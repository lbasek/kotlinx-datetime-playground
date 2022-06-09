import java.text.SimpleDateFormat
import java.util.*

fun main() {

    example1()
    example2()
    example3()
    example4()
}

/**
 * Example 1
 * Create a Date object for 25th December 2017, 8.30 at night
 */
private fun example1() {
    val date = Date(2017, 12, 25, 20, 30)
    println(date)

    val year = 2017 - 1900
    val month = 12 - 1
    val date2 = Date(year, month, 25, 20, 30)
    println(date2)
    println("---------------------")
}

/**
 * Example 2
 * Global Time Zone
 */
private fun example2() {
    val date = Date(1654613189212)
    println(TimeZone.getDefault().id)
    println(date)
    TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"))
    println(TimeZone.getDefault().id)
    println(date)
    println("---------------------")
}

/**
 * Example 3
 * Calendar date modification
 */
private fun example3() {
    val year = 2017 - 1900
    val month = 12 - 1
    val date = Date(year, month, 25, 20, 30)

    with(Calendar.getInstance()) {
        isLenient = true
        time = date
        print()
        set(Calendar.DATE, get(Calendar.DATE) + 7)
        print()
    }
    println("---------------------")
}

private fun example4() {
    val dateIso = "1994-11-05T13:15:30Z"
    println(SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(dateIso))

    val dateTimestamp = Date(1654613189212)
    println(SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(dateTimestamp))
}

private fun Calendar.print() {
    println(
        "${get(Calendar.YEAR)}-" +
                "${get(Calendar.MONTH)}-" +
                "${get(Calendar.DATE)} " +
                "${get(Calendar.HOUR_OF_DAY)}:" +
                "${get(Calendar.MINUTE)} "
    )
}
