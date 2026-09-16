class Solution {
    class Pair {
        double x;
        int[] y;
        Pair(double x, int[] y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "(" + x + ", " + Arrays.toString(y) + ")";
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> Double.compare(a.x, b.x));

        for (int[] co : points) {
            int x = co[0] - 0;
            int y = co[1] - 0;

            x = x * x;
            y = y * y;

            int res = x + y;

            double ans = Math.sqrt((double) res);

            minHeap.offer(new Pair(ans, co));
        }
        System.out.println(minHeap);
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().y;
        }

        return result;
    }
}
