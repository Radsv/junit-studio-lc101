package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }



    @Test
    public void onlyBracketsReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsWithStringWithinReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void onlyBracketsWithStringAroundAndWithinReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void onlyQuotesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyStringsWithBracketAfterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode[]"));
    }

    @Test
    public void SingleBracketReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void SingleBracketWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }

    @Test
    public void ReversedBracketsWithStringReturnsFalse() {

        assertFalse( BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void ReversedBracketsReturnsFalse() {

        assertFalse( BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void MultipleCloseBracketsReturnsFalse() {

        assertFalse( BalancedBrackets.hasBalancedBrackets("[["));
    }


    @Test
    public void MultipleOpenAndClosedBracketsReturnsFalse() {

        assertFalse( BalancedBrackets.hasBalancedBrackets("[code]]"));
    }

}
