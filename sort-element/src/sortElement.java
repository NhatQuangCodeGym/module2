import java.util.LinkedList;
import java.util.Scanner;

public class sortElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ma ban muon sap xep: ");
        String a = scanner.nextLine();
        LinkedList<Character> list = new LinkedList();
        for( int i=1; i<a.length();i++){
            if(!list.contains(a.charAt(i))){
                list.add(a.charAt(i));
            }
        }
        System.out.println(list);
        list.sort((o1, o2) -> o1-o2);
    }
}
