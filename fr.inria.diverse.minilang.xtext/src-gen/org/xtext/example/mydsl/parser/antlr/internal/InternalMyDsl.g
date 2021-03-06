/*
 * generated by Xtext 2.9.1
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Program'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='x'
			{
				newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getXKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getXEDoubleParserRuleCall_2_1_0());
					}
					lv_x_3_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						set(
							$current,
							"x",
							lv_x_3_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_4='y'
			{
				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getYKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getYEDoubleParserRuleCall_3_1_0());
					}
					lv_y_5_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						set(
							$current,
							"y",
							lv_y_5_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='angle'
			{
				newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getAngleKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getAngleCardinalsEnumRuleCall_4_1_0());
					}
					lv_angle_7_0=ruleCardinals
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						set(
							$current,
							"angle",
							lv_angle_7_0,
							"org.xtext.example.mydsl.MyDsl.Cardinals");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='distance'
			{
				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getDistanceKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getDistanceEDoubleParserRuleCall_5_1_0());
					}
					lv_distance_9_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						set(
							$current,
							"distance",
							lv_distance_9_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_10='mainMethod'
		{
			newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getMainMethodKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getProgramAccess().getMainMethodMethodCrossReference_7_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12='methods'
			{
				newLeafNode(otherlv_12, grammarAccess.getProgramAccess().getMethodsKeyword_8_0());
			}
			otherlv_13='{'
			{
				newLeafNode(otherlv_13, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_2_0());
					}
					lv_methods_14_0=ruleMethod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						add(
							$current,
							"methods",
							lv_methods_14_0,
							"org.xtext.example.mydsl.MyDsl.Method");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_15=','
				{
					newLeafNode(otherlv_15, grammarAccess.getProgramAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_3_1_0());
						}
						lv_methods_16_0=ruleMethod
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProgramRule());
							}
							add(
								$current,
								"methods",
								lv_methods_16_0,
								"org.xtext.example.mydsl.MyDsl.Method");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_17='}'
			{
				newLeafNode(otherlv_17, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8_4());
			}
		)?
		(
			otherlv_18='variables'
			{
				newLeafNode(otherlv_18, grammarAccess.getProgramAccess().getVariablesKeyword_9_0());
			}
			otherlv_19='{'
			{
				newLeafNode(otherlv_19, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_2_0());
					}
					lv_variables_20_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						add(
							$current,
							"variables",
							lv_variables_20_0,
							"org.xtext.example.mydsl.MyDsl.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_21=','
				{
					newLeafNode(otherlv_21, grammarAccess.getProgramAccess().getCommaKeyword_9_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_3_1_0());
						}
						lv_variables_22_0=ruleVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProgramRule());
							}
							add(
								$current,
								"variables",
								lv_variables_22_0,
								"org.xtext.example.mydsl.MyDsl.Variable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_23='}'
			{
				newLeafNode(otherlv_23, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9_4());
			}
		)?
		(
			otherlv_24='lines'
			{
				newLeafNode(otherlv_24, grammarAccess.getProgramAccess().getLinesKeyword_10_0());
			}
			otherlv_25='{'
			{
				newLeafNode(otherlv_25, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_2_0());
					}
					lv_lines_26_0=ruleLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						add(
							$current,
							"lines",
							lv_lines_26_0,
							"org.xtext.example.mydsl.MyDsl.Line");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_27=','
				{
					newLeafNode(otherlv_27, grammarAccess.getProgramAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_3_1_0());
						}
						lv_lines_28_0=ruleLine
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProgramRule());
							}
							add(
								$current,
								"lines",
								lv_lines_28_0,
								"org.xtext.example.mydsl.MyDsl.Line");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_29='}'
			{
				newLeafNode(otherlv_29, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_10_4());
			}
		)?
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_0());
		}
		this_IfStmt_0=ruleIfStmt
		{
			$current = $this_IfStmt_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getVariableAffectParserRuleCall_1());
		}
		this_VariableAffect_1=ruleVariableAffect
		{
			$current = $this_VariableAffect_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getCallMethodParserRuleCall_2());
		}
		this_CallMethod_2=ruleCallMethod
		{
			$current = $this_CallMethod_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getMoveParserRuleCall_3());
		}
		this_Move_3=ruleMove
		{
			$current = $this_Move_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getRotateRightParserRuleCall_4());
		}
		this_RotateRight_4=ruleRotateRight
		{
			$current = $this_RotateRight_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getRotateLeftParserRuleCall_5());
		}
		this_RotateLeft_5=ruleRotateLeft
		{
			$current = $this_RotateLeft_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getConditionAccess().getGreaterThanParserRuleCall());
	}
	this_GreaterThan_0=ruleGreaterThan
	{
		$current = $this_GreaterThan_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getConstantParserRuleCall_0());
		}
		this_Constant_0=ruleConstant
		{
			$current = $this_Constant_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getVariableRefParserRuleCall_1());
		}
		this_VariableRef_1=ruleVariableRef
		{
			$current = $this_VariableRef_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getSumParserRuleCall_2());
		}
		this_Sum_2=ruleSum
		{
			$current = $this_Sum_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getModuloParserRuleCall_3());
		}
		this_Modulo_3=ruleModulo
		{
			$current = $this_Modulo_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	iv_ruleMethod=ruleMethod
	{ $current=$iv_ruleMethod.current; }
	EOF;

// Rule Method
ruleMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Method'
		{
			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='block'
		{
			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getBlockKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getBlockBlockParserRuleCall_4_0());
				}
				lv_block_4_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"block",
						lv_block_4_0,
						"org.xtext.example.mydsl.MyDsl.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableAccess().getVariableAction_0(),
					$current);
			}
		)
		otherlv_1='Variable'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='value'
			{
				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getValueKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getValueEDoubleParserRuleCall_4_1_0());
					}
					lv_value_5_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleLine
entryRuleLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLineRule()); }
	iv_ruleLine=ruleLine
	{ $current=$iv_ruleLine.current; }
	EOF;

// Rule Line
ruleLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLineAccess().getLineAction_0(),
					$current);
			}
		)
		otherlv_1='Line'
		{
			newLeafNode(otherlv_1, grammarAccess.getLineAccess().getLineKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='x1'
			{
				newLeafNode(otherlv_3, grammarAccess.getLineAccess().getX1Keyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLineAccess().getX1EDoubleParserRuleCall_3_1_0());
					}
					lv_x1_4_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLineRule());
						}
						set(
							$current,
							"x1",
							lv_x1_4_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='y1'
			{
				newLeafNode(otherlv_5, grammarAccess.getLineAccess().getY1Keyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLineAccess().getY1EDoubleParserRuleCall_4_1_0());
					}
					lv_y1_6_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLineRule());
						}
						set(
							$current,
							"y1",
							lv_y1_6_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='x2'
			{
				newLeafNode(otherlv_7, grammarAccess.getLineAccess().getX2Keyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLineAccess().getX2EDoubleParserRuleCall_5_1_0());
					}
					lv_x2_8_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLineRule());
						}
						set(
							$current,
							"x2",
							lv_x2_8_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='y2'
			{
				newLeafNode(otherlv_9, grammarAccess.getLineAccess().getY2Keyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLineAccess().getY2EDoubleParserRuleCall_6_1_0());
					}
					lv_y2_10_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLineRule());
						}
						set(
							$current,
							"y2",
							lv_y2_10_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getLineAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleBlock
entryRuleBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlockRule()); }
	iv_ruleBlock=ruleBlock
	{ $current=$iv_ruleBlock.current; }
	EOF;

// Rule Block
ruleBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBlockAccess().getBlockAction_0(),
					$current);
			}
		)
		otherlv_1='Block'
		{
			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='statements'
			{
				newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getStatementsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_2_0());
					}
					lv_statements_5_0=ruleStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBlockRule());
						}
						add(
							$current,
							"statements",
							lv_statements_5_0,
							"org.xtext.example.mydsl.MyDsl.Statement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_3_1_0());
						}
						lv_statements_7_0=ruleStatement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBlockRule());
							}
							add(
								$current,
								"statements",
								lv_statements_7_0,
								"org.xtext.example.mydsl.MyDsl.Statement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleIfStmt
entryRuleIfStmt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfStmtRule()); }
	iv_ruleIfStmt=ruleIfStmt
	{ $current=$iv_ruleIfStmt.current; }
	EOF;

// Rule IfStmt
ruleIfStmt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='If'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='thenBranch'
		{
			newLeafNode(otherlv_2, grammarAccess.getIfStmtAccess().getThenBranchKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfStmtAccess().getThenBranchBlockParserRuleCall_3_0());
				}
				lv_thenBranch_3_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfStmtRule());
					}
					set(
						$current,
						"thenBranch",
						lv_thenBranch_3_0,
						"org.xtext.example.mydsl.MyDsl.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='elseBranch'
			{
				newLeafNode(otherlv_4, grammarAccess.getIfStmtAccess().getElseBranchKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfStmtAccess().getElseBranchBlockParserRuleCall_4_1_0());
					}
					lv_elseBranch_5_0=ruleBlock
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfStmtRule());
						}
						set(
							$current,
							"elseBranch",
							lv_elseBranch_5_0,
							"org.xtext.example.mydsl.MyDsl.Block");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='condition'
		{
			newLeafNode(otherlv_6, grammarAccess.getIfStmtAccess().getConditionKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfStmtAccess().getConditionConditionParserRuleCall_6_0());
				}
				lv_condition_7_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfStmtRule());
					}
					set(
						$current,
						"condition",
						lv_condition_7_0,
						"org.xtext.example.mydsl.MyDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getIfStmtAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVariableAffect
entryRuleVariableAffect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableAffectRule()); }
	iv_ruleVariableAffect=ruleVariableAffect
	{ $current=$iv_ruleVariableAffect.current; }
	EOF;

// Rule VariableAffect
ruleVariableAffect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='variable'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableAffectAccess().getVariableKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableAffectRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getVariableAffectAccess().getVariableVariableCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='<-'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableAffectAccess().getLessThanSignHyphenMinusKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAffectAccess().getValueValueParserRuleCall_3_0());
				}
				lv_value_3_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableAffectRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCallMethod
entryRuleCallMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallMethodRule()); }
	iv_ruleCallMethod=ruleCallMethod
	{ $current=$iv_ruleCallMethod.current; }
	EOF;

// Rule CallMethod
ruleCallMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CallMethod'
		{
			newLeafNode(otherlv_0, grammarAccess.getCallMethodAccess().getCallMethodKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCallMethodAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='method'
		{
			newLeafNode(otherlv_2, grammarAccess.getCallMethodAccess().getMethodKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCallMethodRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCallMethodAccess().getMethodMethodCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getCallMethodAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleMove
entryRuleMove returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveRule()); }
	iv_ruleMove=ruleMove
	{ $current=$iv_ruleMove.current; }
	EOF;

// Rule Move
ruleMove returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMoveAccess().getMoveAction_0(),
					$current);
			}
		)
		otherlv_1='Move'
		{
			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
		}
	)
;

// Entry rule entryRuleRotateRight
entryRuleRotateRight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateRightRule()); }
	iv_ruleRotateRight=ruleRotateRight
	{ $current=$iv_ruleRotateRight.current; }
	EOF;

// Rule RotateRight
ruleRotateRight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRotateRightAccess().getRotateRightAction_0(),
					$current);
			}
		)
		otherlv_1='RotateRight'
		{
			newLeafNode(otherlv_1, grammarAccess.getRotateRightAccess().getRotateRightKeyword_1());
		}
	)
;

// Entry rule entryRuleRotateLeft
entryRuleRotateLeft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateLeftRule()); }
	iv_ruleRotateLeft=ruleRotateLeft
	{ $current=$iv_ruleRotateLeft.current; }
	EOF;

// Rule RotateLeft
ruleRotateLeft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRotateLeftAccess().getRotateLeftAction_0(),
					$current);
			}
		)
		otherlv_1='RotateLeft'
		{
			newLeafNode(otherlv_1, grammarAccess.getRotateLeftAccess().getRotateLeftKeyword_1());
		}
	)
;

// Entry rule entryRuleGreaterThan
entryRuleGreaterThan returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGreaterThanRule()); }
	iv_ruleGreaterThan=ruleGreaterThan
	{ $current=$iv_ruleGreaterThan.current; }
	EOF;

// Rule GreaterThan
ruleGreaterThan returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GreaterThan'
		{
			newLeafNode(otherlv_0, grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='left'
		{
			newLeafNode(otherlv_2, grammarAccess.getGreaterThanAccess().getLeftKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGreaterThanAccess().getLeftValueParserRuleCall_3_0());
				}
				lv_left_3_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGreaterThanRule());
					}
					set(
						$current,
						"left",
						lv_left_3_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='right'
		{
			newLeafNode(otherlv_4, grammarAccess.getGreaterThanAccess().getRightKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGreaterThanAccess().getRightValueParserRuleCall_5_0());
				}
				lv_right_5_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGreaterThanRule());
					}
					set(
						$current,
						"right",
						lv_right_5_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConstantAccess().getConstantAction_0(),
					$current);
			}
		)
		otherlv_1='Constant'
		{
			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='value'
			{
				newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getValueKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConstantAccess().getValueEDoubleParserRuleCall_3_1_0());
					}
					lv_value_4_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstantRule());
						}
						set(
							$current,
							"value",
							lv_value_4_0,
							"org.xtext.example.mydsl.MyDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleVariableRef
entryRuleVariableRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRefRule()); }
	iv_ruleVariableRef=ruleVariableRef
	{ $current=$iv_ruleVariableRef.current; }
	EOF;

// Rule VariableRef
ruleVariableRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VariableRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableRefAccess().getVariableRefKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableRefAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='variable'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableRefAccess().getVariableKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRefRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getVariableRefAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleSum
entryRuleSum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSumRule()); }
	iv_ruleSum=ruleSum
	{ $current=$iv_ruleSum.current; }
	EOF;

// Rule Sum
ruleSum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='+'
		{
			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getPlusSignKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSumAccess().getRightValueParserRuleCall_2_0());
				}
				lv_right_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSumRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getSumAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSumAccess().getLeftValueParserRuleCall_4_0());
				}
				lv_left_4_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSumRule());
					}
					set(
						$current,
						"left",
						lv_left_4_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getSumAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleModulo
entryRuleModulo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModuloRule()); }
	iv_ruleModulo=ruleModulo
	{ $current=$iv_ruleModulo.current; }
	EOF;

// Rule Modulo
ruleModulo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='%'
		{
			newLeafNode(otherlv_0, grammarAccess.getModuloAccess().getPercentSignKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getModuloAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModuloAccess().getRightValueParserRuleCall_2_0());
				}
				lv_right_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuloRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getModuloAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModuloAccess().getLeftValueParserRuleCall_4_0());
				}
				lv_left_4_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuloRule());
					}
					set(
						$current,
						"left",
						lv_left_4_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getModuloAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Rule Cardinals
ruleCardinals returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NORTH'
			{
				$current = grammarAccess.getCardinalsAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCardinalsAccess().getNORTHEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='EAST'
			{
				$current = grammarAccess.getCardinalsAccess().getEASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCardinalsAccess().getEASTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='SOUTH'
			{
				$current = grammarAccess.getCardinalsAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getCardinalsAccess().getSOUTHEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='WEST'
			{
				$current = grammarAccess.getCardinalsAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getCardinalsAccess().getWESTEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
