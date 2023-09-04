public class Hogwarts {
    private String name;// имя
    private int magicPower;// магические силы
    private int distanceTransgression;// дистанция трансгрессии

    public Hogwarts(String name, int magicPower, int distanceTransgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.distanceTransgression = distanceTransgression;
    }
    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }
    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", distanceTransgression=" + distanceTransgression +
                '}';
    }
    public void compare(Hogwarts hogwarts) {
        if (magicPower + distanceTransgression > hogwarts.getDistanceTransgression() + hogwarts.getMagicPower()) {
            System.out.println(name + " сильнее " + hogwarts.getName());
        }else{
                System.out.println(hogwarts.getName() + " сильнее " + name);
            }
        }

    public void studentDescription() {//описание студента
        System.out.println("Имя - " + name + ", witchcraft " + getMagicPower() +
                ", transgression " + getDistanceTransgression());
    }

    private int compareMagicPower(Hogwarts student) {
        return magicPower - student.getMagicPower();
    }

    private int compareDisTrans(Hogwarts student) {
        return distanceTransgression - student.getDistanceTransgression();
    }
}
