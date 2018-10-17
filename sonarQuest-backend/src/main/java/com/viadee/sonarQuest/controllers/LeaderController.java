
package com.viadee.sonarQuest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viadee.sonarQuest.entities.User;
import com.viadee.sonarQuest.repositories.UserRepository;

@RequestMapping("/leaders")
@RestController
public class LeaderController {
	private @Autowired UserRepository userRepository;

	@GetMapping()
	public List<User> getLeaders() {
		return userRepository.getLeaders();
	}
}
