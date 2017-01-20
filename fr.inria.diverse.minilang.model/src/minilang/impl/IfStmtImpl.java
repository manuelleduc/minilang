/**
 */
package minilang.impl;

import minilang.Block;
import minilang.Condition;
import minilang.IfStmt;
import minilang.MinilangPackage;
import minilang.visitor.MinilangVisitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>If Stmt</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link minilang.impl.IfStmtImpl#getThenBranch <em>Then Branch</em>}</li>
 * <li>{@link minilang.impl.IfStmtImpl#getElseBranch <em>Else Branch</em>}</li>
 * <li>{@link minilang.impl.IfStmtImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtImpl extends StatementImpl implements IfStmt {
	/**
	 * The cached value of the '{@link #getThenBranch() <em>Then Branch</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getThenBranch()
	 * @generated
	 * @ordered
	 */
	protected Block thenBranch;

	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElseBranch()
	 * @generated
	 * @ordered
	 */
	protected Block elseBranch;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IfStmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinilangPackage.Literals.IF_STMT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Block getThenBranch() {
		return thenBranch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetThenBranch(Block newThenBranch, NotificationChain msgs) {
		Block oldThenBranch = thenBranch;
		thenBranch = newThenBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MinilangPackage.IF_STMT__THEN_BRANCH, oldThenBranch, newThenBranch);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setThenBranch(Block newThenBranch) {
		if (newThenBranch != thenBranch) {
			NotificationChain msgs = null;
			if (thenBranch != null)
				msgs = ((InternalEObject) thenBranch).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MinilangPackage.IF_STMT__THEN_BRANCH, null, msgs);
			if (newThenBranch != null)
				msgs = ((InternalEObject) newThenBranch).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MinilangPackage.IF_STMT__THEN_BRANCH, null, msgs);
			msgs = basicSetThenBranch(newThenBranch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.IF_STMT__THEN_BRANCH, newThenBranch,
					newThenBranch));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Block getElseBranch() {
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetElseBranch(Block newElseBranch, NotificationChain msgs) {
		Block oldElseBranch = elseBranch;
		elseBranch = newElseBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MinilangPackage.IF_STMT__ELSE_BRANCH, oldElseBranch, newElseBranch);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setElseBranch(Block newElseBranch) {
		if (newElseBranch != elseBranch) {
			NotificationChain msgs = null;
			if (elseBranch != null)
				msgs = ((InternalEObject) elseBranch).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MinilangPackage.IF_STMT__ELSE_BRANCH, null, msgs);
			if (newElseBranch != null)
				msgs = ((InternalEObject) newElseBranch).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MinilangPackage.IF_STMT__ELSE_BRANCH, null, msgs);
			msgs = basicSetElseBranch(newElseBranch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.IF_STMT__ELSE_BRANCH, newElseBranch,
					newElseBranch));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MinilangPackage.IF_STMT__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MinilangPackage.IF_STMT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MinilangPackage.IF_STMT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.IF_STMT__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MinilangPackage.IF_STMT__THEN_BRANCH:
			return basicSetThenBranch(null, msgs);
		case MinilangPackage.IF_STMT__ELSE_BRANCH:
			return basicSetElseBranch(null, msgs);
		case MinilangPackage.IF_STMT__CONDITION:
			return basicSetCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MinilangPackage.IF_STMT__THEN_BRANCH:
			return getThenBranch();
		case MinilangPackage.IF_STMT__ELSE_BRANCH:
			return getElseBranch();
		case MinilangPackage.IF_STMT__CONDITION:
			return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MinilangPackage.IF_STMT__THEN_BRANCH:
			setThenBranch((Block) newValue);
			return;
		case MinilangPackage.IF_STMT__ELSE_BRANCH:
			setElseBranch((Block) newValue);
			return;
		case MinilangPackage.IF_STMT__CONDITION:
			setCondition((Condition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MinilangPackage.IF_STMT__THEN_BRANCH:
			setThenBranch((Block) null);
			return;
		case MinilangPackage.IF_STMT__ELSE_BRANCH:
			setElseBranch((Block) null);
			return;
		case MinilangPackage.IF_STMT__CONDITION:
			setCondition((Condition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MinilangPackage.IF_STMT__THEN_BRANCH:
			return thenBranch != null;
		case MinilangPackage.IF_STMT__ELSE_BRANCH:
			return elseBranch != null;
		case MinilangPackage.IF_STMT__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void execute() {
		if (this.getCondition().evaluate()) {
			this.getThenBranch().execute();
		} else {
			if (this.getElseBranch() != null) {
				this.getElseBranch().execute();
			}
		}
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public <T> T accept(MinilangVisitor<T> visitor) {
		return visitor.visitIfStmt(this);
	}

} // IfStmtImpl
