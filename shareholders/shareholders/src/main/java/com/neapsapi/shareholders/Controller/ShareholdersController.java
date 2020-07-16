package com.neapsapi.shareholders.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neapsapi.shareholders.model.Shareholders;
import com.neapsapi.shareholders.service.ShareholdersService;

@RestController
@RequestMapping("/sh")
public class ShareholdersController {
	
	@Autowired
	ShareholdersService shareholdersService;
	
	@RequestMapping("/getShareholdersData")
	public Shareholders getShareholdersData(@RequestParam String auth_token, @RequestParam String from_date, @RequestParam String to_date){
		return shareholdersService.getShareholdersData();
	}

}
