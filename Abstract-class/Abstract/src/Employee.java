public class Employee extends Person {
    private int luong;
    public Employee() {
    }
    public int getLuong(){
        return luong;
    }
    public void setLuong(int luong){
        this.luong= luong;
    }
    @Override
    public void print(){
        System.out.println(getName() + " have the salary of: " + getLuong());
    }
}
