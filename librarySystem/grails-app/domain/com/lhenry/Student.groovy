package com.lhenry

class Student {
String name 
String email
String userName
String password
Int studentId
Course title
String toString()

static hasMany=[books: book, bookReviews: BookReview]
    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false
userName blank:false, nullable:false
password blank:false, nullable:false
StudentId blank:false, nullable:false
course blank:false, nullable:false
    }
}
