import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Gryffindor("Гарри Поттер", 90, 99, 91, 92, 93),
                new Gryffindor("Рон Уизли", 80, 98, 90, 89, 88),
                new Gryffindor("Гермиона Грейнджер", 95, 97, 87, 86, 85),
                new Slytherin("Драко Малфой", 90, 99, 89, 95, 93),
                new Slytherin("Грэхэм Монтегю", 60, 50, 80, 85, 82),
                new Slytherin("Грегори Гойл", 50, 49, 70, 74, 71),
                new Ravenclaw("Чжоу Чанг", 95, 80, 98, 82, 99),
                new Ravenclaw("Падма Патил", 93, 90, 90, 80, 89),
                new Ravenclaw("Маркус Белби", 89, 75, 85, 72, 80),
                new Hufflepuff("Захария Смит", 70, 71, 90, 75, 70),
                new Hufflepuff("Седрик Диггори", 65, 75, 85, 90, 75),
                new Hufflepuff("Джастин Финч-Флетчли", 77, 70, 88, 91, 82)

        };

        for (int i = 0; i < hogwarts.length; i++) {
            for (int j = i + 1; j < hogwarts.length - 1; j++) {
                hogwarts[i].compare(hogwarts[j]);
            }
        }
        System.out.println();
        Gryffindor potter = (Gryffindor) hogwarts[0];
        Gryffindor uizli = (Gryffindor) hogwarts[1];
        Gryffindor granger = (Gryffindor) hogwarts[2];

        Slytherin malfoi = (Slytherin) hogwarts [3];
        Slytherin montegry = (Slytherin) hogwarts [4];
        Slytherin goil = (Slytherin) hogwarts [5];

        Ravenclaw chang = (Ravenclaw) hogwarts [6];
        Ravenclaw patil = (Ravenclaw) hogwarts [7];
        Ravenclaw belbi = (Ravenclaw) hogwarts [8];

        Hufflepuff smith = (Hufflepuff) hogwarts [9];
        Hufflepuff diggory = (Hufflepuff) hogwarts [10];
        Hufflepuff finch = (Hufflepuff) hogwarts [11];


        potter.compare(uizli);
        System.out.println();
        malfoi.studentDescription();
    }
}