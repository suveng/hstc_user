package com.school.user.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * description:
 * @author suwenguang
 * @version 1.0.0
 **/
public interface UserRepository extends MongoRepository<User,String> {
}
