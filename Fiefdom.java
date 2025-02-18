public class Fiefdom extends Kingdom
{
   private int numLords;

   public Fiefdom(String s, int p, int x)
   {
      super(s,p);
      numLords = x;
   }

   public String toString()
   {
      return super.toString() + "\t\t Number of Lords: " + numLords; 
   }
}