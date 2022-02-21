public class Condominium {
    int lineChar = 55;

    void showMenu(){
        System.out.println("=".repeat(lineChar));
        System.out.println(" ".repeat(21) + "Condominium");
        System.out.println("=".repeat(lineChar));
        System.out.println("-".repeat(lineChar));

        System.out.println("\t1. Parcels Size ");
        System.out.println("\t2. Parcels Prices\n");
        System.out.println("\t3. Sold parcels\n");
        System.out.println("\t4. Reserved parcels\n");
        System.out.println("\t5. Free parcels\n");
    }

    void makeOption(int option){
        switch (option){
            case 1:
                Utils.blocksInfo.showBlockInfo();
                break;
            case 2:
                Utils.prices.showBlockInfo();
                break;
            case 3:
                BlocksStatus sold = new BlocksStatus(4);
                sold.showBlockInfo();
                break;
            case 4:
                BlocksStatus reserved = new BlocksStatus(3);
                reserved.showBlockInfo();
                break;
            case 5:
                BlocksStatus free = new BlocksStatus(2);
                free.showBlockInfo();
                break;
            default:
                System.out.println("wrong option");
                break;

        }
    }

    public static void main(String[] args) {
        Condominium condominium = new Condominium();
        condominium.showMenu();
        System.out.print("Option: ");
        int answer = Utils.sn.nextInt();
        condominium.makeOption(answer);
    }
}
