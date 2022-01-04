/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.dao.inter;

import com.company.entity.User;
import com.company.entity.UserSkill;

import java.util.List;

/**
 * @author FarizHasanov
 */
public interface UserDaoInter {

    public List<User> getAll(String name, String surname, Integer nationalityId);

    public User getById(int id);

    public User findByEmailAndPasswordd(String email, String passwordd);

    public User findByEmail(String email);

    public boolean updateUser(User u);

    public boolean addUser(User u);

    public boolean removeUser(int id);

}
