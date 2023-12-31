package com.app.repo;

import com.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

User findByEmail(String email);

    Optional<User> findUserByEmailAndPassword(String email, String password);
//    Optional<User> findByEmail(String email);
}
