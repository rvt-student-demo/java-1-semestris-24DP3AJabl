package rvt;

import java.util.*;

public class mooc32 {
    public static void main(String[] args) {
        //onlyTheseNumbers();
        //listSize();
        //onTheList();
        //removeLast();
    }
    public static void onlyTheseNumbers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 1;;) {
            i = scanner.nextInt();
            if (i == -1) {
                break;
            }
            list.add(i);
        }

        System.out.print("From where?");
        int from = scanner.nextInt();
        System.out.print("to where?");
        int to = scanner.nextInt();

        for (;from <= to;from ++) {
            System.out.println(list.get(from));
        }
    }
    public static void listSize(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String i = "a";

        for (;i != "";) {
            i = scanner.nextLine();
            list.add(i);
        }

         System.out.print("In total: " + (list.size() - 1));
     }
    public static void onTheList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String i = "a";

        for (;i != "";) {
            i = scanner.nextLine();
            list.add(i);
        }

         System.out.print("Seach for?");
         String search = scanner.nextLine();
         boolean found = false;

        for (int j = 0;j <= list.size() - 1; j ++) {
            if (list.get(j) == search) {
                System.out.print(search + " was found!");
                found = true;
            }
        }
        if (found == false) {
            System.out.print(search + " was not found!");
        }
    }
    public static void removeLast(){
        ArrayList<String> buffer = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);
        for (int i = 0; i < strings.size()-1; i++) {
            buffer.add(strings.get(i));
        }
        strings = buffer;
        
        System.out.println(strings);
    }
}
