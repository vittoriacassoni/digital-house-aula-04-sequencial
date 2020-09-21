package classes

class Coca(var size: Int, var price: Double) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Coca

        if (size != other.size) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}