import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 *  Task 4
 *  Parse the given UNIX timestamp and print following:
 *      * Time in ISO8601 format in GMT/UTC+0
 *      * Time in ISO8601 format in UTC+2 or System Time Zone
 *  Get current UNIX timestamp and print in milliseconds
 */
fun main() {
    val timestamp = 644857616000L
    val instant = Instant.fromEpochMilliseconds(timestamp)
    println("GMT: $instant")
    println("UTC+2: ${instant.toLocalDateTime(TimeZone.currentSystemDefault())}")

    val now = Clock.System.now().toEpochMilliseconds()
    println("Current UNIX timestamp: $now")
}
