package lotto.domain

enum class LottoPrize(
    val matchCount: Int,
    val money: Int,
) {
    FOURTH(3, 5000),
    THIRD(4, 50_000),
    SECOND(5, 1_500_000),
    FIRST(6, 2_000_000_000),
}
