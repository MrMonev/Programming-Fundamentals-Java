package advertisementMessage;
import java.util.Random;
import java.util.Scanner;


public class advertisement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] phrasesArr = {
        "Excellent product.",
        "Such a great product.",
        "I always use that product.", "" +
        "Best product of its category.",
        "Exceptional product.",
        "I can't live without this product."};

        String[] eventsArr = {
        "Now I feel good.",
        "I have succeeded with this product.",
        "Makes miracles. I am happy of the results!",
        "I cannot believe but now I feel awesome.",
        "Try it yourself, I am very satisfied.",
        "I feel great!"};

        String[] authorsArr = {
        "Diana",
        "Petya",
        "Stella",
        "Elena",
        "Katya",
        "Iva",
        "Annie",
        "Eva",};

        String[] citiesArr = {
          "Burgas",
          "Sofia",
          "Plovdiv",
          "Varna",
          "Ruse",};



        Random rnd = new Random();
        for (int index = 0; index < n; index++) {

            int phraseIndex = rnd.nextInt(0,phrasesArr.length);
            int eventsIndex = rnd.nextInt(0,eventsArr.length);
            int authorIndex = rnd.nextInt(0,authorsArr.length);
            int cityIndex = rnd.nextInt(0,citiesArr.length);

            String newPhrases = phrasesArr[phraseIndex];
            String newEvents = eventsArr[eventsIndex];
            String newAuthors = authorsArr[authorIndex];
            String newCities = citiesArr[cityIndex];

            AdvertisementMessage advertisementMessage = new AdvertisementMessage(newPhrases,newEvents,newAuthors,newCities);

            System.out.println(advertisementMessage);
        }
    }
}
//        System.out.println(phrasesArr[phraseIndex] + " " + eventsArr[eventsIndex] + " " + authorsArr[authorIndex] + " - " + citiesArr[cityIndex]);
