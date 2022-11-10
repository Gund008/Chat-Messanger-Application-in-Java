import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.*;
import java.net.Socket;
import java.net.UnknownHostException;


class Client
{
    public static void main(String arg[]) throws  IOException 
    {
      System.out.println("Client Application is running...");
      String s1,s2;
      
      Socket s=new Socket("localhost",1100);   //connection Client To Server("Server name",Port number)

      BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));

      BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

      PrintStream ps=new PrintStream(s.getOutputStream());
    
    
      while(!(s1=brk.readLine()).equals("gn"))
      {
        ps.println(s1);
        s2=br.readLine();
       
        System.out.println("Server says:"+s2);
        System.out.println("Enter message for server:");
      }
      s.close();

      br.close();
      brk.close();
      ps.close();

    }
}