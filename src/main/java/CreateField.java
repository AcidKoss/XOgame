import java.util.Scanner;

public class CreateField {

    protected int width = 3;
    protected int height = 3;
    protected String defaultСell = " ";



    protected int axisX;
    protected int axisY;

    String[][] playingField;

    public CreateField() {

    }

    public String[][] getPlayingField() {
        return playingField;
    }

    public CreateField(int width, int height) {
        this.width = width + 1;
        this.height = height + 1;
    }

    // Создание поля для игры
    public String[][] creatingField() {
        playingField = new String[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0) {
                    playingField[i][j] = Integer.toString(j);
                } else if (j == 0) {
                    playingField[i][j] = Integer.toString(i);
                } else {
                    playingField[i][j] = defaultСell;
                }

            }
        }
        return playingField;
    }

    // Вывод поля для игры
    public void displayingField(String[][] field) {
        int i = 0;
        for (i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                System.out.print("[" + field[i][j] + "]");
            }
            System.out.println();
        }
    }

    //Ввод координат куда записать для х
    public void inputAxisX() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите координаты по оси Х: ");
        axisX = console.nextInt();


    }
    //Ввод координат куда записать для y
    public void inputAxisY() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите координаты по оси Y: ");
        axisY = console.nextInt();

    }
    public int getAxisX() {
        return axisX;
    }

    public int getAxisY() {
        return axisY;
    }

    //Запись введенного знака в игровое поле
    public void writingSignInField(String gameSign, int axisX, int axisY) {
        this.playingField[axisX][axisY] = gameSign;
    }
}