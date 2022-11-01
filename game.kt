fun main() {
    val values: Array<IntArray> = getGrid()
    display(values)
}

private fun getGrid(): Array<IntArray> {
    return arrayOf(
        intArrayOf(0, 1, 1),
        intArrayOf(0, 1, 0),
        intArrayOf(1, 0, 1)
    )
}

private fun display(values: Array<IntArray>) {
    print(
        values.joinToString("\n") { ints ->
            ints.map { i -> if (i == 0) 'O' else 'X' }
                .joinToString(" ")
        }
    )
}