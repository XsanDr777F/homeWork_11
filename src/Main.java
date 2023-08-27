import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри Поттер", 90, 99),
                new Hogwarts("Рон Уизли", 80, 98),
                new Hogwarts("Гермиона Грейнджер", 95, 97),
                new Hogwarts("Захария Смит", 70, 71),
                new Hogwarts("Седрик Диггори", 65, 75),
                new Hogwarts("Джастин Финч-Флетчли", 77, 70),
                new Hogwarts("Чжоу Чанг", 95, 80),
                new Hogwarts("Падма Патил", 93, 90),
                new Hogwarts("Маркус Белби", 89, 75),
                new Hogwarts("Драко Малфой", 90, 99),
                new Hogwarts("Грэхэм Монтегю", 60, 50),
                new Hogwarts("Грегори Гойл", 50, 49),
        };

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 90, 99, 91, 92, 93),
                new Gryffindor("Рон Уизли", 80, 98, 90, 89, 88),
                new Gryffindor("Гермиона Грейнджер", 95, 97, 87, 86, 85),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 70, 71, 90, 75, 70),
                new Hufflepuff("Седрик Диггори", 65, 75, 85, 90, 75),
                new Hufflepuff("Джастин Финч-Флетчли", 77, 70, 88, 91, 82)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 95, 80, 98, 82, 99),
                new Ravenclaw("Падма Патил", 93, 90, 90, 80, 89),
                new Ravenclaw("Маркус Белби", 89, 75, 85, 72, 80)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 90, 99, 89, 95, 93),
                new Slytherin("Грэхэм Монтегю", 60, 50, 80, 85, 82),
                new Slytherin("Грегори Гойл", 50, 49, 70, 74, 71)
        };

        for (int i = 1; i < students.length; i++) {
            Hogwarts hogwarts = students[i];
            System.out.println("имя "+ Hogwarts.getName()+" магические силы "+Hogwarts.getMagicPower()+" расстояние трансгрессии "+Hogwarts.getDistanceTransgression());
        }
    }

}