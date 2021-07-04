package br.com.dmb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dmb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
