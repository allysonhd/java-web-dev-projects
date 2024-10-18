package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
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
    public void returnsTrueIfStringIsEmpty() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void returnsTrueIfStringHasBrackets(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void returnsTrueIfStringHasBracketsInBetween(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void returnsTrueIfHasDoubleBrackets() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void returnsTrueIfDoubleBracketsBeforeAndAfterString() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }
    @Test
    public void returnsTrueIfDoubleBracketsBeforeString() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void returnsTrueIfStringHasDoubleBrackets() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[[Launchcode]]"));
    }
    @Test
    public void returnsFalseIfStringHas1Bracket() {
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("[") );
    }

    @Test
    public void returnsFalseIfHasBackwardsBrackets() {
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void returnsFalseIfStringHas1StartBracket() {
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void returnsFalseIfStringHas2InternalBackwardsBracket() {
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
}