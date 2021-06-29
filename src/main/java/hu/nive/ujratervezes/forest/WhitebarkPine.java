package hu.nive.ujratervezes.forest;

public class WhitebarkPine extends Tree {

    private int height;

    public WhitebarkPine(int height) {
        this.height = height;
    }

    public WhitebarkPine() {

    }



    public void irrigate() {
        this.height = height + 2;
    }
}
