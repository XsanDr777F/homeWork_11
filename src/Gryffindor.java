public class Gryffindor extends Hogwarts {
    public Gryffindor(String name, int magicPower, int distanceTransgression, int nobility, int honor, int brave) {
        super();
    }

    private static int nobility; // благородство
    private static int honor; // честь
    private static int brave; // храбрость

    public static int getNobility() {
        return nobility;
    }

    public static int getHonor() {
        return honor;
    }

    public static int getBrave() {
        return brave;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public Gryffindor(int nobility, int honor, int brave) {
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }


}