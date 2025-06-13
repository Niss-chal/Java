import java.util.Scanner;
abstract class Player{
    abstract void play();
    abstract void pause();
    abstract void stop();

}

interface Playlist {
    void addSong(String add);
    void removeSong(String remove);    
}

class VideoPlayer extends Player implements Playlist{

    public void play(){
        System.out.println("Song is playing");

    }

    public void pause(){
        System.out.println("Song has been paused");
    }
    
    public void stop(){
        System.out.println("Song has been stopped");
    }
    public void addSong(String add) {
        System.out.println(add+" has been added");       
    }

    public void removeSong(String remove) {
        System.out.println(remove+" has been removed");
    }
    
}

public class MediaPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the song to add: ");
        String add = sc.nextLine();
        
        System.out.println("Enter the song to remove: ");
        String remove = sc.nextLine();

        VideoPlayer videoplay = new VideoPlayer();

        videoplay.addSong(add);
        videoplay.play();
        videoplay.pause();
        videoplay.stop();
        videoplay.removeSong(remove);

        sc.close();
    }
}
