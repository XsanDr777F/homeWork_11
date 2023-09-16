public class Gryffindor extends Hogwarts {
    public Gryffindor(String name, int magicPower, int distanceTransgression, int nobility, int honor, int brave) {
        super(name, magicPower, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    private int nobility; // благородство
    private int honor; // честь
    private int brave; // храбрость

    public  int getNobility() {
        return nobility;
    }
    public  int getHonor() {
        return honor;
    }
    public  int getBrave() {
        return brave;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name='" + getName() +
                ", magicPower=" + getMagicPower() +
                ", distanceTransgression=" + getDistanceTransgression() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", brave=" + brave +
                '}';

    }
    public void compare(Gryffindor gryffindor) {
        if (nobility + honor + brave > getHonor() + getNobility() + getBrave()) {
            System.out.println(gryffindor.getName() + " сильнее " + getName());
        } else {
            System.out.println(getName() + " сильнее " + gryffindor.getName());
        }
    }

}
