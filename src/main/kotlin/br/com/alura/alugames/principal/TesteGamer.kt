import br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Igor",
                        "igor@email.com")
    println(gamer1)

    val gamer2 = Gamer("Jeni",
                        "jeni@email.com",
                        "19/01/2192",
                        "sampyo")
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "18/01/2000"
        it.usuario = "skywalker"

    }.also {
        println(gamer1.idInterno)
    }
    println(gamer1)
}