public class Hufflepuff extends Hogwarts {
    public Hufflepuff(String name, int magicPower, int distanceTransgression, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, distanceTransgression);
        Hufflepuff.industriousness = industriousness;
        Hufflepuff.loyalty = loyalty;
        Hufflepuff.honesty = honesty;
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
    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name='" + getName() +
                ", magicPower=" + getMagicPower() +
                ", distanceTransgression=" + getDistanceTransgression() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
    public void compare(Hufflepuff hufflepuff) {
        if (industriousness + loyalty + honesty > getIndustriousness() + getLoyalty() + getHonesty()) {
            System.out.println(hufflepuff.getName() + " сильнее " + getName());
        } else {
            System.out.println(getName() + " сильнее " + hufflepuff.getName());
        }
    }
}
