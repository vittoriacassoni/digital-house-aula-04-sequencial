package classes

class Student(registerAcademic: String, name: String, lastName: String) : People(registerAcademic, name, lastName) {
    val canSeeClass get() = true
    val canDoHomework get() = true
}