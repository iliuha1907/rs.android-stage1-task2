package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val sb = StringBuilder()
        val used = BooleanArray(26)
        val helper = inputString.toLowerCase()
        var sum = 0
        for (i in 0 until inputString.length) {
            val alphaPos = helper[i].toInt() - 97
            if (alphaPos > -1 && alphaPos < 26) {
                if (!used[alphaPos]) {
                    used[alphaPos] = true
                    sum++
                }
            }
        }
        val values = inputString.replace("\n".toRegex(), "").split(" ".toRegex()).dropLastWhile { it.isEmpty() }
            .toTypedArray()
        val listCount = ArrayList<AbstractMap.SimpleEntry<Int, String>>()
        for (i in values.indices) {
            if (values[i] == "") {
                continue
            }
            val tempWord = StringBuilder()
            var count = 0
            if (sum == 26) {
                for (j in 0 until values[i].length) {
                    when (Character.toString(values[i][j]).toLowerCase()) {
                        "a", "e", "i", "o", "u", "y" -> {
                            tempWord.append(Character.toString(values[i][j]).toUpperCase())
                            count++
                        }
                        else -> tempWord.append(values[i][j])
                    }
                }
            } else {
                for (j in 0 until values[i].length) {
                    when (Character.toString(values[i][j]).toLowerCase()) {
                        "a", "e", "i", "o", "u", "y" -> tempWord.append(values[i][j])
                        else -> if (values[i].toLowerCase()[j].toInt() - 97 > -1 && values[i].toLowerCase()[j].toInt() - 97 < 26) {
                            tempWord.append(Character.toString(values[i][j]).toUpperCase())
                            count++
                        } else {
                            tempWord.append(values[i][j])
                        }
                    }
                }
            }
            listCount.add(AbstractMap.SimpleEntry(count, tempWord.toString()))
        }
        listCount.sortWith(Comparator { o1, o2 -> o1.key.compareTo(o2.key) })
        for (i in listCount.indices) {
            if(i!=listCount.size-1) {
                sb.append(listCount[i].key.toString() + listCount[i].value + " ")
            }
            else{
                sb.append(listCount[i].key.toString() + listCount[i].value )
            }
        }
        return sb.toString()
    }
}
