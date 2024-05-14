package classes;
public abstract class Vehicle {
    private static int nextId = 1;
    private String make;
    private String model;
    private double cost;
    private int year;
    private int id=1;


    public Vehicle(String make, String model, int year,double cost){
        this.make = make;
        this.model = model;
        this.year=year;
        this.cost=cost;
        this.id=nextId++;
    }
    void drive(){
        System.out.println(this.id + " :"+" "+"You drive"+" "+ this.make+" "+ this.model+" of year"+" "+this.year+" and it costs "+ this.cost + "!");
    }
    void brake (){

        System.out.println("Brake suddenly!");
    }

    public  String toString(){
        return id+" | "+make+" | "+model+" | "+ year+ " | "+ cost;
    }
    public void usage(){
        if (this.year<10) {
            System.out.println("This vehicle is old");
        }else {
            System.out.println("This vehicle is new");
        }
    }

    //GETTERS

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getId(){
        return id;
    }
    public double getCost(){
        return cost;
    }

    //SETTERS
    public void setMake(){
        this.make=make;
    }
    public void setModel(){
        this.model=model;
    }
    public void setYear(){
        this.year=year;
    }
    public void setId(){
        this.id=id;
    }
    public void setCost(){
        this.cost=cost;
    }















}
