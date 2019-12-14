package com.softedge.main;

import javax.management.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller
{

	User user=new User("vikram", 20, "vikram@gmail.com");
	
	@Autowired
	NotificationService notification;
	
    @GetMapping("/test")
	public User getGreeting()
	{
		return  user;
		
	}

}
