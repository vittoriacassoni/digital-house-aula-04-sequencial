package collections

class LockerObject(brand: String, model: String) : Piece(brand, model)  {
    override fun remove() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Marca: $brand | Modelo: $model"
    }
}