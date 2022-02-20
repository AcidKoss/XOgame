import java.util.Scanner;

public class GameLogic {

    protected String[][] playField;
    protected boolean a = true;
    protected String gameSign ;
    protected String gameSignPlayerFirst ;
    protected String gameSignPlayerSecond ;

    public  GameLogic (String[][] field){
        this.playField = field;
    }

    //Ввод игрового знака с консоли
    public void setGameSign() {
        while (a) {
            Scanner console = new Scanner(System.in);
            System.out.print("Введите игровой знак х или о: ");
            String gameSign = console.nextLine();
            if (gameSign.length() == 1 & (gameSign.equals("х") | gameSign.equals("о"))) {
                this.gameSign = gameSign;
                break;
            } else {
                System.out.println("Игровой знак может быть только 1 символ, х или о");
            }
        }

    }

//Проверка какой игрок сделал ход пока не придумал как ????????????????????????
    public String checkingQueue () {
        gameSignPlayerFirst = gameSign;

        return gameSign;
    }

//Ввод координат куда записать

}
