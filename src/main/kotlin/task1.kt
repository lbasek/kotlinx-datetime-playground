import kotlinx.datetime.Clock

/**
 *  Task 1
 *  Get the current time and print the following:
 *      * Current time in ISO8601 format
 *      * Current time in UNIX timestamp format
 */
fun main() {
    val instantNow = Clock.System.now()
    println("ISO8601: $instantNow")
    println("UNIX timestamp: ${instantNow.toEpochMilliseconds()}")
}
