import org.junit.jupiter.api.Test;

class DrugStoreTest {
    @Test
    public void testAddMedicine(){
        DrugStore drugStore = new DrugStore();
        Medicament med1 = new Medicament("Dextrometorfano", 1234, 2,
                "Apotex", "Jarabe", 30);
        Medicament med2 = new Medicament("Paracetamol", 555, 3, "Vita",
                "Tableta", 35);

        drugStore.addMedicine(med1);
        drugStore.addMedicine(med2);

        drugStore.showMed();
    }

}