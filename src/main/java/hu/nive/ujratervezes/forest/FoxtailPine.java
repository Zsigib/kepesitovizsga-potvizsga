package hu.nive.ujratervezes.forest;

public class FoxtailPine extends Tree{

    public FoxtailPine(int height) {
        super();
        this.height = height;
    }

    public FoxtailPine() {
        super();
    }

    public void irrigate() {
        this.height = height + 2;
    }

}
