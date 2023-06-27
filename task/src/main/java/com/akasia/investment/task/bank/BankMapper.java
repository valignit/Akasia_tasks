package com.akasia.investment.task.bank;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

// Bank object - Database mapper 
public class BankMapper implements RowMapper<Bank> {

	@Override
	public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	    Bank bank = new Bank();
	    bank.setBankId(rs.getString("bank_id"));
	    bank.setBankName(rs.getString("bank_name"));
	    bank.setBankNameAr(rs.getString("bank_name_ar"));
	    bank.setBankAbbr(rs.getString("bank_abbr"));
	    return bank;
	}

}
