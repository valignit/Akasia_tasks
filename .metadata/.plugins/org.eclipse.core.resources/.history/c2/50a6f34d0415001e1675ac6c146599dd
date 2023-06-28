package com.akasia.investment.task.akasia.bank;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

// Akasia Bank object - Json mapper 
public class AkasiaBankMapper {
	AkasiaBank akasiaBank = new AkasiaBank();
	
	public AkasiaBank mapJson(JSONObject jsonObject) {
		try {
			akasiaBank.setBankId(jsonObject.get("bank_id"));
			akasiaBank.setBankName(jsonObject.get("bank_name"));
			akasiaBank.setBankNameAr(jsonObject.get("bank_name_ar"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return akasiaBank;
	}
}
