package org.teachplats.model;

import java.util.Date;

public class User {
 private Long id;
 private String firstName;
 private String lastName;
 private String phone;
 private String email;
 private Address address=new Address();
 private Date dateOfBirth;


 public User(String firstName, String lastName, String phone, String email,  Long addressId, Date dateOfBirth) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.phone = phone;
  this.email = email;
  this.address.setId(addressId);
  this.dateOfBirth = dateOfBirth;

 }

 public User(Long id, String firstName, String lastName, String phone, String email, Long addressId, Date dateOfBirth) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.phone = phone;
  this.email = email;
  this.address.setId(addressId);
  this.dateOfBirth = dateOfBirth;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public Date getDateOfBirth() {
  return dateOfBirth;
 }

 public void setDateOfBirth(Date dateOfBirth) {
  this.dateOfBirth = dateOfBirth;
 }

 public Long getAddressId() {
  return this.address.getId();
 }

 public void setAddressId(Long addressId) {
  this.address.setId(addressId);
 }

 public Address getAddress() {
  return address;
 }

 public void setAddress(Address address) {
  this.address = address;
 }

 @Override
 public String toString() {
  final StringBuilder sb = new StringBuilder("User{");
  sb.append("id=").append(id);
  sb.append(", firstName='").append(firstName).append('\'');
  sb.append(", lastName='").append(lastName).append('\'');
  sb.append(", phone='").append(phone).append('\'');
  sb.append(", email='").append(email).append('\'');
  sb.append(", dateOfBirth=").append(dateOfBirth);
  sb.append(", addressId=").append(address.getId());
  sb.append('}');
  return sb.toString();
 }
}
