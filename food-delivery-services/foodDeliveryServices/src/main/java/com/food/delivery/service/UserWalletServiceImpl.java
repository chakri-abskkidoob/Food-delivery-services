package com.food.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.entity.UserWallet;
import com.food.delivery.repository.UserWalletRepository;

@Service
public class UserWalletServiceImpl implements UserWalletService{
	
	@Autowired
	private UserWalletRepository userWalletRepo;

	@Override
	public UserWallet addWallet(UserWallet userWallet) {
		return userWalletRepo.save(userWallet);
	}

	@Override
	public UserWallet getWallet(Integer walletId) {
		return userWalletRepo.findById(walletId).get();
	}

}
