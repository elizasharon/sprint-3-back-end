package com.pack.assessment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import com.pack.assessment.model.Post;
import com.pack.assessment.model.User;
import com.pack.assessment.service.UserService;

//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.http.HttpStatus;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("/api/v1/users")
//@PropertySource("classpath:documentation.properties")
public class UserController {

	@Autowired
	private UserService userService;
	

	@GetMapping(value = "/", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public List<User> listAllUser() {
		return userService.listAllUser();
	}

	@GetMapping(value = "/{id}", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public User findById(@PathVariable int id) {
		return userService.findByIdUser(id);
	}

	@PostMapping(value = "/", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public String saveProduct(@Valid @RequestBody User user) {
		if (userService.creatUser(user) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}

	@PutMapping(value = "/{id}", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public String updateProduct(@PathVariable int id, @RequestBody User user) {
		if (userService.updateUser(id,user) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}

	@DeleteMapping(value = "/{id}")
	public String deleteProduct(@PathVariable long id) {
		if (userService.deleteUser(id) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}
	
	//POST OPERATION

	@PostMapping(value = "/{id}/posts", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public String saveProduct(@PathVariable long id, @RequestBody Post post) {
		if (userService.createPost(id,post) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}
	
//	@GetMapping(value = "/listallposts", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
//	@ResponseStatus(HttpStatus.OK)
//	public List<Post> listAllPost() {
//		System.out.println("List All Post controller");
//		return userService.listAllPost();
//	}
	
	@GetMapping(value = "/{id}/posts", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public List<Post> listAllUSerPost(@PathVariable long id) {
		return userService.listAllPostById(id);
	}
	
	@DeleteMapping(value = "/{id}/posts/{post_id}")
	public String deleteAllPost(@PathVariable long id, @PathVariable long post_id) {
		if (userService.deletePostById(id, post_id) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}
	
	@DeleteMapping(value = "/{id}/posts")
	public String deleteAllPost(@PathVariable long id) {
		if (userService.deleteAllPostByUserId(id) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}


}
