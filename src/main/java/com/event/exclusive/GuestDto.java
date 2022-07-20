package com.event.exclusive;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class GuestDto {

 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long id;
 private String invitationId;
 private String firstName;
 private String lastName;
 private Address address;
 private List<String> deviceIds;
 private Long phoneNumber;
 private String mailAddress;
 private List<GuestDto> bringingGuests;
 private RegistrationType registrationType;

}
