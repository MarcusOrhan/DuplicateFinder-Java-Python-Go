import java.util.HashSet;
import java.util.Set;


public class Main {

    public static boolean hasDuplicates(String[] arr) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        String[] countries1 = { "USA", "Canada", "Mexico", "Brazil", "Argentina" };
        String[] countries2 = { "USA", "Canada", "Mexico", "Canada", "Brazil", "Argentina", "Argentina" };

        System.out.println(hasDuplicates(countries1)); // false
        System.out.println(hasDuplicates(countries2)); // true
    }
}




