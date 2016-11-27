package com.coreKL.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coreKL.entities.User;


@Repository
public interface UserReposiroty extends JpaRepository<User, Long>{

}
