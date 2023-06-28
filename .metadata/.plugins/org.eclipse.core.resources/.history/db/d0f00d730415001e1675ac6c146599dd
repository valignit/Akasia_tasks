package com.akasia.investment.task.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.core.env.Environment;

import com.akasia.investment.task.company.Company;
import com.akasia.investment.task.company.CompanyDao;

public class FocalService extends ApplicationService{

	public FocalService(Environment environment, CompanyDao companyDao) {
		super(environment, companyDao);
		// TODO Auto-generated constructor stub
		Company company = companyDao.getCompany();
		super.setHost(company.getFocalHost());
		super.setAccessToken(company.getFocalAuthorizationType() + " " + company.getFocalAccessToken());

		JSONObject jsonInputObject = new JSONObject();  
		JSONObject jsonOutputObject = new JSONObject();  
        try {
			jsonOutputObject = postObject("/login/test-token", jsonInputObject);
        	if (super.getResponseCode() == 200)
        		return;
        	if (super.getResponseCode() == 403) {
				System.out.println("Token expired");
				String inputString = "username=" + company.getFocalUserId() + "&" + "password=" + company.getFocalPassword();
				System.out.println(inputString);
	    		
				jsonOutputObject = postFormObject("/login/access-token", inputString);
	        	if (super.getResponseCode() == 200) {
					System.out.println("Focal Ok");
					String token = jsonOutputObject.getString("access_token");
					
					System.out.println(token);
					company.setFocalAccessToken(token);
					companyDao.updateCompany(company);
	        		return;
	        	}
		        else {
					System.out.println("Focal Error1:" + super.getResponseCode());
		        	return;
		        }
        	}
	        else {
				System.out.println("Focal Error2:" + super.getResponseCode());
	        	return;
	        }
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
