public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person sarah = new Person("Sarah", 18);
        //sarah.name = "Sarah";
        //sarah.age = 18;
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        Person john = new Person("John", 10);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());
        sarah.setage(30);
        System.out.println("sarah.age = " + sarah.getAge());
    }
}
