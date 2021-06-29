package hu.nive.ujratervezes.forest;

public abstract class Tree {

    protected int height = 0;

    public Tree(int height) {
        this.height = height;
    }

    public Tree() {

    }

    public int getHeight() {
        return height;
    }

    public abstract void irrigate();
}
