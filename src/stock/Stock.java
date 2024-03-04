package stock;

public class Stock {
    private String name;
    private static Stock[] stocks = new Stock[10];

    public Stock(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void initDB() {
        stocks[0] = new Stock("Iron");
        stocks[1] = new Stock("Pan");
        stocks[2] = new Stock("Skis");
        stocks[3] = new Stock("Iron2");
        stocks[4] = new Stock("Vacuum cleaner");
    }

    public static void shawAll() {
        System.out.println("Shaw all: ");
        for(Stock stock: stocks) {
            System.out.println(stock);
        }
    }

    public String toString() {
        return "\nName: " + this.getName();
    }

    public static void main(String[] args) {
        initDB();
        shawAll();
    }
}
