package com.bridgelabz.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return Arrays.asList(
				new Topic("spring", "spring framework", "spring framework description"),
				new Topic("java", "java framework", "java framework description"),
				new Topic("OOPs", "OOps framework", "OOps framework description")
				);
	}
	
}
