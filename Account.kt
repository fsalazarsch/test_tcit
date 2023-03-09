class Account(
    val clientId: Int,
    val bankId: Int,
    val balance: Int,
) {
    override fun toString(): String {
        return "ClientID: $clientId, BankId: $bankId, balance: $balance"
    }
}
