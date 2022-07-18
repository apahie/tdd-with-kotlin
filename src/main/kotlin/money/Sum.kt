package money

data class Sum(internal val augend: Expression, internal val addend: Expression) : Expression {
    override fun plus(addend: Expression): Expression {
        TODO("Not yet implemented")
    }
    override fun reduce(bank: Bank, to: String) : Money {
        val amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }
}