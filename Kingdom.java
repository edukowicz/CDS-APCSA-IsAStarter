
public class Kingdom
{
   private String name;
   private int population;

   public Kingdom()
   {
      name = "Default";
      population = 0;
   }

   public Kingdom(String n, int p)
   {
      name = n;
      population = p;
   }

   public String toString()
   {
      String output = "";
      if(name.length() > 8)
         output += "Kingdom Name: "+name+"\tPop: "+population;
      else
        output += "Kingdom Name: "+name+"\t\tPop: "+population;
      return output;
   }
}