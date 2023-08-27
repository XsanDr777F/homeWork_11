public class Hufflepuff extends Hogwarts{
    public Hufflepuff(String name, int magicPower, int distanceTransgression, int industriousness, int loyalty, int honesty) {
        super();
    }
    private static int industriousness; // трудолюбие
    private static int loyalty; // верность
    private static int honesty; // честность

    public static int getIndustriousness() {
        return industriousness;
    }

    public static int getLoyalty() {
        return loyalty;
    }

    public static int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff(int industriousness, int loyalty, int honesty) {
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
