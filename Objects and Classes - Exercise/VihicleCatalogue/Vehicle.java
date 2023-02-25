package VihicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;

    private int horsePower;


    public Vehicle (String type, String model, String color, int horsePower) {
    this.type = type;
    this.model = model;
    this.color = color;
    this.horsePower = horsePower;
}
    public String getModel() {
        return this.model;
    }
    public String getType() {
        return this.type;
    }
    public int getHorsePower() {
        return horsePower;
    }


    @Override
    public String toString() {
        String formattedType = "";
        if(this.type.equals("car")){
            formattedType = "Car";
        } else if (this.type.equals("truck")){
            formattedType = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                formattedType,this.model,this.color,this.horsePower);
    }
}

