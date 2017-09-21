//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> phonebook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phonebook.containsKey(s)){
                int phone = phonebook.get(s);
                System.out.println(s + "=" + phone);
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
