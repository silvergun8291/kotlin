class User {
    var name: String = "kkang"
    constructor(name: String) {
        this.name = name
    }
    fun someFun() {
        println("name: $name")
    }
    class SomeClass {}
}

fun main(args: Array<String>) {
    val user:User = User("kim")
    user.someFun()
}