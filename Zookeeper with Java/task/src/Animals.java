import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Animals {
    CAMEL(0, "camel", AnimalVideos.camelVideoAndMessage),
    LION(1, "lion", AnimalVideos.lionVideoAndMessage),
    DEER(2, "deer", AnimalVideos.deerVideoAndMessage),
    GOOSE(3, "goose", AnimalVideos.gooseVideoAndMessage),
    BAT(4, "bat", AnimalVideos.batVideoAndMessage),
    RABBIT(5, "rabbit", AnimalVideos.rabbitVideoAndMessage);

    private final int index;
    private final String name;

    private final String videoAndMessage;

    private Animals(int index, String name, String videoAndMessage){
        this.index = index;
        this.name = name;
        this.videoAndMessage = videoAndMessage;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public String getVideoAndMessage() {
        return this.videoAndMessage;
    }

    public static Animals getAnimalByIndexInput(String indexInput) {
        int index = Integer.parseInt(indexInput);
        for(Animals animal : values()) {
            if(animal.index == index) {
                return animal;
            }
        }
        return null;
    }



}
