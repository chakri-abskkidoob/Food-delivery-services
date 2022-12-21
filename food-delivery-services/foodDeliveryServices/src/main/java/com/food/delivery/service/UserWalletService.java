package com.food.delivery.service;

import com.food.delivery.entity.UserWallet;

public interface UserWalletService {

	UserWallet addWallet(UserWallet userWallet);

	UserWallet getWallet(Integer walletId);

}
