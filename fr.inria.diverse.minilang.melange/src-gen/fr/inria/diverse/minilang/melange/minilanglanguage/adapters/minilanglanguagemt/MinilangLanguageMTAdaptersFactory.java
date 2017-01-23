package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BinaryOperationAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BlockAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.CallMethodAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConditionAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConstantAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.GreaterThanAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.IfStmtAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.LineAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MethodAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ModuloAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MoveAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ProgramAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateLeftAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateRightAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.StatementAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.SumAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ValueAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAffectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableRefAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.BinaryOperation;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Block;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.CallMethod;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Condition;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Constant;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.GreaterThan;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.IfStmt;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Line;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Method;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Modulo;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Move;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Program;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateLeft;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateRight;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Statement;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Sum;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Value;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Variable;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableAffect;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableRef;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class MinilangLanguageMTAdaptersFactory implements AdaptersFactory {
  private static MinilangLanguageMTAdaptersFactory instance;
  
  public static MinilangLanguageMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MinilangLanguageMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Program){
    	return createProgramAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Program) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Method){
    	return createMethodAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Method) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Variable){
    	return createVariableAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Variable) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Block){
    	return createBlockAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Block) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.IfStmt){
    	return createIfStmtAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.IfStmt) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.GreaterThan){
    	return createGreaterThanAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.GreaterThan) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Constant){
    	return createConstantAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Constant) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableRef){
    	return createVariableRefAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableRef) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableAffect){
    	return createVariableAffectAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableAffect) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Sum){
    	return createSumAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Sum) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Modulo){
    	return createModuloAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Modulo) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.CallMethod){
    	return createCallMethodAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.CallMethod) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Move){
    	return createMoveAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Move) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateRight){
    	return createRotateRightAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateRight) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateLeft){
    	return createRotateLeftAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateLeft) o, res);
    }
    if (o instanceof fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Line){
    	return createLineAdapter((fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Line) o, res);
    }
    
    return null;
  }
  
  public ProgramAdapter createProgramAdapter(final Program adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ProgramAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ProgramAdapter) adapter;
    }
  }
  
  public MethodAdapter createMethodAdapter(final Method adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MethodAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MethodAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MethodAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BlockAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BlockAdapter) adapter;
    }
  }
  
  public IfStmtAdapter createIfStmtAdapter(final IfStmt adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.IfStmtAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.IfStmtAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.IfStmtAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.StatementAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.StatementAdapter) adapter;
    }
  }
  
  public ConditionAdapter createConditionAdapter(final Condition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConditionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConditionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConditionAdapter) adapter;
    }
  }
  
  public GreaterThanAdapter createGreaterThanAdapter(final GreaterThan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.GreaterThanAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.GreaterThanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.GreaterThanAdapter) adapter;
    }
  }
  
  public ValueAdapter createValueAdapter(final Value adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ValueAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ValueAdapter) adapter;
    }
  }
  
  public ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConstantAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConstantAdapter) adapter;
    }
  }
  
  public VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableRefAdapter) adapter;
    }
  }
  
  public VariableAffectAdapter createVariableAffectAdapter(final VariableAffect adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAffectAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAffectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAffectAdapter) adapter;
    }
  }
  
  public SumAdapter createSumAdapter(final Sum adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.SumAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.SumAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.SumAdapter) adapter;
    }
  }
  
  public ModuloAdapter createModuloAdapter(final Modulo adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ModuloAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ModuloAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ModuloAdapter) adapter;
    }
  }
  
  public BinaryOperationAdapter createBinaryOperationAdapter(final BinaryOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BinaryOperationAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BinaryOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BinaryOperationAdapter) adapter;
    }
  }
  
  public CallMethodAdapter createCallMethodAdapter(final CallMethod adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.CallMethodAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.CallMethodAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.CallMethodAdapter) adapter;
    }
  }
  
  public MoveAdapter createMoveAdapter(final Move adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MoveAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MoveAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MoveAdapter) adapter;
    }
  }
  
  public RotateRightAdapter createRotateRightAdapter(final RotateRight adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateRightAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateRightAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateRightAdapter) adapter;
    }
  }
  
  public RotateLeftAdapter createRotateLeftAdapter(final RotateLeft adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateLeftAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateLeftAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.RotateLeftAdapter) adapter;
    }
  }
  
  public LineAdapter createLineAdapter(final Line adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.LineAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.LineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.LineAdapter) adapter;
    }
  }
}
