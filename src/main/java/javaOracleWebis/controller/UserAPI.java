package javaOracleWebis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaOracleWebis.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserAPI {
	@Autowired
	private UserService service;
   @GetMapping("/getAllUser")
   ResponseEntity <?> getAllKhachHang(){
	   return ResponseEntity.ok(service.getAllUser());
   }
}
