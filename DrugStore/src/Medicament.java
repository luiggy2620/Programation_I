public class Medicament {
    String name;
    String laboratory;
    String type;
    int code;
    int doze;
    int temperature;


    public Medicament(String name, int code, int doze, String laboratory, String type, int temperature){
        this.name = name;
        this.code = code;
        this.doze = doze;
        this.laboratory = laboratory;
        this.type = type;
        this.temperature = temperature;
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(type);
        System.out.println(laboratory);
        System.out.println(code);
        System.out.println(doze);
        System.out.println(temperature + "\n");
    }

}
