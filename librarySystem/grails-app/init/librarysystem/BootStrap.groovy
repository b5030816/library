package com.lhenry

class BootStrap {

    def init = { servletContext ->
   
def libraryA =new Library(
building:'Adsetts',
address:'Adsetts street, Sheffield,S1 1WB',
openingHours:'8:00am-8:00pm',
location:'Level 4',
studySpaces:'50'
).save()

def libraryB =new Library(
building:'Owen',
address:'Owen street, Sheffield,S1 1WB',
openingHours:'8:00am-8:00pm',
location:'Level 3',
studySpaces:'50'
).save()


def courseA =new Course(
title:'Computing',
code:11,
leader:'Steve Smith',
department:'Computing',
description:'Computing',
studyMode:'Full-Time'
).save()

def courseB =new Course(
title:'Art',
code:12,
leader:'Sarah Bloggs',
department:'Art',
description:'Art',
studyMode:'Part-Time'
).save()


def studentA =new Student(
name:'Joe Smith',
email:'joe.smith@shu.ac.uk',
userName:'joesmith',
password:'password',
studentId:1,
course: courseA
).save()


def studentB =new Student(
name:'Jane Smith',
email:'jane.smith@shu.ac.uk',
userName:'janesmith',
password:'password',
studentId:2,
course: courseB
).save()

def BookA =new Book(
title:'programming language',
subject:'programming',
author:'Thierry Henry',
isbn:1786,
dateBorrowed: new Date ('03/03/2017'),
returnDate: new Date ('03/05/2017') ,
student: studentA,
overdue:false
).save()

def BookB =new Book(
title:'coding help',
subject:'computing',
author:'Jack Smith',
isbn:2786,
dateBorrowed: new Date ('01/03/2017'),
returnDate: new Date ('01/05/2017') ,
student: studentB,
overdue:true
).save()

def librarianA =new Librarian(
name: 'Steve Boyle',
email:'steve.boyle@shu.ac.uk',
office:'cantor 9000',
userName: 'steveboyle',
password: 'password',
telephone:'01141234567',
library: libraryA
).save()

def librarianB =new Librarian(
name: 'Emma Stone',
email:'emma.stone@shu.ac.uk',
office:'cantor 9100',
userName: 'emmastone',
password: 'password',
telephone:'01141234568',
library: libraryB
).save()

def BookReviewA =new BookReview(
reviewTitle:'Programming language Joe.B',
book: BookA,
dateCreated: new Date ('01/05/2017'),
student: studentA,
review:'Programming language review A'
).save()

def BookReviewB =new BookReview(
reviewTitle:'coding help Jack.S',
book: BookB,
dateCreated: new Date ('01/04/2017'),
student:studentB,
review:'coding help review B'
).save()


 }
    def destroy = {
    }
}
