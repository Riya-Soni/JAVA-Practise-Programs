
import java.util.ArrayList;
import java.util.Iterator;


public class StringMatching {
    public static void main(String[] args){
        ArrayList tablename = new ArrayList();
            tablename.add("hi");
            tablename.add("hE");
            tablename.add("hR");
            tablename.add("hT");
            Iterator it = tablename.iterator();
            String s="";
            while(it.hasNext()){
                s=(String)it.next();
                System.out.println(s);
                if(s == "hi"){
                    break;
                }
            }
            if(s == "hi"){
                System.out.println("found");
            }
    }
}
