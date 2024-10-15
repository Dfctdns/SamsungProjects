class Rectangle(
    val a:Double,
    val b:Double,
    override var area: Double) : shape() {
    override fun getArea(): Double {
        return a * b
    }
}