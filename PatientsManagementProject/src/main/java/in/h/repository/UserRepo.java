package in.h.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.h.entity.User;

public interface UserRepo extends JpaRepository<User,Long> {
    
	  User findByEmail(String email);
}
