public class WordMatch
{
    /** The secret string. */
    private String secret;
    /** Constructs a WordMatch object with the given secret string of lowercase letters. */
    public WordMatch(String word)
    {
        secret = word;
        /* implementation not shown */
    }
    /** Returns a score for guess, as described in part (a).
     * Precondition: 0 < guess.length() <= secret.length()
     */
    public int scoreGuess(String guess)
    {
        int count = 0;
        for (int i = 0; i < secret.length() - guess.length() + 1; i++){
            if (guess.equals(secret.substring(i, i + guess.length()))){
                count++;
            }
        }
        return count * guess.length() * guess.length();
        /* to be implemented in part (a) */ }
    /** Returns the better of two guesses, as determined by scoreGuess and the rules for a
     * tie-breaker that are described in part (b).
     * Precondition: guess1 and guess2 contain all lowercase letters.
     * guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2){
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 == score2){
            if (guess1.compareTo(guess2) > 0){
                return guess1;
            }
            else{
                return guess2;
            }
        }
        if (score1 > score2){
            return guess1;
        }
        else{
            return guess2;
        }
    /* to be implemented in part (b) */ }
}