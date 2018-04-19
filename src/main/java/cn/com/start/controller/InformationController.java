package cn.com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.model.Information;
import cn.com.start.service.interfaces.InformationService;

@Controller
public class InformationController {
	@Autowired
	public InformationService InformationService;
	@RequestMapping("/insertInformation")
	@ResponseBody
	public Object insertInformation(String name) {
		String result="";
		Information information=new Information();
		information.setName(name);
		int num=InformationService.insert(information);
		if(num==1) {
			result="insert success!";
		}else {
			result="insert failed!";
		}
		return result;
	}
}
