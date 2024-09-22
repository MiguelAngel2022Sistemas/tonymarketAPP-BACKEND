package com.idat.tonymarket.tonymarket.infrastructure.adapter;

import com.idat.tonymarket.tonymarket.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;


public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {
}
