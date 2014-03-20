
import java.util.ArrayList;


public class VM {
    Integer R;
    Integer IC;
    Boolean C;
    String Busena;
    Integer PLR;
    ArrayList<String> Atmintis_Arr;
           
    public VM(){
         this.Busena = "NULL";
         this.R = 0;
         this.IC = 0;
         this.C = false;
         this.PLR = 0;
         this.Atmintis_Arr = new ArrayList<String>();
         for (int i = 0;i<300;i++)
         this.Atmintis_Arr.add("    ");
}
}
