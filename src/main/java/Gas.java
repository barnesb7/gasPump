public class Gas {

    private String typeOfGas;
    private double price;


    public Gas(String typeOfGas, double price){
        this.typeOfGas = typeOfGas;
        this.price = price;
    }

    public String getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
