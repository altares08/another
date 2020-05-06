package com.example.demo.Entity.repository;

import com.example.demo.Entity.Stores;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StoresRepository extends JpaRepository<Stores, String> {

    @Query("select s from Stores s where s.zipCode = :zipcode")
    List<Stores> findByZipcode(@Param("zipcode") final String zipcode);

}
