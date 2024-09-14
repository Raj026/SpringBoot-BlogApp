package com.springboot.blog.service;

import com.springboot.blog.payload.CategoryDto;

import java.util.List;


public interface CategoryService {
    CategoryDto addCategory(CategoryDto categoryDto);
    CategoryDto getCategory(Long categoryId);
    List<CategoryDto> getCategories();

    CategoryDto updateCategory(Long categoryId, CategoryDto categoryDto);

    String deleteCategory(Long categoryId);
}
