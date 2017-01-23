package fr.inria.diverse.minilang.k3.test;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import minilang.Program;
import minilang.aspects.ProgramAspect;


public class UnitTest {

	protected XtextResourceSet resourceSet = null;

	@Before
	final public void initializeResourceSet() {
		resourceSet = new XtextResourceSet();
	}

	@Before
	final public void setupGrammar() {
		MyDslStandaloneSetup.doSetup();
	}

	@Test
	public void hilbert1() throws Exception {
		executeHilbert("model/hilbert1.mydsl");
	}
	
	@Test
	public void hilbert2() throws Exception {
		executeHilbert("model/hilbert2.mydsl");
	}
	
	@Test
	public void hilbert3() throws Exception {
		executeHilbert("model/hilbert3.mydsl");
	}
	
	@Test
	public void hilbert4() throws Exception {
		executeHilbert("model/hilbert4.mydsl");
	}
	
	@Test
	public void hilbert5() throws Exception {
		executeHilbert("model/hilbert5.mydsl");
	}
	
	@Test
	public void hilbert6() throws Exception {
		executeHilbert("model/hilbert6.mydsl");
	}

	private void executeHilbert(String modelPath) {
		Program program = getHilbert(modelPath);

		ProgramAspect.mainK3(program);
		
		System.out.println(program.getLines().size());

	}

	public Program getHilbert(String modelPath) {
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
