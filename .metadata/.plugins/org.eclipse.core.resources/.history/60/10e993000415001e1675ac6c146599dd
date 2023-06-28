package com.akasia.investment.task.bank;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BankDaoImpl implements BankDao {
	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_BANK = "select * from \"tab_bank\" where \"bank_id\" = ?";
	private final String SQL_DELETE_BANK = "delete from \"tab_bank\" where \"bank_id\" = ?";
	private final String SQL_UPDATE_BANK = "update \"tab_bank\" set \"bank_name\" = ?, \"bank_name_ar\" = ?, \"bank_abbr\" = ? where \"bank_id\" = ?";
	private final String SQL_GET_ALL = "select * from \"tab_bank\"";
	private final String SQL_INSERT_BANK = "insert into \"tab_bank\"(\"bank_id\", \"bank_name\", \"bank_name_ar\", \"bank_abbr\") values(?,?,?,?)";

	@Autowired
	public BankDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Bank getBankById(String bankId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_FIND_BANK, new BankMapper(), bankId);
	}

	@Override
	public List<Bank> getAllBanks() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_ALL, new BankMapper());
	}

	@Override
	public boolean deleteBank(Bank bank) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_BANK, bank.getBankId()) > 0;
	}

	@Override
	public boolean updateBank(Bank bank) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				SQL_UPDATE_BANK, 
				bank.getBankName(), 
				bank.getBankNameAr(), 
				bank.getBankAbbr(), 
				bank.getBankId()
				) > 0;
	}

	@Override
	public boolean createBank(Bank bank) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				SQL_INSERT_BANK, 
				bank.getBankId(), 
				bank.getBankName(), 
				bank.getBankNameAr(), 
				bank.getBankAbbr()
				) > 0;
	}

}
