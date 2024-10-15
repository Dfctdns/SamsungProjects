import java.awt.Color

fun main(){


    val car:Car = Car() // название класса()/ конструктор
    car.turnOn()
    val cabriolet:Cabriolet = Cabriolet()
    cabriolet.turnOn()
    cabriolet.openRoof()
/*    val kangaroo:Kangaroo = Kangaroo()
    val snake:Snake = Snake()
    val elephant:Elephant = Elephant()

    val kangAnim = kangaroo as Animal
    kangAnim.move()
    println()// наследует метод из Kangaroo, методы из Kangaroo, которых нет в Animal не будут работать

    kangaroo.move()
    snake.move()
    elephant.move()
    println()
    val array = mutableListOf<Animal>()
    array.add(kangaroo)
    array.add(snake)
    array.add(elephant)

    for(i in array) {
        i.move()
    }*/

/*
    // super - ключевое слово для доступа к родительскому классу
    val mebel:Mebel = Mebel(material = "dsp", lwh = "123", price = 100)
    println(mebel)
*/
/*    val animal1 = Animal(4, Color.pink, "GUGU")
    val animal2 = Animal(4, Color.pink, "GUGU")
    // работает только пока есть метод equals
    print(animal1==animal2)*/

 /*   val direction: Directions = Directions.East

    when (direction) {
        Directions.East-> println("East")
        Directions.South-> println("South")
        Directions.West-> println("West")
        Directions.North-> println("North")
    }*/
}