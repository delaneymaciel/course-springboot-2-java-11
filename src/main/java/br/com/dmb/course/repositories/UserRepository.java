package br.com.dmb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dmb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
