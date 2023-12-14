public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;
    //private final Pupil [] pupils;
    // Объявили массив учеников

    public Gryffindor(String nameOfFaculty, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(nameOfFaculty, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    @Override
    public String toString() {
        return "Gryffindor: " + super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
    public int sumQuality () {
        return getNobility() + getBravery() + getHonor() + getWitchcraft() + getTransgression();
    }
    public void compare (Gryffindor other) {
        int thisQuality = this.sumQuality();
        int otherQuality = other.sumQuality();
        if (thisQuality > otherQuality) {
            System.out.println("Гриффендор: " + thisQuality + " сильнее, чем " + otherQuality);
        } else {
                System.out.println("Гриффендор: " + otherQuality + " сильнее, чем " + thisQuality);
        }
    }

}
