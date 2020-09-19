package classes

class Teacher(registerTeacher: String, name: String, lastName: String) : People(registerTeacher, name, lastName){
    val giveClasses get() = true
    val checkAttendance get() = true
}