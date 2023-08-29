public class Hogwarts {

    public Hogwarts(String name, int magicPower, int distanceTransgression) {
        Hogwarts.name = name;
        Hogwarts.magicPower = magicPower;
        Hogwarts.distanceTransgression = distanceTransgression;
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
}
