import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Utils {
    public static Map mapCreator(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        Map<String, Country> countries = new HashMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            int population = Integer.parseInt(split[2]);
            countries.put(split[0], new Country(split[0], split[1], population));

        }
        scanner.close();
        return countries;
    }
    public static void showInfo(Map<String, Country> countries) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the country code: ");
            String code = scanner.nextLine();

            System.out.println("Country code: " + countries.get(code).getCode() + "\nCountry name: " +
                    countries.get(code).getName() + "\nNumber of people: " + countries.get(code).getPopulation());
            scanner.close();
        }
        catch (NullPointerException ex){
            System.err.println("Wrong country code.");
        }
    }
}
