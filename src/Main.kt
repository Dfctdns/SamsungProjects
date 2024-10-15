fun main() {
    val student: Student? = Student()
    student?.let { // работает с объектом через it, возвращает сам объект
        it.hi()
        it.bye()
        it.name ="123"
    }
    // apply
    student?.apply { // работает с содержимым объекта, возвращает объект
        hi()
        bye()
        name="1234"
    }

    // run
    val stringStudent = Student().run { // работает с содержимым объекта, возвращает последнее значение
        hi()
        bye()
        lastname
    }
    println(stringStudent)

    //with
    val nameStudent = with(Student()) { // работает с содержимым объекта, возвращает последнее значение
        bye()
        hi()
        123
    }
    println(nameStudent)
    //also
    val StudentCringe = Student().also { st -> // работает с объектом через it, возвращает его измененный
        st.hi()
        st.bye()
        st.name = "hello"
        Math.PI
    }
    println(StudentCringe.name)
}