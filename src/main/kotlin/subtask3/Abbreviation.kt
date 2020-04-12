package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val sb = StringBuilder()
        var i = 0
        var j = 0
        while (i < a.length) {
            if (Character.toString(a[i]) == Character.toString(b[j]) || Character.toString(a[i]).toUpperCase() == Character.toString(
                    b[j]
                )
            ) {
                sb.append(b[j])
                j++
                if (j > b.length - 1) {
                    break
                }
            }
            i++
        }
        if (sb.toString() == b) {
            return "YES"
        }
        return "NO"
    }
}
