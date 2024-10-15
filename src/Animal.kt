import java.awt.Color

open class Animal(
    val countOfLeg:Int = 1,
    val baseColor: Color = Color.WHITE,
    val scienceName: String = " "
    ) {

    override fun equals(other: Any?): Boolean {
        val anim = other as Animal
        if(countOfLeg==anim.countOfLeg && baseColor.red==anim.baseColor.red && scienceName==anim.scienceName){
            return true
        }
        return super.equals(other)
    }
    open fun move(){
        //двигаться
    }
}