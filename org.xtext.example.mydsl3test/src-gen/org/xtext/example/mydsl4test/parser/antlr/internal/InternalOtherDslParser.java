package org.xtext.example.mydsl4test.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl4test.services.OtherDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOtherDslParser extends AbstractInternalAntlrParser {
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

        public InternalOtherDslParser(TokenStream input, OtherDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OtherRoot";
       	}

       	@Override
       	protected OtherDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOtherRoot"
    // InternalOtherDsl.g:64:1: entryRuleOtherRoot returns [EObject current=null] : iv_ruleOtherRoot= ruleOtherRoot EOF ;
    public final EObject entryRuleOtherRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherRoot = null;


        try {
            // InternalOtherDsl.g:64:50: (iv_ruleOtherRoot= ruleOtherRoot EOF )
            // InternalOtherDsl.g:65:2: iv_ruleOtherRoot= ruleOtherRoot EOF
            {
             newCompositeNode(grammarAccess.getOtherRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherRoot=ruleOtherRoot();

            state._fsp--;

             current =iv_ruleOtherRoot; 
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
    // $ANTLR end "entryRuleOtherRoot"


    // $ANTLR start "ruleOtherRoot"
    // InternalOtherDsl.g:71:1: ruleOtherRoot returns [EObject current=null] : ( (lv_value_0_0= ruleModel ) ) ;
    public final EObject ruleOtherRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOtherDsl.g:77:2: ( ( (lv_value_0_0= ruleModel ) ) )
            // InternalOtherDsl.g:78:2: ( (lv_value_0_0= ruleModel ) )
            {
            // InternalOtherDsl.g:78:2: ( (lv_value_0_0= ruleModel ) )
            // InternalOtherDsl.g:79:3: (lv_value_0_0= ruleModel )
            {
            // InternalOtherDsl.g:79:3: (lv_value_0_0= ruleModel )
            // InternalOtherDsl.g:80:4: lv_value_0_0= ruleModel
            {

            				newCompositeNode(grammarAccess.getOtherRootAccess().getValueModelParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleModel();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOtherRootRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl3test.MyDslTest.Model");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleOtherRoot"


    // $ANTLR start "entryRuleModel"
    // InternalOtherDsl.g:100:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOtherDsl.g:100:46: (iv_ruleModel= ruleModel EOF )
            // InternalOtherDsl.g:101:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOtherDsl.g:107:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalOtherDsl.g:113:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalOtherDsl.g:114:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalOtherDsl.g:114:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOtherDsl.g:115:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalOtherDsl.g:115:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalOtherDsl.g:116:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.example.mydsl3test.MyDslTest.Greeting");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalOtherDsl.g:136:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalOtherDsl.g:136:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalOtherDsl.g:137:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalOtherDsl.g:143:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOtherDsl.g:149:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalOtherDsl.g:150:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalOtherDsl.g:150:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // InternalOtherDsl.g:151:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
            		
            // InternalOtherDsl.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOtherDsl.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOtherDsl.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalOtherDsl.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
            		

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
    // $ANTLR end "ruleGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}