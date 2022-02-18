
public class Store {
    String[] productNames = {"Mouse", "Keyboard", "Monitor", "RAM", "SDD", "CPU"};
    public static int characters = 56;
    static int answer;
    int actualProduct;
    static Receipt receipt = new Receipt();
    static Products product = new Products();


    public void showHeader() {
        // filling dictionaries

        System.out.println("=".repeat(characters));
        System.out.println("\t\t\tPROGRAM-ONE STORE");
        System.out.println("=".repeat(characters));

    }

    private void showPrincipalMenu() {
        int index = 1;
        System.out.println("-".repeat(characters));
        System.out.println(" \tAvailable products");
        System.out.println("-".repeat(characters));

        for (String product : productNames) {
            System.out.print("\t" + index + ". ");
            System.out.println(product);
            index++;
        }

    }

    private int showMenu() {
        System.out.println("-".repeat(characters));
        System.out.println("\t1. Still shopping here");
        System.out.println("\t2. General Menu");
        System.out.println("\t3. Print receipt");
        System.out.print("Option: ");
        return Utils.sn.nextInt();
    }

    private void makeOption() {

        System.out.println("-".repeat(characters));
        System.out.print("\tSelect option: ");
        answer = Utils.sn.nextInt();
        System.out.println();
        product.sortProduct(answer);
        actualProduct = answer - 1;

    }

    private void purchaseProduct() {
        System.out.println("-".repeat(characters));
        System.out.print("\t Choice a product please: ");
        int indexProduct = Utils.sn.nextInt();
        //checking correct value
        indexProduct--;

        System.out.print("\t Quantity: ");
        int quantity = Utils.sn.nextInt();
        String key = Utils.productCodes[actualProduct];
        String actualCode = key + "-" + product.getDictCodes(key)[indexProduct];
        String actualName = product.getDictProducts(key)[indexProduct];
        double actualPrize = product.getDictPrices(key)[indexProduct];
        receipt.setOrderedItems(quantity, actualName, actualCode, actualPrize);
        System.out.println("-".repeat(characters));

    }

    public static void main(String[] args) {
        Store store = new Store();
        store.showHeader();
        store.showPrincipalMenu();
        store.makeOption();

        boolean condition = true;
        while (condition) {
            store.purchaseProduct();
            int selection = store.showMenu();

            if (selection == 1) {
                product.sortProduct(answer);
                continue;
            } else if (selection == 3) {
                condition = false;
                break;
            }
            store.showHeader();
            store.showPrincipalMenu();
            store.makeOption();
        }
        receipt.showReceipt();

    }
}
