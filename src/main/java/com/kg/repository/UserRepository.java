package com.kg.repository;

import com.kg.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @auther 张圈圈【OF1133】
 * @create 2016-12-20-16:31
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
