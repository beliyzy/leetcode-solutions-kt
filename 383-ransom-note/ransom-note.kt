class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val existed = magazine.asSequence().groupingBy { it }.eachCount().toMutableMap()
        for (ch in ransomNote.toCharArray()) {
            val el = existed[ch] ?: 0

            if (el == 0) return false
            existed[ch] = el - 1
        }

        return true
    }
}