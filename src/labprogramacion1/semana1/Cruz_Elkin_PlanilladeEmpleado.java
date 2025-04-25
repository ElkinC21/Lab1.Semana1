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
public class Cruz_Elkin_PlanilladeEmpleado {    
public static void main(String[]args){

Scanner scanner= new Scanner(System.in);
    System.out.println("Ingrese nombre del empleado:");
   String nombre_empleado= scanner.nextLine();
   System.out.println("Ingrese las horas laborales en el mes:");
    int horas_trabajadas = scanner.nextInt();
    System.out.println("Ingrese la tarifa por hora");
    double tarifaxhora= scanner.nextDouble();
   
   double salario_semanal= horas_trabajadas*tarifaxhora;
   
   System.out.println("----Boleta del empleado----");
   System.out.println("Nombre del empleado: "+nombre_empleado);
   System.out.println("Horas de trabajo mensual: "+ horas_trabajadas);
   System.out.println("Tarifa por hora: "+tarifaxhora);
   System.out.println("Salario del Empleado Semanal: "+salario_semanal);
           
   scanner.close();
    



}

}


