package com.idat.tonymarket.tonymarket.infrastructure.adapter;

import com.idat.tonymarket.tonymarket.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface IUserCrudRepository extends CrudRepository<UserEntity,Integer> {
    Optional<UserEntity> findByEmail(String email);
}
