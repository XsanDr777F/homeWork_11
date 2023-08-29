public class Ravenclaw extends Hogwarts {
    public Ravenclaw(String name, int magicPower, int distanceTransgression, int wisdom, int wit, int creativity) {
        super(name, magicPower, distanceTransgression);
        Ravenclaw.wisdom = wisdom;
        Ravenclaw.wit = wit;
        Ravenclaw.creativity = creativity;
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
    @Override
    public String toString() {
        return "Ravenclaw{" +
                "wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
    public void compare(Ravenclaw ravenclaw) {
        if (wisdom + wit + creativity > getWisdom() + getWit() + getCreativity()) {
            System.out.println(name + " сильнее " + getName());
        } else {
            System.out.println(getName() + " сильнее " + name);
        }
    }
}