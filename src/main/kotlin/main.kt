fun main() {
    println("Curso Kotlin Alura")

    val titular = "Gabriel Guesser"
    val accountNumber: Int = 82126946

    var saldo: Double = 0.0
    saldo = 100.0

    println("Olá, $titular")
    println("Número da conta $accountNumber")
    println("Saldo da conta $saldo")

    testaCondicoes(20.0)

    for (i in 10 downTo 0 step 5) {
        println(i)
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva!")

        saldo == 0.0 -> println("conta neutra!")

        else -> println("conta está negativa!")
    }
}