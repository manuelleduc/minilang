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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'x'", "'y'", "'angle'", "'distance'", "'mainMethod'", "'methods'", "','", "'}'", "'variables'", "'lines'", "'Method'", "'block'", "'Variable'", "'value'", "'-'", "'.'", "'E'", "'e'", "'Line'", "'x1'", "'y1'", "'x2'", "'y2'", "'Block'", "'statements'", "'If'", "'thenBranch'", "'elseBranch'", "'condition'", "'variable'", "'<-'", "'CallMethod'", "'method'", "'Move'", "'RotateRight'", "'RotateLeft'", "'GreaterThan'", "'left'", "'right'", "'Constant'", "'VariableRef'", "'+'", "'('", "')'", "'%'", "'NORTH'", "'EAST'", "'SOUTH'", "'WEST'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'Program' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'angle' ( (lv_angle_7_0= ruleCardinals ) ) )? (otherlv_8= 'distance' ( (lv_distance_9_0= ruleEDouble ) ) )? otherlv_10= 'mainMethod' ( ( ruleEString ) ) (otherlv_12= 'methods' otherlv_13= '{' ( (lv_methods_14_0= ruleMethod ) ) (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )* otherlv_17= '}' )? (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'lines' otherlv_25= '{' ( (lv_lines_26_0= ruleLine ) ) (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        Enumerator lv_angle_7_0 = null;

        AntlrDatatypeRuleToken lv_distance_9_0 = null;

        EObject lv_methods_14_0 = null;

        EObject lv_methods_16_0 = null;

        EObject lv_variables_20_0 = null;

        EObject lv_variables_22_0 = null;

        EObject lv_lines_26_0 = null;

        EObject lv_lines_28_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Program' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'angle' ( (lv_angle_7_0= ruleCardinals ) ) )? (otherlv_8= 'distance' ( (lv_distance_9_0= ruleEDouble ) ) )? otherlv_10= 'mainMethod' ( ( ruleEString ) ) (otherlv_12= 'methods' otherlv_13= '{' ( (lv_methods_14_0= ruleMethod ) ) (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )* otherlv_17= '}' )? (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'lines' otherlv_25= '{' ( (lv_lines_26_0= ruleLine ) ) (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Program' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'angle' ( (lv_angle_7_0= ruleCardinals ) ) )? (otherlv_8= 'distance' ( (lv_distance_9_0= ruleEDouble ) ) )? otherlv_10= 'mainMethod' ( ( ruleEString ) ) (otherlv_12= 'methods' otherlv_13= '{' ( (lv_methods_14_0= ruleMethod ) ) (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )* otherlv_17= '}' )? (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'lines' otherlv_25= '{' ( (lv_lines_26_0= ruleLine ) ) (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Program' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'angle' ( (lv_angle_7_0= ruleCardinals ) ) )? (otherlv_8= 'distance' ( (lv_distance_9_0= ruleEDouble ) ) )? otherlv_10= 'mainMethod' ( ( ruleEString ) ) (otherlv_12= 'methods' otherlv_13= '{' ( (lv_methods_14_0= ruleMethod ) ) (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )* otherlv_17= '}' )? (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'lines' otherlv_25= '{' ( (lv_lines_26_0= ruleLine ) ) (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Program' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'angle' ( (lv_angle_7_0= ruleCardinals ) ) )? (otherlv_8= 'distance' ( (lv_distance_9_0= ruleEDouble ) ) )? otherlv_10= 'mainMethod' ( ( ruleEString ) ) (otherlv_12= 'methods' otherlv_13= '{' ( (lv_methods_14_0= ruleMethod ) ) (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )* otherlv_17= '}' )? (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'lines' otherlv_25= '{' ( (lv_lines_26_0= ruleLine ) ) (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:88:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:89:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getXKeyword_2_0());
                    			
                    // InternalMyDsl.g:93:4: ( (lv_x_3_0= ruleEDouble ) )
                    // InternalMyDsl.g:94:5: (lv_x_3_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:94:5: (lv_x_3_0= ruleEDouble )
                    // InternalMyDsl.g:95:6: lv_x_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getXEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_x_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:113:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:114:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getYKeyword_3_0());
                    			
                    // InternalMyDsl.g:118:4: ( (lv_y_5_0= ruleEDouble ) )
                    // InternalMyDsl.g:119:5: (lv_y_5_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:119:5: (lv_y_5_0= ruleEDouble )
                    // InternalMyDsl.g:120:6: lv_y_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getYEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_y_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:138:3: (otherlv_6= 'angle' ( (lv_angle_7_0= ruleCardinals ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:139:4: otherlv_6= 'angle' ( (lv_angle_7_0= ruleCardinals ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getAngleKeyword_4_0());
                    			
                    // InternalMyDsl.g:143:4: ( (lv_angle_7_0= ruleCardinals ) )
                    // InternalMyDsl.g:144:5: (lv_angle_7_0= ruleCardinals )
                    {
                    // InternalMyDsl.g:144:5: (lv_angle_7_0= ruleCardinals )
                    // InternalMyDsl.g:145:6: lv_angle_7_0= ruleCardinals
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getAngleCardinalsEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_angle_7_0=ruleCardinals();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						set(
                    							current,
                    							"angle",
                    							lv_angle_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Cardinals");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:163:3: (otherlv_8= 'distance' ( (lv_distance_9_0= ruleEDouble ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:164:4: otherlv_8= 'distance' ( (lv_distance_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getDistanceKeyword_5_0());
                    			
                    // InternalMyDsl.g:168:4: ( (lv_distance_9_0= ruleEDouble ) )
                    // InternalMyDsl.g:169:5: (lv_distance_9_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:169:5: (lv_distance_9_0= ruleEDouble )
                    // InternalMyDsl.g:170:6: lv_distance_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getDistanceEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_distance_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						set(
                    							current,
                    							"distance",
                    							lv_distance_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getMainMethodKeyword_6());
            		
            // InternalMyDsl.g:192:3: ( ( ruleEString ) )
            // InternalMyDsl.g:193:4: ( ruleEString )
            {
            // InternalMyDsl.g:193:4: ( ruleEString )
            // InternalMyDsl.g:194:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProgramAccess().getMainMethodMethodCrossReference_7_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:208:3: (otherlv_12= 'methods' otherlv_13= '{' ( (lv_methods_14_0= ruleMethod ) ) (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:209:4: otherlv_12= 'methods' otherlv_13= '{' ( (lv_methods_14_0= ruleMethod ) ) (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getProgramAccess().getMethodsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyDsl.g:217:4: ( (lv_methods_14_0= ruleMethod ) )
                    // InternalMyDsl.g:218:5: (lv_methods_14_0= ruleMethod )
                    {
                    // InternalMyDsl.g:218:5: (lv_methods_14_0= ruleMethod )
                    // InternalMyDsl.g:219:6: lv_methods_14_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_methods_14_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_14_0,
                    							"org.xtext.example.mydsl.MyDsl.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:236:4: (otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:237:5: otherlv_15= ',' ( (lv_methods_16_0= ruleMethod ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getProgramAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:241:5: ( (lv_methods_16_0= ruleMethod ) )
                    	    // InternalMyDsl.g:242:6: (lv_methods_16_0= ruleMethod )
                    	    {
                    	    // InternalMyDsl.g:242:6: (lv_methods_16_0= ruleMethod )
                    	    // InternalMyDsl.g:243:7: lv_methods_16_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_methods_16_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methods",
                    	    								lv_methods_16_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_17, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:266:3: (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:267:4: otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getProgramAccess().getVariablesKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:275:4: ( (lv_variables_20_0= ruleVariable ) )
                    // InternalMyDsl.g:276:5: (lv_variables_20_0= ruleVariable )
                    {
                    // InternalMyDsl.g:276:5: (lv_variables_20_0= ruleVariable )
                    // InternalMyDsl.g:277:6: lv_variables_20_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_variables_20_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_20_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:294:4: (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:295:5: otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) )
                    	    {
                    	    otherlv_21=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getProgramAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:299:5: ( (lv_variables_22_0= ruleVariable ) )
                    	    // InternalMyDsl.g:300:6: (lv_variables_22_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:300:6: (lv_variables_22_0= ruleVariable )
                    	    // InternalMyDsl.g:301:7: lv_variables_22_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_variables_22_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_23, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:324:3: (otherlv_24= 'lines' otherlv_25= '{' ( (lv_lines_26_0= ruleLine ) ) (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )* otherlv_29= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:325:4: otherlv_24= 'lines' otherlv_25= '{' ( (lv_lines_26_0= ruleLine ) ) (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getProgramAccess().getLinesKeyword_10_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_25, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyDsl.g:333:4: ( (lv_lines_26_0= ruleLine ) )
                    // InternalMyDsl.g:334:5: (lv_lines_26_0= ruleLine )
                    {
                    // InternalMyDsl.g:334:5: (lv_lines_26_0= ruleLine )
                    // InternalMyDsl.g:335:6: lv_lines_26_0= ruleLine
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_lines_26_0=ruleLine();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"lines",
                    							lv_lines_26_0,
                    							"org.xtext.example.mydsl.MyDsl.Line");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:352:4: (otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:353:5: otherlv_27= ',' ( (lv_lines_28_0= ruleLine ) )
                    	    {
                    	    otherlv_27=(Token)match(input,19,FOLLOW_18); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getProgramAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMyDsl.g:357:5: ( (lv_lines_28_0= ruleLine ) )
                    	    // InternalMyDsl.g:358:6: (lv_lines_28_0= ruleLine )
                    	    {
                    	    // InternalMyDsl.g:358:6: (lv_lines_28_0= ruleLine )
                    	    // InternalMyDsl.g:359:7: lv_lines_28_0= ruleLine
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_lines_28_0=ruleLine();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"lines",
                    	    								lv_lines_28_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Line");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_29, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:390:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:390:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:391:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:397:1: ruleStatement returns [EObject current=null] : (this_IfStmt_0= ruleIfStmt | this_VariableAffect_1= ruleVariableAffect | this_CallMethod_2= ruleCallMethod | this_Move_3= ruleMove | this_RotateRight_4= ruleRotateRight | this_RotateLeft_5= ruleRotateLeft ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStmt_0 = null;

        EObject this_VariableAffect_1 = null;

        EObject this_CallMethod_2 = null;

        EObject this_Move_3 = null;

        EObject this_RotateRight_4 = null;

        EObject this_RotateLeft_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:403:2: ( (this_IfStmt_0= ruleIfStmt | this_VariableAffect_1= ruleVariableAffect | this_CallMethod_2= ruleCallMethod | this_Move_3= ruleMove | this_RotateRight_4= ruleRotateRight | this_RotateLeft_5= ruleRotateLeft ) )
            // InternalMyDsl.g:404:2: (this_IfStmt_0= ruleIfStmt | this_VariableAffect_1= ruleVariableAffect | this_CallMethod_2= ruleCallMethod | this_Move_3= ruleMove | this_RotateRight_4= ruleRotateRight | this_RotateLeft_5= ruleRotateLeft )
            {
            // InternalMyDsl.g:404:2: (this_IfStmt_0= ruleIfStmt | this_VariableAffect_1= ruleVariableAffect | this_CallMethod_2= ruleCallMethod | this_Move_3= ruleMove | this_RotateRight_4= ruleRotateRight | this_RotateLeft_5= ruleRotateLeft )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 42:
                {
                alt11=2;
                }
                break;
            case 44:
                {
                alt11=3;
                }
                break;
            case 46:
                {
                alt11=4;
                }
                break;
            case 47:
                {
                alt11=5;
                }
                break;
            case 48:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:405:3: this_IfStmt_0= ruleIfStmt
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStmt_0=ruleIfStmt();

                    state._fsp--;


                    			current = this_IfStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:414:3: this_VariableAffect_1= ruleVariableAffect
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableAffectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableAffect_1=ruleVariableAffect();

                    state._fsp--;


                    			current = this_VariableAffect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:423:3: this_CallMethod_2= ruleCallMethod
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCallMethodParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallMethod_2=ruleCallMethod();

                    state._fsp--;


                    			current = this_CallMethod_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:432:3: this_Move_3= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_3=ruleMove();

                    state._fsp--;


                    			current = this_Move_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:441:3: this_RotateRight_4= ruleRotateRight
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRotateRightParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateRight_4=ruleRotateRight();

                    state._fsp--;


                    			current = this_RotateRight_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:450:3: this_RotateLeft_5= ruleRotateLeft
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRotateLeftParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateLeft_5=ruleRotateLeft();

                    state._fsp--;


                    			current = this_RotateLeft_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:462:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:462:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:463:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:469:1: ruleCondition returns [EObject current=null] : this_GreaterThan_0= ruleGreaterThan ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_GreaterThan_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:475:2: (this_GreaterThan_0= ruleGreaterThan )
            // InternalMyDsl.g:476:2: this_GreaterThan_0= ruleGreaterThan
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getGreaterThanParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_GreaterThan_0=ruleGreaterThan();

            state._fsp--;


            		current = this_GreaterThan_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:487:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyDsl.g:487:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:488:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:494:1: ruleValue returns [EObject current=null] : (this_Constant_0= ruleConstant | this_VariableRef_1= ruleVariableRef | this_Sum_2= ruleSum | this_Modulo_3= ruleModulo ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_VariableRef_1 = null;

        EObject this_Sum_2 = null;

        EObject this_Modulo_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:500:2: ( (this_Constant_0= ruleConstant | this_VariableRef_1= ruleVariableRef | this_Sum_2= ruleSum | this_Modulo_3= ruleModulo ) )
            // InternalMyDsl.g:501:2: (this_Constant_0= ruleConstant | this_VariableRef_1= ruleVariableRef | this_Sum_2= ruleSum | this_Modulo_3= ruleModulo )
            {
            // InternalMyDsl.g:501:2: (this_Constant_0= ruleConstant | this_VariableRef_1= ruleVariableRef | this_Sum_2= ruleSum | this_Modulo_3= ruleModulo )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt12=1;
                }
                break;
            case 53:
                {
                alt12=2;
                }
                break;
            case 54:
                {
                alt12=3;
                }
                break;
            case 57:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:502:3: this_Constant_0= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:511:3: this_VariableRef_1= ruleVariableRef
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getVariableRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableRef_1=ruleVariableRef();

                    state._fsp--;


                    			current = this_VariableRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:520:3: this_Sum_2= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getSumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_2=ruleSum();

                    state._fsp--;


                    			current = this_Sum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:529:3: this_Modulo_3= ruleModulo
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getModuloParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modulo_3=ruleModulo();

                    state._fsp--;


                    			current = this_Modulo_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleMethod"
    // InternalMyDsl.g:541:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMyDsl.g:541:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMyDsl.g:542:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMyDsl.g:548:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'Method' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'block' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:554:2: ( (otherlv_0= 'Method' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'block' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:555:2: (otherlv_0= 'Method' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'block' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:555:2: (otherlv_0= 'Method' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'block' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' )
            // InternalMyDsl.g:556:3: otherlv_0= 'Method' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'block' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
            		
            // InternalMyDsl.g:560:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:561:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:561:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:562:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getBlockKeyword_3());
            		
            // InternalMyDsl.g:587:3: ( (lv_block_4_0= ruleBlock ) )
            // InternalMyDsl.g:588:4: (lv_block_4_0= ruleBlock )
            {
            // InternalMyDsl.g:588:4: (lv_block_4_0= ruleBlock )
            // InternalMyDsl.g:589:5: lv_block_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_4_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:614:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:614:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:615:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:621:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:627:2: ( ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:628:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:628:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:629:3: () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEDouble ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:629:3: ()
            // InternalMyDsl.g:630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
            		
            // InternalMyDsl.g:640:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:641:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:641:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:642:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:663:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:664:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getValueKeyword_4_0());
                    			
                    // InternalMyDsl.g:668:4: ( (lv_value_5_0= ruleEDouble ) )
                    // InternalMyDsl.g:669:5: (lv_value_5_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:669:5: (lv_value_5_0= ruleEDouble )
                    // InternalMyDsl.g:670:6: lv_value_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getValueEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_value_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:696:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:696:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:697:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:703:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:709:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:710:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:710:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:711:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:711:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:712:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:718:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:719:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,28,FOLLOW_25); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:739:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:740:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:740:4: (kw= 'E' | kw= 'e' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==29) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==30) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:741:5: kw= 'E'
                            {
                            kw=(Token)match(input,29,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:747:5: kw= 'e'
                            {
                            kw=(Token)match(input,30,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:753:4: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:754:5: kw= '-'
                            {
                            kw=(Token)match(input,27,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleLine"
    // InternalMyDsl.g:772:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalMyDsl.g:772:45: (iv_ruleLine= ruleLine EOF )
            // InternalMyDsl.g:773:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalMyDsl.g:779:1: ruleLine returns [EObject current=null] : ( () otherlv_1= 'Line' otherlv_2= '{' (otherlv_3= 'x1' ( (lv_x1_4_0= ruleEDouble ) ) )? (otherlv_5= 'y1' ( (lv_y1_6_0= ruleEDouble ) ) )? (otherlv_7= 'x2' ( (lv_x2_8_0= ruleEDouble ) ) )? (otherlv_9= 'y2' ( (lv_y2_10_0= ruleEDouble ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_x1_4_0 = null;

        AntlrDatatypeRuleToken lv_y1_6_0 = null;

        AntlrDatatypeRuleToken lv_x2_8_0 = null;

        AntlrDatatypeRuleToken lv_y2_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:785:2: ( ( () otherlv_1= 'Line' otherlv_2= '{' (otherlv_3= 'x1' ( (lv_x1_4_0= ruleEDouble ) ) )? (otherlv_5= 'y1' ( (lv_y1_6_0= ruleEDouble ) ) )? (otherlv_7= 'x2' ( (lv_x2_8_0= ruleEDouble ) ) )? (otherlv_9= 'y2' ( (lv_y2_10_0= ruleEDouble ) ) )? otherlv_11= '}' ) )
            // InternalMyDsl.g:786:2: ( () otherlv_1= 'Line' otherlv_2= '{' (otherlv_3= 'x1' ( (lv_x1_4_0= ruleEDouble ) ) )? (otherlv_5= 'y1' ( (lv_y1_6_0= ruleEDouble ) ) )? (otherlv_7= 'x2' ( (lv_x2_8_0= ruleEDouble ) ) )? (otherlv_9= 'y2' ( (lv_y2_10_0= ruleEDouble ) ) )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:786:2: ( () otherlv_1= 'Line' otherlv_2= '{' (otherlv_3= 'x1' ( (lv_x1_4_0= ruleEDouble ) ) )? (otherlv_5= 'y1' ( (lv_y1_6_0= ruleEDouble ) ) )? (otherlv_7= 'x2' ( (lv_x2_8_0= ruleEDouble ) ) )? (otherlv_9= 'y2' ( (lv_y2_10_0= ruleEDouble ) ) )? otherlv_11= '}' )
            // InternalMyDsl.g:787:3: () otherlv_1= 'Line' otherlv_2= '{' (otherlv_3= 'x1' ( (lv_x1_4_0= ruleEDouble ) ) )? (otherlv_5= 'y1' ( (lv_y1_6_0= ruleEDouble ) ) )? (otherlv_7= 'x2' ( (lv_x2_8_0= ruleEDouble ) ) )? (otherlv_9= 'y2' ( (lv_y2_10_0= ruleEDouble ) ) )? otherlv_11= '}'
            {
            // InternalMyDsl.g:787:3: ()
            // InternalMyDsl.g:788:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLineAccess().getLineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:802:3: (otherlv_3= 'x1' ( (lv_x1_4_0= ruleEDouble ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:803:4: otherlv_3= 'x1' ( (lv_x1_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getLineAccess().getX1Keyword_3_0());
                    			
                    // InternalMyDsl.g:807:4: ( (lv_x1_4_0= ruleEDouble ) )
                    // InternalMyDsl.g:808:5: (lv_x1_4_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:808:5: (lv_x1_4_0= ruleEDouble )
                    // InternalMyDsl.g:809:6: lv_x1_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLineAccess().getX1EDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_x1_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineRule());
                    						}
                    						set(
                    							current,
                    							"x1",
                    							lv_x1_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:827:3: (otherlv_5= 'y1' ( (lv_y1_6_0= ruleEDouble ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:828:4: otherlv_5= 'y1' ( (lv_y1_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getLineAccess().getY1Keyword_4_0());
                    			
                    // InternalMyDsl.g:832:4: ( (lv_y1_6_0= ruleEDouble ) )
                    // InternalMyDsl.g:833:5: (lv_y1_6_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:833:5: (lv_y1_6_0= ruleEDouble )
                    // InternalMyDsl.g:834:6: lv_y1_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLineAccess().getY1EDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_y1_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineRule());
                    						}
                    						set(
                    							current,
                    							"y1",
                    							lv_y1_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:852:3: (otherlv_7= 'x2' ( (lv_x2_8_0= ruleEDouble ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:853:4: otherlv_7= 'x2' ( (lv_x2_8_0= ruleEDouble ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getLineAccess().getX2Keyword_5_0());
                    			
                    // InternalMyDsl.g:857:4: ( (lv_x2_8_0= ruleEDouble ) )
                    // InternalMyDsl.g:858:5: (lv_x2_8_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:858:5: (lv_x2_8_0= ruleEDouble )
                    // InternalMyDsl.g:859:6: lv_x2_8_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLineAccess().getX2EDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_x2_8_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineRule());
                    						}
                    						set(
                    							current,
                    							"x2",
                    							lv_x2_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:877:3: (otherlv_9= 'y2' ( (lv_y2_10_0= ruleEDouble ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:878:4: otherlv_9= 'y2' ( (lv_y2_10_0= ruleEDouble ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getLineAccess().getY2Keyword_6_0());
                    			
                    // InternalMyDsl.g:882:4: ( (lv_y2_10_0= ruleEDouble ) )
                    // InternalMyDsl.g:883:5: (lv_y2_10_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:883:5: (lv_y2_10_0= ruleEDouble )
                    // InternalMyDsl.g:884:6: lv_y2_10_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLineAccess().getY2EDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_y2_10_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineRule());
                    						}
                    						set(
                    							current,
                    							"y2",
                    							lv_y2_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLineAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:910:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:910:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:911:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:917:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:923:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:924:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:924:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:925:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:933:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:944:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:944:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:945:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:951:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statements' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_statements_5_0 = null;

        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:957:2: ( ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statements' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMyDsl.g:958:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statements' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMyDsl.g:958:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statements' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMyDsl.g:959:3: () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statements' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMyDsl.g:959:3: ()
            // InternalMyDsl.g:960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:974:3: (otherlv_3= 'statements' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )* otherlv_8= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:975:4: otherlv_3= 'statements' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getStatementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:983:4: ( (lv_statements_5_0= ruleStatement ) )
                    // InternalMyDsl.g:984:5: (lv_statements_5_0= ruleStatement )
                    {
                    // InternalMyDsl.g:984:5: (lv_statements_5_0= ruleStatement )
                    // InternalMyDsl.g:985:6: lv_statements_5_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statements_5_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1002:4: (otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:1003:5: otherlv_6= ',' ( (lv_statements_7_0= ruleStatement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_33); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1007:5: ( (lv_statements_7_0= ruleStatement ) )
                    	    // InternalMyDsl.g:1008:6: (lv_statements_7_0= ruleStatement )
                    	    {
                    	    // InternalMyDsl.g:1008:6: (lv_statements_7_0= ruleStatement )
                    	    // InternalMyDsl.g:1009:7: lv_statements_7_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_statements_7_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_7_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIfStmt"
    // InternalMyDsl.g:1040:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalMyDsl.g:1040:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMyDsl.g:1041:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalMyDsl.g:1047:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'thenBranch' ( (lv_thenBranch_3_0= ruleBlock ) ) (otherlv_4= 'elseBranch' ( (lv_elseBranch_5_0= ruleBlock ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_thenBranch_3_0 = null;

        EObject lv_elseBranch_5_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1053:2: ( (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'thenBranch' ( (lv_thenBranch_3_0= ruleBlock ) ) (otherlv_4= 'elseBranch' ( (lv_elseBranch_5_0= ruleBlock ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:1054:2: (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'thenBranch' ( (lv_thenBranch_3_0= ruleBlock ) ) (otherlv_4= 'elseBranch' ( (lv_elseBranch_5_0= ruleBlock ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:1054:2: (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'thenBranch' ( (lv_thenBranch_3_0= ruleBlock ) ) (otherlv_4= 'elseBranch' ( (lv_elseBranch_5_0= ruleBlock ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' )
            // InternalMyDsl.g:1055:3: otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'thenBranch' ( (lv_thenBranch_3_0= ruleBlock ) ) (otherlv_4= 'elseBranch' ( (lv_elseBranch_5_0= ruleBlock ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStmtAccess().getThenBranchKeyword_2());
            		
            // InternalMyDsl.g:1067:3: ( (lv_thenBranch_3_0= ruleBlock ) )
            // InternalMyDsl.g:1068:4: (lv_thenBranch_3_0= ruleBlock )
            {
            // InternalMyDsl.g:1068:4: (lv_thenBranch_3_0= ruleBlock )
            // InternalMyDsl.g:1069:5: lv_thenBranch_3_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getThenBranchBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_thenBranch_3_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"thenBranch",
            						lv_thenBranch_3_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1086:3: (otherlv_4= 'elseBranch' ( (lv_elseBranch_5_0= ruleBlock ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1087:4: otherlv_4= 'elseBranch' ( (lv_elseBranch_5_0= ruleBlock ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfStmtAccess().getElseBranchKeyword_4_0());
                    			
                    // InternalMyDsl.g:1091:4: ( (lv_elseBranch_5_0= ruleBlock ) )
                    // InternalMyDsl.g:1092:5: (lv_elseBranch_5_0= ruleBlock )
                    {
                    // InternalMyDsl.g:1092:5: (lv_elseBranch_5_0= ruleBlock )
                    // InternalMyDsl.g:1093:6: lv_elseBranch_5_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getIfStmtAccess().getElseBranchBlockParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_elseBranch_5_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                    						}
                    						set(
                    							current,
                    							"elseBranch",
                    							lv_elseBranch_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStmtAccess().getConditionKeyword_5());
            		
            // InternalMyDsl.g:1115:3: ( (lv_condition_7_0= ruleCondition ) )
            // InternalMyDsl.g:1116:4: (lv_condition_7_0= ruleCondition )
            {
            // InternalMyDsl.g:1116:4: (lv_condition_7_0= ruleCondition )
            // InternalMyDsl.g:1117:5: lv_condition_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getConditionConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_condition_7_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_7_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIfStmtAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleVariableAffect"
    // InternalMyDsl.g:1142:1: entryRuleVariableAffect returns [EObject current=null] : iv_ruleVariableAffect= ruleVariableAffect EOF ;
    public final EObject entryRuleVariableAffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAffect = null;


        try {
            // InternalMyDsl.g:1142:55: (iv_ruleVariableAffect= ruleVariableAffect EOF )
            // InternalMyDsl.g:1143:2: iv_ruleVariableAffect= ruleVariableAffect EOF
            {
             newCompositeNode(grammarAccess.getVariableAffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAffect=ruleVariableAffect();

            state._fsp--;

             current =iv_ruleVariableAffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAffect"


    // $ANTLR start "ruleVariableAffect"
    // InternalMyDsl.g:1149:1: ruleVariableAffect returns [EObject current=null] : (otherlv_0= 'variable' ( ( ruleEString ) ) otherlv_2= '<-' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleVariableAffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1155:2: ( (otherlv_0= 'variable' ( ( ruleEString ) ) otherlv_2= '<-' ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalMyDsl.g:1156:2: (otherlv_0= 'variable' ( ( ruleEString ) ) otherlv_2= '<-' ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:1156:2: (otherlv_0= 'variable' ( ( ruleEString ) ) otherlv_2= '<-' ( (lv_value_3_0= ruleValue ) ) )
            // InternalMyDsl.g:1157:3: otherlv_0= 'variable' ( ( ruleEString ) ) otherlv_2= '<-' ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAffectAccess().getVariableKeyword_0());
            		
            // InternalMyDsl.g:1161:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1162:4: ( ruleEString )
            {
            // InternalMyDsl.g:1162:4: ( ruleEString )
            // InternalMyDsl.g:1163:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableAffectRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAffectAccess().getVariableVariableCrossReference_1_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAffectAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalMyDsl.g:1181:3: ( (lv_value_3_0= ruleValue ) )
            // InternalMyDsl.g:1182:4: (lv_value_3_0= ruleValue )
            {
            // InternalMyDsl.g:1182:4: (lv_value_3_0= ruleValue )
            // InternalMyDsl.g:1183:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getVariableAffectAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableAffectRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAffect"


    // $ANTLR start "entryRuleCallMethod"
    // InternalMyDsl.g:1204:1: entryRuleCallMethod returns [EObject current=null] : iv_ruleCallMethod= ruleCallMethod EOF ;
    public final EObject entryRuleCallMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallMethod = null;


        try {
            // InternalMyDsl.g:1204:51: (iv_ruleCallMethod= ruleCallMethod EOF )
            // InternalMyDsl.g:1205:2: iv_ruleCallMethod= ruleCallMethod EOF
            {
             newCompositeNode(grammarAccess.getCallMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallMethod=ruleCallMethod();

            state._fsp--;

             current =iv_ruleCallMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallMethod"


    // $ANTLR start "ruleCallMethod"
    // InternalMyDsl.g:1211:1: ruleCallMethod returns [EObject current=null] : (otherlv_0= 'CallMethod' otherlv_1= '{' otherlv_2= 'method' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleCallMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1217:2: ( (otherlv_0= 'CallMethod' otherlv_1= '{' otherlv_2= 'method' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:1218:2: (otherlv_0= 'CallMethod' otherlv_1= '{' otherlv_2= 'method' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:1218:2: (otherlv_0= 'CallMethod' otherlv_1= '{' otherlv_2= 'method' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalMyDsl.g:1219:3: otherlv_0= 'CallMethod' otherlv_1= '{' otherlv_2= 'method' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCallMethodAccess().getCallMethodKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getCallMethodAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCallMethodAccess().getMethodKeyword_2());
            		
            // InternalMyDsl.g:1231:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1232:4: ( ruleEString )
            {
            // InternalMyDsl.g:1232:4: ( ruleEString )
            // InternalMyDsl.g:1233:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallMethodRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCallMethodAccess().getMethodMethodCrossReference_3_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCallMethodAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallMethod"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:1255:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalMyDsl.g:1255:45: (iv_ruleMove= ruleMove EOF )
            // InternalMyDsl.g:1256:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:1262:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'Move' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1268:2: ( ( () otherlv_1= 'Move' ) )
            // InternalMyDsl.g:1269:2: ( () otherlv_1= 'Move' )
            {
            // InternalMyDsl.g:1269:2: ( () otherlv_1= 'Move' )
            // InternalMyDsl.g:1270:3: () otherlv_1= 'Move'
            {
            // InternalMyDsl.g:1270:3: ()
            // InternalMyDsl.g:1271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAccess().getMoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRotateRight"
    // InternalMyDsl.g:1285:1: entryRuleRotateRight returns [EObject current=null] : iv_ruleRotateRight= ruleRotateRight EOF ;
    public final EObject entryRuleRotateRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateRight = null;


        try {
            // InternalMyDsl.g:1285:52: (iv_ruleRotateRight= ruleRotateRight EOF )
            // InternalMyDsl.g:1286:2: iv_ruleRotateRight= ruleRotateRight EOF
            {
             newCompositeNode(grammarAccess.getRotateRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateRight=ruleRotateRight();

            state._fsp--;

             current =iv_ruleRotateRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotateRight"


    // $ANTLR start "ruleRotateRight"
    // InternalMyDsl.g:1292:1: ruleRotateRight returns [EObject current=null] : ( () otherlv_1= 'RotateRight' ) ;
    public final EObject ruleRotateRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1298:2: ( ( () otherlv_1= 'RotateRight' ) )
            // InternalMyDsl.g:1299:2: ( () otherlv_1= 'RotateRight' )
            {
            // InternalMyDsl.g:1299:2: ( () otherlv_1= 'RotateRight' )
            // InternalMyDsl.g:1300:3: () otherlv_1= 'RotateRight'
            {
            // InternalMyDsl.g:1300:3: ()
            // InternalMyDsl.g:1301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotateRightAccess().getRotateRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateRightAccess().getRotateRightKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotateRight"


    // $ANTLR start "entryRuleRotateLeft"
    // InternalMyDsl.g:1315:1: entryRuleRotateLeft returns [EObject current=null] : iv_ruleRotateLeft= ruleRotateLeft EOF ;
    public final EObject entryRuleRotateLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateLeft = null;


        try {
            // InternalMyDsl.g:1315:51: (iv_ruleRotateLeft= ruleRotateLeft EOF )
            // InternalMyDsl.g:1316:2: iv_ruleRotateLeft= ruleRotateLeft EOF
            {
             newCompositeNode(grammarAccess.getRotateLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateLeft=ruleRotateLeft();

            state._fsp--;

             current =iv_ruleRotateLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotateLeft"


    // $ANTLR start "ruleRotateLeft"
    // InternalMyDsl.g:1322:1: ruleRotateLeft returns [EObject current=null] : ( () otherlv_1= 'RotateLeft' ) ;
    public final EObject ruleRotateLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1328:2: ( ( () otherlv_1= 'RotateLeft' ) )
            // InternalMyDsl.g:1329:2: ( () otherlv_1= 'RotateLeft' )
            {
            // InternalMyDsl.g:1329:2: ( () otherlv_1= 'RotateLeft' )
            // InternalMyDsl.g:1330:3: () otherlv_1= 'RotateLeft'
            {
            // InternalMyDsl.g:1330:3: ()
            // InternalMyDsl.g:1331:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotateLeftAccess().getRotateLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateLeftAccess().getRotateLeftKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotateLeft"


    // $ANTLR start "entryRuleGreaterThan"
    // InternalMyDsl.g:1345:1: entryRuleGreaterThan returns [EObject current=null] : iv_ruleGreaterThan= ruleGreaterThan EOF ;
    public final EObject entryRuleGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThan = null;


        try {
            // InternalMyDsl.g:1345:52: (iv_ruleGreaterThan= ruleGreaterThan EOF )
            // InternalMyDsl.g:1346:2: iv_ruleGreaterThan= ruleGreaterThan EOF
            {
             newCompositeNode(grammarAccess.getGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreaterThan=ruleGreaterThan();

            state._fsp--;

             current =iv_ruleGreaterThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreaterThan"


    // $ANTLR start "ruleGreaterThan"
    // InternalMyDsl.g:1352:1: ruleGreaterThan returns [EObject current=null] : (otherlv_0= 'GreaterThan' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleValue ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleValue ) ) otherlv_6= '}' ) ;
    public final EObject ruleGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_3_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1358:2: ( (otherlv_0= 'GreaterThan' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleValue ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleValue ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1359:2: (otherlv_0= 'GreaterThan' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleValue ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleValue ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1359:2: (otherlv_0= 'GreaterThan' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleValue ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleValue ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1360:3: otherlv_0= 'GreaterThan' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleValue ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleValue ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getGreaterThanAccess().getLeftKeyword_2());
            		
            // InternalMyDsl.g:1372:3: ( (lv_left_3_0= ruleValue ) )
            // InternalMyDsl.g:1373:4: (lv_left_3_0= ruleValue )
            {
            // InternalMyDsl.g:1373:4: (lv_left_3_0= ruleValue )
            // InternalMyDsl.g:1374:5: lv_left_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getGreaterThanAccess().getLeftValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_left_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterThanRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_3_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_39); 

            			newLeafNode(otherlv_4, grammarAccess.getGreaterThanAccess().getRightKeyword_4());
            		
            // InternalMyDsl.g:1395:3: ( (lv_right_5_0= ruleValue ) )
            // InternalMyDsl.g:1396:4: (lv_right_5_0= ruleValue )
            {
            // InternalMyDsl.g:1396:4: (lv_right_5_0= ruleValue )
            // InternalMyDsl.g:1397:5: lv_right_5_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getGreaterThanAccess().getRightValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_right_5_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterThanRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_5_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreaterThan"


    // $ANTLR start "entryRuleConstant"
    // InternalMyDsl.g:1422:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalMyDsl.g:1422:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalMyDsl.g:1423:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMyDsl.g:1429:1: ruleConstant returns [EObject current=null] : ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1435:2: ( ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1436:2: ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1436:2: ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1437:3: () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1437:3: ()
            // InternalMyDsl.g:1438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1452:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1453:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDsl.g:1457:4: ( (lv_value_4_0= ruleEDouble ) )
                    // InternalMyDsl.g:1458:5: (lv_value_4_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:1458:5: (lv_value_4_0= ruleEDouble )
                    // InternalMyDsl.g:1459:6: lv_value_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getValueEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_value_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariableRef"
    // InternalMyDsl.g:1485:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // InternalMyDsl.g:1485:52: (iv_ruleVariableRef= ruleVariableRef EOF )
            // InternalMyDsl.g:1486:2: iv_ruleVariableRef= ruleVariableRef EOF
            {
             newCompositeNode(grammarAccess.getVariableRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableRef=ruleVariableRef();

            state._fsp--;

             current =iv_ruleVariableRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // InternalMyDsl.g:1492:1: ruleVariableRef returns [EObject current=null] : (otherlv_0= 'VariableRef' otherlv_1= '{' otherlv_2= 'variable' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1498:2: ( (otherlv_0= 'VariableRef' otherlv_1= '{' otherlv_2= 'variable' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:1499:2: (otherlv_0= 'VariableRef' otherlv_1= '{' otherlv_2= 'variable' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:1499:2: (otherlv_0= 'VariableRef' otherlv_1= '{' otherlv_2= 'variable' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalMyDsl.g:1500:3: otherlv_0= 'VariableRef' otherlv_1= '{' otherlv_2= 'variable' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableRefAccess().getVariableRefKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableRefAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableRefAccess().getVariableKeyword_2());
            		
            // InternalMyDsl.g:1512:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1513:4: ( ruleEString )
            {
            // InternalMyDsl.g:1513:4: ( ruleEString )
            // InternalMyDsl.g:1514:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_3_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableRefAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleSum"
    // InternalMyDsl.g:1536:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalMyDsl.g:1536:44: (iv_ruleSum= ruleSum EOF )
            // InternalMyDsl.g:1537:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalMyDsl.g:1543:1: ruleSum returns [EObject current=null] : (otherlv_0= '+' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_right_2_0 = null;

        EObject lv_left_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1549:2: ( (otherlv_0= '+' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:1550:2: (otherlv_0= '+' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:1550:2: (otherlv_0= '+' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' )
            // InternalMyDsl.g:1551:3: otherlv_0= '+' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getPlusSignKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1559:3: ( (lv_right_2_0= ruleValue ) )
            // InternalMyDsl.g:1560:4: (lv_right_2_0= ruleValue )
            {
            // InternalMyDsl.g:1560:4: (lv_right_2_0= ruleValue )
            // InternalMyDsl.g:1561:5: lv_right_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getSumAccess().getRightValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
            lv_right_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getSumAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:1582:3: ( (lv_left_4_0= ruleValue ) )
            // InternalMyDsl.g:1583:4: (lv_left_4_0= ruleValue )
            {
            // InternalMyDsl.g:1583:4: (lv_left_4_0= ruleValue )
            // InternalMyDsl.g:1584:5: lv_left_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getSumAccess().getLeftValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_46);
            lv_left_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSumAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleModulo"
    // InternalMyDsl.g:1609:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalMyDsl.g:1609:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalMyDsl.g:1610:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMyDsl.g:1616:1: ruleModulo returns [EObject current=null] : (otherlv_0= '%' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_right_2_0 = null;

        EObject lv_left_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1622:2: ( (otherlv_0= '%' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:1623:2: (otherlv_0= '%' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:1623:2: (otherlv_0= '%' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')' )
            // InternalMyDsl.g:1624:3: otherlv_0= '%' otherlv_1= '(' ( (lv_right_2_0= ruleValue ) ) otherlv_3= ',' ( (lv_left_4_0= ruleValue ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getModuloAccess().getPercentSignKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getModuloAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1632:3: ( (lv_right_2_0= ruleValue ) )
            // InternalMyDsl.g:1633:4: (lv_right_2_0= ruleValue )
            {
            // InternalMyDsl.g:1633:4: (lv_right_2_0= ruleValue )
            // InternalMyDsl.g:1634:5: lv_right_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getModuloAccess().getRightValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
            lv_right_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuloRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getModuloAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:1655:3: ( (lv_left_4_0= ruleValue ) )
            // InternalMyDsl.g:1656:4: (lv_left_4_0= ruleValue )
            {
            // InternalMyDsl.g:1656:4: (lv_left_4_0= ruleValue )
            // InternalMyDsl.g:1657:5: lv_left_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getModuloAccess().getLeftValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_46);
            lv_left_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuloRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModuloAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "ruleCardinals"
    // InternalMyDsl.g:1682:1: ruleCardinals returns [Enumerator current=null] : ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'EAST' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) ) ;
    public final Enumerator ruleCardinals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1688:2: ( ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'EAST' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) ) )
            // InternalMyDsl.g:1689:2: ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'EAST' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) )
            {
            // InternalMyDsl.g:1689:2: ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'EAST' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt28=1;
                }
                break;
            case 59:
                {
                alt28=2;
                }
                break;
            case 60:
                {
                alt28=3;
                }
                break;
            case 61:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1690:3: (enumLiteral_0= 'NORTH' )
                    {
                    // InternalMyDsl.g:1690:3: (enumLiteral_0= 'NORTH' )
                    // InternalMyDsl.g:1691:4: enumLiteral_0= 'NORTH'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getCardinalsAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalsAccess().getNORTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1698:3: (enumLiteral_1= 'EAST' )
                    {
                    // InternalMyDsl.g:1698:3: (enumLiteral_1= 'EAST' )
                    // InternalMyDsl.g:1699:4: enumLiteral_1= 'EAST'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getCardinalsAccess().getEASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalsAccess().getEASTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1706:3: (enumLiteral_2= 'SOUTH' )
                    {
                    // InternalMyDsl.g:1706:3: (enumLiteral_2= 'SOUTH' )
                    // InternalMyDsl.g:1707:4: enumLiteral_2= 'SOUTH'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getCardinalsAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalsAccess().getSOUTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1714:3: (enumLiteral_3= 'WEST' )
                    {
                    // InternalMyDsl.g:1714:3: (enumLiteral_3= 'WEST' )
                    // InternalMyDsl.g:1715:4: enumLiteral_3= 'WEST'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCardinalsAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCardinalsAccess().getWESTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinals"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000740000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000F00100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000E00100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001D44000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0270000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000000L});

}