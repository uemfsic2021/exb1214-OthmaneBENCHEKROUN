public class Palindrome{
    public static boolean is_palindrome(String s)
    {
      boolean is_palindrome = false;
        for (int i = 0; i<=s.length()-1;i++){
           if(s.charAt(i)==s.charAt(s.length()-1-i)){
             return true;
           }   
        }
        return false;
    }
}
