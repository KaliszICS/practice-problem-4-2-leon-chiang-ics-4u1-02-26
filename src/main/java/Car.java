/**
 * Class defining the details of a car
 * @author Leon Chiang
 * @version 1.0.0
 */

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Variables defining the information of a car
     * @param make Make of the car
     * @param model Model of the car
     * @param year Year the car was released
     * @param price Price of the car
     */

    public Car (String make, String model, int year, double price) {
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    /**
     * Method to get make of the car
     * @return Make of the car
     */
    
    public String getMake(){
        return this.make;
    }

    /**
     * Method to get model of the car
     * @return Model of the car
     */

    public String getModel(){
        return this.model;
    }

    /**
     * Method to get year the car model was released
     * @return Year of the car
     */

    public int getYear(){
        return this.year;
    }

    /**
     * Method to get the price of the car
     * @return Price of the car
     */

    public double getPrice(){
        return this.price;
    }

    /**
     * Sets value of make
     * @param make Make of the car
     */

    public void setMake(String make) {
        this.make=make;
    }

    /**
     * Sets value of model
     * @param model Model of the car
     */

    public void setModel(String model) {
        this.model=model;
    }

    /**
     * Sets value of year
     * @param year Year the car was released
     */

    public void setYear(int year) {
        this.year=year;
    }

    /**
     * Sets value of price
     * @param price Price of the car
     */

    public void setPrice(double price) {
        this.price=price;
    }
}

