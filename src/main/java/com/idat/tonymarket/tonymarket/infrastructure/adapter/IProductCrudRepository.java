package com.idat.tonymarket.tonymarket.infrastructure.adapter;

import com.idat.tonymarket.tonymarket.infrastructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;


public interface IProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
}
