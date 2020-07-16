package com.neapsapi.daily_share_price.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neapsapi.daily_share_price.model.DailySharePrice;
import com.neapsapi.daily_share_price.service.DailySharePriceService;

@RestController
@RequestMapping("/dsp")
public class DailySharePriceController {
	
	@Autowired
	DailySharePriceService dailySharePriceService;
	
	@RequestMapping("/getdailySharePrice")
	public DailySharePrice getdailySharePrice(@RequestParam String auth_token, @RequestParam String from_date,
			@RequestParam String to_date, @RequestParam String request_type) {
		return dailySharePriceService.getDailySharePriceDate(from_date, to_date, request_type);
	}

}
