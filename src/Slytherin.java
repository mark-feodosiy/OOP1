public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ingenuity;
    private int ambition;

    public Slytherin(int witchcraft, int transgression, int trick, int determination, int ingenuity, int ambition) {
        super(witchcraft, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ingenuity = ingenuity;
        this.ambition = ambition;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
}
