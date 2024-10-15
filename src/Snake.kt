class Snake: Animal() ,Digging {
    override val count: Int = 1
    override fun move() {
        println("Ползком")
    }

    override fun digSail() {
        println("DIG")
    }

    override fun holdShovel() {
        println("SHOVEL")
    }

    override fun eatWorms() {
        println("AMAM")
    }
}