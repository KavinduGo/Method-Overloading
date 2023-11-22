public  class methodOverloading {

    static int add(int a, int b) {
        return a + b ;
    }
    static int add(int a, int b, int c) {
        return a + b + c ;

    }

    public static void main(String[] args) {
        System.out.println(methodOverloading.add(54,25));
        System.out.println(methodOverloading.add(25,35,45));

    }
}