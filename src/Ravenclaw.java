public class Ravenclaw extends Hogwarts {
    //private String pupil;
    private int mind;
    private int wisdom;
    private int creativity;

    public Ravenclaw(String name, int witchcraft, int transgression, int mind, int wisdom, int creativity) {
        super(name, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw: " + super.toString() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity;
    }

    public int sumQuality() {
        return getCreativity() + getMind() + getWisdom() + getWitchcraft() + getTransgression();
    }

    public void compare(Ravenclaw other) {
        int thisQuality = this.sumQuality();
        int otherQuality = other.sumQuality();
        if (thisQuality > otherQuality) {
            System.out.println("Когтевран: " + getName() + thisQuality + " сильнее, чем " + other.getName() + otherQuality);
        } else {
            System.out.println("Когтевран: " + other.getName() + otherQuality + " сильнее, чем " + getName() + thisQuality);
        }

    }
}
