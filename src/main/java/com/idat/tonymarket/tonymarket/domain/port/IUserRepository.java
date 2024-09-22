package com.idat.tonymarket.tonymarket.domain.port;

import com.idat.tonymarket.tonymarket.domain.model.User;

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}
