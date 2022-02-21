import java.util.Dictionary;
import java.util.Hashtable;

public class BlocksStatus {
    int lineChar;
    int statusIndex;
    Dictionary<String, double[]> blocks;

    public BlocksStatus(int index){
        statusIndex = index;
        blocks = new Hashtable<>();
        lineChar = 55;
        fillList();
    }

    void fillList(){
        //red block
        double[] rSize = {40.6, 34.9, 4, 1, 1};
        blocks.put("R", rSize);

        //orange block
        double[] oSize = {28.15, 19.6, 1, 2, 0};
        blocks.put("O", oSize);

        //yellow block
        double[] ySize = {20.9, 15.5, 1, 1, 1};
        blocks.put("Y", ySize);

        //green block
        double[] gSize = {28.0, 20.0, 1, 1, 1};
        blocks.put("G", gSize);

        //blue block
        double[] bSize = {32.6, 24.0, 4, 0, 0};
        blocks.put("B", bSize);
    }

    void showBlockInfo(){
        for (int i = 0; i <= 4; i++) {
            // Title
            String name = Utils.blocksNames[i];
            String colorCode = String.valueOf(name.charAt(0));
            int parcelQuantity = (int) blocks.get(colorCode)[statusIndex];

            System.out.println("=".repeat(lineChar));
            System.out.println(" ".repeat(21) + name + " BLOCK");
            System.out.println("=".repeat(lineChar));

            // Details
            System.out.println(parcelQuantity + " Parcels");
            System.out.println("\n");
        }
    }
}
