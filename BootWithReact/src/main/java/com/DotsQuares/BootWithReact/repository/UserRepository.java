package com.DotsQuares.BootWithReact.repository;

import com.DotsQuares.BootWithReact.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Long> {
}
