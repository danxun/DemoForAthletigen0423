package com.athletigen.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckPointStatusRepository extends CrudRepository<CheckPointStatus, Long> {

	CheckPointStatus findByName(String name);
}
