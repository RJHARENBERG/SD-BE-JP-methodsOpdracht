package nl.novi.jp.methods.medior;

/**
 * Gegeven: Een methode die true of false (boolean) teruggeeft op basis van de gegeven leeftijd.
 * <p>
 * Roep deze methode (is oldEnough) vanuit de main-methode aan. Op basis van de return value, roep je
 * of printUnderAgeWarning() of printProceed() uit.
 */
public class MediorTwo {

    public static void main(String[] args) {

        boolean leftijd = isOldEnough(12);
        printProceed(leftijd);
        printUnderAgeWarning(leftijd);
    }

    public static boolean isOldEnough(int age) {
        if (age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public static void printUnderAgeWarning(boolean leeftijd) {
        if (leeftijd = false) {
            System.out.println("You are not old enough for this activity!");
        }
    }

    public static void printProceed(boolean leeftijd) {
        if (leeftijd = true) {
            System.out.println("No warning!");
        }

    }
}
