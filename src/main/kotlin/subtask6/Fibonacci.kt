package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val fibos = ArrayList<Int>()
        val res = IntArray(3)
        fibos.addAll(Arrays.asList(0, 1))
        var i = 2
        while (fibos[i - 1] * fibos[i - 2] < n) {
            fibos.add(fibos[i - 1] + fibos[i - 2])
            i++
        }
        if (fibos[fibos.size - 1] * fibos[fibos.size - 2] == n) {
            res[0] = fibos[fibos.size - 2]
            res[1] = fibos[fibos.size - 1]
            res[2] = 1
        } else {
            res[0] = fibos[fibos.size - 2]
            res[1] = fibos[fibos.size - 1]
            res[2] = 0
        }
        return res
    }
}
