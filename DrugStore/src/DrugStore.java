import java.util.ArrayList;

public class DrugStore {
    String name;
    String address;

    ArrayList<Medicament> medicines = new ArrayList<>();


    public void addMedicine(Medicament medicament){
        medicines.add(medicament);
    }

    public void showMed(){
        for (Medicament medicine:
             medicines) {
            medicine.showInfo();
        }
    }

}
