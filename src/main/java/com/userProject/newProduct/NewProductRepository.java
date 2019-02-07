package com.userProject.newProduct;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.userProject.newProduct.New_Product;;

public interface NewProductRepository extends JpaRepository<New_Product, Long> {
    @Query(value = "SELECT i FROM New_Product i")
    List<New_Product> findByNewPId();
}