public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Person p = new Employee();

        Person pp = new Person();

        emp.setLuong(4.5);
        emp.setTen("Nam");

        p.setTen("Khoa");
//        p.setLuong(3.5);
        emp.thongTin();
        p.thongTin();
    }
}
