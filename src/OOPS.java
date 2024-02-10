class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void details(){
        System.out.println(color+" - "+type);
    }
    public void printColor(String color){
        System.out.println("color: "+color);
    }
    Pen(String color,String type){
        this.color=color;
        this.type=type;
        System.out.println("constructor created");
    }
}


public class OOPS {
    public static void main(String[] args) {
        Pen myPen=new Pen("blue","gel");
        myPen.write();
        myPen.details();


    }
}
