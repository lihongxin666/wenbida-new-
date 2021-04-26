package net.onest.qa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.onest.qa.dao.QuestionMapper;

@Service
public class QuestionService {

	@Resource
	QuestionMapper questionMapper;
}
