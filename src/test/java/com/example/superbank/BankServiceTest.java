package com.example.superbank;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    private BalanceRepository balanceRepository = new BalanceRepository();
    private BankService bankService = new BankService(balanceRepository);

    @Test
    void getBalance() {
        BigDecimal balance = bankService.getBalance(1l);
        assertEquals(balance, BigDecimal.TEN);
    }
    @Test
    void addMoney() {
        BigDecimal balance = bankService.addMoney(1l, BigDecimal.ONE);
        assertEquals(balance, BigDecimal.valueOf(11));
    }
}