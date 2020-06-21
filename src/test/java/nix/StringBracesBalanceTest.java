package nix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringBracesBalanceTest {
    StringBracesBalance task = new StringBracesBalance();

    @Test
    public void ArrayOfUniqueNumbers(){

        assertTrue(task.stringChecking("({[[]]})"));
        assertFalse(task.stringChecking("{]{{()"));
        assertFalse(task.stringChecking("({(}))"));
        assertTrue(task.stringChecking("     "));
        assertTrue(task.stringChecking(""));


    }



}
