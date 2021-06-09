public class Plate {
    private int food;
    public void setFood(int food) {this.food = food;} // метод не используется, он и не нужен
    public int getFood() {
        return food;
    }
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {

        if (food >= n)
        {
            food -= n;
            return true;

        }
        else System.out.println("Кот просит слишком много");
        return false;
    }

    public void info() {

        System.out.println("В тарелке: " + food);
        if (food == 0) {   /// Почему пополнение еды в методе про вывод информации?
            takeFood();
            System.out.println("Еды в тарелке не осталось, пополняем тарелку");}

    }

    public void takeFood(){  //Если нужно прибавить не 100 , а 40 например, как будем делать?
        if (food <= 0) {
            food = 100;
        }
    }
}