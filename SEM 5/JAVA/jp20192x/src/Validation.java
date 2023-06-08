public class Validation {

    public static boolean isValidNumber(String s)
    {
        byte b[]=s.getBytes();
        for(byte x:b)
        {
           if(x<48 || x>57)
               return false;
        }
        
        return true;
    }
    
}
