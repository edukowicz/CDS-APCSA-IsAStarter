// ISA Starter            A+CR
import java.util.ArrayList;

public class Main 
{
  public static void main(String[] args)
  {     
      Kingdom c1 = new Fiefdom("Colombo", 648034, 3);
      Kingdom c2 = new Kingdom("Moratuwa", 185031);
      Kingdom c3 = new Kingdom("Kandana", 33424);
      Kingdom c4 = new Kingdom("Pettyagoda", 30717);
      Kingdom c5 = new Fiefdom("Devinuwara", 45000, 1);
      Kingdom c6 = new Kingdom("Jaffna", 169102);
      Kingdom c7 = new Fiefdom("Negomb", 137223, 2);
      Kingdom c8 = new Kingdom("Kerunegala", 28571);

      Fiefdom c9 = new Fiefdom("Test", 1, 1);
      // Fiefdom c10 = new Kingdom("Test", 1, 1);
      // Fiefdom c11 = new Kingdom("Test", 1);
      
      // System.out.println(c1.getName());
      // System.out.println(c1.getPop());
      // System.out.println(((Fiefdom)c1).getNumLords());
      
      Kingdom[] dataLands = {c1, c2, c3, c4, c5, c6, c7, c8};
      ArrayList<Kingdom> lands = new ArrayList<Kingdom>();
      for(Kingdom c : dataLands)
         lands.add(c);

      for(Kingdom c: lands)
            System.out.println(c);
      System.out.println();

      int max = c1.getPop();
      String largest = c1.getName();
      for(int i = 0; i < dataLands.length; i++){
        if(dataLands[i].getPop() > max) {
          max = dataLands[i].getPop();
          largest = dataLands[i].getName();
        }
      }
      System.out.println(largest + " is the kingdom with the largest population");

      ArrayList<Fiefdom> fief = new ArrayList<Fiefdom>();
      for(int i = 0; i < dataLands.length; i++) {
        if(dataLands[i] instanceof Fiefdom){
          fief.add((Fiefdom)dataLands[i]);
        }
      }
      System.out.println(fief);
  }
}