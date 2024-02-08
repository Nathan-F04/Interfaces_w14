package ie.atu;

public class Burger implements MenuItem{
    private String name;
    private double price;
    private String ingredients;

    public Burger(String name,double price,String ingredients){
        this.name=name;
        this.price=price;
        this.ingredients=ingredients;
    }

    public Burger() {
        this.name = " ";
        this.ingredients = " ";
        this.price = 0;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getDescription(){
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
