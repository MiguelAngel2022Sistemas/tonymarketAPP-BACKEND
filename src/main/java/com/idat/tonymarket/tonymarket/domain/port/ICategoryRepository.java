package com.idat.tonymarket.tonymarket.domain.port;

import com.idat.tonymarket.tonymarket.domain.model.Category;


public interface ICategoryRepository {
    Category save (Category category);
    Iterable<Category> findAll();
    Category findById(Integer id);
    void deleteById(Integer id);

}
