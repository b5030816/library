package com.lhenry

class StudentController {

def scaffold= Student


def login() {
}
def validate() {
def user = Student.findByUserName(params.username)
if (user && user.password == params.password){
session.user=user 
session.role='student'
render view:'home'
}
else{
flash.message="invalid username and password."

render view:'login'

}
}
def logout = {
session.user = null
session.role = null
redirect(uri:'/')
}
}

