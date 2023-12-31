fun main() {
    var likes: Int = 14
    var word: String

    if (likes % 10 == 1 && likes % 100 != 11) {
        word = "человеку"
    } else if (likes % 10 >= 2 && likes % 10 <= 4 && (likes % 100 < 10 || likes % 100 >= 20)) {
        word = "людям"
    } else {
        word = "людям"
    }

    println("Понравилось $likes $word")
}