public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setname("Hung");
        System.out.println(p1.getName());
        p1.print();
        Person p2 = new Employee();
        p2.setname("Quang");
        ((Employee)p2).setLuong(5000);
        p2.print();
    }
}
