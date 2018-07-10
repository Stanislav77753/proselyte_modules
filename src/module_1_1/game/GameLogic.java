package shildt.game;

import java.util.Scanner;


public class GameLogic {
    private User user1;
    private User user2;
    private Field field;
    private int step;
    private int[][] comb = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4 ,8}, {6, 4, 2}};

    public GameLogic(){
        field = new Field();
        user1 = new User("x", "User1");
        user2 = new User("o", "User2");

    }

    public void start(){
        for(int i = 0; i < 9; i++){
            System.out.println("Для своего хода необходимо выбрать код ячейки (от 0 до 8), указанный в правом поле");
            field.printField();


            if( i == 0 || i % 2 == 0){
                setStep(user1);
                doStep(getStep(), user1);
                user1.setComb(getStep());
                if(user1.getCount() > 2){
                    if(checkCombination(user1).equals("win")){
                        field.printField();
                        System.out.println("Win User 1");
                        break;
                    }
                }

            }
            else{
                setStep(user2);
                doStep(getStep(), user2);
                user2.setComb(getStep());
                if(user2.getCount() > 2){
                    if(checkCombination(user2).equals("win")){
                        field.printField();
                        System.out.println("Win User 2");
                        break;
                    }
                }
            }
            if(i == 8){
                System.out.println("Попедитель не определен");
            }
        }

    }

    public int getStep() {
        return step;
    }

    public String checkCombination(User user){
        for(int[] x : comb){
            int comb_game = 0;
            for(int j = 0; j < user.getCount(); j++){
                int[] temp = user.getComb();
                for(int k = 0; k < x.length; k++){
                    if(temp[j] == x[k]){
                        comb_game++;
                    }
                    if(comb_game > 2){
                        return "win";
                    }
                }
            }
        }
        return "No";
    }

    public void setStep(User user) {
        System.out.print(" << " + user.getName() + " >>  " );
        System.out.println("Введите номер ячейки: ");
        Scanner scanner = new Scanner(System.in);
        step = scanner.nextInt();
        if(step < 0 || step > 8){
            try {
                throw new StepExceprion();
            } catch (StepExceprion stepExceprion) {
                System.out.println("Вы ввели некоретный код ячейки");
                setStep(user);
            }
        }
    }
    public void doStep(int step, User user){
        String[][] strings = field.getGamefield();
        switch (step){
            case 0:
                if(!strings[0][0].equals(" ")){
                    checkFieldException(strings[0][0], user);
                }
                else{
                    strings[0][0] = user.getLabel();
                }

                break;
            case 1:
                if(!strings[0][1].equals(" ")){
                checkFieldException(strings[0][1], user);
                }
                else{
                strings[0][1] = user.getLabel();
                }
                break;
            case 2:
                if(!strings[0][2].equals(" ")){
                    checkFieldException(strings[0][2], user);
                }
                else{
                    strings[0][2] = user.getLabel();
                }
                break;
            case 3:
                if(!strings[1][0].equals(" ")){
                    checkFieldException(strings[1][0], user);
                }
                else{
                    strings[1][0] = user.getLabel();
                }
                break;
            case 4:
                if(!strings[1][1].equals(" ")){
                    checkFieldException(strings[1][1], user);
                }
                else{
                    strings[1][1] = user.getLabel();
                }
                break;
            case 5:
                if(!strings[1][2].equals(" ")){
                    checkFieldException(strings[1][2], user);
                }
                else{
                    strings[1][2] = user.getLabel();
                }
                break;
            case 6:
                if(!strings[2][0].equals(" ")){
                    checkFieldException(strings[2][0], user);
                }
                else{
                    strings[2][0] = user.getLabel();
                }
                break;
            case 7:
                if(!strings[2][1].equals(" ")){
                    checkFieldException(strings[2][1], user);
                }
                else{
                    strings[2][1] = user.getLabel();
                }
                break;
            case 8:
                if(!strings[2][2].equals(" ")){
                    checkFieldException(strings[2][2], user);
                }
                else{
                    strings[2][2] = user.getLabel();
                }
                break;
        }
       clrscr();

    }

    public void checkFieldException(String string, User user){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Ход в эту ячейку уже сделан, выберите другую ячейку");
                setStep(user);
                doStep(getStep(), user);
            }
    }
    public static void clrscr(){
        for(int i = 0; i < 50; i++){
            System.out.println();
        }
    }
}
