package classes;

public class Bike extends Vehicle implements Parking{
    int cubicCentimetr;
    public Bike(String make, String model, int year, double cost,int cubicCentimetr) {
        super(make, model, year, cost);
        this.cubicCentimetr=cubicCentimetr;

    }
    public void power() {
        System.out.println(cubicCentimetr);
    }

    public Bike(Bike copyBike){
        super(copyBike.getMake(),copyBike.getModel(),copyBike.getYear(),copyBike.getCost());
        this.cubicCentimetr= copyBike.cubicCentimetr;
    }

    @Override
    void drive() {
        System.out.println(this.getId() + " :"+" "+"Bike:"+" "+ this.getMake() +" "+ this.getModel() +" of year"+" "+ this.getYear() +" and it costs "+ this.getCost() + "!");
    }
    public String toString(){
        return super.toString()+" EU | CC:"+cubicCentimetr;
    }
    public void inParking(){
        System.out.println(this.getMake()+" "+this.getModel()+" with ID:"+this.getId()+" is in the Bike Parking");

    }
    public void outParking(){
        System.out.println(this.getMake()+" "+this.getModel()+" with ID:"+this.getId()+" is not in the Bike Parking");

    }
}
