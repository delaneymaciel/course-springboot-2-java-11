package br.com.dmb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dmb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
