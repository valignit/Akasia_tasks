package com.akasia.investment.task.process;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.akasia.investment.task.company.CompanyDao;

@Component
public class AmlValidation {
    Logger log
    = LoggerFactory.getLogger(AmlValidation.class);
    
	@Autowired
	Environment environment;

	@Autowired
	private CompanyDao companyDao;
	
	@Scheduled(fixedRateString = "${app.akasia.aml-validation-frequency}")
	//@Scheduled(cron = "${app.akasia.aml-validation-cron}")
	public void executeTask() throws IOException, JSONException {
		log.info("");
		log.info("-----------------");
		log.info("AmlValidationProc");
		log.info("-----------------");
		log.info(environment.getProperty("app.akasia.access-token"));
		
	}
}
