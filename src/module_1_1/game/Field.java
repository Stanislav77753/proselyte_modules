package shildt.game;

public class Field {
    private String[][] gamefield;

    public Field(){
        gamefield = new String[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                gamefield[i][j] = " ";
            }
        }
    }

    public String[][] getGamefield() {
        return gamefield;
    }

    public void setGamefield(String[][] gamefield) {
        this.gamefield = gamefield;
    }

    public void printField(){
        System.out.println(" ___ " + "___ "  + "___ " + "     "  + " ___ " + "___ "  + "___ ");
        System.out.println("| " + gamefield[0][0]+ " | " + gamefield[0][1]+ " | " + gamefield[0][2]+ " |" + "     "  +
                "| " + 0 + " | " + 1 + " | " + 2 + " |" );
        System.out.println(" \u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " + "     "  +
                " \u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " +  "\u0336\u0336\u0336 ");
        System.out.println("| " + gamefield[1][0]+ " | " + gamefield[1][1]+ " | " + gamefield[1][2]+ " |" + "     "  +
                "| " + 3 + " | " + 4 + " | " + 5 + " |");
        System.out.println(" \u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " + "     "  +
                " \u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " +  "\u0336\u0336\u0336 ");
        System.out.println("| " + gamefield[2][0]+ " | " + gamefield[2][1]+ " | " + gamefield[2][2]+ " |" + "     "  +
                "| " + 6 + " | " + 7 + " | " + 8 + " |");
        System.out.println(" \u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " + "     "  +
                " \u0336\u0336\u0336 " +  "\u0336\u0336\u0336 " +  "\u0336\u0336\u0336 ");
    }
}
