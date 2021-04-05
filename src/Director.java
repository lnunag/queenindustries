import java.util.ArrayList;

public class Director extends Manager {

    private int tier;
    private int salary;
    private String name;
    private String department;
    private String title;
    private ArrayList<Employee> reports;
    private int stock;

    public Director(int salary, int stock, int bonus, String name, String department, String title, ArrayList<Employee> reports, int tier) throws Exception {

        super(salary, bonus, name, department, title, reports, tier);

        for(Employee emp : reports) {
            if (emp.getTier() >= 3) throw new Exception("ERROR: cannot supervise an Employee of an equal or greater tier.");
        }

        this.stock = stock;

    }

    public int getStockShares() {
        return stock;
    }

}