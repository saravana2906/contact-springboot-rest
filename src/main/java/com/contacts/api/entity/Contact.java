package com.contacts.api.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Contact {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contactId;
	private String name;
	private String emailId;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", nullable = false)
	private User user;
	@OneToMany(mappedBy = "contact",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
	List<ContactPhone> phones;
}
