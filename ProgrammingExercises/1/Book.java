public abstract class Book{

    String title;
    double price;

    public Book(){
        title = "";
        price = 0.00;
    }

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
       return this.title;
    }

    public double getPrice(){
        return this.price;
    }

    public abstract void setPrice();

}