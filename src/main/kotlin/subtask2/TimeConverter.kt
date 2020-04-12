package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val hoursMinutes = arrayOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three"
        )
        val hours = Integer.parseInt(hour)
        val minutes = Integer.parseInt(minute)
        var hour = hoursMinutes[hours]
        if (minutes == 0) {
            return "$hour o' clock"
        }
        if (minutes == 15) {
            return "quarter past $hour"
        }
        if (minutes == 45) {
            return "quarter to " + hoursMinutes[hours + 1]
        }
        if (minutes == 30) {
            return "half past $hour"
        }

        if (minutes < 30) {
            return hoursMinutes[minutes] + " minutes past " + hour
        }
        return if (minutes < 60) {
            hoursMinutes[60 - minutes] + " minutes to " + hoursMinutes[hours + 1]
        } else ""
    }
}
