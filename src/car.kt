import java.awt.Color

open class Car(
    private var color: Color = Color.red,
    private var length:Int = 200,
    private var model:String = "Lada"
) {
    companion object{
        val countOfSold: Int = 20
    }


    open fun turnOn(){
        println("Let`s ride")
    }
    fun colorChanged(c:Color){
        this.color = c//смена цвета
    }
    // getter setter
    fun getLength():Int {
        return length
    }
    fun setLength(l:Int){
        this.length = l
    }
}