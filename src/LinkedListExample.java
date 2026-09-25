import java.util.LinkedList;

public class LinkedListExample {
    static void main (String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.addFirst("redberry");
        playlist.addLast("Shape of you");
        playlist.addLast("Bad Habits");

        String currentList = playlist.getFirst();
        System.out.println("showing the item of currentlist " + currentList);

        playlist.add(1, "perfect");

//        playlist.removeFirst();

        for (String playlistItem: playlist) {
            System.out.println(playlistItem);
        }
    }
}
