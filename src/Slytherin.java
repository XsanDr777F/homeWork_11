public class Slytherin extends Hogwarts{
    public Slytherin(String name, int magicPower, int distanceTransgression, int cunning, int determination, int ambition) {
        super();
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

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public Slytherin(int cunning, int determination, int ambition) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }
}
