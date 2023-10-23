import java.util.ArrayList;
import java.util.List;

class Shops {
    private int shopId;
    private int employeeId;
    private String shopName;
    private List<String> itemList;

    public Shops(int shopId, int employeeId, String shopName) {
        this.shopId = shopId;
        this.employeeId = employeeId;
        this.shopName = shopName;
        this.itemList = new ArrayList<>();
    }

    public void shopDetails() {
        System.out.println("Shop ID: " + shopId);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Shop Name: " + shopName);
    }

    public void itemDetails() {
        for (String item : itemList) {
            System.out.println("Item: " + item);
        }
    }

    public void buy() {
        System.out.println("Buying from shop");
    }
}