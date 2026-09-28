package Exercise10;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpot){
        this.floor = floor;
        this.carpet = carpot;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }




}
