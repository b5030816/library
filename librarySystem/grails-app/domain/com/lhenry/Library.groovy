package com.lhenry

class Library {
String building
String address
String openingHours
String location
String studySpaces
   
static hasMany=[librarians: Librarian, books: book, students: student]
 
static constraints = {
building blank:false, nullable:false
address blank:false, nullable:false
openingHours blank:false, nullable:false
location blank:false, nullable:false
studySpaces blank:false, nullable:false
    }
}
