package exerciseFour;

import org.exerciseFour.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AccountTest {
    private static final double epsilon = 1e-6;


    @Test
    void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    void depositWillNotAcceptNegativeNumbers() {
        Account account = new Account(100);

        boolean result = account.deposit(-50);

        assertEquals(0d, account.getBalance(), epsilon);
        assertFalse(result);
    }

    @Test
    void withdrawWillNotAcceptNegativeNumbers() {
        Account account = new Account(100);

        boolean result = account.withdraw(-50);

        assertEquals(0d, account.getBalance(), epsilon);
        assertFalse(result);
    }

    @Test
    void accountCannotOverstepOverdraftLimit() {
        Account account = new Account(100);

        boolean result = account.withdraw(200);

        assertEquals(0d, account.getBalance(), epsilon);
        assertFalse(result);
    }

    @Test
    void depositAddsCorrectAmount() {
        Account account = new Account(100);
        boolean result = account.deposit(50);

        assertEquals(50d, account.getBalance(), epsilon);
        assertTrue(result);
    }

    @Test
    void withdrawSubtractsCorrectAmount() {
        Account account = new Account(100);
        account.deposit(150);

        boolean result = account.withdraw(50);

        assertEquals(100d, account.getBalance(), epsilon);
        assertTrue(result);
    }
}
