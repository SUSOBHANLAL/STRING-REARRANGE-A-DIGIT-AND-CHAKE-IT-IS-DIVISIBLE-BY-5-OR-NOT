package rearrangemul5;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int flag = 0;
		    int len= sc.nextInt();
		    
		    String s = sc.next();
		    
		    for(int k=0 ;k<len;k++){
		        if(s.charAt(k)=='5' || s.charAt(k) == '0'){
		            flag = 1;
		        }
		    }
		    
		    if(flag==1){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		    
		}
		
	
		
	}

}
