package Paneles;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
 
public class GenerarCodigo{
    ResultSet rst;
public String idMasUno(ResultSet rst){
        int maxReg=0;
        int contChar=0;       
        String id="";
        StringBuilder ceros= new StringBuilder();
        try {
            
            while(rst.next()){
                id=rst.getString(1);
                contChar=0;
                for(int i=0;i<id.length();i++){
                    char c=id.charAt(i);
                    if(Character.isLetter(c)){
                        contChar++;         
                    }
                }
                if(maxReg<Integer.parseInt(id.substring(contChar))){
                    maxReg=Integer.parseInt(id.substring(contChar));
                }
            }
            rst.close();
            maxReg++;            
            for(int i=0;i<id.length()-contChar-String.valueOf(maxReg).length()+1;i++){
                if(i==id.length()-contChar-String.valueOf(maxReg).length()){
                    ceros.append(maxReg);
                    break;
                }
                ceros.append("0");
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return String.valueOf(ceros);
}
    
}
