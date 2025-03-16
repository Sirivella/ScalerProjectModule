package com.scaler.projectmodule.repository;

import com.scaler.projectmodule.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByTitle(String title);
}
