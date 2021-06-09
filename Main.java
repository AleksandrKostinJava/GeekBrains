public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 50, false),
                new Cat("Vasiliy", 50, false),
                new Cat("Kuzma", 20, false),
                new Cat("Masya", 101, false)
        };



        Plate plate = new Plate(100);
        System.out.println(plate.getFood());

        for (int i = 0; i < cats.length; i++) {               //Метод написан некорректно
            cats[i].eat(plate, cats[i].getSatiety());
            plate.info();
            String sat = String.valueOf(cats[i].getSatiety());  // Это ненужный код и очень непонятный.
                                                                //ValueOf тут ни к чему, String тоже,
                                                                // сравнивания и присвоения не нужны.
                                                                // Этот код должен быть отдельынм методом в классе Cat, потому что здесь работа с котами.
            if (sat == "true") {sat = "сытый";}
            else {sat = "голодный";}
            System.out.println((cats[i].getName())+" " + sat);
        }


   }
}
