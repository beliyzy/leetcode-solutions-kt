class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val res = mutableListOf<IntArray>()

        intervals.sortBy { it[0] }
        var interval = intervals[0]

        for (i in 1 until intervals.size) {
            val newInterval = intervals[i]

            if (newInterval[0] <= interval[1]) {
                interval[1] = maxOf(newInterval[1], interval[1])
            } else {
                res.add(interval)
                interval = newInterval
            }
        }

        res.add(interval)

        return res.toTypedArray()
    }
}