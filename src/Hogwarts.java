public class Hogwarts {

    private String nameOfFaculty;
    private int witchcraft;
    private int transgression;


    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public Hogwarts(String nameOfFaculty, int witchcraft, int transgression) {
        this.nameOfFaculty = nameOfFaculty;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }
    public int getWitchcraft() {
        return witchcraft;
    }
public boolean isValidQuality(int witchcraft) {
    return this.witchcraft >= 0 && this.witchcraft <= 100;
}
    public void setWitchcraft(int witchcraft) {
        if (isValidQuality(witchcraft)) {
            this.witchcraft = witchcraft;
        }
            System.out.println("Неправильное значение " + witchcraft);
            return;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }


    @Override
    public String toString() {
        return "name: " + nameOfFaculty +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression;
    }
    public int sumQuality () {
        return getWitchcraft() + getTransgression();
    }
    public void compare (Hogwarts other) {
        if (sumQuality() > other.sumQuality()) {
            System.out.println("Магия " + sumQuality() + " сильнее, чем магия" + other.sumQuality());
        } else {
            System.out.println("Магия " + other.sumQuality() + " сильнее, чем магия" + sumQuality());
        }
    }

}
