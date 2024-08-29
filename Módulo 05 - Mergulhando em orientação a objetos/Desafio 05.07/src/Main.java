public class Main {
    public static void main(String[] args) {

        Dog albert = new Dog();
        Dog alfred = new Dog();
        Person me = new Person();
        Person he = new Person();

        he.name = "Alfred";
        me.name = "Gustavo Carvalho";

        albert.name = "Albert";
        albert.race = "Husky";
        albert.sex = "Male";
        albert.age = 4;
        albert.owner = me;

        albert.owner = he;

        alfred.name = "Alfred";
        alfred.race = "Poddle";
        alfred.sex = "Male";
        alfred.age = 2;
        alfred.owner = me;

        Dog i = new Dog();

        i = alfred;

        System.out.printf("Dog's name : %s%n", albert.name);
        System.out.printf("Characteristics: race = %s, sex = %s, age = %d%n", albert.race, albert.sex, albert.age);

        System.out.println();

        System.out.printf("Dog's name : %s%n", alfred.name);
        System.out.printf("Characteristics: race = %s, sex = %s, age = %d%n", alfred.race, alfred.sex, alfred.age);

    }
}
