class Circle(
    var radius:Double,
    override var area: Double) : shape() {
    override fun getArea(): Double {
        return radius*radius*Math.PI
    }
}