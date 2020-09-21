package classes

class Employee(var name: String, var register: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (register != other.register) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}