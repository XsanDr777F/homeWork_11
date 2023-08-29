public class Slytherin extends Hogwarts {
    public Slytherin(String name, int magicPower, int distanceTransgression, int cunning, int determination, int ambition) {
        super(name, magicPower, distanceTransgression);
        Slytherin.cunning = cunning;
        Slytherin.determination = determination;
        Slytherin.ambition = ambition;
    }

    private static int cunning; // хитрость
    private static int determination;// решительность
    private static int ambition;// амбициозность

    public static int getCunning() {
        return cunning;
    }

    public static int getDetermination() {
        return determination;
    }

    public static int getAmbition() {
        return ambition;
    }
    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }
    public void compare(Slytherin slytherin) {
        if (cunning + determination + ambition > getCunning() + getDetermination() + getAmbition()) {
            System.out.println(name + " сильнее " + getName());
        } else {
            System.out.println(getName() + " сильнее " + name);
        }
    }
}
