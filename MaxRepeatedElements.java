import java.util.*;

class MaxRepeatedElements {
    public static int[] FindMaxElements(int num[]) {
        int k = 2; // top k elements you want
        Map<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Count frequencies
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }
        System.out.println("Frequency Map: " + map);

        // Step 2: Min-Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
                new PriorityQueue<>(Map.Entry.comparingByValue());

        // Step 3: Keep only top k in heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll(); // remove smallest frequency
            }
        }

        // Step 4: Build result from heap
        int[] result = new int[k];
        int i = 0;
        while (!heap.isEmpty()) {
            result[i++] = heap.poll().getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3,2,1,1,2,4};
        System.out.println(Arrays.toString(FindMaxElements(nums)));
    }
}
