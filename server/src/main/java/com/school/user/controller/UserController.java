package com.school.user.controller;

import com.school.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * description:
 * @author suwenguang
 * @version 1.0.0
 **/
@Controller
public class UserController {
	@Autowired
	private UserService userService;


}
