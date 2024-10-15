abstract class shape: Comparable<shape> {
    abstract var area: Double
    abstract fun getArea():Double
    override fun compareTo(other: shape): Int {
        if(getArea() > other.getArea()) {
            return 1
        }
        else if(getArea() < other.getArea()) {
            return -1
        }
        else
            return 0
    }
}