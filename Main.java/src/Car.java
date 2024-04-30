class Car_1 {
    String Color;
    String Number;
    String Status;
    String Driver_Name;

    private Car_1() {

    }

    Car_1(String Color) {
        this.Color = Color;
    }

    Car_1(String Number, String Color) {
        this(Color);
        this.Number = Number;

    }

    Car_1(String Status, String Number, String Color) {
        this(Number,Color);
        this.Status = Status;
    }
    Car_1(String Driver_Name,String Status,String Number,String Color){
        this(Status,Number,Color);
        this.Driver_Name=Driver_Name;
    }

    void Display(){
        System.out.println("\n"+Color+"\n"+Number+"\n"+Status+"\n"+Driver_Name);
    }

}

public class Car{
    public static void main(String[] args) {
        Car_1 C1 = new Car_1("Blue");
        C1.Display();
        Car_1 C2 = new Car_1("WB-52-G-2905","Black");
        C2.Display();
        Car_1 C3 = new Car_1("Expierd","WB-50-W-5010","Orange");
        C3.Display();
        Car_1 C4 = new Car_1("Tonay Sadhukhan","Running","WB-52-GS-9755","Red");
        C4.Display();
    }
}