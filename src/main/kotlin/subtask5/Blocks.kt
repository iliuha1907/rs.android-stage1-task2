package subtask5

import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        if (blockB == Int::class) {
            var sum = 0
            for (i in blockA.indices) {
                if (blockA[i]!!::class == Int::class) {
                    sum += blockA[i] as Int
                }
            }
            return sum
        }
        if (blockB == String::class) {
            val sb = StringBuilder()
            for (i in blockA.indices) {
                if (blockA[i]!!::class ==  String::class) {
                    sb.append(blockA[i] as String)
                }
            }
            return sb.toString()
        }
        val dates = ArrayList<LocalDate>()
        for (i in blockA.indices) {
            if (blockA[i]!!::class == LocalDate::class) {
                dates.add(blockA[i] as LocalDate)
            }
        }
        dates.sortWith(Comparator { o1, o2 -> o1.compareTo(o2) })
        return dates[dates.size - 1].format(
            DateTimeFormatter.ofPattern(
                "dd.MM.yyyy",
                Locale("ru")
            )
        )
    }
}
