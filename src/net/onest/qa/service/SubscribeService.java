package net.onest.qa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.onest.qa.dao.SubscribeMapper;

@Service
public class SubscribeService {

	@Resource
	SubscribeMapper subscribeMapper;
}
