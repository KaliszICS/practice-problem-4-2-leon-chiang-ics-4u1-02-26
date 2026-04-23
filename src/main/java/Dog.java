/**
 * Class defining the traits of a dog
 * @author Leon Chiang
 * @version 1.0.0
 */

class Dog {
    private String name;
    private String breed;
    private int weight;

    /**
     * Variables defining the traits of the dog
     * @param name Name of the dog
     * @param breed Breed of the dog
     * @param weight Weight of the dog
     */

    public Dog(String name, String breed, int weight) {
        this.name=name;
        this.breed=breed;
        this.weight=weight;
    }

    /**
     * Method that gets the name of the dog
     * @return Returns the value of name
     */

    public String getName() {
        return this.name;
    }

    /**
     * Method that gets the breed of the dog
     * @return Returns the value of breed
     */

    public String getBreed() {
        return this.breed;
    }

    /**
     * Method that returns the weight of the dog
     * @return Returns the value of weight
     */

    public int getWeight() {
        return this.weight;
    }

    /**
     * Method that sets the value of name
     * @param name Name of the dog
     */

    public void setName(String name) {
        this.name=name;
    }

    /**
     * Method that sets the value of breed
     * @param breed Breed of the dog
     */

    public void setBreed(String breed) {
        this.breed=breed;
    }

    /**
     * Method that sets the value of weight
     * @param weight Weight of the dog
     */

    public void setWeight(int weight) {
        this.weight=weight;
    }

}