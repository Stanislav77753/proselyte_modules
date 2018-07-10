package shildt.game;

public class User {
    private int[] comb;
    private int count;
    private String label;
    private String name;

    public User(String label, String name){
        comb = new int[5];
        count = 0;
        this.label = label;
        this.name = name;
    }

    public int[] getComb() {
        return comb;
    }

    public void setComb(int num) {
        comb[count] = num;
        count++;
    }


    public int getCount() {
        return count;
    }



    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }
}
