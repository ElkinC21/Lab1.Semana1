/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion1.semana1;
import java.util.Scanner;
/**
 *
 * @author elkin
 */
public class Cruz_Elkin_Clics {
 public static void main(String[]args){   

     System.out.println("Ingrese la cantidad de clics y el costo por clic");
Scanner scanner=new Scanner(System.in);
   System.out.print("Clics 1: ");
  int clics1 = scanner.nextInt();
   System.out.print("Costo por clic 1: ");
  double costo1 = scanner.nextDouble();

 System.out.print("Clics 2: ");
 int clics2 = scanner.nextInt();
 System.out.print("Costo por clic 2: ");
 double costo2 = scanner.nextDouble();
System.out.print("Clics 3: ");
 int clics3 = scanner.nextInt();
 System.out.print("Costo por clic 3: ");
 double costo3 = scanner.nextDouble();

 int totalclics = clics1 + clics2 + clics3;
 double subtotal = (clics1 * costo1) + (clics2 * costo2) + (clics3 * costo3);
 double costoPromedio = subtotal / totalclics;
 double isv = subtotal * 0.16;
 double totalconISV = subtotal + isv;
 
 
  System.out.println("Subtotal: " + String.format("%.2f", subtotal));
 System.out.println("ISV 16%: " + String.format("%.2f", isv));
 System.out.println("Total + ISV: " + String.format("%.2f", totalconISV));
System.out.println("Costo promedio por clic: " + String.format("%.2f", costoPromedio));
 }}
