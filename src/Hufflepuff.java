public class Hufflepuff extends Hogwarts {
    private String pupil;
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int witchcraft, int transgression, String pupil, int diligence, int loyalty, int honesty) {
        super(witchcraft, transgression);
        this.pupil = pupil;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getPupil() {
        return pupil;
    }

    public void setPupil(String pupil) {
        this.pupil = pupil;
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
}
