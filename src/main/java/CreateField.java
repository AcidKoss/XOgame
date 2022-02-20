public class CreateField {

    protected int width = 3;
    protected int height = 3;
    protected String defaultСell = " ";

    public CreateField (){

    }
    public CreateField (int width, int height){
        this.width  = width + 1;
        this.height = height + 1;
    }
// Создание поля для игры
    public String[][] creatingField (){
        String[][] playingField = new String[width][height];
        for (int i = 0; i < width; i++ ){
            for (int j = 0; j < width; j++ ){
                if (i == 0){
                    playingField[i][j] = Integer.toString(j) ;
                }
                else if (j == 0){
                    playingField[i][j] = Integer.toString(i) ;
                }
                else {
                    playingField[i][j] = defaultСell;
                }

            }
        }
        return playingField;
    }
// Вывод поля для игры
public void displayingField (String[][] field) {
    int i = 0;
    for (i =  0; i < field.length; i++ ){
        for (int j = 0; j < field[i].length; j++ ){

            System.out.print("[" + field[i][j] + "]");
        }
        System.out.println();
    }
}




}
