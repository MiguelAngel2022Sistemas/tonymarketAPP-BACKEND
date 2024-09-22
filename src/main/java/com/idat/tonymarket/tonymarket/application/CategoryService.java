package com.idat.tonymarket.tonymarket.application;

import com.idat.tonymarket.tonymarket.domain.model.Category;
import com.idat.tonymarket.tonymarket.domain.model.Order;
import com.idat.tonymarket.tonymarket.domain.port.ICategoryRepository;
import com.idat.tonymarket.tonymarket.domain.port.IOrderRepository;


public class CategoryService {
    private final ICategoryRepository iCategoryRepository;

    public CategoryService(ICategoryRepository iCategoryRepository) {
        this.iCategoryRepository = iCategoryRepository;
    }
    public Category save (Category category){
        return iCategoryRepository.save(category);
    }
    public Iterable<Category> findAll(){
        return iCategoryRepository.findAll();
    }

    public Category findById(Integer id){
        return iCategoryRepository.findById(id);
    }
    public void deleteById(Integer id){
        iCategoryRepository.deleteById(id);
    }


}
