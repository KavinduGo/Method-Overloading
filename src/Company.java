public class Company {
    public void get(String name, int id){
        System.out.println("Company Name : " + name);
        System.out.println("Company ID : " + id);

    }
    public void get(int id, String name){
        System.out.println("Company ID : " + id);
        System.out.println("Company Name : " + name);


    }

}
class overLoad{
    public static void main(String[] args) {
        Company c = new Company();
        c.get("AUDI",1);
        c.get("BMW",2);
    }
}
