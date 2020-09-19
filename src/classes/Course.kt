package classes

class Course(val name: String ) {
    var classes = ArrayList<Class>()
    var students = ArrayList<Student>()
    var teacher: Teacher? = null
}