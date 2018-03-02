public class MyPodDriver{
    public static void main(String[] args){
        Song[] songs = new Song[3];
        songs[0] = new Song("The Sentinel",300,300,1987);
        songs[1] = new Song("Hatred copter",300,300,1998);
        songs[2] = new Song("mother", 120,300,1997);
        MyPod carPod = new MyPod("red", 8.9, songs);
        System.out.println(carPod);
    }

}
