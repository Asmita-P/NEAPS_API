package com.neapsapi.daily_share_price.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neapsapi.daily_share_price.model.DailySharePrice;

@Service
public class DailySharePriceService {
	
	public DailySharePrice getDailySharePriceDate(String from_date, String to_date, String request_type){
		DailySharePrice bean = new DailySharePrice();
		bean.setStatus(200);
		bean.setMessage("Success");
		bean.setDate(new Date());
		bean.setSecurity_name("ADAG");
		bean.setSymbol("ADAG");
		bean.setSeries("EQ");
		bean.setOpen(123);
		bean.setClose(124);
		bean.setHigh(124);
		bean.setLow(122);
		bean.setPre_close(125);
		bean.setNo_of_shares_traded(1111);
		bean.setNet_traded_value(45666);
		bean.setHigh_52_weeks(133);
		bean.setLow_52_weeks(122);
		return bean;
		
	}

}
