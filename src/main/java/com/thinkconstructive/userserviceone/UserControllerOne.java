package com.thinkconstructive.userserviceone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserControllerOne {

	@GetMapping(value = "/{userId}")
	public User getUser(@PathVariable("userId") String userId) {
		
		User userOne = new User("1", "User Name "+userId, "XXXXX "+userId);
		RestTemplate restTemplate = new RestTemplate();
		Profile profile = restTemplate.getForObject("http://localhost:8081/profile/1", Profile.class);
		userOne.setProfile(profile);
		return userOne;
	}
}
