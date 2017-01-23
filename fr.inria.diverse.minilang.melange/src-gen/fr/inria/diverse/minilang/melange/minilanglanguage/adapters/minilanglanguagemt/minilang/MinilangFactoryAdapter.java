package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.CallMethod;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Constant;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.GreaterThan;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangFactory;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Modulo;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Move;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateLeft;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateRight;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Sum;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableRef;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class MinilangFactoryAdapter extends EFactoryImpl implements MinilangFactory {
  private MinilangLanguageMTAdaptersFactory adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  
  private fr.inria.diverse.minilang.melange.minilanglanguage.minilang.MinilangFactory minilangAdaptee = fr.inria.diverse.minilang.melange.minilanglanguage.minilang.MinilangFactory.eINSTANCE;
  
  @Override
  public Program createProgram() {
    return adaptersFactory.createProgramAdapter(minilangAdaptee.createProgram(), null);
  }
  
  @Override
  public Method createMethod() {
    return adaptersFactory.createMethodAdapter(minilangAdaptee.createMethod(), null);
  }
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(minilangAdaptee.createVariable(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(minilangAdaptee.createBlock(), null);
  }
  
  @Override
  public IfStmt createIfStmt() {
    return adaptersFactory.createIfStmtAdapter(minilangAdaptee.createIfStmt(), null);
  }
  
  @Override
  public GreaterThan createGreaterThan() {
    return adaptersFactory.createGreaterThanAdapter(minilangAdaptee.createGreaterThan(), null);
  }
  
  @Override
  public Constant createConstant() {
    return adaptersFactory.createConstantAdapter(minilangAdaptee.createConstant(), null);
  }
  
  @Override
  public VariableRef createVariableRef() {
    return adaptersFactory.createVariableRefAdapter(minilangAdaptee.createVariableRef(), null);
  }
  
  @Override
  public VariableAffect createVariableAffect() {
    return adaptersFactory.createVariableAffectAdapter(minilangAdaptee.createVariableAffect(), null);
  }
  
  @Override
  public Sum createSum() {
    return adaptersFactory.createSumAdapter(minilangAdaptee.createSum(), null);
  }
  
  @Override
  public Modulo createModulo() {
    return adaptersFactory.createModuloAdapter(minilangAdaptee.createModulo(), null);
  }
  
  @Override
  public CallMethod createCallMethod() {
    return adaptersFactory.createCallMethodAdapter(minilangAdaptee.createCallMethod(), null);
  }
  
  @Override
  public Move createMove() {
    return adaptersFactory.createMoveAdapter(minilangAdaptee.createMove(), null);
  }
  
  @Override
  public RotateRight createRotateRight() {
    return adaptersFactory.createRotateRightAdapter(minilangAdaptee.createRotateRight(), null);
  }
  
  @Override
  public RotateLeft createRotateLeft() {
    return adaptersFactory.createRotateLeftAdapter(minilangAdaptee.createRotateLeft(), null);
  }
  
  @Override
  public Line createLine() {
    return adaptersFactory.createLineAdapter(minilangAdaptee.createLine(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getMinilangPackage();
  }
  
  public MinilangPackage getMinilangPackage() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE;
  }
}
