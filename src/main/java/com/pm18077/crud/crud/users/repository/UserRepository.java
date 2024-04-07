package com.pm18077.crud.crud.users.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pm18077.crud.crud.users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
