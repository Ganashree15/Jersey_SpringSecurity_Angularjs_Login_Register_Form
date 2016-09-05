package com.example.angularrestspringsecurity.dao.user;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.angularrestspringsecurity.dao.Dao;
import com.example.angularrestspringsecurity.entity.User;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}