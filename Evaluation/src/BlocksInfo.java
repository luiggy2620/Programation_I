import java.util.Dictionary;
import java.util.Hashtable;

public class BlocksInfo {
    int lineChar;
    Dictionary<String, double[]> blocks;

    public BlocksInfo(){
        blocks = new Hashtable<>();
        lineChar = 55;
        fillList();
    }

    void fillList(){
        //red block
        double[] rSize = {40.6, 34.9, 6};
        blocks.put("R", rSize);

        //orange block
        double[] oSize = {28.15, 19.6, 3};
        blocks.put("O", oSize);

        //yellow block
        double[] ySize = {20.9, 15.5, 3};
        blocks.put("Y", ySize);

        //green block
        double[] gSize = {28.0, 20.0, 3};
        blocks.put("G", gSize);

        //blue block
        double[] bSize = {32.6, 24.0, 4};
        blocks.put("B", bSize);
    }

    void showBlockInfo(){
        for (int i = 0; i <= 4; i++) {
            // Title
            String name = Utils.blocksNames[i];
            String colorCode = String.valueOf(name.charAt(0));
            double height = blocks.get(colorCode)[0];
            double width = blocks.get(colorCode)[1];
            String surface  = String.format("%.2f", height*width);
            int parcelQuantity = (int) blocks.get(colorCode)[2];

            System.out.println("=".repeat(lineChar));
            System.out.println(" ".repeat(21) + name + " BLOCK");
            System.out.println("=".repeat(lineChar));

            // Details
            System.out.println("   CODE" + "\t\t" + "HEIGHT[m]" + "\t\t" + "WIDTH[m]" + "\t\t" + "SURFACE[m2]");
            System.out.println("-".repeat(lineChar));
            for (int parcel = 1; parcel < parcelQuantity; parcel++) {
                System.out.print("|" + colorCode + "-00" + parcel + "\t\t" );
                System.out.println("|" + height + "\t\t" + "|" + width + "\t\t" + "|" + surface);
            }
            System.out.println("\n");
        }
    }
}
