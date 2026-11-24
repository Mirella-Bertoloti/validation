package com.dt2.zegota.repositories;

import com.dt2.zegota.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
