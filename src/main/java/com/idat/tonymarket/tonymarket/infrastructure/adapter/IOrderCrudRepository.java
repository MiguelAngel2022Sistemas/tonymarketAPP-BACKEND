package com.idat.tonymarket.tonymarket.infrastructure.adapter;

import com.idat.tonymarket.tonymarket.domain.model.OrderState;
import com.idat.tonymarket.tonymarket.infrastructure.entity.OrderEntity;
import com.idat.tonymarket.tonymarket.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface IOrderCrudRepository extends CrudRepository<OrderEntity, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE OrderEntity o SET o.orderState = :state WHERE o.id = :id")
    void updateStateById(Integer id, OrderState state);

    Iterable<OrderEntity> findByUserEntity(UserEntity userEntity);
}
