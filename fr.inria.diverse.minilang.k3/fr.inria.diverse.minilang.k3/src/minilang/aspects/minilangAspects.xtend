package minilang.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import minilang.Program
import minilang.Method
import minilang.Variable
import minilang.Block
import minilang.IfStmt
import minilang.Statement
import minilang.Condition
import minilang.GreaterThan
import minilang.Value
import minilang.Constant
import minilang.VariableRef
import minilang.VariableAffect
import minilang.Sum
import minilang.Modulo
import minilang.BinaryOperation
import minilang.CallMethod
import minilang.Move
import minilang.RotateRight
import minilang.RotateLeft
import minilang.Line

import static extension minilang.aspects.ProgramAspect.*
import static extension minilang.aspects.MethodAspect.*
import static extension minilang.aspects.VariableAspect.*
import static extension minilang.aspects.BlockAspect.*
import static extension minilang.aspects.IfStmtAspect.*
import static extension minilang.aspects.StatementAspect.*
import static extension minilang.aspects.ConditionAspect.*
import static extension minilang.aspects.GreaterThanAspect.*
import static extension minilang.aspects.ValueAspect.*
import static extension minilang.aspects.ConstantAspect.*
import static extension minilang.aspects.VariableRefAspect.*
import static extension minilang.aspects.VariableAffectAspect.*
import static extension minilang.aspects.SumAspect.*
import static extension minilang.aspects.ModuloAspect.*
import static extension minilang.aspects.BinaryOperationAspect.*
import static extension minilang.aspects.CallMethodAspect.*
import static extension minilang.aspects.MoveAspect.*
import static extension minilang.aspects.RotateRightAspect.*
import static extension minilang.aspects.RotateLeftAspect.*
import static extension minilang.aspects.LineAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.ecore.EObject
import minilang.MinilangFactory
import minilang.Cardinals

@Aspect(className=Program)
class ProgramAspect {
	@Main
	def void mainK3() {
		_self.mainMethod.executeK3()
	}
}

@Aspect(className=Method)
class MethodAspect {
	def void executeK3() {
		_self.block.executeK3()
	}
}

@Aspect(className=Variable)
class VariableAspect {
}

@Aspect(className=Block)
class BlockAspect {
	def void executeK3() {
		for (statement : _self.statements) {
			statement.executeK3()
		}
	}
}

@Aspect(className=IfStmt)
class IfStmtAspect extends StatementAspect {
	@OverrideAspectMethod
	def void executeK3() {
		if (_self.condition.evalK3()) {
			_self.thenBranch.executeK3()
		} else {
			_self.elseBranch?.executeK3()
		}
	}
}

@Aspect(className=Statement)
abstract class StatementAspect {
	def abstract void executeK3()
}

@Aspect(className=Condition)
abstract class ConditionAspect {
	def abstract boolean evalK3()
}

@Aspect(className=GreaterThan)
class GreaterThanAspect extends ConditionAspect {
	def boolean evalK3() {
		_self.left.valueK3() > _self.right.valueK3()
	}
}

@Aspect(className=Value)
abstract class ValueAspect {
	def abstract double valueK3()
}

@Aspect(className=Constant)
class ConstantAspect extends ValueAspect {
	@OverrideAspectMethod
	def double valueK3() {
		_self.value
	}
}

@Aspect(className=VariableRef)
class VariableRefAspect extends ValueAspect {
	@OverrideAspectMethod
	def double valueK3() {
		_self.variable.value
	}
}

@Aspect(className=VariableAffect)
class VariableAffectAspect extends StatementAspect {
	@OverrideAspectMethod
	def void executeK3() {
		_self.variable.value = _self.value.valueK3()
	}
}

@Aspect(className=Sum)
class SumAspect extends BinaryOperationAspect {
	@OverrideAspectMethod
	def double valueK3() {
		_self.left.valueK3() + _self.right.valueK3()
	}
}

@Aspect(className=Modulo)
class ModuloAspect extends BinaryOperationAspect {
	@OverrideAspectMethod
	def double valueK3() {
		_self.left.valueK3() % _self.right.valueK3()
	}
}

@Aspect(className=BinaryOperation)
abstract class BinaryOperationAspect extends ValueAspect {
}

@Aspect(className=CallMethod)
class CallMethodAspect extends StatementAspect {
	@OverrideAspectMethod
	def void executeK3() {
		_self.method.executeK3()
	}
}

@Aspect(className=Move)
class MoveAspect extends StatementAspect {
	@OverrideAspectMethod
	def void executeK3() {
		val program = _self.findProgram(_self)

		val x1 = program.x
		val y1 = program.y
		val angle = _self.coordinateToAngle(program)
		val x2 = x1 + program.distance * Math.cos(Math.toRadians(angle))
		val y2 = y1 + program.distance * Math.sin(Math.toRadians(angle))

		val createLine = MinilangFactory.eINSTANCE.createLine
		createLine.x1 = x1
		createLine.y1 = y1
		createLine.x2 = x2
		createLine.y2 = y2
		
		program.lines.add(createLine)

		program.x = x2
		program.y = y2
	}

	private def Program findProgram(EObject obj) {
		if (obj instanceof Program)
			obj
		else if(obj.eContainer != null) _self.findProgram(obj.eContainer) else null
	}

	private def double coordinateToAngle(Program program) {
		switch (program.angle) {
			case EAST: {
				0
			}
			case NORTH: {
				270
			}
			case SOUTH: {
				90
			}
			case WEST: {
				180
			}
			default: {
				0
			}
		}
	}

}

@Aspect(className=RotateRight)
class RotateRightAspect extends StatementAspect {
	@OverrideAspectMethod
	def void executeK3() {
		val program = _self.findProgram(_self)
		program.angle = switch (program.angle) {
			case EAST: {
				Cardinals.SOUTH
			}
			case NORTH: {
				Cardinals.EAST
			}
			case SOUTH: {
				Cardinals.WEST
			}
			case WEST: {
				Cardinals.NORTH
			}
		}
	}

	private def Program findProgram(EObject obj) {
		if (obj instanceof Program)
			obj
		else if(obj.eContainer != null) _self.findProgram(obj.eContainer) else null
	}
}

@Aspect(className=RotateLeft)
class RotateLeftAspect extends StatementAspect {
	@OverrideAspectMethod
	def void executeK3() {
		val program = _self.findProgram(_self)
		program.angle = switch (program.angle) {
			case EAST: {
				Cardinals.NORTH
			}
			case NORTH: {
				Cardinals.WEST
			}
			case SOUTH: {
				Cardinals.EAST
			}
			case WEST: {
				Cardinals.SOUTH
			}
		}
	}

	private def Program findProgram(EObject obj) {
		if (obj instanceof Program)
			obj
		else if(obj.eContainer != null) _self.findProgram(obj.eContainer) else null
	}
}

@Aspect(className=Line)
class LineAspect {
}
