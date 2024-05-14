package classes;

public class Car extends Vehicle implements Parking{
    int hp;
    public Car(String make, String model, int year, double cost,int hp) {
        super(make, model, year, cost);
        this.hp=hp;
    }


    public void horsepower(){
        System.out.println(this.hp +" hp");
    }

    public Car(Car copyCar) {
        super(copyCar.getMake(), copyCar.getModel(), copyCar.getYear(), copyCar.getCost());
        this.hp=copyCar.hp;
    }



    @Override
    void drive() {
        System.out.println(this.getId() + " :"+" "+"Car:"+" "+ this.getMake() +" "+ this.getModel() +" of year"+" "+ this.getYear() +" and it costs "+ this.getCost() + "!");
    }
    public String toString(){
        return super.toString()+" EU | Hp:"+ this.hp;
    }
    public void inParking(){
        System.out.println(this.getMake()+" "+this.getModel()+" with ID:"+this.getId()+" is in the Car Parking");
    }
    public void outParking(){
        System.out.println(this.getMake()+" "+this.getModel()+" with ID:"+this.getId()+" is not in the Car Parking");

    }


}
