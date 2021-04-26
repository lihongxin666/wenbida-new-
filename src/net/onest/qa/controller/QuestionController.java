package net.onest.qa.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.onest.qa.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Resource
	QuestionService questionService;
}
