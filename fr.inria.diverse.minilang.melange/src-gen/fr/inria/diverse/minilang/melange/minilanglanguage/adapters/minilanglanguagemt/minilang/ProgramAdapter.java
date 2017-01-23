package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Program;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ProgramAdapter extends EObjectAdapter<Program> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public ProgramAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public double getX() {
    return adaptee.getX();
  }
  
  @Override
  public void setX(final double o) {
    adaptee.setX(o);
  }
  
  @Override
  public double getY() {
    return adaptee.getY();
  }
  
  @Override
  public void setY(final double o) {
    adaptee.setY(o);
  }
  
  @Override
  public Cardinals getAngle() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals.get(adaptee.getAngle().getValue());
  }
  
  @Override
  public void setAngle(final Cardinals o) {
    adaptee.setAngle(fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Cardinals.get(o.getValue()));
  }
  
  @Override
  public double getDistance() {
    return adaptee.getDistance();
  }
  
  @Override
  public void setDistance(final double o) {
    adaptee.setDistance(o);
  }
  
  private EList<Method> methods_;
  
  @Override
  public EList<Method> getMethods() {
    if (methods_ == null)
    	methods_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMethods(), adaptersFactory, eResource);
    return methods_;
  }
  
  @Override
  public Method getMainMethod() {
    return (Method) adaptersFactory.createAdapter(adaptee.getMainMethod(), eResource);
  }
  
  @Override
  public void setMainMethod(final Method o) {
    if (o != null)
    	adaptee.setMainMethod(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MethodAdapter) o).getAdaptee());
    else adaptee.setMainMethod(null);
  }
  
  private EList<Variable> variables_;
  
  @Override
  public EList<Variable> getVariables() {
    if (variables_ == null)
    	variables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVariables(), adaptersFactory, eResource);
    return variables_;
  }
  
  private EList<Line> lines_;
  
  @Override
  public EList<Line> getLines() {
    if (lines_ == null)
    	lines_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLines(), adaptersFactory, eResource);
    return lines_;
  }
  
  @Override
  public void mainK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.ProgramAspect.mainK3(adaptee);
  }
  
  protected final static double X_EDEFAULT = 0.0;
  
  protected final static double Y_EDEFAULT = 0.0;
  
  protected final static Cardinals ANGLE_EDEFAULT = fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals.NORTH;
  
  protected final static double DISTANCE_EDEFAULT = 0.0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getProgram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__METHODS:
    		return getMethods();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__MAIN_METHOD:
    		return getMainMethod();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__VARIABLES:
    		return getVariables();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__X:
    		return new java.lang.Double(getX());
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__Y:
    		return new java.lang.Double(getY());
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__ANGLE:
    		return getAngle();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__DISTANCE:
    		return new java.lang.Double(getDistance());
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__LINES:
    		return getLines();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__METHODS:
    		return getMethods() != null && !getMethods().isEmpty();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__MAIN_METHOD:
    		return getMainMethod() != null;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__VARIABLES:
    		return getVariables() != null && !getVariables().isEmpty();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__X:
    		return getX() != X_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__Y:
    		return getY() != Y_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__ANGLE:
    		return getAngle() != ANGLE_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__DISTANCE:
    		return getDistance() != DISTANCE_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__LINES:
    		return getLines() != null && !getLines().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__METHODS:
    		getMethods().clear();
    		getMethods().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__MAIN_METHOD:
    		setMainMethod(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__VARIABLES:
    		getVariables().clear();
    		getVariables().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__X:
    		setX(((java.lang.Double) newValue).doubleValue());
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__Y:
    		setY(((java.lang.Double) newValue).doubleValue());
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__ANGLE:
    		setAngle(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__DISTANCE:
    		setDistance(((java.lang.Double) newValue).doubleValue());
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.PROGRAM__LINES:
    		getLines().clear();
    		getLines().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
