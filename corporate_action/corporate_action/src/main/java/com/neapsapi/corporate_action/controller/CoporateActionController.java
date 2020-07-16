package com.neapsapi.corporate_action.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neapsapi.corporate_action.model.CorporateAction;
import com.neapsapi.corporate_action.service.CorporateActionService;

@RestController
@RequestMapping("/corpAct")
public class CoporateActionController {
	
	@Autowired
	CorporateActionService corporateActionService;

	@RequestMapping("/getCorpActionData")
	public CorporateAction getCorpActionData(@RequestParam String auth_token, @RequestParam String from_date,
			@RequestParam String to_date) {
		return corporateActionService.getCorpActionData("from_date", to_date);
	}

}
