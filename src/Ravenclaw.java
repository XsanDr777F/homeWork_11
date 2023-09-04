public class Ravenclaw extends Hogwarts {
    public Ravenclaw(String name, int magicPower, int distanceTransgression, int wisdom, int wit, int creativity) {
        super(name, magicPower, distanceTransgression);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    private  int wisdom; // мудрость
    private  int wit; // остроумие
    private  int creativity; // креативность

    public  int getWisdom() {
        return wisdom;
    }

    public  int getWit() {
        return wit;
    }

    public  int getCreativity() {
        return creativity;
    }
    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name='" + getName() +
                ", magicPower=" + getMagicPower() +
                ", distanceTransgression=" + getDistanceTransgression() +
                "wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
    public void compare(Ravenclaw ravenclaw) {
        if (wisdom + wit + creativity > getWisdom() + getWit() + getCreativity()) {
            System.out.println(ravenclaw.getName() + " сильнее " + getName());
        } else {
            System.out.println(getName() + " сильнее " + ravenclaw.getName());
        }
    }
}