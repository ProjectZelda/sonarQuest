package com.viadee.sonarQuest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.viadee.sonarQuest.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    
    //@Query("Select id, username, level_id, gold, xp FROM User ORDER BY level.level DESC, xp DESC")

	@Query("Select u.id, u.username, u.level, u.gold, u.xp from User u Order by u.level DESC, u.xp DESC")

    List<User> getLeaders();
}
