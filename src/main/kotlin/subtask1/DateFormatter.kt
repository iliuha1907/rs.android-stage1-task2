package subtask1

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var day1:String = day
        var month1: String = month
        if (day.length < 2) {
            day1 = "0$day"
        }
        if (month.length < 2) {
            month1 = "0$month"
        }
        try {
            val parseFormatter = DateTimeFormatter.ofPattern(
                "dd MMMM, EEEE",
                Locale("ru")
            )
            return LocalDate.parse("$year-$month1-$day1").format(parseFormatter)
        } catch (ex: Exception) {
            return "Такого дня не существует"
        }
    }
}
