package com.example.TestDemo.repo;

import com.example.TestDemo.entity.User;
import org.hibernate.metamodel.model.convert.internal.JpaAttributeConverterImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM User WHERE ID = ?1",nativeQuery = true)
    User getUserid(String UserId);

    @Query(value ="SELECT * FROM User WHERE ID = ?1 AND ADDRESS = ?2",nativeQuery = true)
    User getUseridAndaddress(String UserId,String Address);
}
