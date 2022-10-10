package Chapter2.MiniProject.BankAccount.test;

import Chapter2.MiniProject.BankAccount.main.BankService;
import org.junit.Assert;
import org.junit.Test;

public class BankServiceTest {
    /**
     * A BankService should be first initialized with a balance of 0.
     */
    @Test
    public void bankServiceTest1(){
        BankService bankService = new BankService();
        double expected = 0;
        double actual = bankService.getBalance();
        Assert.assertEquals(expected, actual,.01);
    }

    /**
     * A BankService should have a balance of 500 if 500 is deposited.
     */
    @Test
    public void bankServiceTest2(){
        BankService bankService = new BankService();
        bankService.deposit(500);
        double expected = 500;
        double actual = bankService.getBalance();
        Assert.assertEquals(expected, actual,.01);
    }
    /**
     * A BankService should have a balance of 700 if 500 and then 200 is deposited.
     */
    @Test
    public void bankServiceTest3(){
        BankService bankService = new BankService();
        bankService.deposit(500);
        bankService.deposit(200);
        double expected = 700;
        double actual = bankService.getBalance();
        Assert.assertEquals(expected, actual,.01);
    }
    /**
     * A BankService should have a balance of 300 if 500 is deposited and then 200 is withdrawn.
     */
    @Test
    public void bankServiceTest4(){
        BankService bankService = new BankService();
        bankService.deposit(500);
        bankService.withdraw(200);
        double expected = 300;
        double actual = bankService.getBalance();
        Assert.assertEquals(expected, actual,.01);
    }
    /**
     * A BankService should have a balance of 500 if 500 is deposited and then 700 is withdrawn, because the withdrawl
     * should fail and not be processed due to potentially causing a negative balance.
     */
    @Test
    public void bankServiceTest5(){
        BankService bankService = new BankService();
        bankService.deposit(500);
        bankService.withdraw(700);
        double expected = 500;
        double actual = bankService.getBalance();
        Assert.assertEquals(expected, actual,.01);
    }
    /**
     * A BankService should have a balance of 0 if 500 is deposited and then 500 is withdrawn.
     */
    @Test
    public void bankServiceTest6(){
        BankService bankService = new BankService();
        bankService.deposit(500);
        bankService.withdraw(500);
        double expected = 0;
        double actual = bankService.getBalance();
        Assert.assertEquals(expected, actual,.01);
    }
}
