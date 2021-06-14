package org.xtext.example.mydsl4test.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl4test.services.OtherDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOtherDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalOtherDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOtherDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOtherDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOtherDsl.g"; }


    	private OtherDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(OtherDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleOtherRoot"
    // InternalOtherDsl.g:53:1: entryRuleOtherRoot : ruleOtherRoot EOF ;
    public final void entryRuleOtherRoot() throws RecognitionException {
        try {
            // InternalOtherDsl.g:54:1: ( ruleOtherRoot EOF )
            // InternalOtherDsl.g:55:1: ruleOtherRoot EOF
            {
             before(grammarAccess.getOtherRootRule()); 
            pushFollow(FOLLOW_1);
            ruleOtherRoot();

            state._fsp--;

             after(grammarAccess.getOtherRootRule()); 
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
    // $ANTLR end "entryRuleOtherRoot"


    // $ANTLR start "ruleOtherRoot"
    // InternalOtherDsl.g:62:1: ruleOtherRoot : ( ( rule__OtherRoot__ValueAssignment ) ) ;
    public final void ruleOtherRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:66:2: ( ( ( rule__OtherRoot__ValueAssignment ) ) )
            // InternalOtherDsl.g:67:2: ( ( rule__OtherRoot__ValueAssignment ) )
            {
            // InternalOtherDsl.g:67:2: ( ( rule__OtherRoot__ValueAssignment ) )
            // InternalOtherDsl.g:68:3: ( rule__OtherRoot__ValueAssignment )
            {
             before(grammarAccess.getOtherRootAccess().getValueAssignment()); 
            // InternalOtherDsl.g:69:3: ( rule__OtherRoot__ValueAssignment )
            // InternalOtherDsl.g:69:4: rule__OtherRoot__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OtherRoot__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOtherRootAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleOtherRoot"


    // $ANTLR start "entryRuleModel"
    // InternalOtherDsl.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOtherDsl.g:79:1: ( ruleModel EOF )
            // InternalOtherDsl.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOtherDsl.g:87:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:91:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalOtherDsl.g:92:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalOtherDsl.g:92:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalOtherDsl.g:93:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalOtherDsl.g:94:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOtherDsl.g:94:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalOtherDsl.g:103:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalOtherDsl.g:104:1: ( ruleGreeting EOF )
            // InternalOtherDsl.g:105:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalOtherDsl.g:112:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:116:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalOtherDsl.g:117:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalOtherDsl.g:117:2: ( ( rule__Greeting__Group__0 ) )
            // InternalOtherDsl.g:118:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalOtherDsl.g:119:3: ( rule__Greeting__Group__0 )
            // InternalOtherDsl.g:119:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalOtherDsl.g:127:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:131:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalOtherDsl.g:132:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalOtherDsl.g:139:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:143:1: ( ( 'Hello' ) )
            // InternalOtherDsl.g:144:1: ( 'Hello' )
            {
            // InternalOtherDsl.g:144:1: ( 'Hello' )
            // InternalOtherDsl.g:145:2: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalOtherDsl.g:154:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:158:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalOtherDsl.g:159:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalOtherDsl.g:166:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:170:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalOtherDsl.g:171:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalOtherDsl.g:171:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalOtherDsl.g:172:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalOtherDsl.g:173:2: ( rule__Greeting__NameAssignment_1 )
            // InternalOtherDsl.g:173:3: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalOtherDsl.g:181:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:185:1: ( rule__Greeting__Group__2__Impl )
            // InternalOtherDsl.g:186:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalOtherDsl.g:192:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:196:1: ( ( '!' ) )
            // InternalOtherDsl.g:197:1: ( '!' )
            {
            // InternalOtherDsl.g:197:1: ( '!' )
            // InternalOtherDsl.g:198:2: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__OtherRoot__ValueAssignment"
    // InternalOtherDsl.g:208:1: rule__OtherRoot__ValueAssignment : ( ruleModel ) ;
    public final void rule__OtherRoot__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:212:1: ( ( ruleModel ) )
            // InternalOtherDsl.g:213:2: ( ruleModel )
            {
            // InternalOtherDsl.g:213:2: ( ruleModel )
            // InternalOtherDsl.g:214:3: ruleModel
            {
             before(grammarAccess.getOtherRootAccess().getValueModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getOtherRootAccess().getValueModelParserRuleCall_0()); 

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
    // $ANTLR end "rule__OtherRoot__ValueAssignment"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalOtherDsl.g:223:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:227:1: ( ( ruleGreeting ) )
            // InternalOtherDsl.g:228:2: ( ruleGreeting )
            {
            // InternalOtherDsl.g:228:2: ( ruleGreeting )
            // InternalOtherDsl.g:229:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalOtherDsl.g:238:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOtherDsl.g:242:1: ( ( RULE_ID ) )
            // InternalOtherDsl.g:243:2: ( RULE_ID )
            {
            // InternalOtherDsl.g:243:2: ( RULE_ID )
            // InternalOtherDsl.g:244:3: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}