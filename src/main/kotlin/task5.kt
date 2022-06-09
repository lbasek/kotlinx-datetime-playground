import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.toLocalDateTime

/**
 *  Task 5
 *  Try parse following formats with Instant class
 *      * "2010-06-01T22:19:44.475Z"
 *      * "1994-11-05T08:15:30-05:00"
 *      * "1994-11-05T08:15:30"
 *  Try parse following formats with LocalDateTime class
 *      * "2010-06-01T22:19:44.475"
 *      * "2010-06-01T22:19:44.475Z"
 */
fun main() {
    println("Convert ISO8601 string to Instant: ${Instant.parse("2010-06-01T22:19:44.475Z")}")
    println("Convert ISO8601 string to Instant: ${Instant.parse("1994-11-05T08:15:30-05:00")}")
    println("Convert ISO8601 string to Instant: " +
            runCatching { Instant.parse("1994-11-05T08:15:30") }.getOrElse { "Not valid ISO format!" }
    )

    // NOTE: LocalDateTime uses the similar format, but without Z UTC time zone designator in the end.
    val localDateTime = LocalDateTime.parse("2010-06-01T22:19:44.475")
    println(localDateTime)
    "2010-06-01T22:19:44.475".toLocalDateTime()
}
