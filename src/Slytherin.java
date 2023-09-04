public class Slytherin extends Hogwarts {
    public Slytherin(String name, int magicPower, int distanceTransgression, int cunning, int determination, int ambition) {
        super(name, magicPower, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    private  int cunning; // хитрость
    private  int determination;// решительность
    private  int ambition;// амбициозность

    public  int getCunning() {
        return cunning;
    }

    public  int getDetermination() {
        return determination;
    }

    public  int getAmbition() {
        return ambition;
    }
    @Override
    public String toString() {
        return "Slytherin{" +
                "name='" + getName() +
                ", magicPower=" + getMagicPower() +
                ", distanceTransgression=" + getDistanceTransgression() +
                "cunning=" + getCunning() +
                ", determination=" + getDetermination() +
                ", ambition=" + getAmbition() +
                '}';
    }
    public void compare(Slytherin slytherin) {
        if (cunning + determination + ambition > getCunning() + getDetermination() + getAmbition()) {
            System.out.println(slytherin.getName() + " сильнее " + getName());
        } else {
            System.out.println(getName() + " сильнее " + slytherin.getName());
        }
    }
}
