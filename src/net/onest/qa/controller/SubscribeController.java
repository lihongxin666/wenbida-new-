package net.onest.qa.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.onest.qa.service.SubscribeService;

@RestController
@RequestMapping("subscribe")
public class SubscribeController {

	@Resource
	SubscribeService subscribeService;
}
