package br.com.dmb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dmb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
