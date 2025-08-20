/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dht.repositories;

import com.dht.pojo.User;

/**
 *
 * @author admin
 */

public interface UserRepository {
    public User getUserByUsername(String username);
}
