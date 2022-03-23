package E07ObjectsAndClasses.P06VehicleCatalogue;

import com.sun.source.tree.BreakTree;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private String horsePower;

    public Vehicle(String type, String model, String color, String horsePower){
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString(){
        String typeVehicle = type.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVehicle + "\n" + "Model: " + this.model + "\n" + "Color: " + this.color + "\n" + "Horsepower: " + this.horsePower;
    }
}
