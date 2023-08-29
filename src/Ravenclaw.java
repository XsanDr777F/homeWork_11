public class Ravenclaw extends Hogwarts {
    public Ravenclaw(String name, int magicPower, int distanceTransgression, int wisdom, int wit, int creativity) {
        super(name, magicPower, distanceTransgression);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    private static int wisdom; // мудрость
    private static int wit; // остроумие
    private static int creativity; // креативность

    public static int getWisdom() {
        return wisdom;
    }

    public static int getWit() {
        return wit;
    }

    public static int getCreativity() {
        return creativity;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}