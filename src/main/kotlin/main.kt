package ru.netology

fun main() {
    var flag = -1
    val minCount = 0
    var likes = 0
    var input : String
    var endOfMan = "-"
    var endOfPeople = "-"

    println("Программа определения окончания")
    while (flag == -1) {
        println("Введите количество человек/людей: ")
        println("0-Выход из программы")

        input = readLine()!!
        when (input) {
            "0" -> {
                flag = 0; break
            }
        }
        when (input.last()) {
            '1' -> {
            endOfMan = "y"
            endOfPeople ="-"
            }
            else -> {
            endOfMan = "ам"
            endOfPeople ="ям"
            }
        }

        likes = input.toInt()
        println("В планируете проанализировать число $likes")
        if (likes >= minCount) {
            println("Это понравилось $likes человек$endOfMan")
            if (endOfPeople != "-") println("Это понравилось $likes люд$endOfPeople")
        }
        else {
            println("Анализ невозможен: число меньше или равно 0")
        }
        println("")
    }
    println("Программа определения окончания завершена.")
}
