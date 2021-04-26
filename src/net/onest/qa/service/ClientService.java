package net.onest.qa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.onest.qa.dao.ClientMapper;

@Service
public class ClientService {

	@Resource
	ClientMapper clientMapper;
}
