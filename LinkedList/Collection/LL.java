import java.util.*;

public class LL{

    public static void printLinst(LinkedList<String> list){
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();


        list.addFirst("hell");
        list.addFirst("hey");

        list.addLast("om");
        list.addLast("sah");


        System.out.println(list.size());


    }
}