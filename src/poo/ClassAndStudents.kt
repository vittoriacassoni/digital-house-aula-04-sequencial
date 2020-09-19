package poo

import classes.*

fun main(){
    var student1 = Student("1", "Aluno", "1")
    var student2 = Student("2", "Aluno", "2")
    var teacher = Teacher("1", "Professor", "1")

    var subject1 = Subject("Quimica")
    var subject2 = Subject("Fisica")

    var class1 = Class(subject1, "9", "10")
    var class2 = Class(subject2, "10", "11")

    var course = Course("Ensino médio")
    course.classes.add(class1)
    course.classes.add(class2)

    course.students.add(student1)
    course.students.add(student2)

    course.teacher = teacher

    var team = Team("EM1", course)
}