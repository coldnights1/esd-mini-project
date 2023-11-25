package com.miniproject.employeesalarymaintenance.Repository;

import com.miniproject.employeesalarymaintenance.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,String> {


    @Query(value = "SELECT * FROM users WHERE usr_email = :email", nativeQuery = true)
    User findByEmail(@Param("email") String email);

}