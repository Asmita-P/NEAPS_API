package com.neapsapi.corporate_action.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neapsapi.corporate_action.model.CorporateAction;

@Service
public class CorporateActionService {
	
	public CorporateAction getCorpActionData(String from_date, String to_date){
		CorporateAction bean = new CorporateAction();
		bean.setStatus(200);
		bean.setMessage("test message");
		bean.setDate(new Date());
		bean.setSecurity_name("dummy name");
		bean.setSymbol("HDFCBANK");
		bean.setSeries("123");
		bean.setRecord_date(new Date());
		bean.setBc_start_date(new Date());
		bean.setBc_end_date(new Date());
		bean.setNd_start_date(new Date());
		bean.setNd_end_date(new Date());
		bean.setPurpose("Aquisition");
		bean.setAnnouncementText("Dummy Announcement Text");
		return bean;
		
	}

}
