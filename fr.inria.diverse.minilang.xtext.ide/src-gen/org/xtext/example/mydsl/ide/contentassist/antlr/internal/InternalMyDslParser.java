package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'NORTH'", "'EAST'", "'SOUTH'", "'WEST'", "'Program'", "'{'", "'mainMethod'", "'}'", "'x'", "'y'", "'angle'", "'distance'", "'methods'", "','", "'variables'", "'lines'", "'Method'", "'block'", "'Variable'", "'value'", "'-'", "'.'", "'Line'", "'x1'", "'y1'", "'x2'", "'y2'", "'Block'", "'statements'", "'If'", "'thenBranch'", "'condition'", "'elseBranch'", "'variable'", "'<-'", "'CallMethod'", "'method'", "'Move'", "'RotateRight'", "'RotateLeft'", "'GreaterThan'", "'left'", "'right'", "'Constant'", "'VariableRef'", "'+'", "'('", "')'", "'%'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgram EOF )
            // InternalMyDsl.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Program__Group__0 )
            // InternalMyDsl.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStatement EOF )
            // InternalMyDsl.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Statement__Alternatives )
            // InternalMyDsl.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:103:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCondition EOF )
            // InternalMyDsl.g:105:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:112:1: ruleCondition : ( ruleGreaterThan ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ruleGreaterThan ) )
            // InternalMyDsl.g:117:2: ( ruleGreaterThan )
            {
            // InternalMyDsl.g:117:2: ( ruleGreaterThan )
            // InternalMyDsl.g:118:3: ruleGreaterThan
            {
             before(grammarAccess.getConditionAccess().getGreaterThanParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleGreaterThan();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getGreaterThanParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleValue EOF )
            // InternalMyDsl.g:130:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:144:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleMethod"
    // InternalMyDsl.g:153:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMethod EOF )
            // InternalMyDsl.g:155:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMyDsl.g:162:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Method__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Method__Group__0 )
            // InternalMyDsl.g:169:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:178:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleVariable EOF )
            // InternalMyDsl.g:180:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:187:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Variable__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Variable__Group__0 )
            // InternalMyDsl.g:194:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:203:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEDouble EOF )
            // InternalMyDsl.g:205:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:212:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EDouble__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__EDouble__Group__0 )
            // InternalMyDsl.g:219:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleLine"
    // InternalMyDsl.g:228:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleLine EOF )
            // InternalMyDsl.g:230:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalMyDsl.g:237:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Line__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Line__Group__0 )
            // InternalMyDsl.g:244:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEString EOF )
            // InternalMyDsl.g:255:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:269:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:278:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleBlock EOF )
            // InternalMyDsl.g:280:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:287:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Block__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Block__Group__0 )
            // InternalMyDsl.g:294:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIfStmt"
    // InternalMyDsl.g:303:1: entryRuleIfStmt : ruleIfStmt EOF ;
    public final void entryRuleIfStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleIfStmt EOF )
            // InternalMyDsl.g:305:1: ruleIfStmt EOF
            {
             before(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStmt();

            state._fsp--;

             after(grammarAccess.getIfStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalMyDsl.g:312:1: ruleIfStmt : ( ( rule__IfStmt__Group__0 ) ) ;
    public final void ruleIfStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__IfStmt__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__IfStmt__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__IfStmt__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__IfStmt__Group__0 )
            {
             before(grammarAccess.getIfStmtAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__IfStmt__Group__0 )
            // InternalMyDsl.g:319:4: rule__IfStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleVariableAffect"
    // InternalMyDsl.g:328:1: entryRuleVariableAffect : ruleVariableAffect EOF ;
    public final void entryRuleVariableAffect() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleVariableAffect EOF )
            // InternalMyDsl.g:330:1: ruleVariableAffect EOF
            {
             before(grammarAccess.getVariableAffectRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableAffect();

            state._fsp--;

             after(grammarAccess.getVariableAffectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableAffect"


    // $ANTLR start "ruleVariableAffect"
    // InternalMyDsl.g:337:1: ruleVariableAffect : ( ( rule__VariableAffect__Group__0 ) ) ;
    public final void ruleVariableAffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__VariableAffect__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__VariableAffect__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__VariableAffect__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__VariableAffect__Group__0 )
            {
             before(grammarAccess.getVariableAffectAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__VariableAffect__Group__0 )
            // InternalMyDsl.g:344:4: rule__VariableAffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAffect"


    // $ANTLR start "entryRuleCallMethod"
    // InternalMyDsl.g:353:1: entryRuleCallMethod : ruleCallMethod EOF ;
    public final void entryRuleCallMethod() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleCallMethod EOF )
            // InternalMyDsl.g:355:1: ruleCallMethod EOF
            {
             before(grammarAccess.getCallMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleCallMethod();

            state._fsp--;

             after(grammarAccess.getCallMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCallMethod"


    // $ANTLR start "ruleCallMethod"
    // InternalMyDsl.g:362:1: ruleCallMethod : ( ( rule__CallMethod__Group__0 ) ) ;
    public final void ruleCallMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__CallMethod__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__CallMethod__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__CallMethod__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__CallMethod__Group__0 )
            {
             before(grammarAccess.getCallMethodAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__CallMethod__Group__0 )
            // InternalMyDsl.g:369:4: rule__CallMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallMethod"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:378:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMove EOF )
            // InternalMyDsl.g:380:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:387:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Move__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Move__Group__0 )
            // InternalMyDsl.g:394:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRotateRight"
    // InternalMyDsl.g:403:1: entryRuleRotateRight : ruleRotateRight EOF ;
    public final void entryRuleRotateRight() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleRotateRight EOF )
            // InternalMyDsl.g:405:1: ruleRotateRight EOF
            {
             before(grammarAccess.getRotateRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateRight();

            state._fsp--;

             after(grammarAccess.getRotateRightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotateRight"


    // $ANTLR start "ruleRotateRight"
    // InternalMyDsl.g:412:1: ruleRotateRight : ( ( rule__RotateRight__Group__0 ) ) ;
    public final void ruleRotateRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__RotateRight__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__RotateRight__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__RotateRight__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__RotateRight__Group__0 )
            {
             before(grammarAccess.getRotateRightAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__RotateRight__Group__0 )
            // InternalMyDsl.g:419:4: rule__RotateRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotateRight"


    // $ANTLR start "entryRuleRotateLeft"
    // InternalMyDsl.g:428:1: entryRuleRotateLeft : ruleRotateLeft EOF ;
    public final void entryRuleRotateLeft() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleRotateLeft EOF )
            // InternalMyDsl.g:430:1: ruleRotateLeft EOF
            {
             before(grammarAccess.getRotateLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateLeft();

            state._fsp--;

             after(grammarAccess.getRotateLeftRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotateLeft"


    // $ANTLR start "ruleRotateLeft"
    // InternalMyDsl.g:437:1: ruleRotateLeft : ( ( rule__RotateLeft__Group__0 ) ) ;
    public final void ruleRotateLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__RotateLeft__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__RotateLeft__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__RotateLeft__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__RotateLeft__Group__0 )
            {
             before(grammarAccess.getRotateLeftAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__RotateLeft__Group__0 )
            // InternalMyDsl.g:444:4: rule__RotateLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotateLeft"


    // $ANTLR start "entryRuleGreaterThan"
    // InternalMyDsl.g:453:1: entryRuleGreaterThan : ruleGreaterThan EOF ;
    public final void entryRuleGreaterThan() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleGreaterThan EOF )
            // InternalMyDsl.g:455:1: ruleGreaterThan EOF
            {
             before(grammarAccess.getGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            ruleGreaterThan();

            state._fsp--;

             after(grammarAccess.getGreaterThanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreaterThan"


    // $ANTLR start "ruleGreaterThan"
    // InternalMyDsl.g:462:1: ruleGreaterThan : ( ( rule__GreaterThan__Group__0 ) ) ;
    public final void ruleGreaterThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__GreaterThan__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__GreaterThan__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__GreaterThan__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__GreaterThan__Group__0 )
            {
             before(grammarAccess.getGreaterThanAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__GreaterThan__Group__0 )
            // InternalMyDsl.g:469:4: rule__GreaterThan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreaterThanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreaterThan"


    // $ANTLR start "entryRuleConstant"
    // InternalMyDsl.g:478:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleConstant EOF )
            // InternalMyDsl.g:480:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMyDsl.g:487:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Constant__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Constant__Group__0 )
            // InternalMyDsl.g:494:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariableRef"
    // InternalMyDsl.g:503:1: entryRuleVariableRef : ruleVariableRef EOF ;
    public final void entryRuleVariableRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleVariableRef EOF )
            // InternalMyDsl.g:505:1: ruleVariableRef EOF
            {
             before(grammarAccess.getVariableRefRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableRef();

            state._fsp--;

             after(grammarAccess.getVariableRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // InternalMyDsl.g:512:1: ruleVariableRef : ( ( rule__VariableRef__Group__0 ) ) ;
    public final void ruleVariableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__VariableRef__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__VariableRef__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__VariableRef__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__VariableRef__Group__0 )
            {
             before(grammarAccess.getVariableRefAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__VariableRef__Group__0 )
            // InternalMyDsl.g:519:4: rule__VariableRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleSum"
    // InternalMyDsl.g:528:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleSum EOF )
            // InternalMyDsl.g:530:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalMyDsl.g:537:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Sum__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Sum__Group__0 )
            // InternalMyDsl.g:544:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleModulo"
    // InternalMyDsl.g:553:1: entryRuleModulo : ruleModulo EOF ;
    public final void entryRuleModulo() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleModulo EOF )
            // InternalMyDsl.g:555:1: ruleModulo EOF
            {
             before(grammarAccess.getModuloRule()); 
            pushFollow(FOLLOW_1);
            ruleModulo();

            state._fsp--;

             after(grammarAccess.getModuloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMyDsl.g:562:1: ruleModulo : ( ( rule__Modulo__Group__0 ) ) ;
    public final void ruleModulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Modulo__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Modulo__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Modulo__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Modulo__Group__0 )
            {
             before(grammarAccess.getModuloAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Modulo__Group__0 )
            // InternalMyDsl.g:569:4: rule__Modulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "ruleCardinals"
    // InternalMyDsl.g:578:1: ruleCardinals : ( ( rule__Cardinals__Alternatives ) ) ;
    public final void ruleCardinals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( rule__Cardinals__Alternatives ) ) )
            // InternalMyDsl.g:583:2: ( ( rule__Cardinals__Alternatives ) )
            {
            // InternalMyDsl.g:583:2: ( ( rule__Cardinals__Alternatives ) )
            // InternalMyDsl.g:584:3: ( rule__Cardinals__Alternatives )
            {
             before(grammarAccess.getCardinalsAccess().getAlternatives()); 
            // InternalMyDsl.g:585:3: ( rule__Cardinals__Alternatives )
            // InternalMyDsl.g:585:4: rule__Cardinals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinals"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyDsl.g:593:1: rule__Statement__Alternatives : ( ( ruleIfStmt ) | ( ruleVariableAffect ) | ( ruleCallMethod ) | ( ruleMove ) | ( ruleRotateRight ) | ( ruleRotateLeft ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( ( ruleIfStmt ) | ( ruleVariableAffect ) | ( ruleCallMethod ) | ( ruleMove ) | ( ruleRotateRight ) | ( ruleRotateLeft ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 48:
                {
                alt1=3;
                }
                break;
            case 50:
                {
                alt1=4;
                }
                break;
            case 51:
                {
                alt1=5;
                }
                break;
            case 52:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:598:2: ( ruleIfStmt )
                    {
                    // InternalMyDsl.g:598:2: ( ruleIfStmt )
                    // InternalMyDsl.g:599:3: ruleIfStmt
                    {
                     before(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStmt();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:604:2: ( ruleVariableAffect )
                    {
                    // InternalMyDsl.g:604:2: ( ruleVariableAffect )
                    // InternalMyDsl.g:605:3: ruleVariableAffect
                    {
                     before(grammarAccess.getStatementAccess().getVariableAffectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableAffect();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableAffectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:610:2: ( ruleCallMethod )
                    {
                    // InternalMyDsl.g:610:2: ( ruleCallMethod )
                    // InternalMyDsl.g:611:3: ruleCallMethod
                    {
                     before(grammarAccess.getStatementAccess().getCallMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCallMethod();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCallMethodParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:616:2: ( ruleMove )
                    {
                    // InternalMyDsl.g:616:2: ( ruleMove )
                    // InternalMyDsl.g:617:3: ruleMove
                    {
                     before(grammarAccess.getStatementAccess().getMoveParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoveParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:622:2: ( ruleRotateRight )
                    {
                    // InternalMyDsl.g:622:2: ( ruleRotateRight )
                    // InternalMyDsl.g:623:3: ruleRotateRight
                    {
                     before(grammarAccess.getStatementAccess().getRotateRightParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateRight();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRotateRightParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:628:2: ( ruleRotateLeft )
                    {
                    // InternalMyDsl.g:628:2: ( ruleRotateLeft )
                    // InternalMyDsl.g:629:3: ruleRotateLeft
                    {
                     before(grammarAccess.getStatementAccess().getRotateLeftParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateLeft();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRotateLeftParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyDsl.g:638:1: rule__Value__Alternatives : ( ( ruleConstant ) | ( ruleVariableRef ) | ( ruleSum ) | ( ruleModulo ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( ruleConstant ) | ( ruleVariableRef ) | ( ruleSum ) | ( ruleModulo ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt2=1;
                }
                break;
            case 57:
                {
                alt2=2;
                }
                break;
            case 58:
                {
                alt2=3;
                }
                break;
            case 61:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:643:2: ( ruleConstant )
                    {
                    // InternalMyDsl.g:643:2: ( ruleConstant )
                    // InternalMyDsl.g:644:3: ruleConstant
                    {
                     before(grammarAccess.getValueAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:649:2: ( ruleVariableRef )
                    {
                    // InternalMyDsl.g:649:2: ( ruleVariableRef )
                    // InternalMyDsl.g:650:3: ruleVariableRef
                    {
                     before(grammarAccess.getValueAccess().getVariableRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableRef();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getVariableRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:655:2: ( ruleSum )
                    {
                    // InternalMyDsl.g:655:2: ( ruleSum )
                    // InternalMyDsl.g:656:3: ruleSum
                    {
                     before(grammarAccess.getValueAccess().getSumParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSum();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getSumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:661:2: ( ruleModulo )
                    {
                    // InternalMyDsl.g:661:2: ( ruleModulo )
                    // InternalMyDsl.g:662:3: ruleModulo
                    {
                     before(grammarAccess.getValueAccess().getModuloParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleModulo();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getModuloParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalMyDsl.g:671:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:676:2: ( 'E' )
                    {
                    // InternalMyDsl.g:676:2: ( 'E' )
                    // InternalMyDsl.g:677:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:682:2: ( 'e' )
                    {
                    // InternalMyDsl.g:682:2: ( 'e' )
                    // InternalMyDsl.g:683:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:692:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:697:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:697:2: ( RULE_STRING )
                    // InternalMyDsl.g:698:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:703:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:703:2: ( RULE_ID )
                    // InternalMyDsl.g:704:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Cardinals__Alternatives"
    // InternalMyDsl.g:713:1: rule__Cardinals__Alternatives : ( ( ( 'NORTH' ) ) | ( ( 'EAST' ) ) | ( ( 'SOUTH' ) ) | ( ( 'WEST' ) ) );
    public final void rule__Cardinals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( ( ( 'NORTH' ) ) | ( ( 'EAST' ) ) | ( ( 'SOUTH' ) ) | ( ( 'WEST' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:718:2: ( ( 'NORTH' ) )
                    {
                    // InternalMyDsl.g:718:2: ( ( 'NORTH' ) )
                    // InternalMyDsl.g:719:3: ( 'NORTH' )
                    {
                     before(grammarAccess.getCardinalsAccess().getNORTHEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:720:3: ( 'NORTH' )
                    // InternalMyDsl.g:720:4: 'NORTH'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalsAccess().getNORTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:724:2: ( ( 'EAST' ) )
                    {
                    // InternalMyDsl.g:724:2: ( ( 'EAST' ) )
                    // InternalMyDsl.g:725:3: ( 'EAST' )
                    {
                     before(grammarAccess.getCardinalsAccess().getEASTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:726:3: ( 'EAST' )
                    // InternalMyDsl.g:726:4: 'EAST'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalsAccess().getEASTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:730:2: ( ( 'SOUTH' ) )
                    {
                    // InternalMyDsl.g:730:2: ( ( 'SOUTH' ) )
                    // InternalMyDsl.g:731:3: ( 'SOUTH' )
                    {
                     before(grammarAccess.getCardinalsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:732:3: ( 'SOUTH' )
                    // InternalMyDsl.g:732:4: 'SOUTH'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalsAccess().getSOUTHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:736:2: ( ( 'WEST' ) )
                    {
                    // InternalMyDsl.g:736:2: ( ( 'WEST' ) )
                    // InternalMyDsl.g:737:3: ( 'WEST' )
                    {
                     before(grammarAccess.getCardinalsAccess().getWESTEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:738:3: ( 'WEST' )
                    // InternalMyDsl.g:738:4: 'WEST'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalsAccess().getWESTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinals__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMyDsl.g:746:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyDsl.g:751:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMyDsl.g:758:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:762:1: ( ( 'Program' ) )
            // InternalMyDsl.g:763:1: ( 'Program' )
            {
            // InternalMyDsl.g:763:1: ( 'Program' )
            // InternalMyDsl.g:764:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMyDsl.g:773:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMyDsl.g:778:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMyDsl.g:785:1: rule__Program__Group__1__Impl : ( '{' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:789:1: ( ( '{' ) )
            // InternalMyDsl.g:790:1: ( '{' )
            {
            // InternalMyDsl.g:790:1: ( '{' )
            // InternalMyDsl.g:791:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMyDsl.g:800:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalMyDsl.g:805:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMyDsl.g:812:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )? ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:1: ( ( ( rule__Program__Group_2__0 )? ) )
            // InternalMyDsl.g:817:1: ( ( rule__Program__Group_2__0 )? )
            {
            // InternalMyDsl.g:817:1: ( ( rule__Program__Group_2__0 )? )
            // InternalMyDsl.g:818:2: ( rule__Program__Group_2__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // InternalMyDsl.g:819:2: ( rule__Program__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:819:3: rule__Program__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalMyDsl.g:827:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalMyDsl.g:832:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalMyDsl.g:839:1: rule__Program__Group__3__Impl : ( ( rule__Program__Group_3__0 )? ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( ( ( rule__Program__Group_3__0 )? ) )
            // InternalMyDsl.g:844:1: ( ( rule__Program__Group_3__0 )? )
            {
            // InternalMyDsl.g:844:1: ( ( rule__Program__Group_3__0 )? )
            // InternalMyDsl.g:845:2: ( rule__Program__Group_3__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_3()); 
            // InternalMyDsl.g:846:2: ( rule__Program__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:846:3: rule__Program__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalMyDsl.g:854:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalMyDsl.g:859:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalMyDsl.g:866:1: rule__Program__Group__4__Impl : ( ( rule__Program__Group_4__0 )? ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:870:1: ( ( ( rule__Program__Group_4__0 )? ) )
            // InternalMyDsl.g:871:1: ( ( rule__Program__Group_4__0 )? )
            {
            // InternalMyDsl.g:871:1: ( ( rule__Program__Group_4__0 )? )
            // InternalMyDsl.g:872:2: ( rule__Program__Group_4__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_4()); 
            // InternalMyDsl.g:873:2: ( rule__Program__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:873:3: rule__Program__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalMyDsl.g:881:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalMyDsl.g:886:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalMyDsl.g:893:1: rule__Program__Group__5__Impl : ( ( rule__Program__Group_5__0 )? ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:897:1: ( ( ( rule__Program__Group_5__0 )? ) )
            // InternalMyDsl.g:898:1: ( ( rule__Program__Group_5__0 )? )
            {
            // InternalMyDsl.g:898:1: ( ( rule__Program__Group_5__0 )? )
            // InternalMyDsl.g:899:2: ( rule__Program__Group_5__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_5()); 
            // InternalMyDsl.g:900:2: ( rule__Program__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:900:3: rule__Program__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // InternalMyDsl.g:908:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalMyDsl.g:913:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // InternalMyDsl.g:920:1: rule__Program__Group__6__Impl : ( 'mainMethod' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( ( 'mainMethod' ) )
            // InternalMyDsl.g:925:1: ( 'mainMethod' )
            {
            // InternalMyDsl.g:925:1: ( 'mainMethod' )
            // InternalMyDsl.g:926:2: 'mainMethod'
            {
             before(grammarAccess.getProgramAccess().getMainMethodKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getMainMethodKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Program__Group__7"
    // InternalMyDsl.g:935:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalMyDsl.g:940:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7"


    // $ANTLR start "rule__Program__Group__7__Impl"
    // InternalMyDsl.g:947:1: rule__Program__Group__7__Impl : ( ( rule__Program__MainMethodAssignment_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( ( rule__Program__MainMethodAssignment_7 ) ) )
            // InternalMyDsl.g:952:1: ( ( rule__Program__MainMethodAssignment_7 ) )
            {
            // InternalMyDsl.g:952:1: ( ( rule__Program__MainMethodAssignment_7 ) )
            // InternalMyDsl.g:953:2: ( rule__Program__MainMethodAssignment_7 )
            {
             before(grammarAccess.getProgramAccess().getMainMethodAssignment_7()); 
            // InternalMyDsl.g:954:2: ( rule__Program__MainMethodAssignment_7 )
            // InternalMyDsl.g:954:3: rule__Program__MainMethodAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Program__MainMethodAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainMethodAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7__Impl"


    // $ANTLR start "rule__Program__Group__8"
    // InternalMyDsl.g:962:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalMyDsl.g:967:2: rule__Program__Group__8__Impl rule__Program__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8"


    // $ANTLR start "rule__Program__Group__8__Impl"
    // InternalMyDsl.g:974:1: rule__Program__Group__8__Impl : ( ( rule__Program__Group_8__0 )? ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:978:1: ( ( ( rule__Program__Group_8__0 )? ) )
            // InternalMyDsl.g:979:1: ( ( rule__Program__Group_8__0 )? )
            {
            // InternalMyDsl.g:979:1: ( ( rule__Program__Group_8__0 )? )
            // InternalMyDsl.g:980:2: ( rule__Program__Group_8__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_8()); 
            // InternalMyDsl.g:981:2: ( rule__Program__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:981:3: rule__Program__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8__Impl"


    // $ANTLR start "rule__Program__Group__9"
    // InternalMyDsl.g:989:1: rule__Program__Group__9 : rule__Program__Group__9__Impl rule__Program__Group__10 ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( rule__Program__Group__9__Impl rule__Program__Group__10 )
            // InternalMyDsl.g:994:2: rule__Program__Group__9__Impl rule__Program__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9"


    // $ANTLR start "rule__Program__Group__9__Impl"
    // InternalMyDsl.g:1001:1: rule__Program__Group__9__Impl : ( ( rule__Program__Group_9__0 )? ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( ( ( rule__Program__Group_9__0 )? ) )
            // InternalMyDsl.g:1006:1: ( ( rule__Program__Group_9__0 )? )
            {
            // InternalMyDsl.g:1006:1: ( ( rule__Program__Group_9__0 )? )
            // InternalMyDsl.g:1007:2: ( rule__Program__Group_9__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_9()); 
            // InternalMyDsl.g:1008:2: ( rule__Program__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1008:3: rule__Program__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9__Impl"


    // $ANTLR start "rule__Program__Group__10"
    // InternalMyDsl.g:1016:1: rule__Program__Group__10 : rule__Program__Group__10__Impl rule__Program__Group__11 ;
    public final void rule__Program__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( rule__Program__Group__10__Impl rule__Program__Group__11 )
            // InternalMyDsl.g:1021:2: rule__Program__Group__10__Impl rule__Program__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__10"


    // $ANTLR start "rule__Program__Group__10__Impl"
    // InternalMyDsl.g:1028:1: rule__Program__Group__10__Impl : ( ( rule__Program__Group_10__0 )? ) ;
    public final void rule__Program__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1032:1: ( ( ( rule__Program__Group_10__0 )? ) )
            // InternalMyDsl.g:1033:1: ( ( rule__Program__Group_10__0 )? )
            {
            // InternalMyDsl.g:1033:1: ( ( rule__Program__Group_10__0 )? )
            // InternalMyDsl.g:1034:2: ( rule__Program__Group_10__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_10()); 
            // InternalMyDsl.g:1035:2: ( rule__Program__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1035:3: rule__Program__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__10__Impl"


    // $ANTLR start "rule__Program__Group__11"
    // InternalMyDsl.g:1043:1: rule__Program__Group__11 : rule__Program__Group__11__Impl ;
    public final void rule__Program__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1047:1: ( rule__Program__Group__11__Impl )
            // InternalMyDsl.g:1048:2: rule__Program__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__11"


    // $ANTLR start "rule__Program__Group__11__Impl"
    // InternalMyDsl.g:1054:1: rule__Program__Group__11__Impl : ( '}' ) ;
    public final void rule__Program__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( ( '}' ) )
            // InternalMyDsl.g:1059:1: ( '}' )
            {
            // InternalMyDsl.g:1059:1: ( '}' )
            // InternalMyDsl.g:1060:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__11__Impl"


    // $ANTLR start "rule__Program__Group_2__0"
    // InternalMyDsl.g:1070:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // InternalMyDsl.g:1075:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0"


    // $ANTLR start "rule__Program__Group_2__0__Impl"
    // InternalMyDsl.g:1082:1: rule__Program__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( ( 'x' ) )
            // InternalMyDsl.g:1087:1: ( 'x' )
            {
            // InternalMyDsl.g:1087:1: ( 'x' )
            // InternalMyDsl.g:1088:2: 'x'
            {
             before(grammarAccess.getProgramAccess().getXKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getXKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0__Impl"


    // $ANTLR start "rule__Program__Group_2__1"
    // InternalMyDsl.g:1097:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( rule__Program__Group_2__1__Impl )
            // InternalMyDsl.g:1102:2: rule__Program__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1"


    // $ANTLR start "rule__Program__Group_2__1__Impl"
    // InternalMyDsl.g:1108:1: rule__Program__Group_2__1__Impl : ( ( rule__Program__XAssignment_2_1 ) ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( ( ( rule__Program__XAssignment_2_1 ) ) )
            // InternalMyDsl.g:1113:1: ( ( rule__Program__XAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1113:1: ( ( rule__Program__XAssignment_2_1 ) )
            // InternalMyDsl.g:1114:2: ( rule__Program__XAssignment_2_1 )
            {
             before(grammarAccess.getProgramAccess().getXAssignment_2_1()); 
            // InternalMyDsl.g:1115:2: ( rule__Program__XAssignment_2_1 )
            // InternalMyDsl.g:1115:3: rule__Program__XAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__XAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getXAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1__Impl"


    // $ANTLR start "rule__Program__Group_3__0"
    // InternalMyDsl.g:1124:1: rule__Program__Group_3__0 : rule__Program__Group_3__0__Impl rule__Program__Group_3__1 ;
    public final void rule__Program__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( rule__Program__Group_3__0__Impl rule__Program__Group_3__1 )
            // InternalMyDsl.g:1129:2: rule__Program__Group_3__0__Impl rule__Program__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0"


    // $ANTLR start "rule__Program__Group_3__0__Impl"
    // InternalMyDsl.g:1136:1: rule__Program__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__Program__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( ( 'y' ) )
            // InternalMyDsl.g:1141:1: ( 'y' )
            {
            // InternalMyDsl.g:1141:1: ( 'y' )
            // InternalMyDsl.g:1142:2: 'y'
            {
             before(grammarAccess.getProgramAccess().getYKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0__Impl"


    // $ANTLR start "rule__Program__Group_3__1"
    // InternalMyDsl.g:1151:1: rule__Program__Group_3__1 : rule__Program__Group_3__1__Impl ;
    public final void rule__Program__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( rule__Program__Group_3__1__Impl )
            // InternalMyDsl.g:1156:2: rule__Program__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1"


    // $ANTLR start "rule__Program__Group_3__1__Impl"
    // InternalMyDsl.g:1162:1: rule__Program__Group_3__1__Impl : ( ( rule__Program__YAssignment_3_1 ) ) ;
    public final void rule__Program__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( ( ( rule__Program__YAssignment_3_1 ) ) )
            // InternalMyDsl.g:1167:1: ( ( rule__Program__YAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1167:1: ( ( rule__Program__YAssignment_3_1 ) )
            // InternalMyDsl.g:1168:2: ( rule__Program__YAssignment_3_1 )
            {
             before(grammarAccess.getProgramAccess().getYAssignment_3_1()); 
            // InternalMyDsl.g:1169:2: ( rule__Program__YAssignment_3_1 )
            // InternalMyDsl.g:1169:3: rule__Program__YAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__YAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getYAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1__Impl"


    // $ANTLR start "rule__Program__Group_4__0"
    // InternalMyDsl.g:1178:1: rule__Program__Group_4__0 : rule__Program__Group_4__0__Impl rule__Program__Group_4__1 ;
    public final void rule__Program__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( rule__Program__Group_4__0__Impl rule__Program__Group_4__1 )
            // InternalMyDsl.g:1183:2: rule__Program__Group_4__0__Impl rule__Program__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__0"


    // $ANTLR start "rule__Program__Group_4__0__Impl"
    // InternalMyDsl.g:1190:1: rule__Program__Group_4__0__Impl : ( 'angle' ) ;
    public final void rule__Program__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( ( 'angle' ) )
            // InternalMyDsl.g:1195:1: ( 'angle' )
            {
            // InternalMyDsl.g:1195:1: ( 'angle' )
            // InternalMyDsl.g:1196:2: 'angle'
            {
             before(grammarAccess.getProgramAccess().getAngleKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getAngleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__0__Impl"


    // $ANTLR start "rule__Program__Group_4__1"
    // InternalMyDsl.g:1205:1: rule__Program__Group_4__1 : rule__Program__Group_4__1__Impl ;
    public final void rule__Program__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( rule__Program__Group_4__1__Impl )
            // InternalMyDsl.g:1210:2: rule__Program__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__1"


    // $ANTLR start "rule__Program__Group_4__1__Impl"
    // InternalMyDsl.g:1216:1: rule__Program__Group_4__1__Impl : ( ( rule__Program__AngleAssignment_4_1 ) ) ;
    public final void rule__Program__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( ( ( rule__Program__AngleAssignment_4_1 ) ) )
            // InternalMyDsl.g:1221:1: ( ( rule__Program__AngleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1221:1: ( ( rule__Program__AngleAssignment_4_1 ) )
            // InternalMyDsl.g:1222:2: ( rule__Program__AngleAssignment_4_1 )
            {
             before(grammarAccess.getProgramAccess().getAngleAssignment_4_1()); 
            // InternalMyDsl.g:1223:2: ( rule__Program__AngleAssignment_4_1 )
            // InternalMyDsl.g:1223:3: rule__Program__AngleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__AngleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAngleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__1__Impl"


    // $ANTLR start "rule__Program__Group_5__0"
    // InternalMyDsl.g:1232:1: rule__Program__Group_5__0 : rule__Program__Group_5__0__Impl rule__Program__Group_5__1 ;
    public final void rule__Program__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( rule__Program__Group_5__0__Impl rule__Program__Group_5__1 )
            // InternalMyDsl.g:1237:2: rule__Program__Group_5__0__Impl rule__Program__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_5__0"


    // $ANTLR start "rule__Program__Group_5__0__Impl"
    // InternalMyDsl.g:1244:1: rule__Program__Group_5__0__Impl : ( 'distance' ) ;
    public final void rule__Program__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( ( 'distance' ) )
            // InternalMyDsl.g:1249:1: ( 'distance' )
            {
            // InternalMyDsl.g:1249:1: ( 'distance' )
            // InternalMyDsl.g:1250:2: 'distance'
            {
             before(grammarAccess.getProgramAccess().getDistanceKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getDistanceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_5__0__Impl"


    // $ANTLR start "rule__Program__Group_5__1"
    // InternalMyDsl.g:1259:1: rule__Program__Group_5__1 : rule__Program__Group_5__1__Impl ;
    public final void rule__Program__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1263:1: ( rule__Program__Group_5__1__Impl )
            // InternalMyDsl.g:1264:2: rule__Program__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_5__1"


    // $ANTLR start "rule__Program__Group_5__1__Impl"
    // InternalMyDsl.g:1270:1: rule__Program__Group_5__1__Impl : ( ( rule__Program__DistanceAssignment_5_1 ) ) ;
    public final void rule__Program__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( ( ( rule__Program__DistanceAssignment_5_1 ) ) )
            // InternalMyDsl.g:1275:1: ( ( rule__Program__DistanceAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1275:1: ( ( rule__Program__DistanceAssignment_5_1 ) )
            // InternalMyDsl.g:1276:2: ( rule__Program__DistanceAssignment_5_1 )
            {
             before(grammarAccess.getProgramAccess().getDistanceAssignment_5_1()); 
            // InternalMyDsl.g:1277:2: ( rule__Program__DistanceAssignment_5_1 )
            // InternalMyDsl.g:1277:3: rule__Program__DistanceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__DistanceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getDistanceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_5__1__Impl"


    // $ANTLR start "rule__Program__Group_8__0"
    // InternalMyDsl.g:1286:1: rule__Program__Group_8__0 : rule__Program__Group_8__0__Impl rule__Program__Group_8__1 ;
    public final void rule__Program__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( rule__Program__Group_8__0__Impl rule__Program__Group_8__1 )
            // InternalMyDsl.g:1291:2: rule__Program__Group_8__0__Impl rule__Program__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__0"


    // $ANTLR start "rule__Program__Group_8__0__Impl"
    // InternalMyDsl.g:1298:1: rule__Program__Group_8__0__Impl : ( 'methods' ) ;
    public final void rule__Program__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( ( 'methods' ) )
            // InternalMyDsl.g:1303:1: ( 'methods' )
            {
            // InternalMyDsl.g:1303:1: ( 'methods' )
            // InternalMyDsl.g:1304:2: 'methods'
            {
             before(grammarAccess.getProgramAccess().getMethodsKeyword_8_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getMethodsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__0__Impl"


    // $ANTLR start "rule__Program__Group_8__1"
    // InternalMyDsl.g:1313:1: rule__Program__Group_8__1 : rule__Program__Group_8__1__Impl rule__Program__Group_8__2 ;
    public final void rule__Program__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1317:1: ( rule__Program__Group_8__1__Impl rule__Program__Group_8__2 )
            // InternalMyDsl.g:1318:2: rule__Program__Group_8__1__Impl rule__Program__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__Program__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__1"


    // $ANTLR start "rule__Program__Group_8__1__Impl"
    // InternalMyDsl.g:1325:1: rule__Program__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Program__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( ( '{' ) )
            // InternalMyDsl.g:1330:1: ( '{' )
            {
            // InternalMyDsl.g:1330:1: ( '{' )
            // InternalMyDsl.g:1331:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__1__Impl"


    // $ANTLR start "rule__Program__Group_8__2"
    // InternalMyDsl.g:1340:1: rule__Program__Group_8__2 : rule__Program__Group_8__2__Impl rule__Program__Group_8__3 ;
    public final void rule__Program__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( rule__Program__Group_8__2__Impl rule__Program__Group_8__3 )
            // InternalMyDsl.g:1345:2: rule__Program__Group_8__2__Impl rule__Program__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__Program__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__2"


    // $ANTLR start "rule__Program__Group_8__2__Impl"
    // InternalMyDsl.g:1352:1: rule__Program__Group_8__2__Impl : ( ( rule__Program__MethodsAssignment_8_2 ) ) ;
    public final void rule__Program__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( ( ( rule__Program__MethodsAssignment_8_2 ) ) )
            // InternalMyDsl.g:1357:1: ( ( rule__Program__MethodsAssignment_8_2 ) )
            {
            // InternalMyDsl.g:1357:1: ( ( rule__Program__MethodsAssignment_8_2 ) )
            // InternalMyDsl.g:1358:2: ( rule__Program__MethodsAssignment_8_2 )
            {
             before(grammarAccess.getProgramAccess().getMethodsAssignment_8_2()); 
            // InternalMyDsl.g:1359:2: ( rule__Program__MethodsAssignment_8_2 )
            // InternalMyDsl.g:1359:3: rule__Program__MethodsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__MethodsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMethodsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__2__Impl"


    // $ANTLR start "rule__Program__Group_8__3"
    // InternalMyDsl.g:1367:1: rule__Program__Group_8__3 : rule__Program__Group_8__3__Impl rule__Program__Group_8__4 ;
    public final void rule__Program__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( rule__Program__Group_8__3__Impl rule__Program__Group_8__4 )
            // InternalMyDsl.g:1372:2: rule__Program__Group_8__3__Impl rule__Program__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__Program__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__3"


    // $ANTLR start "rule__Program__Group_8__3__Impl"
    // InternalMyDsl.g:1379:1: rule__Program__Group_8__3__Impl : ( ( rule__Program__Group_8_3__0 )* ) ;
    public final void rule__Program__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( ( ( rule__Program__Group_8_3__0 )* ) )
            // InternalMyDsl.g:1384:1: ( ( rule__Program__Group_8_3__0 )* )
            {
            // InternalMyDsl.g:1384:1: ( ( rule__Program__Group_8_3__0 )* )
            // InternalMyDsl.g:1385:2: ( rule__Program__Group_8_3__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_8_3()); 
            // InternalMyDsl.g:1386:2: ( rule__Program__Group_8_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1386:3: rule__Program__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Program__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__3__Impl"


    // $ANTLR start "rule__Program__Group_8__4"
    // InternalMyDsl.g:1394:1: rule__Program__Group_8__4 : rule__Program__Group_8__4__Impl ;
    public final void rule__Program__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( rule__Program__Group_8__4__Impl )
            // InternalMyDsl.g:1399:2: rule__Program__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__4"


    // $ANTLR start "rule__Program__Group_8__4__Impl"
    // InternalMyDsl.g:1405:1: rule__Program__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Program__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( '}' ) )
            // InternalMyDsl.g:1410:1: ( '}' )
            {
            // InternalMyDsl.g:1410:1: ( '}' )
            // InternalMyDsl.g:1411:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__4__Impl"


    // $ANTLR start "rule__Program__Group_8_3__0"
    // InternalMyDsl.g:1421:1: rule__Program__Group_8_3__0 : rule__Program__Group_8_3__0__Impl rule__Program__Group_8_3__1 ;
    public final void rule__Program__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( rule__Program__Group_8_3__0__Impl rule__Program__Group_8_3__1 )
            // InternalMyDsl.g:1426:2: rule__Program__Group_8_3__0__Impl rule__Program__Group_8_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Program__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8_3__0"


    // $ANTLR start "rule__Program__Group_8_3__0__Impl"
    // InternalMyDsl.g:1433:1: rule__Program__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1437:1: ( ( ',' ) )
            // InternalMyDsl.g:1438:1: ( ',' )
            {
            // InternalMyDsl.g:1438:1: ( ',' )
            // InternalMyDsl.g:1439:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_8_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8_3__0__Impl"


    // $ANTLR start "rule__Program__Group_8_3__1"
    // InternalMyDsl.g:1448:1: rule__Program__Group_8_3__1 : rule__Program__Group_8_3__1__Impl ;
    public final void rule__Program__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( rule__Program__Group_8_3__1__Impl )
            // InternalMyDsl.g:1453:2: rule__Program__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8_3__1"


    // $ANTLR start "rule__Program__Group_8_3__1__Impl"
    // InternalMyDsl.g:1459:1: rule__Program__Group_8_3__1__Impl : ( ( rule__Program__MethodsAssignment_8_3_1 ) ) ;
    public final void rule__Program__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( ( rule__Program__MethodsAssignment_8_3_1 ) ) )
            // InternalMyDsl.g:1464:1: ( ( rule__Program__MethodsAssignment_8_3_1 ) )
            {
            // InternalMyDsl.g:1464:1: ( ( rule__Program__MethodsAssignment_8_3_1 ) )
            // InternalMyDsl.g:1465:2: ( rule__Program__MethodsAssignment_8_3_1 )
            {
             before(grammarAccess.getProgramAccess().getMethodsAssignment_8_3_1()); 
            // InternalMyDsl.g:1466:2: ( rule__Program__MethodsAssignment_8_3_1 )
            // InternalMyDsl.g:1466:3: rule__Program__MethodsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__MethodsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMethodsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8_3__1__Impl"


    // $ANTLR start "rule__Program__Group_9__0"
    // InternalMyDsl.g:1475:1: rule__Program__Group_9__0 : rule__Program__Group_9__0__Impl rule__Program__Group_9__1 ;
    public final void rule__Program__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( rule__Program__Group_9__0__Impl rule__Program__Group_9__1 )
            // InternalMyDsl.g:1480:2: rule__Program__Group_9__0__Impl rule__Program__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__0"


    // $ANTLR start "rule__Program__Group_9__0__Impl"
    // InternalMyDsl.g:1487:1: rule__Program__Group_9__0__Impl : ( 'variables' ) ;
    public final void rule__Program__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1491:1: ( ( 'variables' ) )
            // InternalMyDsl.g:1492:1: ( 'variables' )
            {
            // InternalMyDsl.g:1492:1: ( 'variables' )
            // InternalMyDsl.g:1493:2: 'variables'
            {
             before(grammarAccess.getProgramAccess().getVariablesKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getVariablesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__0__Impl"


    // $ANTLR start "rule__Program__Group_9__1"
    // InternalMyDsl.g:1502:1: rule__Program__Group_9__1 : rule__Program__Group_9__1__Impl rule__Program__Group_9__2 ;
    public final void rule__Program__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( rule__Program__Group_9__1__Impl rule__Program__Group_9__2 )
            // InternalMyDsl.g:1507:2: rule__Program__Group_9__1__Impl rule__Program__Group_9__2
            {
            pushFollow(FOLLOW_12);
            rule__Program__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__1"


    // $ANTLR start "rule__Program__Group_9__1__Impl"
    // InternalMyDsl.g:1514:1: rule__Program__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Program__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( ( '{' ) )
            // InternalMyDsl.g:1519:1: ( '{' )
            {
            // InternalMyDsl.g:1519:1: ( '{' )
            // InternalMyDsl.g:1520:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__1__Impl"


    // $ANTLR start "rule__Program__Group_9__2"
    // InternalMyDsl.g:1529:1: rule__Program__Group_9__2 : rule__Program__Group_9__2__Impl rule__Program__Group_9__3 ;
    public final void rule__Program__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( rule__Program__Group_9__2__Impl rule__Program__Group_9__3 )
            // InternalMyDsl.g:1534:2: rule__Program__Group_9__2__Impl rule__Program__Group_9__3
            {
            pushFollow(FOLLOW_10);
            rule__Program__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__2"


    // $ANTLR start "rule__Program__Group_9__2__Impl"
    // InternalMyDsl.g:1541:1: rule__Program__Group_9__2__Impl : ( ( rule__Program__VariablesAssignment_9_2 ) ) ;
    public final void rule__Program__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( ( ( rule__Program__VariablesAssignment_9_2 ) ) )
            // InternalMyDsl.g:1546:1: ( ( rule__Program__VariablesAssignment_9_2 ) )
            {
            // InternalMyDsl.g:1546:1: ( ( rule__Program__VariablesAssignment_9_2 ) )
            // InternalMyDsl.g:1547:2: ( rule__Program__VariablesAssignment_9_2 )
            {
             before(grammarAccess.getProgramAccess().getVariablesAssignment_9_2()); 
            // InternalMyDsl.g:1548:2: ( rule__Program__VariablesAssignment_9_2 )
            // InternalMyDsl.g:1548:3: rule__Program__VariablesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__VariablesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getVariablesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__2__Impl"


    // $ANTLR start "rule__Program__Group_9__3"
    // InternalMyDsl.g:1556:1: rule__Program__Group_9__3 : rule__Program__Group_9__3__Impl rule__Program__Group_9__4 ;
    public final void rule__Program__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( rule__Program__Group_9__3__Impl rule__Program__Group_9__4 )
            // InternalMyDsl.g:1561:2: rule__Program__Group_9__3__Impl rule__Program__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__Program__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__3"


    // $ANTLR start "rule__Program__Group_9__3__Impl"
    // InternalMyDsl.g:1568:1: rule__Program__Group_9__3__Impl : ( ( rule__Program__Group_9_3__0 )* ) ;
    public final void rule__Program__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1572:1: ( ( ( rule__Program__Group_9_3__0 )* ) )
            // InternalMyDsl.g:1573:1: ( ( rule__Program__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:1573:1: ( ( rule__Program__Group_9_3__0 )* )
            // InternalMyDsl.g:1574:2: ( rule__Program__Group_9_3__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_9_3()); 
            // InternalMyDsl.g:1575:2: ( rule__Program__Group_9_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1575:3: rule__Program__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Program__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__3__Impl"


    // $ANTLR start "rule__Program__Group_9__4"
    // InternalMyDsl.g:1583:1: rule__Program__Group_9__4 : rule__Program__Group_9__4__Impl ;
    public final void rule__Program__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( rule__Program__Group_9__4__Impl )
            // InternalMyDsl.g:1588:2: rule__Program__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__4"


    // $ANTLR start "rule__Program__Group_9__4__Impl"
    // InternalMyDsl.g:1594:1: rule__Program__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Program__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( ( '}' ) )
            // InternalMyDsl.g:1599:1: ( '}' )
            {
            // InternalMyDsl.g:1599:1: ( '}' )
            // InternalMyDsl.g:1600:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__4__Impl"


    // $ANTLR start "rule__Program__Group_9_3__0"
    // InternalMyDsl.g:1610:1: rule__Program__Group_9_3__0 : rule__Program__Group_9_3__0__Impl rule__Program__Group_9_3__1 ;
    public final void rule__Program__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( rule__Program__Group_9_3__0__Impl rule__Program__Group_9_3__1 )
            // InternalMyDsl.g:1615:2: rule__Program__Group_9_3__0__Impl rule__Program__Group_9_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Program__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__0"


    // $ANTLR start "rule__Program__Group_9_3__0__Impl"
    // InternalMyDsl.g:1622:1: rule__Program__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1626:1: ( ( ',' ) )
            // InternalMyDsl.g:1627:1: ( ',' )
            {
            // InternalMyDsl.g:1627:1: ( ',' )
            // InternalMyDsl.g:1628:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_9_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__0__Impl"


    // $ANTLR start "rule__Program__Group_9_3__1"
    // InternalMyDsl.g:1637:1: rule__Program__Group_9_3__1 : rule__Program__Group_9_3__1__Impl ;
    public final void rule__Program__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( rule__Program__Group_9_3__1__Impl )
            // InternalMyDsl.g:1642:2: rule__Program__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__1"


    // $ANTLR start "rule__Program__Group_9_3__1__Impl"
    // InternalMyDsl.g:1648:1: rule__Program__Group_9_3__1__Impl : ( ( rule__Program__VariablesAssignment_9_3_1 ) ) ;
    public final void rule__Program__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( ( ( rule__Program__VariablesAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:1653:1: ( ( rule__Program__VariablesAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:1653:1: ( ( rule__Program__VariablesAssignment_9_3_1 ) )
            // InternalMyDsl.g:1654:2: ( rule__Program__VariablesAssignment_9_3_1 )
            {
             before(grammarAccess.getProgramAccess().getVariablesAssignment_9_3_1()); 
            // InternalMyDsl.g:1655:2: ( rule__Program__VariablesAssignment_9_3_1 )
            // InternalMyDsl.g:1655:3: rule__Program__VariablesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__VariablesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getVariablesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__1__Impl"


    // $ANTLR start "rule__Program__Group_10__0"
    // InternalMyDsl.g:1664:1: rule__Program__Group_10__0 : rule__Program__Group_10__0__Impl rule__Program__Group_10__1 ;
    public final void rule__Program__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( rule__Program__Group_10__0__Impl rule__Program__Group_10__1 )
            // InternalMyDsl.g:1669:2: rule__Program__Group_10__0__Impl rule__Program__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__0"


    // $ANTLR start "rule__Program__Group_10__0__Impl"
    // InternalMyDsl.g:1676:1: rule__Program__Group_10__0__Impl : ( 'lines' ) ;
    public final void rule__Program__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1680:1: ( ( 'lines' ) )
            // InternalMyDsl.g:1681:1: ( 'lines' )
            {
            // InternalMyDsl.g:1681:1: ( 'lines' )
            // InternalMyDsl.g:1682:2: 'lines'
            {
             before(grammarAccess.getProgramAccess().getLinesKeyword_10_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLinesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__0__Impl"


    // $ANTLR start "rule__Program__Group_10__1"
    // InternalMyDsl.g:1691:1: rule__Program__Group_10__1 : rule__Program__Group_10__1__Impl rule__Program__Group_10__2 ;
    public final void rule__Program__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( rule__Program__Group_10__1__Impl rule__Program__Group_10__2 )
            // InternalMyDsl.g:1696:2: rule__Program__Group_10__1__Impl rule__Program__Group_10__2
            {
            pushFollow(FOLLOW_13);
            rule__Program__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__1"


    // $ANTLR start "rule__Program__Group_10__1__Impl"
    // InternalMyDsl.g:1703:1: rule__Program__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Program__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1707:1: ( ( '{' ) )
            // InternalMyDsl.g:1708:1: ( '{' )
            {
            // InternalMyDsl.g:1708:1: ( '{' )
            // InternalMyDsl.g:1709:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__1__Impl"


    // $ANTLR start "rule__Program__Group_10__2"
    // InternalMyDsl.g:1718:1: rule__Program__Group_10__2 : rule__Program__Group_10__2__Impl rule__Program__Group_10__3 ;
    public final void rule__Program__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( rule__Program__Group_10__2__Impl rule__Program__Group_10__3 )
            // InternalMyDsl.g:1723:2: rule__Program__Group_10__2__Impl rule__Program__Group_10__3
            {
            pushFollow(FOLLOW_10);
            rule__Program__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__2"


    // $ANTLR start "rule__Program__Group_10__2__Impl"
    // InternalMyDsl.g:1730:1: rule__Program__Group_10__2__Impl : ( ( rule__Program__LinesAssignment_10_2 ) ) ;
    public final void rule__Program__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1734:1: ( ( ( rule__Program__LinesAssignment_10_2 ) ) )
            // InternalMyDsl.g:1735:1: ( ( rule__Program__LinesAssignment_10_2 ) )
            {
            // InternalMyDsl.g:1735:1: ( ( rule__Program__LinesAssignment_10_2 ) )
            // InternalMyDsl.g:1736:2: ( rule__Program__LinesAssignment_10_2 )
            {
             before(grammarAccess.getProgramAccess().getLinesAssignment_10_2()); 
            // InternalMyDsl.g:1737:2: ( rule__Program__LinesAssignment_10_2 )
            // InternalMyDsl.g:1737:3: rule__Program__LinesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__LinesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLinesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__2__Impl"


    // $ANTLR start "rule__Program__Group_10__3"
    // InternalMyDsl.g:1745:1: rule__Program__Group_10__3 : rule__Program__Group_10__3__Impl rule__Program__Group_10__4 ;
    public final void rule__Program__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1749:1: ( rule__Program__Group_10__3__Impl rule__Program__Group_10__4 )
            // InternalMyDsl.g:1750:2: rule__Program__Group_10__3__Impl rule__Program__Group_10__4
            {
            pushFollow(FOLLOW_10);
            rule__Program__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__3"


    // $ANTLR start "rule__Program__Group_10__3__Impl"
    // InternalMyDsl.g:1757:1: rule__Program__Group_10__3__Impl : ( ( rule__Program__Group_10_3__0 )* ) ;
    public final void rule__Program__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( ( ( rule__Program__Group_10_3__0 )* ) )
            // InternalMyDsl.g:1762:1: ( ( rule__Program__Group_10_3__0 )* )
            {
            // InternalMyDsl.g:1762:1: ( ( rule__Program__Group_10_3__0 )* )
            // InternalMyDsl.g:1763:2: ( rule__Program__Group_10_3__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_10_3()); 
            // InternalMyDsl.g:1764:2: ( rule__Program__Group_10_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1764:3: rule__Program__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Program__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__3__Impl"


    // $ANTLR start "rule__Program__Group_10__4"
    // InternalMyDsl.g:1772:1: rule__Program__Group_10__4 : rule__Program__Group_10__4__Impl ;
    public final void rule__Program__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( rule__Program__Group_10__4__Impl )
            // InternalMyDsl.g:1777:2: rule__Program__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__4"


    // $ANTLR start "rule__Program__Group_10__4__Impl"
    // InternalMyDsl.g:1783:1: rule__Program__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Program__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( ( '}' ) )
            // InternalMyDsl.g:1788:1: ( '}' )
            {
            // InternalMyDsl.g:1788:1: ( '}' )
            // InternalMyDsl.g:1789:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10__4__Impl"


    // $ANTLR start "rule__Program__Group_10_3__0"
    // InternalMyDsl.g:1799:1: rule__Program__Group_10_3__0 : rule__Program__Group_10_3__0__Impl rule__Program__Group_10_3__1 ;
    public final void rule__Program__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( rule__Program__Group_10_3__0__Impl rule__Program__Group_10_3__1 )
            // InternalMyDsl.g:1804:2: rule__Program__Group_10_3__0__Impl rule__Program__Group_10_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Program__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10_3__0"


    // $ANTLR start "rule__Program__Group_10_3__0__Impl"
    // InternalMyDsl.g:1811:1: rule__Program__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( ( ',' ) )
            // InternalMyDsl.g:1816:1: ( ',' )
            {
            // InternalMyDsl.g:1816:1: ( ',' )
            // InternalMyDsl.g:1817:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_10_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10_3__0__Impl"


    // $ANTLR start "rule__Program__Group_10_3__1"
    // InternalMyDsl.g:1826:1: rule__Program__Group_10_3__1 : rule__Program__Group_10_3__1__Impl ;
    public final void rule__Program__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( rule__Program__Group_10_3__1__Impl )
            // InternalMyDsl.g:1831:2: rule__Program__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10_3__1"


    // $ANTLR start "rule__Program__Group_10_3__1__Impl"
    // InternalMyDsl.g:1837:1: rule__Program__Group_10_3__1__Impl : ( ( rule__Program__LinesAssignment_10_3_1 ) ) ;
    public final void rule__Program__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( ( ( rule__Program__LinesAssignment_10_3_1 ) ) )
            // InternalMyDsl.g:1842:1: ( ( rule__Program__LinesAssignment_10_3_1 ) )
            {
            // InternalMyDsl.g:1842:1: ( ( rule__Program__LinesAssignment_10_3_1 ) )
            // InternalMyDsl.g:1843:2: ( rule__Program__LinesAssignment_10_3_1 )
            {
             before(grammarAccess.getProgramAccess().getLinesAssignment_10_3_1()); 
            // InternalMyDsl.g:1844:2: ( rule__Program__LinesAssignment_10_3_1 )
            // InternalMyDsl.g:1844:3: rule__Program__LinesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__LinesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLinesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_10_3__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMyDsl.g:1853:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMyDsl.g:1858:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalMyDsl.g:1865:1: rule__Method__Group__0__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1869:1: ( ( 'Method' ) )
            // InternalMyDsl.g:1870:1: ( 'Method' )
            {
            // InternalMyDsl.g:1870:1: ( 'Method' )
            // InternalMyDsl.g:1871:2: 'Method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalMyDsl.g:1880:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMyDsl.g:1885:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalMyDsl.g:1892:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1896:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1897:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1897:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalMyDsl.g:1898:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1899:2: ( rule__Method__NameAssignment_1 )
            // InternalMyDsl.g:1899:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalMyDsl.g:1907:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMyDsl.g:1912:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalMyDsl.g:1919:1: rule__Method__Group__2__Impl : ( '{' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( ( '{' ) )
            // InternalMyDsl.g:1924:1: ( '{' )
            {
            // InternalMyDsl.g:1924:1: ( '{' )
            // InternalMyDsl.g:1925:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalMyDsl.g:1934:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMyDsl.g:1939:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalMyDsl.g:1946:1: rule__Method__Group__3__Impl : ( 'block' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1950:1: ( ( 'block' ) )
            // InternalMyDsl.g:1951:1: ( 'block' )
            {
            // InternalMyDsl.g:1951:1: ( 'block' )
            // InternalMyDsl.g:1952:2: 'block'
            {
             before(grammarAccess.getMethodAccess().getBlockKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getBlockKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalMyDsl.g:1961:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMyDsl.g:1966:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalMyDsl.g:1973:1: rule__Method__Group__4__Impl : ( ( rule__Method__BlockAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1977:1: ( ( ( rule__Method__BlockAssignment_4 ) ) )
            // InternalMyDsl.g:1978:1: ( ( rule__Method__BlockAssignment_4 ) )
            {
            // InternalMyDsl.g:1978:1: ( ( rule__Method__BlockAssignment_4 ) )
            // InternalMyDsl.g:1979:2: ( rule__Method__BlockAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getBlockAssignment_4()); 
            // InternalMyDsl.g:1980:2: ( rule__Method__BlockAssignment_4 )
            // InternalMyDsl.g:1980:3: rule__Method__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Method__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalMyDsl.g:1988:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( rule__Method__Group__5__Impl )
            // InternalMyDsl.g:1993:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalMyDsl.g:1999:1: rule__Method__Group__5__Impl : ( '}' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( '}' ) )
            // InternalMyDsl.g:2004:1: ( '}' )
            {
            // InternalMyDsl.g:2004:1: ( '}' )
            // InternalMyDsl.g:2005:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMyDsl.g:2015:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMyDsl.g:2020:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMyDsl.g:2027:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2031:1: ( ( () ) )
            // InternalMyDsl.g:2032:1: ( () )
            {
            // InternalMyDsl.g:2032:1: ( () )
            // InternalMyDsl.g:2033:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalMyDsl.g:2034:2: ()
            // InternalMyDsl.g:2034:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMyDsl.g:2042:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMyDsl.g:2047:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMyDsl.g:2054:1: rule__Variable__Group__1__Impl : ( 'Variable' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2058:1: ( ( 'Variable' ) )
            // InternalMyDsl.g:2059:1: ( 'Variable' )
            {
            // InternalMyDsl.g:2059:1: ( 'Variable' )
            // InternalMyDsl.g:2060:2: 'Variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMyDsl.g:2069:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMyDsl.g:2074:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMyDsl.g:2081:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2085:1: ( ( ( rule__Variable__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2086:1: ( ( rule__Variable__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2086:1: ( ( rule__Variable__NameAssignment_2 ) )
            // InternalMyDsl.g:2087:2: ( rule__Variable__NameAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2088:2: ( rule__Variable__NameAssignment_2 )
            // InternalMyDsl.g:2088:3: rule__Variable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalMyDsl.g:2096:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2100:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalMyDsl.g:2101:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalMyDsl.g:2108:1: rule__Variable__Group__3__Impl : ( '{' ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2112:1: ( ( '{' ) )
            // InternalMyDsl.g:2113:1: ( '{' )
            {
            // InternalMyDsl.g:2113:1: ( '{' )
            // InternalMyDsl.g:2114:2: '{'
            {
             before(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalMyDsl.g:2123:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalMyDsl.g:2128:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalMyDsl.g:2135:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2139:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalMyDsl.g:2140:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalMyDsl.g:2140:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalMyDsl.g:2141:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalMyDsl.g:2142:2: ( rule__Variable__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2142:3: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // InternalMyDsl.g:2150:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2154:1: ( rule__Variable__Group__5__Impl )
            // InternalMyDsl.g:2155:2: rule__Variable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // InternalMyDsl.g:2161:1: rule__Variable__Group__5__Impl : ( '}' ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( ( '}' ) )
            // InternalMyDsl.g:2166:1: ( '}' )
            {
            // InternalMyDsl.g:2166:1: ( '}' )
            // InternalMyDsl.g:2167:2: '}'
            {
             before(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group_4__0"
    // InternalMyDsl.g:2177:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalMyDsl.g:2182:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0"


    // $ANTLR start "rule__Variable__Group_4__0__Impl"
    // InternalMyDsl.g:2189:1: rule__Variable__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( ( 'value' ) )
            // InternalMyDsl.g:2194:1: ( 'value' )
            {
            // InternalMyDsl.g:2194:1: ( 'value' )
            // InternalMyDsl.g:2195:2: 'value'
            {
             before(grammarAccess.getVariableAccess().getValueKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_4__1"
    // InternalMyDsl.g:2204:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2208:1: ( rule__Variable__Group_4__1__Impl )
            // InternalMyDsl.g:2209:2: rule__Variable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1"


    // $ANTLR start "rule__Variable__Group_4__1__Impl"
    // InternalMyDsl.g:2215:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__ValueAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( ( ( rule__Variable__ValueAssignment_4_1 ) ) )
            // InternalMyDsl.g:2220:1: ( ( rule__Variable__ValueAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2220:1: ( ( rule__Variable__ValueAssignment_4_1 ) )
            // InternalMyDsl.g:2221:2: ( rule__Variable__ValueAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_4_1()); 
            // InternalMyDsl.g:2222:2: ( rule__Variable__ValueAssignment_4_1 )
            // InternalMyDsl.g:2222:3: rule__Variable__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalMyDsl.g:2231:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalMyDsl.g:2236:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalMyDsl.g:2243:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2247:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2248:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2248:1: ( ( '-' )? )
            // InternalMyDsl.g:2249:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2250:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2250:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalMyDsl.g:2258:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2262:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalMyDsl.g:2263:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalMyDsl.g:2270:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2274:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:2275:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:2275:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:2276:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:2277:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2277:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalMyDsl.g:2285:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2289:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalMyDsl.g:2290:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalMyDsl.g:2297:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2301:1: ( ( '.' ) )
            // InternalMyDsl.g:2302:1: ( '.' )
            {
            // InternalMyDsl.g:2302:1: ( '.' )
            // InternalMyDsl.g:2303:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalMyDsl.g:2312:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2316:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalMyDsl.g:2317:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalMyDsl.g:2324:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2329:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2329:1: ( RULE_INT )
            // InternalMyDsl.g:2330:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalMyDsl.g:2339:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2343:1: ( rule__EDouble__Group__4__Impl )
            // InternalMyDsl.g:2344:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalMyDsl.g:2350:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalMyDsl.g:2355:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalMyDsl.g:2355:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalMyDsl.g:2356:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalMyDsl.g:2357:2: ( rule__EDouble__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=11 && LA19_0<=12)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2357:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalMyDsl.g:2366:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalMyDsl.g:2371:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalMyDsl.g:2378:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2382:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:2383:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:2383:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalMyDsl.g:2384:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:2385:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalMyDsl.g:2385:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalMyDsl.g:2393:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalMyDsl.g:2398:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalMyDsl.g:2405:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2409:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2410:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2410:1: ( ( '-' )? )
            // InternalMyDsl.g:2411:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:2412:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2412:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalMyDsl.g:2420:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2424:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalMyDsl.g:2425:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalMyDsl.g:2431:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2436:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2436:1: ( RULE_INT )
            // InternalMyDsl.g:2437:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalMyDsl.g:2447:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2451:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalMyDsl.g:2452:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalMyDsl.g:2459:1: rule__Line__Group__0__Impl : ( () ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( () ) )
            // InternalMyDsl.g:2464:1: ( () )
            {
            // InternalMyDsl.g:2464:1: ( () )
            // InternalMyDsl.g:2465:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0()); 
            // InternalMyDsl.g:2466:2: ()
            // InternalMyDsl.g:2466:3: 
            {
            }

             after(grammarAccess.getLineAccess().getLineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalMyDsl.g:2474:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalMyDsl.g:2479:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Line__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalMyDsl.g:2486:1: rule__Line__Group__1__Impl : ( 'Line' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2490:1: ( ( 'Line' ) )
            // InternalMyDsl.g:2491:1: ( 'Line' )
            {
            // InternalMyDsl.g:2491:1: ( 'Line' )
            // InternalMyDsl.g:2492:2: 'Line'
            {
             before(grammarAccess.getLineAccess().getLineKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__2"
    // InternalMyDsl.g:2501:1: rule__Line__Group__2 : rule__Line__Group__2__Impl rule__Line__Group__3 ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2505:1: ( rule__Line__Group__2__Impl rule__Line__Group__3 )
            // InternalMyDsl.g:2506:2: rule__Line__Group__2__Impl rule__Line__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Line__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2"


    // $ANTLR start "rule__Line__Group__2__Impl"
    // InternalMyDsl.g:2513:1: rule__Line__Group__2__Impl : ( '{' ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2517:1: ( ( '{' ) )
            // InternalMyDsl.g:2518:1: ( '{' )
            {
            // InternalMyDsl.g:2518:1: ( '{' )
            // InternalMyDsl.g:2519:2: '{'
            {
             before(grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2__Impl"


    // $ANTLR start "rule__Line__Group__3"
    // InternalMyDsl.g:2528:1: rule__Line__Group__3 : rule__Line__Group__3__Impl rule__Line__Group__4 ;
    public final void rule__Line__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2532:1: ( rule__Line__Group__3__Impl rule__Line__Group__4 )
            // InternalMyDsl.g:2533:2: rule__Line__Group__3__Impl rule__Line__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Line__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3"


    // $ANTLR start "rule__Line__Group__3__Impl"
    // InternalMyDsl.g:2540:1: rule__Line__Group__3__Impl : ( ( rule__Line__Group_3__0 )? ) ;
    public final void rule__Line__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2544:1: ( ( ( rule__Line__Group_3__0 )? ) )
            // InternalMyDsl.g:2545:1: ( ( rule__Line__Group_3__0 )? )
            {
            // InternalMyDsl.g:2545:1: ( ( rule__Line__Group_3__0 )? )
            // InternalMyDsl.g:2546:2: ( rule__Line__Group_3__0 )?
            {
             before(grammarAccess.getLineAccess().getGroup_3()); 
            // InternalMyDsl.g:2547:2: ( rule__Line__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2547:3: rule__Line__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3__Impl"


    // $ANTLR start "rule__Line__Group__4"
    // InternalMyDsl.g:2555:1: rule__Line__Group__4 : rule__Line__Group__4__Impl rule__Line__Group__5 ;
    public final void rule__Line__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2559:1: ( rule__Line__Group__4__Impl rule__Line__Group__5 )
            // InternalMyDsl.g:2560:2: rule__Line__Group__4__Impl rule__Line__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Line__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__4"


    // $ANTLR start "rule__Line__Group__4__Impl"
    // InternalMyDsl.g:2567:1: rule__Line__Group__4__Impl : ( ( rule__Line__Group_4__0 )? ) ;
    public final void rule__Line__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2571:1: ( ( ( rule__Line__Group_4__0 )? ) )
            // InternalMyDsl.g:2572:1: ( ( rule__Line__Group_4__0 )? )
            {
            // InternalMyDsl.g:2572:1: ( ( rule__Line__Group_4__0 )? )
            // InternalMyDsl.g:2573:2: ( rule__Line__Group_4__0 )?
            {
             before(grammarAccess.getLineAccess().getGroup_4()); 
            // InternalMyDsl.g:2574:2: ( rule__Line__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2574:3: rule__Line__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__4__Impl"


    // $ANTLR start "rule__Line__Group__5"
    // InternalMyDsl.g:2582:1: rule__Line__Group__5 : rule__Line__Group__5__Impl rule__Line__Group__6 ;
    public final void rule__Line__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( rule__Line__Group__5__Impl rule__Line__Group__6 )
            // InternalMyDsl.g:2587:2: rule__Line__Group__5__Impl rule__Line__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Line__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__5"


    // $ANTLR start "rule__Line__Group__5__Impl"
    // InternalMyDsl.g:2594:1: rule__Line__Group__5__Impl : ( ( rule__Line__Group_5__0 )? ) ;
    public final void rule__Line__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2598:1: ( ( ( rule__Line__Group_5__0 )? ) )
            // InternalMyDsl.g:2599:1: ( ( rule__Line__Group_5__0 )? )
            {
            // InternalMyDsl.g:2599:1: ( ( rule__Line__Group_5__0 )? )
            // InternalMyDsl.g:2600:2: ( rule__Line__Group_5__0 )?
            {
             before(grammarAccess.getLineAccess().getGroup_5()); 
            // InternalMyDsl.g:2601:2: ( rule__Line__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2601:3: rule__Line__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__5__Impl"


    // $ANTLR start "rule__Line__Group__6"
    // InternalMyDsl.g:2609:1: rule__Line__Group__6 : rule__Line__Group__6__Impl rule__Line__Group__7 ;
    public final void rule__Line__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2613:1: ( rule__Line__Group__6__Impl rule__Line__Group__7 )
            // InternalMyDsl.g:2614:2: rule__Line__Group__6__Impl rule__Line__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Line__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__6"


    // $ANTLR start "rule__Line__Group__6__Impl"
    // InternalMyDsl.g:2621:1: rule__Line__Group__6__Impl : ( ( rule__Line__Group_6__0 )? ) ;
    public final void rule__Line__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2625:1: ( ( ( rule__Line__Group_6__0 )? ) )
            // InternalMyDsl.g:2626:1: ( ( rule__Line__Group_6__0 )? )
            {
            // InternalMyDsl.g:2626:1: ( ( rule__Line__Group_6__0 )? )
            // InternalMyDsl.g:2627:2: ( rule__Line__Group_6__0 )?
            {
             before(grammarAccess.getLineAccess().getGroup_6()); 
            // InternalMyDsl.g:2628:2: ( rule__Line__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2628:3: rule__Line__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__6__Impl"


    // $ANTLR start "rule__Line__Group__7"
    // InternalMyDsl.g:2636:1: rule__Line__Group__7 : rule__Line__Group__7__Impl ;
    public final void rule__Line__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( rule__Line__Group__7__Impl )
            // InternalMyDsl.g:2641:2: rule__Line__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__7"


    // $ANTLR start "rule__Line__Group__7__Impl"
    // InternalMyDsl.g:2647:1: rule__Line__Group__7__Impl : ( '}' ) ;
    public final void rule__Line__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( ( '}' ) )
            // InternalMyDsl.g:2652:1: ( '}' )
            {
            // InternalMyDsl.g:2652:1: ( '}' )
            // InternalMyDsl.g:2653:2: '}'
            {
             before(grammarAccess.getLineAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__7__Impl"


    // $ANTLR start "rule__Line__Group_3__0"
    // InternalMyDsl.g:2663:1: rule__Line__Group_3__0 : rule__Line__Group_3__0__Impl rule__Line__Group_3__1 ;
    public final void rule__Line__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2667:1: ( rule__Line__Group_3__0__Impl rule__Line__Group_3__1 )
            // InternalMyDsl.g:2668:2: rule__Line__Group_3__0__Impl rule__Line__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Line__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_3__0"


    // $ANTLR start "rule__Line__Group_3__0__Impl"
    // InternalMyDsl.g:2675:1: rule__Line__Group_3__0__Impl : ( 'x1' ) ;
    public final void rule__Line__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2679:1: ( ( 'x1' ) )
            // InternalMyDsl.g:2680:1: ( 'x1' )
            {
            // InternalMyDsl.g:2680:1: ( 'x1' )
            // InternalMyDsl.g:2681:2: 'x1'
            {
             before(grammarAccess.getLineAccess().getX1Keyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getX1Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_3__0__Impl"


    // $ANTLR start "rule__Line__Group_3__1"
    // InternalMyDsl.g:2690:1: rule__Line__Group_3__1 : rule__Line__Group_3__1__Impl ;
    public final void rule__Line__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2694:1: ( rule__Line__Group_3__1__Impl )
            // InternalMyDsl.g:2695:2: rule__Line__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_3__1"


    // $ANTLR start "rule__Line__Group_3__1__Impl"
    // InternalMyDsl.g:2701:1: rule__Line__Group_3__1__Impl : ( ( rule__Line__X1Assignment_3_1 ) ) ;
    public final void rule__Line__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( ( ( rule__Line__X1Assignment_3_1 ) ) )
            // InternalMyDsl.g:2706:1: ( ( rule__Line__X1Assignment_3_1 ) )
            {
            // InternalMyDsl.g:2706:1: ( ( rule__Line__X1Assignment_3_1 ) )
            // InternalMyDsl.g:2707:2: ( rule__Line__X1Assignment_3_1 )
            {
             before(grammarAccess.getLineAccess().getX1Assignment_3_1()); 
            // InternalMyDsl.g:2708:2: ( rule__Line__X1Assignment_3_1 )
            // InternalMyDsl.g:2708:3: rule__Line__X1Assignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__X1Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getX1Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_3__1__Impl"


    // $ANTLR start "rule__Line__Group_4__0"
    // InternalMyDsl.g:2717:1: rule__Line__Group_4__0 : rule__Line__Group_4__0__Impl rule__Line__Group_4__1 ;
    public final void rule__Line__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2721:1: ( rule__Line__Group_4__0__Impl rule__Line__Group_4__1 )
            // InternalMyDsl.g:2722:2: rule__Line__Group_4__0__Impl rule__Line__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Line__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__0"


    // $ANTLR start "rule__Line__Group_4__0__Impl"
    // InternalMyDsl.g:2729:1: rule__Line__Group_4__0__Impl : ( 'y1' ) ;
    public final void rule__Line__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2733:1: ( ( 'y1' ) )
            // InternalMyDsl.g:2734:1: ( 'y1' )
            {
            // InternalMyDsl.g:2734:1: ( 'y1' )
            // InternalMyDsl.g:2735:2: 'y1'
            {
             before(grammarAccess.getLineAccess().getY1Keyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getY1Keyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__0__Impl"


    // $ANTLR start "rule__Line__Group_4__1"
    // InternalMyDsl.g:2744:1: rule__Line__Group_4__1 : rule__Line__Group_4__1__Impl ;
    public final void rule__Line__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( rule__Line__Group_4__1__Impl )
            // InternalMyDsl.g:2749:2: rule__Line__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__1"


    // $ANTLR start "rule__Line__Group_4__1__Impl"
    // InternalMyDsl.g:2755:1: rule__Line__Group_4__1__Impl : ( ( rule__Line__Y1Assignment_4_1 ) ) ;
    public final void rule__Line__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2759:1: ( ( ( rule__Line__Y1Assignment_4_1 ) ) )
            // InternalMyDsl.g:2760:1: ( ( rule__Line__Y1Assignment_4_1 ) )
            {
            // InternalMyDsl.g:2760:1: ( ( rule__Line__Y1Assignment_4_1 ) )
            // InternalMyDsl.g:2761:2: ( rule__Line__Y1Assignment_4_1 )
            {
             before(grammarAccess.getLineAccess().getY1Assignment_4_1()); 
            // InternalMyDsl.g:2762:2: ( rule__Line__Y1Assignment_4_1 )
            // InternalMyDsl.g:2762:3: rule__Line__Y1Assignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__Y1Assignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getY1Assignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__1__Impl"


    // $ANTLR start "rule__Line__Group_5__0"
    // InternalMyDsl.g:2771:1: rule__Line__Group_5__0 : rule__Line__Group_5__0__Impl rule__Line__Group_5__1 ;
    public final void rule__Line__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( rule__Line__Group_5__0__Impl rule__Line__Group_5__1 )
            // InternalMyDsl.g:2776:2: rule__Line__Group_5__0__Impl rule__Line__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Line__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__0"


    // $ANTLR start "rule__Line__Group_5__0__Impl"
    // InternalMyDsl.g:2783:1: rule__Line__Group_5__0__Impl : ( 'x2' ) ;
    public final void rule__Line__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2787:1: ( ( 'x2' ) )
            // InternalMyDsl.g:2788:1: ( 'x2' )
            {
            // InternalMyDsl.g:2788:1: ( 'x2' )
            // InternalMyDsl.g:2789:2: 'x2'
            {
             before(grammarAccess.getLineAccess().getX2Keyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getX2Keyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__0__Impl"


    // $ANTLR start "rule__Line__Group_5__1"
    // InternalMyDsl.g:2798:1: rule__Line__Group_5__1 : rule__Line__Group_5__1__Impl ;
    public final void rule__Line__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2802:1: ( rule__Line__Group_5__1__Impl )
            // InternalMyDsl.g:2803:2: rule__Line__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__1"


    // $ANTLR start "rule__Line__Group_5__1__Impl"
    // InternalMyDsl.g:2809:1: rule__Line__Group_5__1__Impl : ( ( rule__Line__X2Assignment_5_1 ) ) ;
    public final void rule__Line__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( ( ( rule__Line__X2Assignment_5_1 ) ) )
            // InternalMyDsl.g:2814:1: ( ( rule__Line__X2Assignment_5_1 ) )
            {
            // InternalMyDsl.g:2814:1: ( ( rule__Line__X2Assignment_5_1 ) )
            // InternalMyDsl.g:2815:2: ( rule__Line__X2Assignment_5_1 )
            {
             before(grammarAccess.getLineAccess().getX2Assignment_5_1()); 
            // InternalMyDsl.g:2816:2: ( rule__Line__X2Assignment_5_1 )
            // InternalMyDsl.g:2816:3: rule__Line__X2Assignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__X2Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getX2Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__1__Impl"


    // $ANTLR start "rule__Line__Group_6__0"
    // InternalMyDsl.g:2825:1: rule__Line__Group_6__0 : rule__Line__Group_6__0__Impl rule__Line__Group_6__1 ;
    public final void rule__Line__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2829:1: ( rule__Line__Group_6__0__Impl rule__Line__Group_6__1 )
            // InternalMyDsl.g:2830:2: rule__Line__Group_6__0__Impl rule__Line__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Line__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__0"


    // $ANTLR start "rule__Line__Group_6__0__Impl"
    // InternalMyDsl.g:2837:1: rule__Line__Group_6__0__Impl : ( 'y2' ) ;
    public final void rule__Line__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2841:1: ( ( 'y2' ) )
            // InternalMyDsl.g:2842:1: ( 'y2' )
            {
            // InternalMyDsl.g:2842:1: ( 'y2' )
            // InternalMyDsl.g:2843:2: 'y2'
            {
             before(grammarAccess.getLineAccess().getY2Keyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getY2Keyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__0__Impl"


    // $ANTLR start "rule__Line__Group_6__1"
    // InternalMyDsl.g:2852:1: rule__Line__Group_6__1 : rule__Line__Group_6__1__Impl ;
    public final void rule__Line__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2856:1: ( rule__Line__Group_6__1__Impl )
            // InternalMyDsl.g:2857:2: rule__Line__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__1"


    // $ANTLR start "rule__Line__Group_6__1__Impl"
    // InternalMyDsl.g:2863:1: rule__Line__Group_6__1__Impl : ( ( rule__Line__Y2Assignment_6_1 ) ) ;
    public final void rule__Line__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( ( ( rule__Line__Y2Assignment_6_1 ) ) )
            // InternalMyDsl.g:2868:1: ( ( rule__Line__Y2Assignment_6_1 ) )
            {
            // InternalMyDsl.g:2868:1: ( ( rule__Line__Y2Assignment_6_1 ) )
            // InternalMyDsl.g:2869:2: ( rule__Line__Y2Assignment_6_1 )
            {
             before(grammarAccess.getLineAccess().getY2Assignment_6_1()); 
            // InternalMyDsl.g:2870:2: ( rule__Line__Y2Assignment_6_1 )
            // InternalMyDsl.g:2870:3: rule__Line__Y2Assignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__Y2Assignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getY2Assignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalMyDsl.g:2879:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMyDsl.g:2884:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalMyDsl.g:2891:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2895:1: ( ( () ) )
            // InternalMyDsl.g:2896:1: ( () )
            {
            // InternalMyDsl.g:2896:1: ( () )
            // InternalMyDsl.g:2897:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalMyDsl.g:2898:2: ()
            // InternalMyDsl.g:2898:3: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMyDsl.g:2906:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2910:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMyDsl.g:2911:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalMyDsl.g:2918:1: rule__Block__Group__1__Impl : ( 'Block' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2922:1: ( ( 'Block' ) )
            // InternalMyDsl.g:2923:1: ( 'Block' )
            {
            // InternalMyDsl.g:2923:1: ( 'Block' )
            // InternalMyDsl.g:2924:2: 'Block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getBlockKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalMyDsl.g:2933:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2937:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMyDsl.g:2938:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalMyDsl.g:2945:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2949:1: ( ( '{' ) )
            // InternalMyDsl.g:2950:1: ( '{' )
            {
            // InternalMyDsl.g:2950:1: ( '{' )
            // InternalMyDsl.g:2951:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalMyDsl.g:2960:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2964:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalMyDsl.g:2965:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalMyDsl.g:2972:1: rule__Block__Group__3__Impl : ( ( rule__Block__Group_3__0 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2976:1: ( ( ( rule__Block__Group_3__0 )? ) )
            // InternalMyDsl.g:2977:1: ( ( rule__Block__Group_3__0 )? )
            {
            // InternalMyDsl.g:2977:1: ( ( rule__Block__Group_3__0 )? )
            // InternalMyDsl.g:2978:2: ( rule__Block__Group_3__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_3()); 
            // InternalMyDsl.g:2979:2: ( rule__Block__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2979:3: rule__Block__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalMyDsl.g:2987:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2991:1: ( rule__Block__Group__4__Impl )
            // InternalMyDsl.g:2992:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalMyDsl.g:2998:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3002:1: ( ( '}' ) )
            // InternalMyDsl.g:3003:1: ( '}' )
            {
            // InternalMyDsl.g:3003:1: ( '}' )
            // InternalMyDsl.g:3004:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group_3__0"
    // InternalMyDsl.g:3014:1: rule__Block__Group_3__0 : rule__Block__Group_3__0__Impl rule__Block__Group_3__1 ;
    public final void rule__Block__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( rule__Block__Group_3__0__Impl rule__Block__Group_3__1 )
            // InternalMyDsl.g:3019:2: rule__Block__Group_3__0__Impl rule__Block__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Block__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__0"


    // $ANTLR start "rule__Block__Group_3__0__Impl"
    // InternalMyDsl.g:3026:1: rule__Block__Group_3__0__Impl : ( 'statements' ) ;
    public final void rule__Block__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3030:1: ( ( 'statements' ) )
            // InternalMyDsl.g:3031:1: ( 'statements' )
            {
            // InternalMyDsl.g:3031:1: ( 'statements' )
            // InternalMyDsl.g:3032:2: 'statements'
            {
             before(grammarAccess.getBlockAccess().getStatementsKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getStatementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__0__Impl"


    // $ANTLR start "rule__Block__Group_3__1"
    // InternalMyDsl.g:3041:1: rule__Block__Group_3__1 : rule__Block__Group_3__1__Impl rule__Block__Group_3__2 ;
    public final void rule__Block__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( rule__Block__Group_3__1__Impl rule__Block__Group_3__2 )
            // InternalMyDsl.g:3046:2: rule__Block__Group_3__1__Impl rule__Block__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__Block__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__1"


    // $ANTLR start "rule__Block__Group_3__1__Impl"
    // InternalMyDsl.g:3053:1: rule__Block__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Block__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3057:1: ( ( '{' ) )
            // InternalMyDsl.g:3058:1: ( '{' )
            {
            // InternalMyDsl.g:3058:1: ( '{' )
            // InternalMyDsl.g:3059:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__1__Impl"


    // $ANTLR start "rule__Block__Group_3__2"
    // InternalMyDsl.g:3068:1: rule__Block__Group_3__2 : rule__Block__Group_3__2__Impl rule__Block__Group_3__3 ;
    public final void rule__Block__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3072:1: ( rule__Block__Group_3__2__Impl rule__Block__Group_3__3 )
            // InternalMyDsl.g:3073:2: rule__Block__Group_3__2__Impl rule__Block__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Block__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__2"


    // $ANTLR start "rule__Block__Group_3__2__Impl"
    // InternalMyDsl.g:3080:1: rule__Block__Group_3__2__Impl : ( ( rule__Block__StatementsAssignment_3_2 ) ) ;
    public final void rule__Block__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3084:1: ( ( ( rule__Block__StatementsAssignment_3_2 ) ) )
            // InternalMyDsl.g:3085:1: ( ( rule__Block__StatementsAssignment_3_2 ) )
            {
            // InternalMyDsl.g:3085:1: ( ( rule__Block__StatementsAssignment_3_2 ) )
            // InternalMyDsl.g:3086:2: ( rule__Block__StatementsAssignment_3_2 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_3_2()); 
            // InternalMyDsl.g:3087:2: ( rule__Block__StatementsAssignment_3_2 )
            // InternalMyDsl.g:3087:3: rule__Block__StatementsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__2__Impl"


    // $ANTLR start "rule__Block__Group_3__3"
    // InternalMyDsl.g:3095:1: rule__Block__Group_3__3 : rule__Block__Group_3__3__Impl rule__Block__Group_3__4 ;
    public final void rule__Block__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( rule__Block__Group_3__3__Impl rule__Block__Group_3__4 )
            // InternalMyDsl.g:3100:2: rule__Block__Group_3__3__Impl rule__Block__Group_3__4
            {
            pushFollow(FOLLOW_10);
            rule__Block__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__3"


    // $ANTLR start "rule__Block__Group_3__3__Impl"
    // InternalMyDsl.g:3107:1: rule__Block__Group_3__3__Impl : ( ( rule__Block__Group_3_3__0 )* ) ;
    public final void rule__Block__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3111:1: ( ( ( rule__Block__Group_3_3__0 )* ) )
            // InternalMyDsl.g:3112:1: ( ( rule__Block__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:3112:1: ( ( rule__Block__Group_3_3__0 )* )
            // InternalMyDsl.g:3113:2: ( rule__Block__Group_3_3__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_3_3()); 
            // InternalMyDsl.g:3114:2: ( rule__Block__Group_3_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:3114:3: rule__Block__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Block__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__3__Impl"


    // $ANTLR start "rule__Block__Group_3__4"
    // InternalMyDsl.g:3122:1: rule__Block__Group_3__4 : rule__Block__Group_3__4__Impl ;
    public final void rule__Block__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3126:1: ( rule__Block__Group_3__4__Impl )
            // InternalMyDsl.g:3127:2: rule__Block__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__4"


    // $ANTLR start "rule__Block__Group_3__4__Impl"
    // InternalMyDsl.g:3133:1: rule__Block__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Block__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( ( '}' ) )
            // InternalMyDsl.g:3138:1: ( '}' )
            {
            // InternalMyDsl.g:3138:1: ( '}' )
            // InternalMyDsl.g:3139:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__4__Impl"


    // $ANTLR start "rule__Block__Group_3_3__0"
    // InternalMyDsl.g:3149:1: rule__Block__Group_3_3__0 : rule__Block__Group_3_3__0__Impl rule__Block__Group_3_3__1 ;
    public final void rule__Block__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3153:1: ( rule__Block__Group_3_3__0__Impl rule__Block__Group_3_3__1 )
            // InternalMyDsl.g:3154:2: rule__Block__Group_3_3__0__Impl rule__Block__Group_3_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Block__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__0"


    // $ANTLR start "rule__Block__Group_3_3__0__Impl"
    // InternalMyDsl.g:3161:1: rule__Block__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Block__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3165:1: ( ( ',' ) )
            // InternalMyDsl.g:3166:1: ( ',' )
            {
            // InternalMyDsl.g:3166:1: ( ',' )
            // InternalMyDsl.g:3167:2: ','
            {
             before(grammarAccess.getBlockAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__0__Impl"


    // $ANTLR start "rule__Block__Group_3_3__1"
    // InternalMyDsl.g:3176:1: rule__Block__Group_3_3__1 : rule__Block__Group_3_3__1__Impl ;
    public final void rule__Block__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3180:1: ( rule__Block__Group_3_3__1__Impl )
            // InternalMyDsl.g:3181:2: rule__Block__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__1"


    // $ANTLR start "rule__Block__Group_3_3__1__Impl"
    // InternalMyDsl.g:3187:1: rule__Block__Group_3_3__1__Impl : ( ( rule__Block__StatementsAssignment_3_3_1 ) ) ;
    public final void rule__Block__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( ( ( rule__Block__StatementsAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:3192:1: ( ( rule__Block__StatementsAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:3192:1: ( ( rule__Block__StatementsAssignment_3_3_1 ) )
            // InternalMyDsl.g:3193:2: ( rule__Block__StatementsAssignment_3_3_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_3_3_1()); 
            // InternalMyDsl.g:3194:2: ( rule__Block__StatementsAssignment_3_3_1 )
            // InternalMyDsl.g:3194:3: rule__Block__StatementsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__1__Impl"


    // $ANTLR start "rule__IfStmt__Group__0"
    // InternalMyDsl.g:3203:1: rule__IfStmt__Group__0 : rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 ;
    public final void rule__IfStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3207:1: ( rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 )
            // InternalMyDsl.g:3208:2: rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IfStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__0"


    // $ANTLR start "rule__IfStmt__Group__0__Impl"
    // InternalMyDsl.g:3215:1: rule__IfStmt__Group__0__Impl : ( 'If' ) ;
    public final void rule__IfStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3219:1: ( ( 'If' ) )
            // InternalMyDsl.g:3220:1: ( 'If' )
            {
            // InternalMyDsl.g:3220:1: ( 'If' )
            // InternalMyDsl.g:3221:2: 'If'
            {
             before(grammarAccess.getIfStmtAccess().getIfKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIfStmtAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__0__Impl"


    // $ANTLR start "rule__IfStmt__Group__1"
    // InternalMyDsl.g:3230:1: rule__IfStmt__Group__1 : rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 ;
    public final void rule__IfStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3234:1: ( rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 )
            // InternalMyDsl.g:3235:2: rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__IfStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__1"


    // $ANTLR start "rule__IfStmt__Group__1__Impl"
    // InternalMyDsl.g:3242:1: rule__IfStmt__Group__1__Impl : ( '{' ) ;
    public final void rule__IfStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3246:1: ( ( '{' ) )
            // InternalMyDsl.g:3247:1: ( '{' )
            {
            // InternalMyDsl.g:3247:1: ( '{' )
            // InternalMyDsl.g:3248:2: '{'
            {
             before(grammarAccess.getIfStmtAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfStmtAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__1__Impl"


    // $ANTLR start "rule__IfStmt__Group__2"
    // InternalMyDsl.g:3257:1: rule__IfStmt__Group__2 : rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 ;
    public final void rule__IfStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3261:1: ( rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 )
            // InternalMyDsl.g:3262:2: rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__IfStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__2"


    // $ANTLR start "rule__IfStmt__Group__2__Impl"
    // InternalMyDsl.g:3269:1: rule__IfStmt__Group__2__Impl : ( 'thenBranch' ) ;
    public final void rule__IfStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3273:1: ( ( 'thenBranch' ) )
            // InternalMyDsl.g:3274:1: ( 'thenBranch' )
            {
            // InternalMyDsl.g:3274:1: ( 'thenBranch' )
            // InternalMyDsl.g:3275:2: 'thenBranch'
            {
             before(grammarAccess.getIfStmtAccess().getThenBranchKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIfStmtAccess().getThenBranchKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__2__Impl"


    // $ANTLR start "rule__IfStmt__Group__3"
    // InternalMyDsl.g:3284:1: rule__IfStmt__Group__3 : rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 ;
    public final void rule__IfStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3288:1: ( rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 )
            // InternalMyDsl.g:3289:2: rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__IfStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__3"


    // $ANTLR start "rule__IfStmt__Group__3__Impl"
    // InternalMyDsl.g:3296:1: rule__IfStmt__Group__3__Impl : ( ( rule__IfStmt__ThenBranchAssignment_3 ) ) ;
    public final void rule__IfStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3300:1: ( ( ( rule__IfStmt__ThenBranchAssignment_3 ) ) )
            // InternalMyDsl.g:3301:1: ( ( rule__IfStmt__ThenBranchAssignment_3 ) )
            {
            // InternalMyDsl.g:3301:1: ( ( rule__IfStmt__ThenBranchAssignment_3 ) )
            // InternalMyDsl.g:3302:2: ( rule__IfStmt__ThenBranchAssignment_3 )
            {
             before(grammarAccess.getIfStmtAccess().getThenBranchAssignment_3()); 
            // InternalMyDsl.g:3303:2: ( rule__IfStmt__ThenBranchAssignment_3 )
            // InternalMyDsl.g:3303:3: rule__IfStmt__ThenBranchAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__ThenBranchAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfStmtAccess().getThenBranchAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__3__Impl"


    // $ANTLR start "rule__IfStmt__Group__4"
    // InternalMyDsl.g:3311:1: rule__IfStmt__Group__4 : rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 ;
    public final void rule__IfStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3315:1: ( rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 )
            // InternalMyDsl.g:3316:2: rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__IfStmt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__4"


    // $ANTLR start "rule__IfStmt__Group__4__Impl"
    // InternalMyDsl.g:3323:1: rule__IfStmt__Group__4__Impl : ( ( rule__IfStmt__Group_4__0 )? ) ;
    public final void rule__IfStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3327:1: ( ( ( rule__IfStmt__Group_4__0 )? ) )
            // InternalMyDsl.g:3328:1: ( ( rule__IfStmt__Group_4__0 )? )
            {
            // InternalMyDsl.g:3328:1: ( ( rule__IfStmt__Group_4__0 )? )
            // InternalMyDsl.g:3329:2: ( rule__IfStmt__Group_4__0 )?
            {
             before(grammarAccess.getIfStmtAccess().getGroup_4()); 
            // InternalMyDsl.g:3330:2: ( rule__IfStmt__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3330:3: rule__IfStmt__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStmt__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStmtAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__4__Impl"


    // $ANTLR start "rule__IfStmt__Group__5"
    // InternalMyDsl.g:3338:1: rule__IfStmt__Group__5 : rule__IfStmt__Group__5__Impl rule__IfStmt__Group__6 ;
    public final void rule__IfStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3342:1: ( rule__IfStmt__Group__5__Impl rule__IfStmt__Group__6 )
            // InternalMyDsl.g:3343:2: rule__IfStmt__Group__5__Impl rule__IfStmt__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__IfStmt__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__5"


    // $ANTLR start "rule__IfStmt__Group__5__Impl"
    // InternalMyDsl.g:3350:1: rule__IfStmt__Group__5__Impl : ( 'condition' ) ;
    public final void rule__IfStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3354:1: ( ( 'condition' ) )
            // InternalMyDsl.g:3355:1: ( 'condition' )
            {
            // InternalMyDsl.g:3355:1: ( 'condition' )
            // InternalMyDsl.g:3356:2: 'condition'
            {
             before(grammarAccess.getIfStmtAccess().getConditionKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIfStmtAccess().getConditionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__5__Impl"


    // $ANTLR start "rule__IfStmt__Group__6"
    // InternalMyDsl.g:3365:1: rule__IfStmt__Group__6 : rule__IfStmt__Group__6__Impl rule__IfStmt__Group__7 ;
    public final void rule__IfStmt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3369:1: ( rule__IfStmt__Group__6__Impl rule__IfStmt__Group__7 )
            // InternalMyDsl.g:3370:2: rule__IfStmt__Group__6__Impl rule__IfStmt__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__IfStmt__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__6"


    // $ANTLR start "rule__IfStmt__Group__6__Impl"
    // InternalMyDsl.g:3377:1: rule__IfStmt__Group__6__Impl : ( ( rule__IfStmt__ConditionAssignment_6 ) ) ;
    public final void rule__IfStmt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3381:1: ( ( ( rule__IfStmt__ConditionAssignment_6 ) ) )
            // InternalMyDsl.g:3382:1: ( ( rule__IfStmt__ConditionAssignment_6 ) )
            {
            // InternalMyDsl.g:3382:1: ( ( rule__IfStmt__ConditionAssignment_6 ) )
            // InternalMyDsl.g:3383:2: ( rule__IfStmt__ConditionAssignment_6 )
            {
             before(grammarAccess.getIfStmtAccess().getConditionAssignment_6()); 
            // InternalMyDsl.g:3384:2: ( rule__IfStmt__ConditionAssignment_6 )
            // InternalMyDsl.g:3384:3: rule__IfStmt__ConditionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__ConditionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIfStmtAccess().getConditionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__6__Impl"


    // $ANTLR start "rule__IfStmt__Group__7"
    // InternalMyDsl.g:3392:1: rule__IfStmt__Group__7 : rule__IfStmt__Group__7__Impl ;
    public final void rule__IfStmt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3396:1: ( rule__IfStmt__Group__7__Impl )
            // InternalMyDsl.g:3397:2: rule__IfStmt__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__7"


    // $ANTLR start "rule__IfStmt__Group__7__Impl"
    // InternalMyDsl.g:3403:1: rule__IfStmt__Group__7__Impl : ( '}' ) ;
    public final void rule__IfStmt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3407:1: ( ( '}' ) )
            // InternalMyDsl.g:3408:1: ( '}' )
            {
            // InternalMyDsl.g:3408:1: ( '}' )
            // InternalMyDsl.g:3409:2: '}'
            {
             before(grammarAccess.getIfStmtAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIfStmtAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__7__Impl"


    // $ANTLR start "rule__IfStmt__Group_4__0"
    // InternalMyDsl.g:3419:1: rule__IfStmt__Group_4__0 : rule__IfStmt__Group_4__0__Impl rule__IfStmt__Group_4__1 ;
    public final void rule__IfStmt__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3423:1: ( rule__IfStmt__Group_4__0__Impl rule__IfStmt__Group_4__1 )
            // InternalMyDsl.g:3424:2: rule__IfStmt__Group_4__0__Impl rule__IfStmt__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__IfStmt__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStmt__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_4__0"


    // $ANTLR start "rule__IfStmt__Group_4__0__Impl"
    // InternalMyDsl.g:3431:1: rule__IfStmt__Group_4__0__Impl : ( 'elseBranch' ) ;
    public final void rule__IfStmt__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3435:1: ( ( 'elseBranch' ) )
            // InternalMyDsl.g:3436:1: ( 'elseBranch' )
            {
            // InternalMyDsl.g:3436:1: ( 'elseBranch' )
            // InternalMyDsl.g:3437:2: 'elseBranch'
            {
             before(grammarAccess.getIfStmtAccess().getElseBranchKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIfStmtAccess().getElseBranchKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_4__0__Impl"


    // $ANTLR start "rule__IfStmt__Group_4__1"
    // InternalMyDsl.g:3446:1: rule__IfStmt__Group_4__1 : rule__IfStmt__Group_4__1__Impl ;
    public final void rule__IfStmt__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( rule__IfStmt__Group_4__1__Impl )
            // InternalMyDsl.g:3451:2: rule__IfStmt__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_4__1"


    // $ANTLR start "rule__IfStmt__Group_4__1__Impl"
    // InternalMyDsl.g:3457:1: rule__IfStmt__Group_4__1__Impl : ( ( rule__IfStmt__ElseBranchAssignment_4_1 ) ) ;
    public final void rule__IfStmt__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3461:1: ( ( ( rule__IfStmt__ElseBranchAssignment_4_1 ) ) )
            // InternalMyDsl.g:3462:1: ( ( rule__IfStmt__ElseBranchAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3462:1: ( ( rule__IfStmt__ElseBranchAssignment_4_1 ) )
            // InternalMyDsl.g:3463:2: ( rule__IfStmt__ElseBranchAssignment_4_1 )
            {
             before(grammarAccess.getIfStmtAccess().getElseBranchAssignment_4_1()); 
            // InternalMyDsl.g:3464:2: ( rule__IfStmt__ElseBranchAssignment_4_1 )
            // InternalMyDsl.g:3464:3: rule__IfStmt__ElseBranchAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__ElseBranchAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStmtAccess().getElseBranchAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_4__1__Impl"


    // $ANTLR start "rule__VariableAffect__Group__0"
    // InternalMyDsl.g:3473:1: rule__VariableAffect__Group__0 : rule__VariableAffect__Group__0__Impl rule__VariableAffect__Group__1 ;
    public final void rule__VariableAffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3477:1: ( rule__VariableAffect__Group__0__Impl rule__VariableAffect__Group__1 )
            // InternalMyDsl.g:3478:2: rule__VariableAffect__Group__0__Impl rule__VariableAffect__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VariableAffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAffect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__0"


    // $ANTLR start "rule__VariableAffect__Group__0__Impl"
    // InternalMyDsl.g:3485:1: rule__VariableAffect__Group__0__Impl : ( 'variable' ) ;
    public final void rule__VariableAffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3489:1: ( ( 'variable' ) )
            // InternalMyDsl.g:3490:1: ( 'variable' )
            {
            // InternalMyDsl.g:3490:1: ( 'variable' )
            // InternalMyDsl.g:3491:2: 'variable'
            {
             before(grammarAccess.getVariableAffectAccess().getVariableKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVariableAffectAccess().getVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__0__Impl"


    // $ANTLR start "rule__VariableAffect__Group__1"
    // InternalMyDsl.g:3500:1: rule__VariableAffect__Group__1 : rule__VariableAffect__Group__1__Impl rule__VariableAffect__Group__2 ;
    public final void rule__VariableAffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3504:1: ( rule__VariableAffect__Group__1__Impl rule__VariableAffect__Group__2 )
            // InternalMyDsl.g:3505:2: rule__VariableAffect__Group__1__Impl rule__VariableAffect__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__VariableAffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAffect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__1"


    // $ANTLR start "rule__VariableAffect__Group__1__Impl"
    // InternalMyDsl.g:3512:1: rule__VariableAffect__Group__1__Impl : ( ( rule__VariableAffect__VariableAssignment_1 ) ) ;
    public final void rule__VariableAffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3516:1: ( ( ( rule__VariableAffect__VariableAssignment_1 ) ) )
            // InternalMyDsl.g:3517:1: ( ( rule__VariableAffect__VariableAssignment_1 ) )
            {
            // InternalMyDsl.g:3517:1: ( ( rule__VariableAffect__VariableAssignment_1 ) )
            // InternalMyDsl.g:3518:2: ( rule__VariableAffect__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAffectAccess().getVariableAssignment_1()); 
            // InternalMyDsl.g:3519:2: ( rule__VariableAffect__VariableAssignment_1 )
            // InternalMyDsl.g:3519:3: rule__VariableAffect__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableAffect__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAffectAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__1__Impl"


    // $ANTLR start "rule__VariableAffect__Group__2"
    // InternalMyDsl.g:3527:1: rule__VariableAffect__Group__2 : rule__VariableAffect__Group__2__Impl rule__VariableAffect__Group__3 ;
    public final void rule__VariableAffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3531:1: ( rule__VariableAffect__Group__2__Impl rule__VariableAffect__Group__3 )
            // InternalMyDsl.g:3532:2: rule__VariableAffect__Group__2__Impl rule__VariableAffect__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__VariableAffect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAffect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__2"


    // $ANTLR start "rule__VariableAffect__Group__2__Impl"
    // InternalMyDsl.g:3539:1: rule__VariableAffect__Group__2__Impl : ( '<-' ) ;
    public final void rule__VariableAffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3543:1: ( ( '<-' ) )
            // InternalMyDsl.g:3544:1: ( '<-' )
            {
            // InternalMyDsl.g:3544:1: ( '<-' )
            // InternalMyDsl.g:3545:2: '<-'
            {
             before(grammarAccess.getVariableAffectAccess().getLessThanSignHyphenMinusKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVariableAffectAccess().getLessThanSignHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__2__Impl"


    // $ANTLR start "rule__VariableAffect__Group__3"
    // InternalMyDsl.g:3554:1: rule__VariableAffect__Group__3 : rule__VariableAffect__Group__3__Impl ;
    public final void rule__VariableAffect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3558:1: ( rule__VariableAffect__Group__3__Impl )
            // InternalMyDsl.g:3559:2: rule__VariableAffect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableAffect__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__3"


    // $ANTLR start "rule__VariableAffect__Group__3__Impl"
    // InternalMyDsl.g:3565:1: rule__VariableAffect__Group__3__Impl : ( ( rule__VariableAffect__ValueAssignment_3 ) ) ;
    public final void rule__VariableAffect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3569:1: ( ( ( rule__VariableAffect__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:3570:1: ( ( rule__VariableAffect__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:3570:1: ( ( rule__VariableAffect__ValueAssignment_3 ) )
            // InternalMyDsl.g:3571:2: ( rule__VariableAffect__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableAffectAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:3572:2: ( rule__VariableAffect__ValueAssignment_3 )
            // InternalMyDsl.g:3572:3: rule__VariableAffect__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableAffect__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAffectAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__Group__3__Impl"


    // $ANTLR start "rule__CallMethod__Group__0"
    // InternalMyDsl.g:3581:1: rule__CallMethod__Group__0 : rule__CallMethod__Group__0__Impl rule__CallMethod__Group__1 ;
    public final void rule__CallMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3585:1: ( rule__CallMethod__Group__0__Impl rule__CallMethod__Group__1 )
            // InternalMyDsl.g:3586:2: rule__CallMethod__Group__0__Impl rule__CallMethod__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CallMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__0"


    // $ANTLR start "rule__CallMethod__Group__0__Impl"
    // InternalMyDsl.g:3593:1: rule__CallMethod__Group__0__Impl : ( 'CallMethod' ) ;
    public final void rule__CallMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3597:1: ( ( 'CallMethod' ) )
            // InternalMyDsl.g:3598:1: ( 'CallMethod' )
            {
            // InternalMyDsl.g:3598:1: ( 'CallMethod' )
            // InternalMyDsl.g:3599:2: 'CallMethod'
            {
             before(grammarAccess.getCallMethodAccess().getCallMethodKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCallMethodAccess().getCallMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__0__Impl"


    // $ANTLR start "rule__CallMethod__Group__1"
    // InternalMyDsl.g:3608:1: rule__CallMethod__Group__1 : rule__CallMethod__Group__1__Impl rule__CallMethod__Group__2 ;
    public final void rule__CallMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3612:1: ( rule__CallMethod__Group__1__Impl rule__CallMethod__Group__2 )
            // InternalMyDsl.g:3613:2: rule__CallMethod__Group__1__Impl rule__CallMethod__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__CallMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMethod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__1"


    // $ANTLR start "rule__CallMethod__Group__1__Impl"
    // InternalMyDsl.g:3620:1: rule__CallMethod__Group__1__Impl : ( '{' ) ;
    public final void rule__CallMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3624:1: ( ( '{' ) )
            // InternalMyDsl.g:3625:1: ( '{' )
            {
            // InternalMyDsl.g:3625:1: ( '{' )
            // InternalMyDsl.g:3626:2: '{'
            {
             before(grammarAccess.getCallMethodAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCallMethodAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__1__Impl"


    // $ANTLR start "rule__CallMethod__Group__2"
    // InternalMyDsl.g:3635:1: rule__CallMethod__Group__2 : rule__CallMethod__Group__2__Impl rule__CallMethod__Group__3 ;
    public final void rule__CallMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3639:1: ( rule__CallMethod__Group__2__Impl rule__CallMethod__Group__3 )
            // InternalMyDsl.g:3640:2: rule__CallMethod__Group__2__Impl rule__CallMethod__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CallMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMethod__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__2"


    // $ANTLR start "rule__CallMethod__Group__2__Impl"
    // InternalMyDsl.g:3647:1: rule__CallMethod__Group__2__Impl : ( 'method' ) ;
    public final void rule__CallMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3651:1: ( ( 'method' ) )
            // InternalMyDsl.g:3652:1: ( 'method' )
            {
            // InternalMyDsl.g:3652:1: ( 'method' )
            // InternalMyDsl.g:3653:2: 'method'
            {
             before(grammarAccess.getCallMethodAccess().getMethodKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCallMethodAccess().getMethodKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__2__Impl"


    // $ANTLR start "rule__CallMethod__Group__3"
    // InternalMyDsl.g:3662:1: rule__CallMethod__Group__3 : rule__CallMethod__Group__3__Impl rule__CallMethod__Group__4 ;
    public final void rule__CallMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3666:1: ( rule__CallMethod__Group__3__Impl rule__CallMethod__Group__4 )
            // InternalMyDsl.g:3667:2: rule__CallMethod__Group__3__Impl rule__CallMethod__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CallMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMethod__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__3"


    // $ANTLR start "rule__CallMethod__Group__3__Impl"
    // InternalMyDsl.g:3674:1: rule__CallMethod__Group__3__Impl : ( ( rule__CallMethod__MethodAssignment_3 ) ) ;
    public final void rule__CallMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3678:1: ( ( ( rule__CallMethod__MethodAssignment_3 ) ) )
            // InternalMyDsl.g:3679:1: ( ( rule__CallMethod__MethodAssignment_3 ) )
            {
            // InternalMyDsl.g:3679:1: ( ( rule__CallMethod__MethodAssignment_3 ) )
            // InternalMyDsl.g:3680:2: ( rule__CallMethod__MethodAssignment_3 )
            {
             before(grammarAccess.getCallMethodAccess().getMethodAssignment_3()); 
            // InternalMyDsl.g:3681:2: ( rule__CallMethod__MethodAssignment_3 )
            // InternalMyDsl.g:3681:3: rule__CallMethod__MethodAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CallMethod__MethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCallMethodAccess().getMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__3__Impl"


    // $ANTLR start "rule__CallMethod__Group__4"
    // InternalMyDsl.g:3689:1: rule__CallMethod__Group__4 : rule__CallMethod__Group__4__Impl ;
    public final void rule__CallMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3693:1: ( rule__CallMethod__Group__4__Impl )
            // InternalMyDsl.g:3694:2: rule__CallMethod__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallMethod__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__4"


    // $ANTLR start "rule__CallMethod__Group__4__Impl"
    // InternalMyDsl.g:3700:1: rule__CallMethod__Group__4__Impl : ( '}' ) ;
    public final void rule__CallMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3704:1: ( ( '}' ) )
            // InternalMyDsl.g:3705:1: ( '}' )
            {
            // InternalMyDsl.g:3705:1: ( '}' )
            // InternalMyDsl.g:3706:2: '}'
            {
             before(grammarAccess.getCallMethodAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCallMethodAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__Group__4__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalMyDsl.g:3716:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3720:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalMyDsl.g:3721:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalMyDsl.g:3728:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3732:1: ( ( () ) )
            // InternalMyDsl.g:3733:1: ( () )
            {
            // InternalMyDsl.g:3733:1: ( () )
            // InternalMyDsl.g:3734:2: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // InternalMyDsl.g:3735:2: ()
            // InternalMyDsl.g:3735:3: 
            {
            }

             after(grammarAccess.getMoveAccess().getMoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalMyDsl.g:3743:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3747:1: ( rule__Move__Group__1__Impl )
            // InternalMyDsl.g:3748:2: rule__Move__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalMyDsl.g:3754:1: rule__Move__Group__1__Impl : ( 'Move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3758:1: ( ( 'Move' ) )
            // InternalMyDsl.g:3759:1: ( 'Move' )
            {
            // InternalMyDsl.g:3759:1: ( 'Move' )
            // InternalMyDsl.g:3760:2: 'Move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__RotateRight__Group__0"
    // InternalMyDsl.g:3770:1: rule__RotateRight__Group__0 : rule__RotateRight__Group__0__Impl rule__RotateRight__Group__1 ;
    public final void rule__RotateRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3774:1: ( rule__RotateRight__Group__0__Impl rule__RotateRight__Group__1 )
            // InternalMyDsl.g:3775:2: rule__RotateRight__Group__0__Impl rule__RotateRight__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__RotateRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateRight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateRight__Group__0"


    // $ANTLR start "rule__RotateRight__Group__0__Impl"
    // InternalMyDsl.g:3782:1: rule__RotateRight__Group__0__Impl : ( () ) ;
    public final void rule__RotateRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3786:1: ( ( () ) )
            // InternalMyDsl.g:3787:1: ( () )
            {
            // InternalMyDsl.g:3787:1: ( () )
            // InternalMyDsl.g:3788:2: ()
            {
             before(grammarAccess.getRotateRightAccess().getRotateRightAction_0()); 
            // InternalMyDsl.g:3789:2: ()
            // InternalMyDsl.g:3789:3: 
            {
            }

             after(grammarAccess.getRotateRightAccess().getRotateRightAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateRight__Group__0__Impl"


    // $ANTLR start "rule__RotateRight__Group__1"
    // InternalMyDsl.g:3797:1: rule__RotateRight__Group__1 : rule__RotateRight__Group__1__Impl ;
    public final void rule__RotateRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3801:1: ( rule__RotateRight__Group__1__Impl )
            // InternalMyDsl.g:3802:2: rule__RotateRight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateRight__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateRight__Group__1"


    // $ANTLR start "rule__RotateRight__Group__1__Impl"
    // InternalMyDsl.g:3808:1: rule__RotateRight__Group__1__Impl : ( 'RotateRight' ) ;
    public final void rule__RotateRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3812:1: ( ( 'RotateRight' ) )
            // InternalMyDsl.g:3813:1: ( 'RotateRight' )
            {
            // InternalMyDsl.g:3813:1: ( 'RotateRight' )
            // InternalMyDsl.g:3814:2: 'RotateRight'
            {
             before(grammarAccess.getRotateRightAccess().getRotateRightKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRotateRightAccess().getRotateRightKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateRight__Group__1__Impl"


    // $ANTLR start "rule__RotateLeft__Group__0"
    // InternalMyDsl.g:3824:1: rule__RotateLeft__Group__0 : rule__RotateLeft__Group__0__Impl rule__RotateLeft__Group__1 ;
    public final void rule__RotateLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3828:1: ( rule__RotateLeft__Group__0__Impl rule__RotateLeft__Group__1 )
            // InternalMyDsl.g:3829:2: rule__RotateLeft__Group__0__Impl rule__RotateLeft__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RotateLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateLeft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateLeft__Group__0"


    // $ANTLR start "rule__RotateLeft__Group__0__Impl"
    // InternalMyDsl.g:3836:1: rule__RotateLeft__Group__0__Impl : ( () ) ;
    public final void rule__RotateLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3840:1: ( ( () ) )
            // InternalMyDsl.g:3841:1: ( () )
            {
            // InternalMyDsl.g:3841:1: ( () )
            // InternalMyDsl.g:3842:2: ()
            {
             before(grammarAccess.getRotateLeftAccess().getRotateLeftAction_0()); 
            // InternalMyDsl.g:3843:2: ()
            // InternalMyDsl.g:3843:3: 
            {
            }

             after(grammarAccess.getRotateLeftAccess().getRotateLeftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateLeft__Group__0__Impl"


    // $ANTLR start "rule__RotateLeft__Group__1"
    // InternalMyDsl.g:3851:1: rule__RotateLeft__Group__1 : rule__RotateLeft__Group__1__Impl ;
    public final void rule__RotateLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3855:1: ( rule__RotateLeft__Group__1__Impl )
            // InternalMyDsl.g:3856:2: rule__RotateLeft__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateLeft__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateLeft__Group__1"


    // $ANTLR start "rule__RotateLeft__Group__1__Impl"
    // InternalMyDsl.g:3862:1: rule__RotateLeft__Group__1__Impl : ( 'RotateLeft' ) ;
    public final void rule__RotateLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3866:1: ( ( 'RotateLeft' ) )
            // InternalMyDsl.g:3867:1: ( 'RotateLeft' )
            {
            // InternalMyDsl.g:3867:1: ( 'RotateLeft' )
            // InternalMyDsl.g:3868:2: 'RotateLeft'
            {
             before(grammarAccess.getRotateLeftAccess().getRotateLeftKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRotateLeftAccess().getRotateLeftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateLeft__Group__1__Impl"


    // $ANTLR start "rule__GreaterThan__Group__0"
    // InternalMyDsl.g:3878:1: rule__GreaterThan__Group__0 : rule__GreaterThan__Group__0__Impl rule__GreaterThan__Group__1 ;
    public final void rule__GreaterThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3882:1: ( rule__GreaterThan__Group__0__Impl rule__GreaterThan__Group__1 )
            // InternalMyDsl.g:3883:2: rule__GreaterThan__Group__0__Impl rule__GreaterThan__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GreaterThan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__0"


    // $ANTLR start "rule__GreaterThan__Group__0__Impl"
    // InternalMyDsl.g:3890:1: rule__GreaterThan__Group__0__Impl : ( 'GreaterThan' ) ;
    public final void rule__GreaterThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3894:1: ( ( 'GreaterThan' ) )
            // InternalMyDsl.g:3895:1: ( 'GreaterThan' )
            {
            // InternalMyDsl.g:3895:1: ( 'GreaterThan' )
            // InternalMyDsl.g:3896:2: 'GreaterThan'
            {
             before(grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__0__Impl"


    // $ANTLR start "rule__GreaterThan__Group__1"
    // InternalMyDsl.g:3905:1: rule__GreaterThan__Group__1 : rule__GreaterThan__Group__1__Impl rule__GreaterThan__Group__2 ;
    public final void rule__GreaterThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3909:1: ( rule__GreaterThan__Group__1__Impl rule__GreaterThan__Group__2 )
            // InternalMyDsl.g:3910:2: rule__GreaterThan__Group__1__Impl rule__GreaterThan__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__GreaterThan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__1"


    // $ANTLR start "rule__GreaterThan__Group__1__Impl"
    // InternalMyDsl.g:3917:1: rule__GreaterThan__Group__1__Impl : ( '{' ) ;
    public final void rule__GreaterThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3921:1: ( ( '{' ) )
            // InternalMyDsl.g:3922:1: ( '{' )
            {
            // InternalMyDsl.g:3922:1: ( '{' )
            // InternalMyDsl.g:3923:2: '{'
            {
             before(grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__1__Impl"


    // $ANTLR start "rule__GreaterThan__Group__2"
    // InternalMyDsl.g:3932:1: rule__GreaterThan__Group__2 : rule__GreaterThan__Group__2__Impl rule__GreaterThan__Group__3 ;
    public final void rule__GreaterThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3936:1: ( rule__GreaterThan__Group__2__Impl rule__GreaterThan__Group__3 )
            // InternalMyDsl.g:3937:2: rule__GreaterThan__Group__2__Impl rule__GreaterThan__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__GreaterThan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__2"


    // $ANTLR start "rule__GreaterThan__Group__2__Impl"
    // InternalMyDsl.g:3944:1: rule__GreaterThan__Group__2__Impl : ( 'left' ) ;
    public final void rule__GreaterThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3948:1: ( ( 'left' ) )
            // InternalMyDsl.g:3949:1: ( 'left' )
            {
            // InternalMyDsl.g:3949:1: ( 'left' )
            // InternalMyDsl.g:3950:2: 'left'
            {
             before(grammarAccess.getGreaterThanAccess().getLeftKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getLeftKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__2__Impl"


    // $ANTLR start "rule__GreaterThan__Group__3"
    // InternalMyDsl.g:3959:1: rule__GreaterThan__Group__3 : rule__GreaterThan__Group__3__Impl rule__GreaterThan__Group__4 ;
    public final void rule__GreaterThan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3963:1: ( rule__GreaterThan__Group__3__Impl rule__GreaterThan__Group__4 )
            // InternalMyDsl.g:3964:2: rule__GreaterThan__Group__3__Impl rule__GreaterThan__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__GreaterThan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__3"


    // $ANTLR start "rule__GreaterThan__Group__3__Impl"
    // InternalMyDsl.g:3971:1: rule__GreaterThan__Group__3__Impl : ( ( rule__GreaterThan__LeftAssignment_3 ) ) ;
    public final void rule__GreaterThan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3975:1: ( ( ( rule__GreaterThan__LeftAssignment_3 ) ) )
            // InternalMyDsl.g:3976:1: ( ( rule__GreaterThan__LeftAssignment_3 ) )
            {
            // InternalMyDsl.g:3976:1: ( ( rule__GreaterThan__LeftAssignment_3 ) )
            // InternalMyDsl.g:3977:2: ( rule__GreaterThan__LeftAssignment_3 )
            {
             before(grammarAccess.getGreaterThanAccess().getLeftAssignment_3()); 
            // InternalMyDsl.g:3978:2: ( rule__GreaterThan__LeftAssignment_3 )
            // InternalMyDsl.g:3978:3: rule__GreaterThan__LeftAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGreaterThanAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__3__Impl"


    // $ANTLR start "rule__GreaterThan__Group__4"
    // InternalMyDsl.g:3986:1: rule__GreaterThan__Group__4 : rule__GreaterThan__Group__4__Impl rule__GreaterThan__Group__5 ;
    public final void rule__GreaterThan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( rule__GreaterThan__Group__4__Impl rule__GreaterThan__Group__5 )
            // InternalMyDsl.g:3991:2: rule__GreaterThan__Group__4__Impl rule__GreaterThan__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__GreaterThan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__4"


    // $ANTLR start "rule__GreaterThan__Group__4__Impl"
    // InternalMyDsl.g:3998:1: rule__GreaterThan__Group__4__Impl : ( 'right' ) ;
    public final void rule__GreaterThan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4002:1: ( ( 'right' ) )
            // InternalMyDsl.g:4003:1: ( 'right' )
            {
            // InternalMyDsl.g:4003:1: ( 'right' )
            // InternalMyDsl.g:4004:2: 'right'
            {
             before(grammarAccess.getGreaterThanAccess().getRightKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getRightKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__4__Impl"


    // $ANTLR start "rule__GreaterThan__Group__5"
    // InternalMyDsl.g:4013:1: rule__GreaterThan__Group__5 : rule__GreaterThan__Group__5__Impl rule__GreaterThan__Group__6 ;
    public final void rule__GreaterThan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4017:1: ( rule__GreaterThan__Group__5__Impl rule__GreaterThan__Group__6 )
            // InternalMyDsl.g:4018:2: rule__GreaterThan__Group__5__Impl rule__GreaterThan__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__GreaterThan__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__5"


    // $ANTLR start "rule__GreaterThan__Group__5__Impl"
    // InternalMyDsl.g:4025:1: rule__GreaterThan__Group__5__Impl : ( ( rule__GreaterThan__RightAssignment_5 ) ) ;
    public final void rule__GreaterThan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4029:1: ( ( ( rule__GreaterThan__RightAssignment_5 ) ) )
            // InternalMyDsl.g:4030:1: ( ( rule__GreaterThan__RightAssignment_5 ) )
            {
            // InternalMyDsl.g:4030:1: ( ( rule__GreaterThan__RightAssignment_5 ) )
            // InternalMyDsl.g:4031:2: ( rule__GreaterThan__RightAssignment_5 )
            {
             before(grammarAccess.getGreaterThanAccess().getRightAssignment_5()); 
            // InternalMyDsl.g:4032:2: ( rule__GreaterThan__RightAssignment_5 )
            // InternalMyDsl.g:4032:3: rule__GreaterThan__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGreaterThanAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__5__Impl"


    // $ANTLR start "rule__GreaterThan__Group__6"
    // InternalMyDsl.g:4040:1: rule__GreaterThan__Group__6 : rule__GreaterThan__Group__6__Impl ;
    public final void rule__GreaterThan__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4044:1: ( rule__GreaterThan__Group__6__Impl )
            // InternalMyDsl.g:4045:2: rule__GreaterThan__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__6"


    // $ANTLR start "rule__GreaterThan__Group__6__Impl"
    // InternalMyDsl.g:4051:1: rule__GreaterThan__Group__6__Impl : ( '}' ) ;
    public final void rule__GreaterThan__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4055:1: ( ( '}' ) )
            // InternalMyDsl.g:4056:1: ( '}' )
            {
            // InternalMyDsl.g:4056:1: ( '}' )
            // InternalMyDsl.g:4057:2: '}'
            {
             before(grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__6__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalMyDsl.g:4067:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4071:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalMyDsl.g:4072:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalMyDsl.g:4079:1: rule__Constant__Group__0__Impl : ( () ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4083:1: ( ( () ) )
            // InternalMyDsl.g:4084:1: ( () )
            {
            // InternalMyDsl.g:4084:1: ( () )
            // InternalMyDsl.g:4085:2: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_0()); 
            // InternalMyDsl.g:4086:2: ()
            // InternalMyDsl.g:4086:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalMyDsl.g:4094:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4098:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalMyDsl.g:4099:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalMyDsl.g:4106:1: rule__Constant__Group__1__Impl : ( 'Constant' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4110:1: ( ( 'Constant' ) )
            // InternalMyDsl.g:4111:1: ( 'Constant' )
            {
            // InternalMyDsl.g:4111:1: ( 'Constant' )
            // InternalMyDsl.g:4112:2: 'Constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getConstantKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalMyDsl.g:4121:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4125:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalMyDsl.g:4126:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalMyDsl.g:4133:1: rule__Constant__Group__2__Impl : ( '{' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4137:1: ( ( '{' ) )
            // InternalMyDsl.g:4138:1: ( '{' )
            {
            // InternalMyDsl.g:4138:1: ( '{' )
            // InternalMyDsl.g:4139:2: '{'
            {
             before(grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalMyDsl.g:4148:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4152:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // InternalMyDsl.g:4153:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalMyDsl.g:4160:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__Group_3__0 )? ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4164:1: ( ( ( rule__Constant__Group_3__0 )? ) )
            // InternalMyDsl.g:4165:1: ( ( rule__Constant__Group_3__0 )? )
            {
            // InternalMyDsl.g:4165:1: ( ( rule__Constant__Group_3__0 )? )
            // InternalMyDsl.g:4166:2: ( rule__Constant__Group_3__0 )?
            {
             before(grammarAccess.getConstantAccess().getGroup_3()); 
            // InternalMyDsl.g:4167:2: ( rule__Constant__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:4167:3: rule__Constant__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // InternalMyDsl.g:4175:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4179:1: ( rule__Constant__Group__4__Impl )
            // InternalMyDsl.g:4180:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // InternalMyDsl.g:4186:1: rule__Constant__Group__4__Impl : ( '}' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4190:1: ( ( '}' ) )
            // InternalMyDsl.g:4191:1: ( '}' )
            {
            // InternalMyDsl.g:4191:1: ( '}' )
            // InternalMyDsl.g:4192:2: '}'
            {
             before(grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Constant__Group_3__0"
    // InternalMyDsl.g:4202:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4206:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalMyDsl.g:4207:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Constant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__0"


    // $ANTLR start "rule__Constant__Group_3__0__Impl"
    // InternalMyDsl.g:4214:1: rule__Constant__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4218:1: ( ( 'value' ) )
            // InternalMyDsl.g:4219:1: ( 'value' )
            {
            // InternalMyDsl.g:4219:1: ( 'value' )
            // InternalMyDsl.g:4220:2: 'value'
            {
             before(grammarAccess.getConstantAccess().getValueKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__0__Impl"


    // $ANTLR start "rule__Constant__Group_3__1"
    // InternalMyDsl.g:4229:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4233:1: ( rule__Constant__Group_3__1__Impl )
            // InternalMyDsl.g:4234:2: rule__Constant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__1"


    // $ANTLR start "rule__Constant__Group_3__1__Impl"
    // InternalMyDsl.g:4240:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4244:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalMyDsl.g:4245:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4245:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalMyDsl.g:4246:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalMyDsl.g:4247:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalMyDsl.g:4247:3: rule__Constant__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__1__Impl"


    // $ANTLR start "rule__VariableRef__Group__0"
    // InternalMyDsl.g:4256:1: rule__VariableRef__Group__0 : rule__VariableRef__Group__0__Impl rule__VariableRef__Group__1 ;
    public final void rule__VariableRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4260:1: ( rule__VariableRef__Group__0__Impl rule__VariableRef__Group__1 )
            // InternalMyDsl.g:4261:2: rule__VariableRef__Group__0__Impl rule__VariableRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VariableRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__0"


    // $ANTLR start "rule__VariableRef__Group__0__Impl"
    // InternalMyDsl.g:4268:1: rule__VariableRef__Group__0__Impl : ( 'VariableRef' ) ;
    public final void rule__VariableRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4272:1: ( ( 'VariableRef' ) )
            // InternalMyDsl.g:4273:1: ( 'VariableRef' )
            {
            // InternalMyDsl.g:4273:1: ( 'VariableRef' )
            // InternalMyDsl.g:4274:2: 'VariableRef'
            {
             before(grammarAccess.getVariableRefAccess().getVariableRefKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getVariableRefAccess().getVariableRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__0__Impl"


    // $ANTLR start "rule__VariableRef__Group__1"
    // InternalMyDsl.g:4283:1: rule__VariableRef__Group__1 : rule__VariableRef__Group__1__Impl rule__VariableRef__Group__2 ;
    public final void rule__VariableRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4287:1: ( rule__VariableRef__Group__1__Impl rule__VariableRef__Group__2 )
            // InternalMyDsl.g:4288:2: rule__VariableRef__Group__1__Impl rule__VariableRef__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__VariableRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__1"


    // $ANTLR start "rule__VariableRef__Group__1__Impl"
    // InternalMyDsl.g:4295:1: rule__VariableRef__Group__1__Impl : ( '{' ) ;
    public final void rule__VariableRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4299:1: ( ( '{' ) )
            // InternalMyDsl.g:4300:1: ( '{' )
            {
            // InternalMyDsl.g:4300:1: ( '{' )
            // InternalMyDsl.g:4301:2: '{'
            {
             before(grammarAccess.getVariableRefAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableRefAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__1__Impl"


    // $ANTLR start "rule__VariableRef__Group__2"
    // InternalMyDsl.g:4310:1: rule__VariableRef__Group__2 : rule__VariableRef__Group__2__Impl rule__VariableRef__Group__3 ;
    public final void rule__VariableRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4314:1: ( rule__VariableRef__Group__2__Impl rule__VariableRef__Group__3 )
            // InternalMyDsl.g:4315:2: rule__VariableRef__Group__2__Impl rule__VariableRef__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VariableRef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableRef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__2"


    // $ANTLR start "rule__VariableRef__Group__2__Impl"
    // InternalMyDsl.g:4322:1: rule__VariableRef__Group__2__Impl : ( 'variable' ) ;
    public final void rule__VariableRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4326:1: ( ( 'variable' ) )
            // InternalMyDsl.g:4327:1: ( 'variable' )
            {
            // InternalMyDsl.g:4327:1: ( 'variable' )
            // InternalMyDsl.g:4328:2: 'variable'
            {
             before(grammarAccess.getVariableRefAccess().getVariableKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVariableRefAccess().getVariableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__2__Impl"


    // $ANTLR start "rule__VariableRef__Group__3"
    // InternalMyDsl.g:4337:1: rule__VariableRef__Group__3 : rule__VariableRef__Group__3__Impl rule__VariableRef__Group__4 ;
    public final void rule__VariableRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4341:1: ( rule__VariableRef__Group__3__Impl rule__VariableRef__Group__4 )
            // InternalMyDsl.g:4342:2: rule__VariableRef__Group__3__Impl rule__VariableRef__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__VariableRef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableRef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__3"


    // $ANTLR start "rule__VariableRef__Group__3__Impl"
    // InternalMyDsl.g:4349:1: rule__VariableRef__Group__3__Impl : ( ( rule__VariableRef__VariableAssignment_3 ) ) ;
    public final void rule__VariableRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4353:1: ( ( ( rule__VariableRef__VariableAssignment_3 ) ) )
            // InternalMyDsl.g:4354:1: ( ( rule__VariableRef__VariableAssignment_3 ) )
            {
            // InternalMyDsl.g:4354:1: ( ( rule__VariableRef__VariableAssignment_3 ) )
            // InternalMyDsl.g:4355:2: ( rule__VariableRef__VariableAssignment_3 )
            {
             before(grammarAccess.getVariableRefAccess().getVariableAssignment_3()); 
            // InternalMyDsl.g:4356:2: ( rule__VariableRef__VariableAssignment_3 )
            // InternalMyDsl.g:4356:3: rule__VariableRef__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableRef__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableRefAccess().getVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__3__Impl"


    // $ANTLR start "rule__VariableRef__Group__4"
    // InternalMyDsl.g:4364:1: rule__VariableRef__Group__4 : rule__VariableRef__Group__4__Impl ;
    public final void rule__VariableRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4368:1: ( rule__VariableRef__Group__4__Impl )
            // InternalMyDsl.g:4369:2: rule__VariableRef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableRef__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__4"


    // $ANTLR start "rule__VariableRef__Group__4__Impl"
    // InternalMyDsl.g:4375:1: rule__VariableRef__Group__4__Impl : ( '}' ) ;
    public final void rule__VariableRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4379:1: ( ( '}' ) )
            // InternalMyDsl.g:4380:1: ( '}' )
            {
            // InternalMyDsl.g:4380:1: ( '}' )
            // InternalMyDsl.g:4381:2: '}'
            {
             before(grammarAccess.getVariableRefAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableRefAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__Group__4__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalMyDsl.g:4391:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4395:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalMyDsl.g:4396:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalMyDsl.g:4403:1: rule__Sum__Group__0__Impl : ( '+' ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4407:1: ( ( '+' ) )
            // InternalMyDsl.g:4408:1: ( '+' )
            {
            // InternalMyDsl.g:4408:1: ( '+' )
            // InternalMyDsl.g:4409:2: '+'
            {
             before(grammarAccess.getSumAccess().getPlusSignKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalMyDsl.g:4418:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl rule__Sum__Group__2 ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4422:1: ( rule__Sum__Group__1__Impl rule__Sum__Group__2 )
            // InternalMyDsl.g:4423:2: rule__Sum__Group__1__Impl rule__Sum__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Sum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalMyDsl.g:4430:1: rule__Sum__Group__1__Impl : ( '(' ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4434:1: ( ( '(' ) )
            // InternalMyDsl.g:4435:1: ( '(' )
            {
            // InternalMyDsl.g:4435:1: ( '(' )
            // InternalMyDsl.g:4436:2: '('
            {
             before(grammarAccess.getSumAccess().getLeftParenthesisKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group__2"
    // InternalMyDsl.g:4445:1: rule__Sum__Group__2 : rule__Sum__Group__2__Impl rule__Sum__Group__3 ;
    public final void rule__Sum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4449:1: ( rule__Sum__Group__2__Impl rule__Sum__Group__3 )
            // InternalMyDsl.g:4450:2: rule__Sum__Group__2__Impl rule__Sum__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Sum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__2"


    // $ANTLR start "rule__Sum__Group__2__Impl"
    // InternalMyDsl.g:4457:1: rule__Sum__Group__2__Impl : ( ( rule__Sum__RightAssignment_2 ) ) ;
    public final void rule__Sum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4461:1: ( ( ( rule__Sum__RightAssignment_2 ) ) )
            // InternalMyDsl.g:4462:1: ( ( rule__Sum__RightAssignment_2 ) )
            {
            // InternalMyDsl.g:4462:1: ( ( rule__Sum__RightAssignment_2 ) )
            // InternalMyDsl.g:4463:2: ( rule__Sum__RightAssignment_2 )
            {
             before(grammarAccess.getSumAccess().getRightAssignment_2()); 
            // InternalMyDsl.g:4464:2: ( rule__Sum__RightAssignment_2 )
            // InternalMyDsl.g:4464:3: rule__Sum__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sum__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__2__Impl"


    // $ANTLR start "rule__Sum__Group__3"
    // InternalMyDsl.g:4472:1: rule__Sum__Group__3 : rule__Sum__Group__3__Impl rule__Sum__Group__4 ;
    public final void rule__Sum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4476:1: ( rule__Sum__Group__3__Impl rule__Sum__Group__4 )
            // InternalMyDsl.g:4477:2: rule__Sum__Group__3__Impl rule__Sum__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Sum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__3"


    // $ANTLR start "rule__Sum__Group__3__Impl"
    // InternalMyDsl.g:4484:1: rule__Sum__Group__3__Impl : ( ',' ) ;
    public final void rule__Sum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4488:1: ( ( ',' ) )
            // InternalMyDsl.g:4489:1: ( ',' )
            {
            // InternalMyDsl.g:4489:1: ( ',' )
            // InternalMyDsl.g:4490:2: ','
            {
             before(grammarAccess.getSumAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__3__Impl"


    // $ANTLR start "rule__Sum__Group__4"
    // InternalMyDsl.g:4499:1: rule__Sum__Group__4 : rule__Sum__Group__4__Impl rule__Sum__Group__5 ;
    public final void rule__Sum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4503:1: ( rule__Sum__Group__4__Impl rule__Sum__Group__5 )
            // InternalMyDsl.g:4504:2: rule__Sum__Group__4__Impl rule__Sum__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__Sum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__4"


    // $ANTLR start "rule__Sum__Group__4__Impl"
    // InternalMyDsl.g:4511:1: rule__Sum__Group__4__Impl : ( ( rule__Sum__LeftAssignment_4 ) ) ;
    public final void rule__Sum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4515:1: ( ( ( rule__Sum__LeftAssignment_4 ) ) )
            // InternalMyDsl.g:4516:1: ( ( rule__Sum__LeftAssignment_4 ) )
            {
            // InternalMyDsl.g:4516:1: ( ( rule__Sum__LeftAssignment_4 ) )
            // InternalMyDsl.g:4517:2: ( rule__Sum__LeftAssignment_4 )
            {
             before(grammarAccess.getSumAccess().getLeftAssignment_4()); 
            // InternalMyDsl.g:4518:2: ( rule__Sum__LeftAssignment_4 )
            // InternalMyDsl.g:4518:3: rule__Sum__LeftAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sum__LeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__4__Impl"


    // $ANTLR start "rule__Sum__Group__5"
    // InternalMyDsl.g:4526:1: rule__Sum__Group__5 : rule__Sum__Group__5__Impl ;
    public final void rule__Sum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4530:1: ( rule__Sum__Group__5__Impl )
            // InternalMyDsl.g:4531:2: rule__Sum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__5"


    // $ANTLR start "rule__Sum__Group__5__Impl"
    // InternalMyDsl.g:4537:1: rule__Sum__Group__5__Impl : ( ')' ) ;
    public final void rule__Sum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4541:1: ( ( ')' ) )
            // InternalMyDsl.g:4542:1: ( ')' )
            {
            // InternalMyDsl.g:4542:1: ( ')' )
            // InternalMyDsl.g:4543:2: ')'
            {
             before(grammarAccess.getSumAccess().getRightParenthesisKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__5__Impl"


    // $ANTLR start "rule__Modulo__Group__0"
    // InternalMyDsl.g:4553:1: rule__Modulo__Group__0 : rule__Modulo__Group__0__Impl rule__Modulo__Group__1 ;
    public final void rule__Modulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4557:1: ( rule__Modulo__Group__0__Impl rule__Modulo__Group__1 )
            // InternalMyDsl.g:4558:2: rule__Modulo__Group__0__Impl rule__Modulo__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Modulo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0"


    // $ANTLR start "rule__Modulo__Group__0__Impl"
    // InternalMyDsl.g:4565:1: rule__Modulo__Group__0__Impl : ( '%' ) ;
    public final void rule__Modulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4569:1: ( ( '%' ) )
            // InternalMyDsl.g:4570:1: ( '%' )
            {
            // InternalMyDsl.g:4570:1: ( '%' )
            // InternalMyDsl.g:4571:2: '%'
            {
             before(grammarAccess.getModuloAccess().getPercentSignKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPercentSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0__Impl"


    // $ANTLR start "rule__Modulo__Group__1"
    // InternalMyDsl.g:4580:1: rule__Modulo__Group__1 : rule__Modulo__Group__1__Impl rule__Modulo__Group__2 ;
    public final void rule__Modulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4584:1: ( rule__Modulo__Group__1__Impl rule__Modulo__Group__2 )
            // InternalMyDsl.g:4585:2: rule__Modulo__Group__1__Impl rule__Modulo__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Modulo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1"


    // $ANTLR start "rule__Modulo__Group__1__Impl"
    // InternalMyDsl.g:4592:1: rule__Modulo__Group__1__Impl : ( '(' ) ;
    public final void rule__Modulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4596:1: ( ( '(' ) )
            // InternalMyDsl.g:4597:1: ( '(' )
            {
            // InternalMyDsl.g:4597:1: ( '(' )
            // InternalMyDsl.g:4598:2: '('
            {
             before(grammarAccess.getModuloAccess().getLeftParenthesisKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1__Impl"


    // $ANTLR start "rule__Modulo__Group__2"
    // InternalMyDsl.g:4607:1: rule__Modulo__Group__2 : rule__Modulo__Group__2__Impl rule__Modulo__Group__3 ;
    public final void rule__Modulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4611:1: ( rule__Modulo__Group__2__Impl rule__Modulo__Group__3 )
            // InternalMyDsl.g:4612:2: rule__Modulo__Group__2__Impl rule__Modulo__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Modulo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__2"


    // $ANTLR start "rule__Modulo__Group__2__Impl"
    // InternalMyDsl.g:4619:1: rule__Modulo__Group__2__Impl : ( ( rule__Modulo__RightAssignment_2 ) ) ;
    public final void rule__Modulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4623:1: ( ( ( rule__Modulo__RightAssignment_2 ) ) )
            // InternalMyDsl.g:4624:1: ( ( rule__Modulo__RightAssignment_2 ) )
            {
            // InternalMyDsl.g:4624:1: ( ( rule__Modulo__RightAssignment_2 ) )
            // InternalMyDsl.g:4625:2: ( rule__Modulo__RightAssignment_2 )
            {
             before(grammarAccess.getModuloAccess().getRightAssignment_2()); 
            // InternalMyDsl.g:4626:2: ( rule__Modulo__RightAssignment_2 )
            // InternalMyDsl.g:4626:3: rule__Modulo__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__2__Impl"


    // $ANTLR start "rule__Modulo__Group__3"
    // InternalMyDsl.g:4634:1: rule__Modulo__Group__3 : rule__Modulo__Group__3__Impl rule__Modulo__Group__4 ;
    public final void rule__Modulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4638:1: ( rule__Modulo__Group__3__Impl rule__Modulo__Group__4 )
            // InternalMyDsl.g:4639:2: rule__Modulo__Group__3__Impl rule__Modulo__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Modulo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__3"


    // $ANTLR start "rule__Modulo__Group__3__Impl"
    // InternalMyDsl.g:4646:1: rule__Modulo__Group__3__Impl : ( ',' ) ;
    public final void rule__Modulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4650:1: ( ( ',' ) )
            // InternalMyDsl.g:4651:1: ( ',' )
            {
            // InternalMyDsl.g:4651:1: ( ',' )
            // InternalMyDsl.g:4652:2: ','
            {
             before(grammarAccess.getModuloAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__3__Impl"


    // $ANTLR start "rule__Modulo__Group__4"
    // InternalMyDsl.g:4661:1: rule__Modulo__Group__4 : rule__Modulo__Group__4__Impl rule__Modulo__Group__5 ;
    public final void rule__Modulo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4665:1: ( rule__Modulo__Group__4__Impl rule__Modulo__Group__5 )
            // InternalMyDsl.g:4666:2: rule__Modulo__Group__4__Impl rule__Modulo__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__Modulo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__4"


    // $ANTLR start "rule__Modulo__Group__4__Impl"
    // InternalMyDsl.g:4673:1: rule__Modulo__Group__4__Impl : ( ( rule__Modulo__LeftAssignment_4 ) ) ;
    public final void rule__Modulo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4677:1: ( ( ( rule__Modulo__LeftAssignment_4 ) ) )
            // InternalMyDsl.g:4678:1: ( ( rule__Modulo__LeftAssignment_4 ) )
            {
            // InternalMyDsl.g:4678:1: ( ( rule__Modulo__LeftAssignment_4 ) )
            // InternalMyDsl.g:4679:2: ( rule__Modulo__LeftAssignment_4 )
            {
             before(grammarAccess.getModuloAccess().getLeftAssignment_4()); 
            // InternalMyDsl.g:4680:2: ( rule__Modulo__LeftAssignment_4 )
            // InternalMyDsl.g:4680:3: rule__Modulo__LeftAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__LeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__4__Impl"


    // $ANTLR start "rule__Modulo__Group__5"
    // InternalMyDsl.g:4688:1: rule__Modulo__Group__5 : rule__Modulo__Group__5__Impl ;
    public final void rule__Modulo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4692:1: ( rule__Modulo__Group__5__Impl )
            // InternalMyDsl.g:4693:2: rule__Modulo__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__5"


    // $ANTLR start "rule__Modulo__Group__5__Impl"
    // InternalMyDsl.g:4699:1: rule__Modulo__Group__5__Impl : ( ')' ) ;
    public final void rule__Modulo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4703:1: ( ( ')' ) )
            // InternalMyDsl.g:4704:1: ( ')' )
            {
            // InternalMyDsl.g:4704:1: ( ')' )
            // InternalMyDsl.g:4705:2: ')'
            {
             before(grammarAccess.getModuloAccess().getRightParenthesisKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__5__Impl"


    // $ANTLR start "rule__Program__XAssignment_2_1"
    // InternalMyDsl.g:4715:1: rule__Program__XAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Program__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4719:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4720:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4720:2: ( ruleEDouble )
            // InternalMyDsl.g:4721:3: ruleEDouble
            {
             before(grammarAccess.getProgramAccess().getXEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getXEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__XAssignment_2_1"


    // $ANTLR start "rule__Program__YAssignment_3_1"
    // InternalMyDsl.g:4730:1: rule__Program__YAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Program__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4734:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4735:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4735:2: ( ruleEDouble )
            // InternalMyDsl.g:4736:3: ruleEDouble
            {
             before(grammarAccess.getProgramAccess().getYEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getYEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__YAssignment_3_1"


    // $ANTLR start "rule__Program__AngleAssignment_4_1"
    // InternalMyDsl.g:4745:1: rule__Program__AngleAssignment_4_1 : ( ruleCardinals ) ;
    public final void rule__Program__AngleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4749:1: ( ( ruleCardinals ) )
            // InternalMyDsl.g:4750:2: ( ruleCardinals )
            {
            // InternalMyDsl.g:4750:2: ( ruleCardinals )
            // InternalMyDsl.g:4751:3: ruleCardinals
            {
             before(grammarAccess.getProgramAccess().getAngleCardinalsEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinals();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getAngleCardinalsEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__AngleAssignment_4_1"


    // $ANTLR start "rule__Program__DistanceAssignment_5_1"
    // InternalMyDsl.g:4760:1: rule__Program__DistanceAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Program__DistanceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4764:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4765:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4765:2: ( ruleEDouble )
            // InternalMyDsl.g:4766:3: ruleEDouble
            {
             before(grammarAccess.getProgramAccess().getDistanceEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDistanceEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DistanceAssignment_5_1"


    // $ANTLR start "rule__Program__MainMethodAssignment_7"
    // InternalMyDsl.g:4775:1: rule__Program__MainMethodAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Program__MainMethodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4779:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:4780:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:4780:2: ( ( ruleEString ) )
            // InternalMyDsl.g:4781:3: ( ruleEString )
            {
             before(grammarAccess.getProgramAccess().getMainMethodMethodCrossReference_7_0()); 
            // InternalMyDsl.g:4782:3: ( ruleEString )
            // InternalMyDsl.g:4783:4: ruleEString
            {
             before(grammarAccess.getProgramAccess().getMainMethodMethodEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMainMethodMethodEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getProgramAccess().getMainMethodMethodCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MainMethodAssignment_7"


    // $ANTLR start "rule__Program__MethodsAssignment_8_2"
    // InternalMyDsl.g:4794:1: rule__Program__MethodsAssignment_8_2 : ( ruleMethod ) ;
    public final void rule__Program__MethodsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4798:1: ( ( ruleMethod ) )
            // InternalMyDsl.g:4799:2: ( ruleMethod )
            {
            // InternalMyDsl.g:4799:2: ( ruleMethod )
            // InternalMyDsl.g:4800:3: ruleMethod
            {
             before(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MethodsAssignment_8_2"


    // $ANTLR start "rule__Program__MethodsAssignment_8_3_1"
    // InternalMyDsl.g:4809:1: rule__Program__MethodsAssignment_8_3_1 : ( ruleMethod ) ;
    public final void rule__Program__MethodsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4813:1: ( ( ruleMethod ) )
            // InternalMyDsl.g:4814:2: ( ruleMethod )
            {
            // InternalMyDsl.g:4814:2: ( ruleMethod )
            // InternalMyDsl.g:4815:3: ruleMethod
            {
             before(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MethodsAssignment_8_3_1"


    // $ANTLR start "rule__Program__VariablesAssignment_9_2"
    // InternalMyDsl.g:4824:1: rule__Program__VariablesAssignment_9_2 : ( ruleVariable ) ;
    public final void rule__Program__VariablesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:4829:2: ( ruleVariable )
            {
            // InternalMyDsl.g:4829:2: ( ruleVariable )
            // InternalMyDsl.g:4830:3: ruleVariable
            {
             before(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__VariablesAssignment_9_2"


    // $ANTLR start "rule__Program__VariablesAssignment_9_3_1"
    // InternalMyDsl.g:4839:1: rule__Program__VariablesAssignment_9_3_1 : ( ruleVariable ) ;
    public final void rule__Program__VariablesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:4844:2: ( ruleVariable )
            {
            // InternalMyDsl.g:4844:2: ( ruleVariable )
            // InternalMyDsl.g:4845:3: ruleVariable
            {
             before(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__VariablesAssignment_9_3_1"


    // $ANTLR start "rule__Program__LinesAssignment_10_2"
    // InternalMyDsl.g:4854:1: rule__Program__LinesAssignment_10_2 : ( ruleLine ) ;
    public final void rule__Program__LinesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( ( ruleLine ) )
            // InternalMyDsl.g:4859:2: ( ruleLine )
            {
            // InternalMyDsl.g:4859:2: ( ruleLine )
            // InternalMyDsl.g:4860:3: ruleLine
            {
             before(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__LinesAssignment_10_2"


    // $ANTLR start "rule__Program__LinesAssignment_10_3_1"
    // InternalMyDsl.g:4869:1: rule__Program__LinesAssignment_10_3_1 : ( ruleLine ) ;
    public final void rule__Program__LinesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( ( ruleLine ) )
            // InternalMyDsl.g:4874:2: ( ruleLine )
            {
            // InternalMyDsl.g:4874:2: ( ruleLine )
            // InternalMyDsl.g:4875:3: ruleLine
            {
             before(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__LinesAssignment_10_3_1"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalMyDsl.g:4884:1: rule__Method__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4888:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4889:2: ( ruleEString )
            {
            // InternalMyDsl.g:4889:2: ( ruleEString )
            // InternalMyDsl.g:4890:3: ruleEString
            {
             before(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__BlockAssignment_4"
    // InternalMyDsl.g:4899:1: rule__Method__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__Method__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4903:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:4904:2: ( ruleBlock )
            {
            // InternalMyDsl.g:4904:2: ( ruleBlock )
            // InternalMyDsl.g:4905:3: ruleBlock
            {
             before(grammarAccess.getMethodAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__BlockAssignment_4"


    // $ANTLR start "rule__Variable__NameAssignment_2"
    // InternalMyDsl.g:4914:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4918:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4919:2: ( ruleEString )
            {
            // InternalMyDsl.g:4919:2: ( ruleEString )
            // InternalMyDsl.g:4920:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_2"


    // $ANTLR start "rule__Variable__ValueAssignment_4_1"
    // InternalMyDsl.g:4929:1: rule__Variable__ValueAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Variable__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4933:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4934:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4934:2: ( ruleEDouble )
            // InternalMyDsl.g:4935:3: ruleEDouble
            {
             before(grammarAccess.getVariableAccess().getValueEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValueAssignment_4_1"


    // $ANTLR start "rule__Line__X1Assignment_3_1"
    // InternalMyDsl.g:4944:1: rule__Line__X1Assignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Line__X1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4948:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4949:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4949:2: ( ruleEDouble )
            // InternalMyDsl.g:4950:3: ruleEDouble
            {
             before(grammarAccess.getLineAccess().getX1EDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLineAccess().getX1EDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__X1Assignment_3_1"


    // $ANTLR start "rule__Line__Y1Assignment_4_1"
    // InternalMyDsl.g:4959:1: rule__Line__Y1Assignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Line__Y1Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4963:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4964:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4964:2: ( ruleEDouble )
            // InternalMyDsl.g:4965:3: ruleEDouble
            {
             before(grammarAccess.getLineAccess().getY1EDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLineAccess().getY1EDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Y1Assignment_4_1"


    // $ANTLR start "rule__Line__X2Assignment_5_1"
    // InternalMyDsl.g:4974:1: rule__Line__X2Assignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Line__X2Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4979:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4979:2: ( ruleEDouble )
            // InternalMyDsl.g:4980:3: ruleEDouble
            {
             before(grammarAccess.getLineAccess().getX2EDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLineAccess().getX2EDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__X2Assignment_5_1"


    // $ANTLR start "rule__Line__Y2Assignment_6_1"
    // InternalMyDsl.g:4989:1: rule__Line__Y2Assignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Line__Y2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4993:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4994:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4994:2: ( ruleEDouble )
            // InternalMyDsl.g:4995:3: ruleEDouble
            {
             before(grammarAccess.getLineAccess().getY2EDoubleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLineAccess().getY2EDoubleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Y2Assignment_6_1"


    // $ANTLR start "rule__Block__StatementsAssignment_3_2"
    // InternalMyDsl.g:5004:1: rule__Block__StatementsAssignment_3_2 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:5009:2: ( ruleStatement )
            {
            // InternalMyDsl.g:5009:2: ( ruleStatement )
            // InternalMyDsl.g:5010:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_3_2"


    // $ANTLR start "rule__Block__StatementsAssignment_3_3_1"
    // InternalMyDsl.g:5019:1: rule__Block__StatementsAssignment_3_3_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5023:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:5024:2: ( ruleStatement )
            {
            // InternalMyDsl.g:5024:2: ( ruleStatement )
            // InternalMyDsl.g:5025:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_3_3_1"


    // $ANTLR start "rule__IfStmt__ThenBranchAssignment_3"
    // InternalMyDsl.g:5034:1: rule__IfStmt__ThenBranchAssignment_3 : ( ruleBlock ) ;
    public final void rule__IfStmt__ThenBranchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5038:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:5039:2: ( ruleBlock )
            {
            // InternalMyDsl.g:5039:2: ( ruleBlock )
            // InternalMyDsl.g:5040:3: ruleBlock
            {
             before(grammarAccess.getIfStmtAccess().getThenBranchBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStmtAccess().getThenBranchBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__ThenBranchAssignment_3"


    // $ANTLR start "rule__IfStmt__ElseBranchAssignment_4_1"
    // InternalMyDsl.g:5049:1: rule__IfStmt__ElseBranchAssignment_4_1 : ( ruleBlock ) ;
    public final void rule__IfStmt__ElseBranchAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5053:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:5054:2: ( ruleBlock )
            {
            // InternalMyDsl.g:5054:2: ( ruleBlock )
            // InternalMyDsl.g:5055:3: ruleBlock
            {
             before(grammarAccess.getIfStmtAccess().getElseBranchBlockParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStmtAccess().getElseBranchBlockParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__ElseBranchAssignment_4_1"


    // $ANTLR start "rule__IfStmt__ConditionAssignment_6"
    // InternalMyDsl.g:5064:1: rule__IfStmt__ConditionAssignment_6 : ( ruleCondition ) ;
    public final void rule__IfStmt__ConditionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5068:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:5069:2: ( ruleCondition )
            {
            // InternalMyDsl.g:5069:2: ( ruleCondition )
            // InternalMyDsl.g:5070:3: ruleCondition
            {
             before(grammarAccess.getIfStmtAccess().getConditionConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIfStmtAccess().getConditionConditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__ConditionAssignment_6"


    // $ANTLR start "rule__VariableAffect__VariableAssignment_1"
    // InternalMyDsl.g:5079:1: rule__VariableAffect__VariableAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__VariableAffect__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5083:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5084:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5084:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5085:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAffectAccess().getVariableVariableCrossReference_1_0()); 
            // InternalMyDsl.g:5086:3: ( ruleEString )
            // InternalMyDsl.g:5087:4: ruleEString
            {
             before(grammarAccess.getVariableAffectAccess().getVariableVariableEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAffectAccess().getVariableVariableEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableAffectAccess().getVariableVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__VariableAssignment_1"


    // $ANTLR start "rule__VariableAffect__ValueAssignment_3"
    // InternalMyDsl.g:5098:1: rule__VariableAffect__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__VariableAffect__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5102:1: ( ( ruleValue ) )
            // InternalMyDsl.g:5103:2: ( ruleValue )
            {
            // InternalMyDsl.g:5103:2: ( ruleValue )
            // InternalMyDsl.g:5104:3: ruleValue
            {
             before(grammarAccess.getVariableAffectAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariableAffectAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAffect__ValueAssignment_3"


    // $ANTLR start "rule__CallMethod__MethodAssignment_3"
    // InternalMyDsl.g:5113:1: rule__CallMethod__MethodAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CallMethod__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5117:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5118:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5118:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5119:3: ( ruleEString )
            {
             before(grammarAccess.getCallMethodAccess().getMethodMethodCrossReference_3_0()); 
            // InternalMyDsl.g:5120:3: ( ruleEString )
            // InternalMyDsl.g:5121:4: ruleEString
            {
             before(grammarAccess.getCallMethodAccess().getMethodMethodEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCallMethodAccess().getMethodMethodEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCallMethodAccess().getMethodMethodCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMethod__MethodAssignment_3"


    // $ANTLR start "rule__GreaterThan__LeftAssignment_3"
    // InternalMyDsl.g:5132:1: rule__GreaterThan__LeftAssignment_3 : ( ruleValue ) ;
    public final void rule__GreaterThan__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5136:1: ( ( ruleValue ) )
            // InternalMyDsl.g:5137:2: ( ruleValue )
            {
            // InternalMyDsl.g:5137:2: ( ruleValue )
            // InternalMyDsl.g:5138:3: ruleValue
            {
             before(grammarAccess.getGreaterThanAccess().getLeftValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGreaterThanAccess().getLeftValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__LeftAssignment_3"


    // $ANTLR start "rule__GreaterThan__RightAssignment_5"
    // InternalMyDsl.g:5147:1: rule__GreaterThan__RightAssignment_5 : ( ruleValue ) ;
    public final void rule__GreaterThan__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5151:1: ( ( ruleValue ) )
            // InternalMyDsl.g:5152:2: ( ruleValue )
            {
            // InternalMyDsl.g:5152:2: ( ruleValue )
            // InternalMyDsl.g:5153:3: ruleValue
            {
             before(grammarAccess.getGreaterThanAccess().getRightValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGreaterThanAccess().getRightValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__RightAssignment_5"


    // $ANTLR start "rule__Constant__ValueAssignment_3_1"
    // InternalMyDsl.g:5162:1: rule__Constant__ValueAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5166:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:5167:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:5167:2: ( ruleEDouble )
            // InternalMyDsl.g:5168:3: ruleEDouble
            {
             before(grammarAccess.getConstantAccess().getValueEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getValueEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_3_1"


    // $ANTLR start "rule__VariableRef__VariableAssignment_3"
    // InternalMyDsl.g:5177:1: rule__VariableRef__VariableAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__VariableRef__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5181:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5182:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5182:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5183:3: ( ruleEString )
            {
             before(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_3_0()); 
            // InternalMyDsl.g:5184:3: ( ruleEString )
            // InternalMyDsl.g:5185:4: ruleEString
            {
             before(grammarAccess.getVariableRefAccess().getVariableVariableEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableRefAccess().getVariableVariableEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__VariableAssignment_3"


    // $ANTLR start "rule__Sum__RightAssignment_2"
    // InternalMyDsl.g:5196:1: rule__Sum__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Sum__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5200:1: ( ( ruleValue ) )
            // InternalMyDsl.g:5201:2: ( ruleValue )
            {
            // InternalMyDsl.g:5201:2: ( ruleValue )
            // InternalMyDsl.g:5202:3: ruleValue
            {
             before(grammarAccess.getSumAccess().getRightValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSumAccess().getRightValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__RightAssignment_2"


    // $ANTLR start "rule__Sum__LeftAssignment_4"
    // InternalMyDsl.g:5211:1: rule__Sum__LeftAssignment_4 : ( ruleValue ) ;
    public final void rule__Sum__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5215:1: ( ( ruleValue ) )
            // InternalMyDsl.g:5216:2: ( ruleValue )
            {
            // InternalMyDsl.g:5216:2: ( ruleValue )
            // InternalMyDsl.g:5217:3: ruleValue
            {
             before(grammarAccess.getSumAccess().getLeftValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSumAccess().getLeftValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__LeftAssignment_4"


    // $ANTLR start "rule__Modulo__RightAssignment_2"
    // InternalMyDsl.g:5226:1: rule__Modulo__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Modulo__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5230:1: ( ( ruleValue ) )
            // InternalMyDsl.g:5231:2: ( ruleValue )
            {
            // InternalMyDsl.g:5231:2: ( ruleValue )
            // InternalMyDsl.g:5232:3: ruleValue
            {
             before(grammarAccess.getModuloAccess().getRightValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getModuloAccess().getRightValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__RightAssignment_2"


    // $ANTLR start "rule__Modulo__LeftAssignment_4"
    // InternalMyDsl.g:5241:1: rule__Modulo__LeftAssignment_4 : ( ruleValue ) ;
    public final void rule__Modulo__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5245:1: ( ( ruleValue ) )
            // InternalMyDsl.g:5246:2: ( ruleValue )
            {
            // InternalMyDsl.g:5246:2: ( ruleValue )
            // InternalMyDsl.g:5247:3: ruleValue
            {
             before(grammarAccess.getModuloAccess().getLeftValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getModuloAccess().getLeftValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__LeftAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001E80000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001A100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000600000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000F000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x001D440000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2700000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});

}