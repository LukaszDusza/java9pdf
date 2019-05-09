package zadanieRestauracja;

public enum Dish {

    Lody("8pln"),
    Gyros("12pln"),
    Tortilla("13pln"),
    Pizza("18"),
    Stek("30pln");


    private String price;

    Dish(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}
