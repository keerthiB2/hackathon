package com.example.hackathon.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="userrequest")
public class User {
	private String locality;
	private String typeofstay;
	private String goodtohave;
	private String distance;
	private String desc;
}
