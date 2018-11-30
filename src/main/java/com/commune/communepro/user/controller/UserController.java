package com.commune.communepro.user.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.commune.communepro.user.domain.User;
import com.commune.communepro.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping(method=RequestMethod.GET,value= {"/", "/login"})
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();

		model.setViewName("user/login");
		return model;
	}

	@RequestMapping(method=RequestMethod.GET,value= {"/add"})
	public ModelAndView signup() {
		ModelAndView model = new ModelAndView();
		User user = new User();

		model.addObject("user", user);
		model.setViewName("user/user_add :: add");
		return model;
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.POST)
	public ModelAndView createUser(@Valid User user, BindingResult bindingResult) {
		ModelAndView model = new ModelAndView();
		User userExists = userService.findUserByEmail(user.getEmail());

		if(userExists != null) {
			bindingResult.rejectValue("email", "error.user", "This email already exists!");
		}
		if(bindingResult.hasErrors()) {
			model.setViewName("user/user_add");
		} else {
			userService.addUser(user);
			model.addObject("msg", "User has been registered successfully!");
			// model.addObject("user", new User());
			model.setViewName("redirect:/users");
			//model.setViewName("user/user");
		}

		return model;
	}

	@RequestMapping(value= {"/home"}, method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());

		model.addObject("userName", user.getFirstName() + " " + user.getLastName());
		model.setViewName("pboard/index");
		return model;
	}

	@RequestMapping(value= {"/access_denied"}, method=RequestMethod.GET)
	public ModelAndView accessDenied() {
		ModelAndView model = new ModelAndView();
		model.setViewName("errors/access_denied");
		return model;
	}
	@RequestMapping("/index")
	public ModelAndView departmentIndex(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/user_index.html");
		return modelAndView;
	}
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public ModelAndView getAllUsers(){
		ModelAndView model = new ModelAndView("user/user_list");
		//Map<String, Object> params = new HashMap<>();
		model.addObject("list", userService.getAllUsers());
		model.setViewName("user/user_list :: list");
		return model;
	}
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public ModelAndView getUser(@PathVariable Long id){
		ModelAndView model = new ModelAndView();
		model.addObject("user", userService.getUser(id));
		model.setViewName("user/user_edit :: edit");
		return model;
	}
	@RequestMapping(value="/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);

	}
	@RequestMapping(method=RequestMethod.PUT,value={"/updateUser"}  )
	public ModelAndView updateUser(User user) {

		ModelAndView model = new ModelAndView();
		userService.updateUser(user);
		model.addObject("msg", "User has been updated successfully!");
		// model.addObject("user", new User());
		model.setViewName("redirect:/users");
		return model;
	}
	@RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);

	}

}
