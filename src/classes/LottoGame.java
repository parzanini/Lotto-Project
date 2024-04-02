package classes;
public class LottoGame {

    private static int id = 0;
    private int[] gameNumbers;
    private LottoResult result;

    public LottoGame(int[] gameNumbers) {
        this.id = ++id;
        this.gameNumbers = gameNumbers;
        this.result = LottoResult.Loss;
    }
    public LottoGame(int[] gameNumbers, LottoResult result) {
        this.id = ++id;
        this.gameNumbers = gameNumbers;
        this.result = result;
    }


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        LottoGame.id = id;
    }

    public int[] getGameNumbers() {
        return gameNumbers;
    }

    public void setGameNumbers(int[] gameNumbers) {
        this.gameNumbers = gameNumbers;
    }

    public LottoResult getResult() {
        return result;
    }

    public void setResult(LottoResult result) {
        this.result = result;
    }
}
