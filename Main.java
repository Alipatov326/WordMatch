public class Main {
    public static void main(String[] args) {
        WordMatch game = new WordMatch("mississippi");
        System.out.println(game.scoreGuess("i"));
        System.out.println(game.scoreGuess("iss"));
        System.out.println(game.scoreGuess("issipp"));
        System.out.println(game.scoreGuess("mississippi"));

        WordMatch game2 = new WordMatch("aaaabb");
        System.out.println(game2.scoreGuess("a"));
        System.out.println(game2.scoreGuess("aa"));
        System.out.println(game2.scoreGuess("aaa"));
        System.out.println(game2.scoreGuess("aabb"));
        System.out.println(game2.scoreGuess("c"));

        WordMatch game3 = new WordMatch("concatenation");
        System.out.println(game3.scoreGuess("ten"));
        System.out.println(game3.scoreGuess("nation"));
        System.out.println(game3.findBetterGuess("ten", "nation"));
        System.out.println(game3.scoreGuess("con"));
        System.out.println(game3.scoreGuess("cat"));
        System.out.println(game3.findBetterGuess("con", "cat"));
    }
}


