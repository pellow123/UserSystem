package org.usersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.usersystem.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
