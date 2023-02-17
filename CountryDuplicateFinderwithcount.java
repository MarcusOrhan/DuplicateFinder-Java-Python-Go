import java.util.*;

public class CountryDuplicateFinderwithcount {
    public static void main(String[] args) {
        String[] countries = { "India", "USA", "China", "Japan", "India", "Russia", "China", "USA", "Canada" };
        Map<String, Integer> duplicates = findDuplicateCounts(countries);
        System.out.println("Duplicate countries and counts: " + duplicates);
    }

    public static Map<String, Integer> findDuplicateCounts(String[] countries) {
        Map<String, Integer> duplicateCounts = new HashMap<>();
        for (String country : countries) {
            if (duplicateCounts.containsKey(country)) {
                duplicateCounts.put(country, duplicateCounts.get(country) + 1);
            } else {
                duplicateCounts.put(country, 1);
            }
        }

        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : duplicateCounts.entrySet()) {
            if (entry.getValue() > 1) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}
