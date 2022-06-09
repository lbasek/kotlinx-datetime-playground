import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 *  Task 2
 *  Get the current time and print the following:
 *      * System Time Zone
 *      * Current time adjusted to the time zone: "Europe/Zagreb"
 *      * Current time adjusted to the time zone: "America/New_York"
 */
fun main() {
    val instantNow = Clock.System.now()
    println("System Time Zone: ${TimeZone.currentSystemDefault()}")
    println("Zagreb: ${instantNow.toLocalDateTime(TimeZone.of("Europe/Zagreb"))}")
    println("New York: ${instantNow.toLocalDateTime(TimeZone.of("America/New_York"))}")
}
