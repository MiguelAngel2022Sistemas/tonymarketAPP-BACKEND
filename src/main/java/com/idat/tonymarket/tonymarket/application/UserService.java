package com.idat.tonymarket.tonymarket.application;

import com.idat.tonymarket.tonymarket.domain.model.User;
import com.idat.tonymarket.tonymarket.domain.port.IUserRepository;


public class UserService {
    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public User save (User user){
        return  this.iUserRepository.save(user);
    }

    public User findById (Integer id){
        return this.iUserRepository.findById(id);
    }

    public User findByEmail(String email){
        return iUserRepository.findByEmail(email);
    }

}
