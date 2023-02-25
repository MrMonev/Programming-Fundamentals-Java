package advertisementMessage;

public class AdvertisementMessage {

    private String laudatoryPhrases; //
    private String events; // Събитие
    private String author; // Автор
    private String city; // Град


    public AdvertisementMessage(String laudatoryPhrases, String events, String author, String city) {
        this.laudatoryPhrases = laudatoryPhrases;
        this.events = events;
        this.author = author;
        this.city = city;
    }
    public void phrases(String newPhrases) {
        this.laudatoryPhrases = newPhrases;
    }
    public void events(String newEvents) {
        this.events = newEvents;
    }
    public void authors (String newAuthors) {
        this.author = newAuthors;
    }
    public void cities (String newCities) {
        this.city = newCities;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s - %s",this.laudatoryPhrases,this.events, this.author, this.city);
    }
}


