package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        MenuItem[] menuItems=new MenuItem[]{
          //add menu items here


            new Burger("Cheese Burger",2.5,"Buns,Hamburger,Cheese,Lettuce"),
            new Burger("Regular Burger",2.25,"Buns,Hamburger,Lettuce"),
            new Pizza("Pepperoni Pizza",14.0,"Cheese,Mozzarella,Dough,Tomato sauce"),
            new Salad("Regular Salad",5.75,"Lettuce,Chicken,Tomatoes"),
            new Dessert("Sundae",9.80,"Ice cream,Chocolate sauce,Cherries,Cream")

        };



        for(MenuItem menuItem:menuItems){
          System.out.println("Name:"+menuItem.getName());
          System.out.println("Description:"+menuItem.getDescription());
          System.out.println("Price: €"+menuItem.getPrice()+"\n");
        };

        double totalCost=0;
        for(MenuItem menuItem:menuItems){
            totalCost+=menuItem.getPrice();
        };

        System.out.println("Total cost: €"+totalCost);
    }
}