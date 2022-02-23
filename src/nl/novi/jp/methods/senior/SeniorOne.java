package nl.novi.jp.methods.senior;

import java.util.*;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 * <p>
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 */

public class SeniorOne {


    public static void main(String[] args) {

        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        List<String> curstomerNamesSpeltCorrectly = new ArrayList<>();

        for (int i = 0; i < curstomerNames.size(); i++) {

            ArrayList<String> splitName = new ArrayList<>(List.of(curstomerNames.get(i).split(" ")));

            String eersteWoord = "";
            String tweedeWoord = "";
            String derdeWoord = "";

            int grote = splitName.size();

            String maakString = "";

            if (grote == 2) {
                eersteWoord = voorNaam(splitName);
                tweedeWoord = achterNaam(splitName);
            }
            if (grote == 2 && splitName.get(1).contains("-")) {
                eersteWoord = voorNaam(splitName);
                tweedeWoord = streepje(splitName);
            }
            if (grote == 3) {
                eersteWoord = voorNaam(splitName);
                tweedeWoord = splitName.get(1);
                derdeWoord = achterNaamMetTussenVoegsel(splitName);
            }

            maakString = eersteWoord + " " + tweedeWoord + " " + derdeWoord;
            curstomerNamesSpeltCorrectly.add(maakString);
        }
        System.out.println(curstomerNamesSpeltCorrectly);
    }

    public static String voorNaam(ArrayList<String> naam) {
        String s = naam.get(0).substring(0, 1).toUpperCase() + naam.get(0).substring(1);
        return s;
    }

    public static String achterNaam(ArrayList<String> naam) {
        String s = naam.get(1).substring(0, 1).toUpperCase() + naam.get(1).substring(1);
        return s;
    }

    public static String achterNaamMetTussenVoegsel(ArrayList<String> naam) {
        String s = naam.get(2).substring(0, 1).toUpperCase() + naam.get(2).substring(1);
        return s;
    }

    public static String streepje(ArrayList<String> naam) {
        String s = naam.get(1).substring(0, 3) + naam.get(1).substring(3, 4).toUpperCase() + naam.get(1).substring(4);
        return s;
    }
}

