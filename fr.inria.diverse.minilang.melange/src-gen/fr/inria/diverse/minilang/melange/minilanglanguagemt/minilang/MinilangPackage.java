/**
 */
package fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangFactory
 * @model kind="package"
 * @generated
 */
public interface MinilangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minilang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.minilang.melange.minilanglanguagemt/minilang/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minilang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinilangPackage eINSTANCE = fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ProgramImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Main Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MAIN_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__Y = 4;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ANGLE = 5;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DISTANCE = 6;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LINES = 7;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MethodImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BLOCK = 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BlockImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.StatementImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.IfStmtImpl <em>If Stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.IfStmtImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getIfStmt()
	 * @generated
	 */
	int IF_STMT = 4;

	/**
	 * The feature id for the '<em><b>Then Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__THEN_BRANCH = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__ELSE_BRANCH = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__CONDITION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConditionImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.GreaterThanImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 7;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ValueImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConstantImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableRefImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 10;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableAffectImpl <em>Variable Affect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableAffectImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getVariableAffect()
	 * @generated
	 */
	int VARIABLE_AFFECT = 11;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_AFFECT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_AFFECT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Affect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_AFFECT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BinaryOperationImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.SumImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getSum()
	 * @generated
	 */
	int SUM = 12;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ModuloImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 13;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.CallMethodImpl <em>Call Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.CallMethodImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getCallMethod()
	 * @generated
	 */
	int CALL_METHOD = 15;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD__METHOD = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MoveImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 16;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateRightImpl <em>Rotate Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateRightImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getRotateRight()
	 * @generated
	 */
	int ROTATE_RIGHT = 17;

	/**
	 * The number of structural features of the '<em>Rotate Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_RIGHT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateLeftImpl <em>Rotate Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateLeftImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getRotateLeft()
	 * @generated
	 */
	int ROTATE_LEFT = 18;

	/**
	 * The number of structural features of the '<em>Rotate Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_LEFT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.LineImpl
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 19;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__X1 = 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__Y1 = 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__X2 = 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__Y2 = 3;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals <em>Cardinals</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getCardinals()
	 * @generated
	 */
	int CARDINALS = 20;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getMethods()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Methods();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getMainMethod <em>Main Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Method</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getMainMethod()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_MainMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getVariables()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Variables();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getX()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getY()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Y();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getAngle()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Angle();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getDistance()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Distance();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getLines()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Lines();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getProgram()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Program();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getBlock()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Block();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt <em>If Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Stmt</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt
	 * @generated
	 */
	EClass getIfStmt();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getThenBranch <em>Then Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Branch</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getThenBranch()
	 * @see #getIfStmt()
	 * @generated
	 */
	EReference getIfStmt_ThenBranch();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getElseBranch <em>Else Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Branch</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getElseBranch()
	 * @see #getIfStmt()
	 * @generated
	 */
	EReference getIfStmt_ElseBranch();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getCondition()
	 * @see #getIfStmt()
	 * @generated
	 */
	EReference getIfStmt_Condition();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.GreaterThan#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.GreaterThan#getLeft()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EReference getGreaterThan_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.GreaterThan#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.GreaterThan#getRight()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EReference getGreaterThan_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect <em>Variable Affect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Affect</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect
	 * @generated
	 */
	EClass getVariableAffect();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getVariable()
	 * @see #getVariableAffect()
	 * @generated
	 */
	EReference getVariableAffect_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getValue()
	 * @see #getVariableAffect()
	 * @generated
	 */
	EReference getVariableAffect_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Sum
	 * @generated
	 */
	EClass getSum();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getRight()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Right();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getLeft()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Left();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.CallMethod <em>Call Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Method</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.CallMethod
	 * @generated
	 */
	EClass getCallMethod();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.CallMethod#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.CallMethod#getMethod()
	 * @see #getCallMethod()
	 * @generated
	 */
	EReference getCallMethod_Method();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateRight <em>Rotate Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Right</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateRight
	 * @generated
	 */
	EClass getRotateRight();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateLeft <em>Rotate Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Left</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateLeft
	 * @generated
	 */
	EClass getRotateLeft();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getX1()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_X1();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getY1()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Y1();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getX2()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_X2();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line#getY2()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Y2();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals <em>Cardinals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinals</em>'.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals
	 * @generated
	 */
	EEnum getCardinals();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinilangFactory getMinilangFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ProgramImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__METHODS = eINSTANCE.getProgram_Methods();

		/**
		 * The meta object literal for the '<em><b>Main Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__MAIN_METHOD = eINSTANCE.getProgram_MainMethod();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__VARIABLES = eINSTANCE.getProgram_Variables();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__X = eINSTANCE.getProgram_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__Y = eINSTANCE.getProgram_Y();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ANGLE = eINSTANCE.getProgram_Angle();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__DISTANCE = eINSTANCE.getProgram_Distance();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__LINES = eINSTANCE.getProgram_Lines();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MethodImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PROGRAM = eINSTANCE.getMethod_Program();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BLOCK = eINSTANCE.getMethod_Block();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BlockImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.IfStmtImpl <em>If Stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.IfStmtImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getIfStmt()
		 * @generated
		 */
		EClass IF_STMT = eINSTANCE.getIfStmt();

		/**
		 * The meta object literal for the '<em><b>Then Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__THEN_BRANCH = eINSTANCE.getIfStmt_ThenBranch();

		/**
		 * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__ELSE_BRANCH = eINSTANCE.getIfStmt_ElseBranch();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__CONDITION = eINSTANCE.getIfStmt_Condition();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.StatementImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConditionImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.GreaterThanImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_THAN__LEFT = eINSTANCE.getGreaterThan_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_THAN__RIGHT = eINSTANCE.getGreaterThan_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ValueImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ConstantImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableRefImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableAffectImpl <em>Variable Affect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.VariableAffectImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getVariableAffect()
		 * @generated
		 */
		EClass VARIABLE_AFFECT = eINSTANCE.getVariableAffect();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_AFFECT__VARIABLE = eINSTANCE.getVariableAffect_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_AFFECT__VALUE = eINSTANCE.getVariableAffect_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.SumImpl <em>Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.SumImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getSum()
		 * @generated
		 */
		EClass SUM = eINSTANCE.getSum();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.ModuloImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.BinaryOperationImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.CallMethodImpl <em>Call Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.CallMethodImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getCallMethod()
		 * @generated
		 */
		EClass CALL_METHOD = eINSTANCE.getCallMethod();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_METHOD__METHOD = eINSTANCE.getCallMethod_Method();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MoveImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateRightImpl <em>Rotate Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateRightImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getRotateRight()
		 * @generated
		 */
		EClass ROTATE_RIGHT = eINSTANCE.getRotateRight();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateLeftImpl <em>Rotate Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.RotateLeftImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getRotateLeft()
		 * @generated
		 */
		EClass ROTATE_LEFT = eINSTANCE.getRotateLeft();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.LineImpl
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__X1 = eINSTANCE.getLine_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__Y1 = eINSTANCE.getLine_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__X2 = eINSTANCE.getLine_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__Y2 = eINSTANCE.getLine_Y2();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals <em>Cardinals</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals
		 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.impl.MinilangPackageImpl#getCardinals()
		 * @generated
		 */
		EEnum CARDINALS = eINSTANCE.getCardinals();

	}

} //MinilangPackage
