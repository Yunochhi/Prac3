fun main()
{
    println("На какую сумму у вас оформлен кредит?")
    val summ:Int = readLine()!!.toInt()
    println("На сколько лет взят кредит?")
    val srok:Int = readLine()!!.toInt()
    println("Под какой процент был оформлен кредит")
    val procent = readLine()!!.toInt()
    val plata:Int = (summ / srok)
    val viplata:Int = summ + (summ / 100 * procent)


    println("Плата в месяц по кредиту $plata, Выплатить придется $viplata")
}