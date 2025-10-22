import java.util.HashMap;
import java.util.Map;

class Problem {
    public static void main(String[] args) {
        Integer[] a = { 1, 2, 3, 3 };
        assert containsDuplicate_v2(a) == true;

        Integer[] b = { 1, 2, 3, 4 };
        assert containsDuplicate_v2(b) == false;
    }

    private static boolean containsDuplicate(Integer[] ex) {
        Map<Integer, Integer> m = new HashMap<>();
        for (Integer i : ex) {
            m.put(i, m.getOrDefault(i, 0) + 1);
            if (m.get(i) > 1)
                return true;
        }
        return false;
    }

    private static boolean containsDuplicate_v2(Integer[] ex) {
        Map<Integer, Integer> m = new HashMap<>();
        for (Integer i : ex) {
            m.putIfAbsent(i, 0);
            if (m.get(i) > 0)
                return true;
            m.put(i, m.get(i) + 1);
        }
        return false;
    }
}
