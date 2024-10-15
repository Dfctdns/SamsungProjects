class Triangle(
    var a: Double,
    var h: Double,
    override var area: Double): shape() {
    override fun getArea(): Double {
        return a * h / 2
    }
}