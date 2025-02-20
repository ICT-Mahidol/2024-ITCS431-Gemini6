public class DealerInstalledOption {
    private String optionCode;
    private String description;
    private double price;

    public DealerInstalledOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Option: " + description + " (Code: " + optionCode + ")");
        System.out.println("Price:" + price + "฿");
    }
}
