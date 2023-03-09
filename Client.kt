class Client(
    val id: Int, val taxNumber: String, val name: String
) {
    override fun toString(): String {
        return "ID: $id, RUT: $taxNumber, Name: $name"
    }
}
