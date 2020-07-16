package com.neapsapi.shareholders.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neapsapi.shareholders.model.Shareholders;

@Service
public class ShareholdersService {
	
	public Shareholders getShareholdersData(){
		Shareholders bean = new Shareholders();
		bean.setMessage("Success");
		bean.setDate(new Date());
		bean.setSecurity_name("ADAG");
		bean.setSymbol("ADAG");
		bean.setSeries("EQ");
		bean.setSecurity_status("Active");
		bean.setSecurity_type("ST");
		bean.setName("HDFC BANK");
		bean.setPan("ABCDH1254M");
		bean.setAddress("Address of Shareholders");
		bean.setCin_din("CIN");
		bean.setNo_of_shares_held(321);
		bean.setPercentage_holding((int)2.32);
		bean.setAs_on_date(new Date());
		return bean;
		
	}

}
