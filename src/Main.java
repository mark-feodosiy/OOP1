public class Main {
    public static void main(String[] args) {
        //Домашка ООП1
        Gryffindor a1 = new Gryffindor("Гарри Поттер",0, 100, 100, 100, 100);
        Gryffindor a2 = new Gryffindor("Гермиона Грейнджер", 70, 80, 90, 100, 80);
        Gryffindor a3 = new Gryffindor("Рон Уизли", 60, 70, 80, 90, 80);
        Hufflepuff b1 = new Hufflepuff("Захария Смит", 29, 50, 80, 62, 80);
        Hufflepuff b2 = new Hufflepuff("Седрик Диггори", 80, 40, 20, 12, 50);
        Hufflepuff b3 = new Hufflepuff("Джастин Финч-Флетчли", 40, 30, 60, 72, 56);
        Ravenclaw c1 = new Ravenclaw("Чжоу Чанг", 70, 80, 90, 52, 75);
        Ravenclaw c2 = new Ravenclaw("Падма Патил", 50, 50, 70, 62, 45);
        Ravenclaw c3 = new Ravenclaw("Маркус Белби", 40, 68, 94, 47, 67);
        Slytherin d1 = new Slytherin("Драко Малфой", 20, 30, 40, 50, 70, 90);
        Slytherin d2 = new Slytherin("Грэхэм Монтегю", 40, 40, 60, 80, 80, 67);
        Slytherin d3 = new Slytherin("Грегори Гойл", 50, 60, 70, 90, 67, 82);
        System.out.println(a1);
        a1.compare(d2);
        a1.compare(a2);


        //System.out.println(a1.getWitchcraft());
    }
}