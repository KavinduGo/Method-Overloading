public class Programing {

    String language;

    Programing() {
        this.language = "java";

    }
    Programing(String language){
        this.language = language;

    }
    public void getName(){
        System.out.println("Programing language : " + this.language);
    }

    public static void main(String[] args) {
        Programing pr = new Programing();
        Programing pr1 = new Programing("python");
        pr.getName();
        pr1.getName();
    }

}
