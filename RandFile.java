import java.io.*;

// public class RandFile {

// public static void main(String[] args) {
//     try {
//         FileOutputStream f1=new FileOutputStream("taylor.txt");
//         String s="Welcome to javaTpoint.";
//         byte b[]=s.getBytes();
//         f1.write(b);
//         f1.close();
//         System.out.println("Success./..");
//     } catch (Exception e) {
//         System.out.println("Error is"+e);
//     }

// }
// }
// }

// import java.io.FileOutputStream;  
// public class FileOutputStreamExample {  
//    public static void main(String args[]){    
//          try{    
//     FileOutputStream fout=new FileOutputStream("taylor.txt");
//           String s="Welcome to javaTpoint.";
//             byte b[]=s.getBytes();//converting string into byte array    
//            fout.write(b);
//             fout.close();    
//         System.out.println("success...");
//           }catch(Exception e){System.out.println(e);}    
//      }
// }

public class RandFile {

    public static void main(String[] args) {
        try {
            FileReader f1=new FileReader("taylor.txt");
            int data;
            while ((data=f1.read())!=-1) {
                System.out.print((char)(data));
                
            }
            
            FileWriter f2=new FileWriter("taylor.txt");
            f2.write(67);
            f2.close();

            while ((data=f1.read())!=-1) {
                System.out.print((char)(data));
                
            }
            
            f1.close();
            // while ((data=f1.read())!=-1) {
            //     System.out.print((char)(data));
                
            // }
        //    FileInputStream in=new FileInputStream("taylor.txt");
           //approach 1
        //    int data;
        //    while((data=in.read())!=-1)
        //    {
        //         System.out.print((char)data);
        //    }
        //    System.out.println();



        //approach 2
        // byte b[]=new byte[1024];
        // in.read(b);
        // System.out.println(new String(b));
        //     System.out.println("Success./..");
        //     in.close();
        } catch (Exception e) {
            System.out.println("Error is"+e);
        }
    
    }
}