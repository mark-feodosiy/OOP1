public class Hogwarts {

    private String name;
    private int witchcraft;
    private int transgression;


    public String getName() {
        return name;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.name= name;
    }

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }
    public int getWitchcraft() {
        return witchcraft;
    }
/*public boolean isValidQuality(int witchcraft) {
    return this.witchcraft >= 0 && this.witchcraft <= 100;
}
   public void setWitchcraft(int witchcraft) {
        if (isValidQuality(witchcraft)) {
        this.witchcraft = witchcraft;
      /*  }
            System.out.println("Неправильное значение " + witchcraft);
            return;
    }
*/
    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }


    @Override
    public String toString() {
        return "name: " + name +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression;
    }
    public int sumQuality () {
        return getWitchcraft() + getTransgression();
    }
    public void compare (Hogwarts other) {
        if (sumQuality() > other.sumQuality()) {
            System.out.println("Магия " + name + " (" + sumQuality() + ")" + " сильнее, чем магия " + other.name + " (" + other.sumQuality() + ")");
        } else {
            System.out.println("Магия " + other.name + " (" + other.sumQuality() + ")" + " сильнее, чем магия " + name + " (" + sumQuality()+ ")");
        }
    }

}
