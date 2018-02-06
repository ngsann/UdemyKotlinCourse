import java.util.*

fun main(args: Array<String>)
{
    val random = Random(). nextInt(50) + 1

    when (random)
    {
        in 1..10 -> println("Range is 1 to 10 and the value is $random")
        in 11..20 -> println("Range is 11 to 20 and the value is $random")
        in 21..30 -> println("Range is 21 to 30 and the value is $random")
        in 31..40 -> println("Range is 31 to 40 and the value is $random")
        else -> println("Range larger than 40 and the value is $random")
    }
}