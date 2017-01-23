package fr.inria.diverse.minilang.k3.benchmark;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import minilang.MinilangPackage;
import minilang.Program;
import minilang.aspects.ProgramAspect;

public class K3Scaling {
	public static void main(String[] args) {
		final K3Scaling scaling = new K3Scaling();
		scaling.setup();

		scaling.go();
	}

	public void setup() {
		MyDslStandaloneSetup.doSetup();
		MinilangPackage fsmPackage = MinilangPackage.eINSTANCE;
	}

	private void go() {
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < 50; j++) {
				loop(i, j);
			}
		}

	}

	public void loop(int limit, int iteration) {
		final XtextResourceSet resourceSet = new XtextResourceSet();
		Program hilbert = getHilbert("model/hilbert.mydsl", resourceSet);
		hilbert.getVariables().get(0).setValue(limit);
		long start = System.currentTimeMillis();
		ProgramAspect.mainK3(hilbert);
		long stop = System.currentTimeMillis();

		System.out.println(limit + ";" + iteration + ";" + (stop - start) + ";" + hilbert.getLines().size()+";k3");
	}

	public Program getHilbert(String modelPath, XtextResourceSet resourceSet) {
		final Resource resource = resourceSet.getResource(createFileURI(modelPath), true);
		final EObject eObject = resource.getContents().get(0);
		if (eObject instanceof Program) {
			final Program ret = (Program) eObject;
			return ret;
		}
		return null;
	}

	private URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}

	private File createFile(String path) {
		return new File(path);
	}
}
