package com.akasia.investment.task.bank;

import java.util.List;

public interface BankDao {
	Bank getBankById(String bankId);

	List<Bank> getAllBanks();

	boolean deleteBank(Bank bank);

	boolean updateBank(Bank bank);

	boolean createBank(Bank bank);
}
