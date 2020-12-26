package com.contacts.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.contacts.api.entity.ContactPhone;

@RepositoryRestResource
public interface ContactPhoneRepository extends PagingAndSortingRepository<ContactPhone, Long> {

}
