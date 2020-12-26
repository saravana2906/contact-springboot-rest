package com.contacts.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.contacts.api.entity.User;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
