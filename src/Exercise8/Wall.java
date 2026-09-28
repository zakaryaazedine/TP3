package Exercise8;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        width = 0;
        height=0;
    }

    public Wall(double width,double height){
        if(width<0) this.width=0;
        else this.width=width;
        if(height<0) this.height=0;
        else this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double x){
        if(x<0) this.width=0;
        else this.width=x;
    }

    public void setHeight(double x){
        if(x<0) this.height=0;
        else this.height =x;
    }

    public double getArea(){
        return this.width*this.height;
    }









}
