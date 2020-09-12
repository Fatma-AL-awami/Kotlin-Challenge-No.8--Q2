object singleton {
    init {
        println("Initializing with object:   $this")
    }

    fun print() = println("Printing with object:   $this")
    fun print1() = println("The same object:   $this")

}


fun main(){
    println("________________________ Use the same object  ______________________")
    println("The singleton pattern")
    singleton.print()
    singleton.print1()
}