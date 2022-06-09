import kotlinx.datetime.*

/**
 *  Task 6
 *  Explore how arithmetic operations works with the Instant class
 *  Calculate time period between:
 *      * "2020-01-01T00:00:00Z"
 *      * Current time + 1 year + 6 months
 */
fun main() {
    val futureTime = Clock.System.now()
        .plus(1, DateTimeUnit.YEAR, TimeZone.UTC)
        .plus(6, DateTimeUnit.MONTH, TimeZone.UTC)

    val instantInThePast: Instant = Instant.parse("2020-01-01T00:00:00Z")

    // Duration - Experimental
    val durationSinceThen = futureTime - instantInThePast
    println(durationSinceThen)

    // DateTimePeriod
    val period: DateTimePeriod = instantInThePast.periodUntil(futureTime, TimeZone.UTC)
    println("Period between dates: ${period.years} years and ${period.months} months")

    // NOTE : Arithmetic on LocalDateTime is intentionally omitted.
}
