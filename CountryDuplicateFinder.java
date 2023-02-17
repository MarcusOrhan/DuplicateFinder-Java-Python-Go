import java.util.*;

public class CountryDuplicateFinder {
    public static void main(String[] args) {
        String[] countries = { "Turkey", "Turkey", "India", "USA", "China", "Japan", "India", "Russia", "China", "USA", "Canada" };
        List<String> duplicates = findDuplicates(countries);
        System.out.println("Duplicate countries: " + duplicates);
    }

    public static List<String> findDuplicates(String[] countries) {
        List<String> duplicates = new ArrayList<>();
        Set<String> uniqueCountries = new HashSet<>();

        for (String country : countries) {
            if (!uniqueCountries.add(country)) {
                duplicates.add(country);
            }
        }

        return duplicates;
    }
}
