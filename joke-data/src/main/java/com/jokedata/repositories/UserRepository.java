package com.jokedata.repositories;

import com.jokedata.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("select u from users u where u.firstName = :firstName")
    public User findUserByFirstName(@Param("firstName") String firstName);

    @Query("select u from users u where u.lastName = :lastName")
    public User findUserByLasttName(@Param("lastName") String lastName);

    @Query("select u from users u where u.email = :email")
    public User findUserByEmail(@Param("email") String email);


}
