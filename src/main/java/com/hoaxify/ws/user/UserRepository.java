package com.hoaxify.ws.user;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    
    User findByEmail(String email);

    User findByActivationToken(String token);

    //JPQL formatında bir query
    /*@Query(value="Select u from User u")
    Page<UserProjection> getAllUserRecords(Pageable page);*/
}
