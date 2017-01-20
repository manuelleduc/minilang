package fr.inria.diverse.minilange.algebra.benchmark;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import fr.inria.diverse.minilange.algebra.ExecutableOAMinilang;
import minilang.MinilangPackage;
import minilang.Program;

public class Scaling {
	public static void main(String[] args) {
		MyDslStandaloneSetup.doSetup();
		MinilangPackage fsmPackage = MinilangPackage.eINSTANCE;

		new Scaling().go();
	}

	private void go() {
		for (int i = 20; i < 1000; i++) {
			for (int j = 0; j < 1; j++) {
				loop(i, j);
			}
		}

	}

	private void loop(int i, int j) {
		final XtextResourceSet resourceSet = new XtextResourceSet();
		Program hilbert = getHilbert("model/hilbert.mydsl", resourceSet);
		ExecutableOAMinilang oa = new ExecutableOAMinilang();
		hilbert.getVariables().get(0).setValue(i);
		long start = System.currentTimeMillis();
		oa.$(hilbert);
		long stop = System.currentTimeMillis();

		System.out.println(i + ";" + j + ";" + (stop - start) + ";" + hilbert.getLines().size());
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
