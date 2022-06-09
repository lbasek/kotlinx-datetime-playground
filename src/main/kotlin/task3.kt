import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 *  Task 3
 *  Get the current time and print the following:
 *      * All Local Date Time object attrs
 */
fun main() {
    val localDateTime = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
    with(localDateTime) {
        println(
            "Day of Week: $dayOfWeek \n" +
                    "Day of Month: $dayOfMonth \n" +
                    "Day of Year: $dayOfYear \n" +
                    "Year: $year \n" +
                    "Month: $month \n" +
                    "Month Number: $monthNumber \n" +
                    "Hour: $hour \n" +
                    "Minute: $minute \n" +
                    "Second: $second"
        )
    }
}
