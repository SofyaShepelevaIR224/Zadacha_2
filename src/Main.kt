fun main() {
    println("Введите строку:") //Запрашиваем ввод строки у пользователя
    val input = readLine() ?: "" //Считывание строки которую ввел пользователь

    val symbol = input.toSet().sorted() //toSet удаляет дубликаты, sorted сорт-т по алфавиту

    val result = StringBuilder("Результат: \n") //Формирует выходную строку
    var totalCount = 0 //Хранит общее количество символов

    for (char in symbol) { //Начало цикла
        val count = input.count { it == char } //Подсчет повторений уникальных символов
        result.append("$char: $count\n") //Помещаем всю информацию в одной строке
        totalCount += 1 //Подсчет количества уникальных символов
    }

   println(result.toString())
}