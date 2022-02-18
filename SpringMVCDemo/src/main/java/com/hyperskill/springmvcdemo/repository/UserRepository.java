package com.hyperskill.springmvcdemo.repository;

import com.hyperskill.springmvcdemo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserById(Long id);

    User findUserByUsername(String username);

}
