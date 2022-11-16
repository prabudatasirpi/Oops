
abstract class car{
    void speed() {
        System.out.println("Average speed 100km hr");
    }
    abstract void color();
    abstract void mileage();
    abstract void gear();
}
class bmw extends car{

    @Override
    void color() {
        System.out.println("Bmw color was red");
    }

    @Override
    void mileage() {
        System.out.println("Mileage 25kmpl");
    }

    @Override
    void gear() {
        System.out.println("Automatic gears");
    }
}
class audi extends car{
    @Override
    void color() {
        System.out.println("Audi color was green ");
    }
    @Override
    void mileage() {
        System.out.println("Mileage 20kmpl");
    }
    @Override
    void gear() {
        System.out.println("Manual gears");
    }
    void airbag(){
        System.out.println("Airbag is available");
    }
}
public class Abstractmethod {
    public static void main(String args[]){
        bmw ss = new bmw();
        ss.color();
        ss.gear();
        ss.mileage();

        audi mm = new audi();
        mm.color();
        mm.gear();
        mm.mileage();
        mm.airbag();
    }
}











