package net.onest.qa.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.onest.qa.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {

	@Resource
	ClientService clientService;
}
