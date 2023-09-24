package GroupTask;

public class Car {
    int carPrice;
    String carColor;
    public Car(int carPrice,String carColor){
        this.carPrice=carPrice;
        this.carColor=carColor;
    }
    double calculateSalePrice(){
        return carPrice;
    }
}
class Truck extends Car{
    double weight;
    public Truck(int carPrice,String carColor,double weight){
        super(carPrice,carColor);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){
        if(weight>2000){
            return super.calculateSalePrice()*0.10;
        }else{
            return super.calculateSalePrice()*0.20;
        }
    }
}
class Sedan extends Car{
    int length;
    public Sedan(int carPrice,String carColor,int length){
        super(carPrice,carColor);
        this.length=length;
    }
    @Override
    double calculateSalePrice(){
        if(length>20){
            return super.calculateSalePrice()*0.05;
        }else{
            return super.calculateSalePrice()*0.10;
        }
    }
}
class CarTester{
    public static void main(String[] args) {
        Truck t=new Truck(30000,"Black",2000);
        System.out.println("Truck final price is "+t.calculateSalePrice());
        Sedan s=new Sedan(20000,"Red",100);
        System.out.println("Sedan final price is "+s.calculateSalePrice());
    }
}
