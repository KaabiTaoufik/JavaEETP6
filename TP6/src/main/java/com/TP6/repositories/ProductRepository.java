package com.TP6.repositories;

import com.TP6.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProdName(final String prodName);

}