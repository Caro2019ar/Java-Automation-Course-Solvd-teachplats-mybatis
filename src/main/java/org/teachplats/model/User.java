package org.teachplats.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
 private Long id;
 private String firstName;
 private String lastName;
 private String phone;
 private String email;
 private Date dateOfBirth;
 private Address address;
 private List<Payment> listPayments;
 private List<Course> listCourses;

 public User() {
 }

 public User(Long id, String firstName, String lastName, String phone, String email, Date dateOfBirth, Address address) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.phone = phone;
  this.email = email;
  this.dateOfBirth = dateOfBirth;
  this.address = address;
  this.listPayments = new ArrayList<>();
  this.listCourses = new ArrayList<>();
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

 public Address getAddress() {
  return address;
 }

 public void setAddress(Address address) {
  this.address = address;
 }

 public List<Payment> getListPayments() {
  return listPayments;
 }

 public void setListPayments(List<Payment> listPayments) {
  this.listPayments = listPayments;
 }

 public List<Course> getListCourses() {
  return listCourses;
 }

 public void setListCourses(List<Course> listCourses) {
  this.listCourses = listCourses;
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
          ", address=" + address +
          ", listPayments=" + listPayments +
          ", listCourses=" + listCourses +
          '}';
 }
}
