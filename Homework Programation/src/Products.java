import java.util.Dictionary;
import java.util.Hashtable;

public class Products {
    int characters;
    Dictionary<String, String[]> dictProducts;
    Dictionary<String, String[]> dictCodes;
    Dictionary<String, double[]> dictPrices;

    public Products() {
        characters = 56;
        dictProducts = new Hashtable<>();
        dictCodes = new Hashtable<>();
        dictPrices = new Hashtable<>();
        fill_list();
        arrangeList();
    }

    public double[] getDictPrices(String key) {
        return dictPrices.get(key);
    }

    public String[] getDictCodes(String key) {
        return dictCodes.get(key);
    }

    public String[] getDictProducts(String key) {
        return dictProducts.get(key);
    }

    public void fill_list() {
        // Mouse
        String[] moCode = {"LMX", "L25", "MCI", "LVE"};
        String[] mouseNames = {"Logitech MX Master 3", "Logitech M325",
                "Microsoft Classic Intellimouse", "Logitech MX Vertical"};
        double[] moPrice = {77.44, 17.99, 42.19, 82.99};
        dictProducts.put("U", mouseNames);
        dictCodes.put("U", moCode);
        dictPrices.put("U", moPrice);


        //Keyboard
        String[] kCode = {"PRO", "BW3", "MXK", "ERG"};
        String[] keyboardNames = {"SteelSeries Apex Pro", "Razer BlackWidow V3 Pro",
                "Logitech MX Keys", "Logitech ERGO K860"};
        double[] kPrice = {199.99, 225.99, 165.51, 155.39};
        dictProducts.put("K", keyboardNames);
        dictCodes.put("K", kCode);
        dictPrices.put("K", kPrice);

        //Monitor
        String[] mCodes = {"DSE", "XFA", "HPS", "VSE"};
        String[] monitorNames = {"Dell SE2719HR", "Acer XFA240",
                "HP EliteDisplay S14", "ViewSonic Elite XG270QC"};
        double[] mPrices = {299.99, 209.99, 339.99, 419.99};
        dictProducts.put("M", monitorNames);
        dictCodes.put("M", mCodes);
        dictPrices.put("M", mPrices);

        //RAM
        String[] rCodes = {"CSV", "OWL", "HPT", "TTZ"};
        String[] ramNames = {"Corsair Vengeance Pro SL", "OLOy Owl",
                "HyperX Predator RGB", "Teamgroup T-Force Dark Z"};
        double[] rPrices = {94.99, 80.51, 97.51, 55.99};
        dictProducts.put("R", ramNames);
        dictCodes.put("R", rCodes);
        dictPrices.put("R", rPrices);

        //SSD
        String[] ssdCodes = {"980", "KC3", "SN8", "CRU"};
        String[] ssdNames = {"Samsung 980 Pro", "Kingston KC3000",
                "WD Black SN850", "Crucial P5 Plus"};
        double[] ssdPrices = {149.99, 155.64, 158.89, 134.99};
        dictProducts.put("S", ssdNames);
        dictCodes.put("S", ssdCodes);
        dictPrices.put("S", ssdPrices);

        //CPU
        String[] cpuCodes = {"IC9", "IC7", "AMD", "I9K"};
        String[] cpuNames = {"Intel Core i9-12900K", "Intel Core i7-12700K",
                "AMD Ryzen 9 5950X", "Intel Core i9-10900K"};
        double[] cpuPrices = {579.52, 374.99, 799.21, 488.21};
        dictProducts.put("C", cpuNames);
        dictCodes.put("C", cpuCodes);
        dictPrices.put("C", cpuPrices);

    }

    public void sortProduct(int option) {
        switch (option) {
            case 1:
                Utils.showHeader();
                showProductHeader("Mouse");
                showProducts("U");
                break;
            case 2:
                Utils.showHeader();
                showProductHeader("Keyboard");
                showProducts("K");
                break;
            case 3:
                Utils.showHeader();
                showProductHeader("Monitor");
                showProducts("M");
                break;
            case 4:
                Utils.showHeader();
                showProductHeader("RAM");
                showProducts("R");
                break;
            case 5:
                Utils.showHeader();
                showProductHeader("SDD");
                showProducts("S");
                break;
            case 6:
                Utils.showHeader();
                showProductHeader("CPU");
                showProducts("C");
                break;
            default:
                System.out.println("Wrong option try again");
                break;
        }
    }

    void showProductHeader(String productName) {
        String etiquette = productName + " Models";
        int remaining = 39 - etiquette.length();
        System.out.println(" ".repeat(12) + etiquette + " ".repeat(remaining) + "Price");
        System.out.println("-".repeat(characters));
    }

    void showProducts(String productCode) {
        String[] codes = dictCodes.get(productCode);
        String[] names = dictProducts.get(productCode);
        double[] prices = dictPrices.get(productCode);
        int cycle = 1;
        int index = 0;
        while (cycle <= 4) {
            System.out.print("|" + productCode + "-" + codes[index] + "|  ");
            System.out.print(cycle + ". " + names[index]);
            System.out.println("\t|$" + prices[index]);
            index++;
            cycle++;
        }
        System.out.println();
    }

    void arrangeList() {

        for (String code : Utils.productCodes) {
            int remaining;
            int index = 0;
            String[] unsortedList = dictProducts.get(code);
            String[] arrangedList = new String[4];
            for (String item : unsortedList) {
                remaining = 32 - item.length();
                arrangedList[index] = item + " ".repeat(remaining);
                index++;
            }
            dictProducts.put(code, arrangedList);
        }
    }

}
