package toSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.security.auth.kerberos.KerberosKey;


public class lengthOfLongestSubstring {
	 public int MylengthOfLongestSubstring(String s) {
		 if(s.length() ==1||s.length() ==0){
			 return s.length();
		 }
		 char strArr[] = s.toCharArray();
	        int length = strArr.length;
	        String str = "";
	        List<Integer> vector = new ArrayList<Integer>();
	        int slen = 0;
	        boolean same = false;
	        int sindex;
	        for(int i = 0;i<strArr.length;i++){
	            for(int j = 0;j<str.length();j++){
	               if(strArr[i]==str.charAt(j)){
	                   same =true;
	                   vector.add(slen);
	                   sindex = slen;
//	                   System.out.println();
	                   slen =0;
	                   System.out.println("len:"+str.length()+","+(i+j-str.length()));
	                   if(i<strArr.length-1){
	                	   System.out.println("i:"+i+"j,"+j+",");
	                	   i = i+j-str.length()+1;
//	                	   System.out.println(i);
	                   }
	                   str = "";
	                   
	                   break;
	               }
	            }
	            
	            if(!same){
	                str +=strArr[i];
	                slen++;
	            }
	            if (str.equals("")) {
	            	str +=strArr[i];
	            	slen++;
					
				}
	            same =false;
	            System.out.println(i+","+str);
	            
	        }
	        if(!same){
	            vector.add(slen);
	        }
	         for(int i = 0;i<vector.size();i++){
	            System.out.print(vector.get(i));
	         }
	         System.out.println();
	        Collections.sort(vector);
	        for(int i = 0;i<vector.size();i++){
	            System.out.print(vector.get(i));
	         }
	        System.out.println(vector.size()-1);
	        return vector.get(vector.size()-1);
	    }
	 public String convert(String s, int numRows) {
		 if(s.length()<=1||numRows<=1){
			 return s;
		 }
	       int len  = s.length();
	       String res = "";
	        for(int i = 0;i<numRows&&i<len;i++){
	        	int index = i;
	        	res+=s.charAt(index);
	        	for(int j = 1;index<len;j++){
	        		if(i ==0||i==numRows-1){
	        			index +=2*numRows-2; 
	        		}
	        		else{
	        			if(j%2==1){
	        				index+=2*(numRows-1-i);
	        			}else{
	        				index +=2*i;
	        			}
	        		}
	        		System.out.println(i+":"+j+":"+index+":"+res);
	        		if (index < len)  
	                {  
	                    res += s.charAt(index);  
	                }  
	        		System.out.println(i+":"+j+":"+res);
	        	}
	        }
	        return  res;
	    }
	/**
	 * @param args
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfLongestSubstring ls = new lengthOfLongestSubstring();
		String l = ls.convert("ABCDEF",3);
		System.out.println("res:"+l);
	}
	
}
