public class prob22_UnitConvertor {

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100°F in Celsius: " + convertFarhenheitToCelsius(100));
        System.out.println("37°C in Fahrenheit: " + convertCelsiusToFarhenheit(37));
        System.out.println("150 pounds in kg: " + convertPoundsToKilograms(150));
        System.out.println("70 kg in pounds: " + convertKilogramsToPounds(70));
        System.out.println("10 gallons in liters: " + convertGallonsToLiters(10));
        System.out.println("20 liters in gallons: " + convertLitersToGallons(20));
    }
}
