package main;

 import java.net.*;
 import java.io.*;
import javax.swing.JOptionPane;

 public class Main {
  public static void main(String[] args) {
      int porta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a porta"));
      String endereco = JOptionPane.showInputDialog(null, "Digite o endereço");
   try {
      Socket sock = new Socket(endereco, porta);
      PrintWriter out = new  
                 PrintWriter(sock.getOutputStream(),true);
      BufferedReader in = new BufferedReader(new   
                 InputStreamReader(sock.getInputStream()));
      String linha="";
      out.println("GET / HTTP/1.0\n");
      while ((linha = in.readLine()) != null) {
  System.out.println("echo: " + linha);  
      }
     }catch ( IOException e ) {
 System.err.println( "Problemas de IO" );
     }
  }
 }