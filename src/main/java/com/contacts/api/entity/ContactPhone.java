package com.contacts.api.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ContactPhone {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long phoneId;
	private String phoneNo;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "contactId", nullable = false)
	private Contact contact;
}
