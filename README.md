# `kotlinx-datetime` Playground

This repository serves as a playground with `kotlinx-datetime` library. Some basic functionalities of the library are
presented through a few tasks/examples.

Tasks:

1. Get the current time and print the following:
    * Current time in ISO8601 format
    * Current time in UNIX timestamp format

***

2. Get the current time and print the following:
    * System Time Zone
    * Current time adjusted to the time zone: `Europe/Zagreb`
    * Current time adjusted to the time zone: `America/New_York`

***

3. Get the current time and print the following:
    * All Local Date Time object attrs

***

4. Parse the given UNIX timestamp and print following:
     * Time in ISO8601 format in GMT/UTC+0
     * Time in ISO8601 format in UTC+2 or System Time Zone
* Get current UNIX timestamp and print in milliseconds

***

5.  Try parse following formats with Instant class:
    * "2010-06-01T22:19:44.475Z"
    * "1994-11-05T08:15:30-05:00"
    * "1994-11-05T08:15:30"
   * Try parse following formats with LocalDateTime class
     * "2010-06-01T22:19:44.475"
     * "2010-06-01T22:19:44.475Z"
     
***

6. Explore how arithmetic operations works with the Instant class. Calculate time period between:
   * "2020-01-01T00:00:00Z"
   * Current time + 1 year + 6 months

***

7. Try format the date to date you use daily e.g. 9.6.2022 20:34

***

## Resources
* [kotlinx-datetime](https://github.com/Kotlin/kotlinx-datetime)
* [W3 datetime](https://www.w3.org/TR/NOTE-datetime)
* [All about java.util.date by jonskeet](https://codeblog.jonskeet.uk/2017/04/23/all-about-java-util-date/)
* [joda-time-android](https://github.com/dlew/joda-time-android)
* [Epoch Converter](https://www.epochconverter.com/)
* [Handling dates on Android](https://medium.com/nanogiants/handling-dates-on-android-1fccccde9d54)
* [ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP)
* [5 Reasons Why Java's old Date and Calendar API was Bad](https://javarevisited.blogspot.com/2017/04/5-reasons-why-javas-old-date-and-Calendar-API-bad.html#axzz7VjHEzINL)
