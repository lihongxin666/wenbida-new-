package net.onest.qa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.onest.qa.dao.StatusMapper;

@Service
public class StatusService {

	@Resource
	StatusMapper statusMapper;
	
}
