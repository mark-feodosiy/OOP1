public class Slytherin extends Hogwarts {
    //private String pupil;
    private int trick;
    private int determination;
    private int ingenuity;
    private int ambition;

    public Slytherin(String nameOfFaculty, int witchcraft, int transgression, int trick, int determination, int ingenuity, int ambition) {
        super(nameOfFaculty, witchcraft, transgression);
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

    @Override
    public String toString() {
        return "Slytherin: " + super.toString() +
                "trick=" + trick +
                ", determination=" + determination +
                ", ingenuity=" + ingenuity +
                ", ambition=" + ambition;
    }
    public int sumQuality() {
        return getAmbition() + getDetermination() + getIngenuity() + getTrick() + getTransgression() + getWitchcraft();
    }

    public void compare(Slytherin other) {
        int thisQuality = this.sumQuality();
        int otherQuality = other.sumQuality();
        if (thisQuality > otherQuality) {
            System.out.println("Слизерин: " + thisQuality + " сильнее, чем " + otherQuality);
        } else {
            System.out.println("Слизерин: " + otherQuality + " сильнее, чем " + thisQuality);
        }

    }
}
