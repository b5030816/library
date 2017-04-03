package com.lhenry

class Student {
String name 
String email
String userName
String password
int studentId
Course course
String toString()
{
return name }


static hasMany=[books: Book, bookReviews: BookReview]
    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false
userName blank:false, nullable:false
password blank:false, nullable:false
studentId blank:false, nullable:false
course blank:false, nullable:false
    }
}
