package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);
       int i=1;
       String s="";
      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));

          /**
           구현하시오. 
          **/
         while((s=inputStream.readLine()) != null){
        	 outputStream.println(i+" "+s);
        	 System.out.println(i+ " " + s);
        	 i++;
         }
         inputStream.close( );
         outputStream.close( );
      }catch(IOException e){
    	  System.err.println(e);
      }
      
      /** catch() 구문 작성하시오 **/

   }
}