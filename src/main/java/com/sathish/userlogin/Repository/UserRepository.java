package com.sathish.userlogin.Repository;

import com.sathish.userlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends CrudRepository<User,Long> {
}
