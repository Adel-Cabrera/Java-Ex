package hashmatique;

import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public void hashmatique(){
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Song One", "Lyrics One");
        trackList.put("Song Two", "Lyrics Two");
        trackList.put("Song Three", "Lyrics Three");
        trackList.put("Song Four", "Lyrics Four");

        String output = trackList.get("Song Three");
        System.out.println("One Song "+ output);


//        System.out.println(trackList.entrySet());

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(String.format("Track '%s' | Lyrics : '%s' ", key, trackList.get(key)));
        }

    }

}