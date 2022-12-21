package com.food.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.entity.UserWallet;
import com.food.delivery.service.UserWalletService;

@RestController
@RequestMapping("/wallet")
public class UserWalletController {
	
	@Autowired
	private UserWalletService userWalletService;
	
	@PostMapping("/post")
	public UserWallet addWallet(@RequestBody UserWallet userWallet) {
		return userWalletService.addWallet(userWallet);
	}
	
	@GetMapping("/get/{walletId}")
	public UserWallet getWallet(@PathVariable Integer walletId) {
		return userWalletService.getWallet(walletId);
	}
}
