package io.controllers;

import io.model.User;
import io.model.UserRegistrationApiData;
import io.model.UserRegistrationResource;
import io.services.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-role")
public class RoleAdminController {

		private UserService userService = new UserService();
		
		@RequestMapping(method=RequestMethod.PUT)
		public ResponseEntity<UserRegistrationResource> registerUser(@RequestBody UserRegistrationApiData userRoleChangeApiData) {
			
			if (userService.findUserByUsername(userRoleChangeApiData.getUsername()) == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			User user = new User(userRoleChangeApiData.getUsername());
	        
	        userService.updateUserRole(user,userRoleChangeApiData);

			return new ResponseEntity<>(new UserRegistrationResource(userRoleChangeApiData), HttpStatus.CREATED);
		}
}
