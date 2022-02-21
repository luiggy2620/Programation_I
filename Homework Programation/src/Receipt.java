import java.util.ArrayList;

public class Receipt {
    ArrayList<Integer> quantitiesList = new ArrayList<>();
    ArrayList<String> arrayNames = new ArrayList<>();
    ArrayList<String> arrayCodes = new ArrayList<>();
    ArrayList<Double> arrayPrizes = new ArrayList<>();
    String userName;
    int userNIT;
    int characters = 68;

    public void setOrderedItems(int quantity, String productName, String productCode, double productPrize) {
        quantitiesList.add(quantity);
        arrayNames.add(productName);
        arrayCodes.add(productCode);
        arrayPrizes.add(productPrize);
        System.out.println("\tThe item has been added to your shopping cart ");
    }

    public void showHeader() {
        userData();
        System.out.println("=".repeat(characters));
        System.out.println(" ".repeat(27) + "PROGRAM-ONE STORE");
        System.out.println(" ".repeat(33) + "RECEIPT");
        System.out.println("=".repeat(characters));
        System.out.println("   Customer Name: " + userName);
        System.out.println("   Customer NIT: " + userNIT);
        System.out.println("=".repeat(characters));
        System.out.println("=".repeat(characters));
        System.out.println("\t\t\tProduct" + " ".repeat(23) + "Qty.  " + "Unit price  " + "Price");
        System.out.println("-".repeat(characters));
    }

    private void userData() {
        System.out.println("-".repeat(characters));
        System.out.print("Please insert your name: ");
        userName = Utils.sn.next();
        System.out.print("Please insert your NIT: ");
        userNIT = Utils.sn.nextInt();
        System.out.println();
        System.out.println();
    }

    public void showReceipt() {
        showHeader();
        int index = 0;
        double total = 0;

        for (String code :
                arrayCodes) {
            String name = arrayNames.get(index);
            int quantity = quantitiesList.get(index);
            double prize = arrayPrizes.get(index);
            String subtotal = String.format("%.2f", quantity * prize);


            System.out.println("|" + code + "|  " + name + "(" + quantity +
                    ")" + "\t$" + prize + "\t\t$" + subtotal);
            index++;
            total = total + (prize * quantity);
        }

        String finalValue = String.format("%.2f", total);
        System.out.println("-".repeat(characters));
        System.out.println("Total:".concat(" ".repeat(53)) + "\t$" + finalValue);


    }

}
