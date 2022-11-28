import java.util.*;
class ChartOuccrence
{
public static void main(String args[])
	{
		String s="kaaamesh";
    int distinct = 1 ;

    for (int i = 0; i < s.length(); i++) {

        for (int j = i+1; j < s.length()-i; j++) {

            if(s.charAt(i)==s.charAt(j))
            {
                distinct++;

            }
        }   
        if(distinct>1){
        System.out.println(s.charAt(i)+"--"+distinct);
        String d=String.valueOf(s.charAt(i)).trim();
        s=s.replaceAll(d,"");
        distinct=0;
        }
     }
	}
}	