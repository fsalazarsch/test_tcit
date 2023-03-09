open class Bank(
    val id: Int,
    val name: String,
) {
    override fun toString(): String {
        return "ID: $id, Name: $name"
    }
}
