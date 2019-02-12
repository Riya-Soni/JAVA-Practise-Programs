public class StringComparision {
    public static void main(String[] args){
        String s1= "GitHub";
        String s2 = "GitHua";
        
        int i = s1.compareTo(s2);
        System.out.println(i);
        }
}
/*
this will check the string as per dictionary sequence by default,
that means no  restriction for string length
but this is case sensitive so, it will arrange Capital letters first then according their UNICODE value
if number came, they before any letter
*/
