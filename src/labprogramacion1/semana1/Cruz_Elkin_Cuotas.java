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
public class Cruz_Elkin_Cuotas {
public static void main(String[]args){    

Scanner scanner=new Scanner(System.in);

System.out.println("Ingrese el Monto del prestamo");
double monto_prestamo=scanner.nextDouble();
System.out.println("Ingrese el plazo de pago establecido:");
int plazo_pago=scanner.nextInt();
System.out.println("Ingrese el interes mensual aplicado al prestamos:");
double interes_mensual= scanner.nextDouble();
System.out.println("Ingrese la comision por cuota:");
double comision_cuota= scanner.nextDouble();
System.out.println("Ingrese el porcentaje de seguro mensual");
double seguro_mensual= scanner.nextDouble();

double cuota_mensual=(monto_prestamo/plazo_pago)+(monto_prestamo*interes_mensual/100)+comision_cuota+(monto_prestamo*seguro_mensual/100);
double total_pagar=cuota_mensual*plazo_pago;

System.out.println("****Cuotas Mensuales****");
System.out.println("Cuota de pago mensual:HNL. "+cuota_mensual);
System.out.println("Total a pagar: "+total_pagar);
}}
