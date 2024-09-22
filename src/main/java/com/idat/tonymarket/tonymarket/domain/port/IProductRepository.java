package com.idat.tonymarket.tonymarket.domain.port;

import com.idat.tonymarket.tonymarket.domain.model.Product;


public interface IProductRepository {
    Product save (Product product);
    Iterable<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
}
