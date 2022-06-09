import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toJavaLocalDateTime
import kotlinx.datetime.toLocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

/**
 *  Task 7
 *  Try format the date to date you use daily e.g. 9.6.2022 20:34
 */
fun main() {
    val localDateTime = Clock.System.now().toLocalDateTime(TimeZone.of("Europe/Zagreb"))
    val formatStyleMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
    val formatCustom = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm z")

    println(localDateTime.toJavaLocalDateTime().format(formatStyleMedium))
    println(localDateTime.toJavaLocalDateTime().atZone(ZoneId.of("Europe/Zagreb")).format(formatCustom))
}
