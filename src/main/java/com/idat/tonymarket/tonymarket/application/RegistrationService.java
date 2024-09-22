package com.idat.tonymarket.tonymarket.application;

import com.idat.tonymarket.tonymarket.domain.model.User;
import com.idat.tonymarket.tonymarket.domain.port.IUserRepository;


public class RegistrationService {
    private final IUserRepository iUserRepository;

    public RegistrationService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public User register (User user){
        return iUserRepository.save(user);
    }
}
