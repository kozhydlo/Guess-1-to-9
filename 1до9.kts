fun main(args: Array<String>){
    println("Привіт")//Вести на екран текст і перейти на новий рядок
    print("Загадайте число від 1 до 9 і натисніть ентир.")
    val x = (1..9).random()
    vat s = x;
    readline()
    for (in (1 .. 3)){
        when((1..2).random()){
            1 ->{
                print("До результату додайте задумане.")
                s = s + x;
            }
            2-> {
                var md = (2..5).random()
                print("Помножте результат на $rnd.")
                s = s * rmd;
            }
        }
        readline()
    }
    print("Результат подільть на задумане число!")
    s = s / x;
    readline()
    print("Відповіть: це число $s")
}