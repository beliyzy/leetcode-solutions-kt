class Solution {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> intersections = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {
            int[] first = firstList[i];
            int[] second = secondList[j];

            int startMax = Math.max(first[0], second[0]);
            int endMin = Math.min(first[1], second[1]);

            if (startMax <= endMin) {
                intersections.add(new int[]{startMax, endMin});
            }
            
            if (first[1] == endMin) i++;
            if (second[1] == endMin) j++;
        }

        int[][] res = new int[intersections.size()][2];
        for (int k = 0; k < intersections.size(); k++) {
            res[k] = intersections.get(k);
        }
        return res;
    }
}