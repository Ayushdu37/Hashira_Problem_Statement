import java.util.ArrayList;
import java.util.List;

public class CombinationUtil {
    public static void generate(List<Integer> arr, int start, int k, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.size(); i++) {
            current.add(arr.get(i));
            generate(arr, i + 1, k, current, result);
            current.remove(current.size() - 1);
        }
    }
}
