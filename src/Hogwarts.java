public class Hogwarts {

    public Hogwarts(String name, int magicPower, int distanceTransgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.distanceTransgression = distanceTransgression;
    }

    protected static String name; // имя
    protected static int magicPower; // магические силы
    protected static int distanceTransgression; // дистанция трансгрессии

    public static String getName() {
        return name;
    }

    public static int getMagicPower() {
        return magicPower;
    }

    public static int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", distanceTransgression=" + distanceTransgression +
                '}';
    }
}
