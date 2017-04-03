package com.lhenry

class BookReview {
String reviewTitle
Book book
Date dateCreated
Student student
String review
    
String toString()
{
return reviewTitle
}

static constraints = {
reviewTitle blank:false, nullable:false
book blank:false, nullable:false
dateCreated blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false
    }
}
