package com.techmarket.api.repository;

import com.techmarket.api.model.ProductCate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductCateRepository extends JpaRepository<ProductCate, Long>, JpaSpecificationExecutor<ProductCate> {
}
