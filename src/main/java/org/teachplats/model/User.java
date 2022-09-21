package org.teachplats.model;

import java.util.Date;

public class User {
 private Long id;
 private String firstName;
 private String lastName;
 private String phone;
 private String email;
 private Date dateOfBirth;
 private Long addressId;

 public User(Long id, String firstName, String lastName, String phone, String email, Date dateOfBirth, Long address) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.phone = phone;
  this.email = email;
  this.dateOfBirth = dateOfBirth;
  this.addressId = address;
 }

 public User(String firstName, String lastName, String phone, String email, Date dateOfBirth, Long address) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.phone = phone;
  this.email = email;
  this.dateOfBirth = dateOfBirth;
  this.addressId = address;
 }


 public Long getId() {
  return id;
 }

 public String getFirstName() {
  return firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public String getPhone() {
  return phone;
 }

 public String getEmail() {
  return email;
 }

 public Date getDateOfBirth() {
  return dateOfBirth;
 }

 public Long getAddressId() {
  return addressId;
 }

 @Override
 public String toString() {
  return "User{" +
          "id=" + id +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", phone='" + phone + '\'' +
          ", email='" + email + '\'' +
          ", dateOfBirth=" + dateOfBirth +
          ", addressId=" + addressId +
          '}';
 }
}
