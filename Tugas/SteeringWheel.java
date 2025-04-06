class SteeringWheel {  
    private String material;  

    public SteeringWheel(String material) {  
        this.material = material;  
    }  

    public String getMaterial() {  
        return material;  
    }  
}

class Car {  
    private SteeringWheel steeringWheel;  

    public Car(String material) {  
        this.steeringWheel = new SteeringWheel(material);  
    }  

    public void showDetails() {  
        System.out.println("Car has a steering wheel made of: " + steeringWheel.getMaterial());  
    }  
}
