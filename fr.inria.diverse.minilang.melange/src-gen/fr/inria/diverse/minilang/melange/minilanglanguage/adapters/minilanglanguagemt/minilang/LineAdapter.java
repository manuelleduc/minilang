package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Line;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class LineAdapter extends EObjectAdapter<Line> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public LineAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public double getX1() {
    return adaptee.getX1();
  }
  
  @Override
  public void setX1(final double o) {
    adaptee.setX1(o);
  }
  
  @Override
  public double getY1() {
    return adaptee.getY1();
  }
  
  @Override
  public void setY1(final double o) {
    adaptee.setY1(o);
  }
  
  @Override
  public double getX2() {
    return adaptee.getX2();
  }
  
  @Override
  public void setX2(final double o) {
    adaptee.setX2(o);
  }
  
  @Override
  public double getY2() {
    return adaptee.getY2();
  }
  
  @Override
  public void setY2(final double o) {
    adaptee.setY2(o);
  }
  
  protected final static double X1_EDEFAULT = 0.0;
  
  protected final static double Y1_EDEFAULT = 0.0;
  
  protected final static double X2_EDEFAULT = 0.0;
  
  protected final static double Y2_EDEFAULT = 0.0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getLine();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__X1:
    		return new java.lang.Double(getX1());
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__Y1:
    		return new java.lang.Double(getY1());
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__X2:
    		return new java.lang.Double(getX2());
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__Y2:
    		return new java.lang.Double(getY2());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__X1:
    		return getX1() != X1_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__Y1:
    		return getY1() != Y1_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__X2:
    		return getX2() != X2_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__Y2:
    		return getY2() != Y2_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__X1:
    		setX1(((java.lang.Double) newValue).doubleValue());
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__Y1:
    		setY1(((java.lang.Double) newValue).doubleValue());
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__X2:
    		setX2(((java.lang.Double) newValue).doubleValue());
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.LINE__Y2:
    		setY2(((java.lang.Double) newValue).doubleValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
