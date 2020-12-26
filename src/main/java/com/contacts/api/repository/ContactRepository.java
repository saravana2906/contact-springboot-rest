package com.contacts.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.contacts.api.entity.Contact;

@RepositoryRestResource
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {

}
