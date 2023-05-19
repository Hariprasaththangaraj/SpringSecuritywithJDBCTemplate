package com.springsecurity.withJDBC.Repo;

import com.springsecurity.withJDBC.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByusername(String username);


//    @Query("FROM User u where u.isActive = true and u.username = :username order by u.id asc")
//    User getUserByUsername(String username);
//
//    @Query("FROM User u where u.isActive = true and u.username = :username order by u.id asc")
//    Optional<User> getUserByUsernameOpt(String username);
//
//    @Query("FROM User u where u.isActive = ?2 and u.username = ?1")
//    User getUserByUsernameAndIsActiveOpt(String username, boolean isActive);
//
//    User findByUsernameAndIsActive(String username, boolean isActive);
//    User findByResetToken(String token);
//    List<User> findByRoles(Role roleName);
}
