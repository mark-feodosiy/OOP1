public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchcraft, int transgression, int diligence, int loyalty, int honesty) {
        super(name, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

   public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

   @Override
   public String toString() {
       return "Hufflepuff: " + super.toString() +
               ", diligence=" + diligence +
               ", loyalty=" + loyalty +
               ", honesty=" + honesty;
   }
    public int sumQuality () {
        return getDiligence() + getLoyalty() + getHonesty() + getWitchcraft() + getTransgression();
    }
    public void compare (Hufflepuff other) {
        int thisQuality = this.sumQuality();
        int otherQuality = other.sumQuality();
        if (thisQuality > otherQuality) {
            System.out.println("Пуффендуй: " + getName() + thisQuality + " сильнее, чем " + other.getName() + otherQuality);
        } else {
            System.out.println("Пуффендуй: " + other.getName() + otherQuality + " сильнее, чем " + getName() + thisQuality);
        }
    }
}
