import java.util.*;

public class LL{

    public static void printLinst(LinkedList<String> list){
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ->");
        }
        System.out.println("null");
    }

    public static void delete(LinkedList<String> list, int postion){
         
        if(list.size()>=postion){
            for(int i =0;i<list.size();i++){
                if(i== postion-1){
                    list.remove(i);
                }

            }
        }
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();


        list.addFirst("hell");
        list.addFirst("hey");

        list.addLast("om");
        list.addLast("sah");


        System.out.println("The size of linked list: "+list.size());
        printLinst(list);

        delete(list, 4);

        printLinst(list);



    }
}