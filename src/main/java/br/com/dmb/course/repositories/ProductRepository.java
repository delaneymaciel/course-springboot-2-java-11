package br.com.dmb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dmb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
