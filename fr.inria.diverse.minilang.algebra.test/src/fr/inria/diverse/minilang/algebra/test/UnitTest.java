package fr.inria.diverse.minilang.algebra.test;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import fr.inria.diverse.minilang.algebra.ExecutableOAMinilang;
import minilang.Program;

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

		ExecutableOAMinilang oa = new ExecutableOAMinilang();

		oa.$(program);
		
		System.out.println(program.getLines().size());

//		System.out.println(program
//				.getLines().stream().map(a -> "x1: " + Math.round(a.getX1()) + "," + " y1: "+Math.round(a.getY1()) + ";"
//						+ "x2: "+Math.round(a.getX2()) + "," + " y2: "+Math.round(a.getY2()))
//				.collect(Collectors.joining(" -- ", "[", "]")));
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
