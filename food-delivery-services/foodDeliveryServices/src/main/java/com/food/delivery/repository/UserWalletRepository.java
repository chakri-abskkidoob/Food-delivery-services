package com.food.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.delivery.entity.UserWallet;

public interface UserWalletRepository extends JpaRepository<UserWallet, Integer>{

}
