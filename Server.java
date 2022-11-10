import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
        public static void main(String arg[]) throws  Exception 
        {
          System.out.println("Server Application is running.........................");
          String s1,s2;
          
          ServerSocket ss=new ServerSocket(1100);
          Socket s=ss.accept();

          System.out.println("Connection Successul............");
          
          BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
    
          BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    
          PrintStream ps=new PrintStream(s.getOutputStream());
        
        
          while((s1=br.readLine())!=null)
          {
              System.out.println("Client Says:"+s1);
              System.out.println("Enter the massage for Client:");
              s2=brk.readLine();
              ps.println(s2);
          }
          
          s.close();
          ss.accept();  //request accept
          br.close();
          brk.close();
          ps.close();
    
        }
    }    

