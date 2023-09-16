public class Hufflepuff extends Hogwarts {
    public Hufflepuff(String name, int magicPower, int distanceTransgression, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, distanceTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    private  int industriousness; // трудолюбие
    private  int loyalty; // верность
    private  int honesty; // честность

    public  int getIndustriousness() {
        return industriousness;
    }

    public  int getLoyalty() {
        return loyalty;
    }

    public  int getHonesty() {
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
