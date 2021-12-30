public class Main {

    public static void main(String[] args) {
        boolean playingCat1 = PlayingCat.isCatPlaying(true, 10);
        System.out.println(playingCat1);

        boolean playingCat2 = PlayingCat.isCatPlaying(false, 36);
        System.out.println(playingCat2);

        boolean playingCat3 = PlayingCat.isCatPlaying(false, 35);
        System.out.println(playingCat3);
    }
}
