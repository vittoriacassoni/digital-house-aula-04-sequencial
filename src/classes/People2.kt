package classes

class People2(var name: String, var RG: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as People2

        if (RG != other.RG) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}