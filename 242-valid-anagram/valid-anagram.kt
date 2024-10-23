class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val store = IntArray(26)

        for (i in s.indices) {
            store[s[i] - 'a']++
            store[t[i] - 'a']--
        }

        for (n in store) {
            if (n != 0) return false
        }

        return true
    }
}