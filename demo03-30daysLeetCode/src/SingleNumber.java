import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        // solution 1
//        if (nums == null || nums.length < 1)
//            return 0;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (list.contains(nums[i]))
//                list.remove(new Integer(nums[i]));
//            else
//                list.add(nums[i]);
//        }
//        return list.get(0);

        // solution 2
//        Map<Integer, Boolean> map = new HashMap<>();
//        for (int i : nums)
//            if (map.containsKey(i))
//                map.remove(i);
//            else
//                map.put(i, true);
//        for (Map.Entry<Integer, Boolean> entry : map.entrySet())
//            return entry.getKey();
//        return 0;

        // solution 3
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(new int[]{2, 2, 1}));
    }
}
