//Создать крестики нолики для игры междву двумя людьми
//в консоль первым делом выводится
//сообщение размер поля
//далее выводится созданное поле
//ниже сообщение Поставьте Х
//нужно ввести координаты по х и у
//далее консоль очищается и выводится поле с проставленным Х и сообщением ввидеите О и ТД

public class Main {
    public static void main(String[] args) {
        CreateField field = new CreateField(3,3);
        field.creatingField();
        field.displayingField(field.creatingField());

        GameLogic game = new GameLogic(field.creatingField());
        game.setGameSign();
        System.out.println(game.checkingQueue());






    }
}
