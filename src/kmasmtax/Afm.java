/*
 *One class to check if a string from afm isValid(Greek AFM)
 */
package kmasmtax;

/**
 * @author MeTaXaS4
 */

public class Afm {
    static boolean afmIsValid(String afm){
        try{
            if (Integer.parseInt(afm)==0)
                return false;
        }
        catch (NumberFormatException ex){
            return false;
        }
        char[] afmCharArray = afm.toCharArray();
        String localString;
        int lastdigit;
        int mask=256,sum=0,ipoloipo;


        if (afm.length()!=9)
            return false;
        for (int i=0;i<8;i++){
            localString=String.copyValueOf(afmCharArray,i,1);
            int local=Integer.parseInt(localString);
            sum+=mask*local;
            mask/=2;
        }
        ipoloipo=sum%11;
        if (ipoloipo==10)
            lastdigit=0;
        else
            lastdigit=ipoloipo;
        return (lastdigit==Integer.parseInt(String.copyValueOf(afmCharArray,8,1)));
    }
/*
    public static void main(String args[]) {
        String afm = "15661646";
        System.out.println(Afm.afmIsValid(afm));
    }
*/
}

