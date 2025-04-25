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
public class Cruz_Elkin_Formulas {
public static void main(String[]args){    

Scanner scanner= new Scanner(System.in);

System.out.println("Ingrese los datos para completar esta formula a/b+c/d");
System.out.println("Ingrese numerador a");
double numerador_a_1= scanner.nextDouble();
System.out.println("Ingrese denominador b");
double denominador_b_1= scanner.nextDouble();
System.out.println("Ingrese numerador c");
double numerador_c_1= scanner.nextDouble();
System.out.println("Ingrese denominador d ");
double denominador_d_1= scanner.nextDouble();

double resultado1= (numerador_a_1/denominador_b_1)+(numerador_c_1/denominador_d_1);
System.out.println("El resultado es: "+ resultado1);


System.out.println("Ingrese los datos para completar esta formula 1/(x-5)-3xy/4");
System.out.println("Ingrese el valor de x:");
double valorx_2=scanner.nextDouble();
System.out.println("Ingrese el valor de y:");
double valory_2=scanner.nextDouble();

double resultado2= (1/(valorx_2-5)-(3*valorx_2*valory_2));
System.out.println("El resultado es: "+ resultado2);

double resultado3=(1.0/2)+7;
System.out.println("El resultado de esta formula es: "+ resultado3);

double resultado4=7+(1.0/2);
System.out.println("El resultado de esta formula es:"+ resultado4 );

System.out.println("Ingrese los datos para completar esta formula (a^2)/(b-c)+(d-e)/(f-(g*h)/j))");
System.out.println("Ingrese valor de a");
double valora_5 = scanner.nextDouble();
System.out.println("Ingrese el valor de b");
double valorb_5= scanner.nextDouble();
System.out.println("Ingrese el valor de c");
double valorc_5=scanner.nextInt();
System.out.println("Ingrese el valor de d");
double valord_5=scanner.nextDouble();
System.out.println("Ingrese el valor de e");
double valore_5=scanner.nextDouble();
 System.out.println("Ingrese el valor de f");       
double valorf_5=scanner.nextDouble();
System.out.println("Ingrese el valor de g");       
double valorg_5=scanner.nextDouble();
System.out.println("Ingrese el valor de h");       
double valorh_5=scanner.nextDouble();

System.out.println("Ingrese el valor de J");       
double valorj_5=scanner.nextDouble();

 double resultado5=((valora_5*valora_5)/(valorb_5-valorc_5)) +((valord_5-valore_5) / (valorf_5 - ((valorg_5 * valorh_5) / valorj_5)));
System.out.println("El resultado es: "+ resultado5);


System.out.println("Ingrese los valores para resolver la siguiente ecuacion m/n+p");
System.out.println("Ingrese el valor de m");
double valorm_6=scanner.nextDouble();
System.out.println("Ingrese el valor de n");
double valorn_6=scanner.nextDouble();
System.out.println("Ingrese el valor de p");
double valorp_6=scanner.nextDouble();
double resultado7= (valorm_6/valorn_6)+valorp_6;
System.out.println("El resultado es: "+ resultado7);


System.out.println("Ingrese los valores para resolver la siguiente ecuacion m+(n/(p-q))");
System.out.println("Ingrese el valor de m");
double valorm_8= scanner.nextDouble();
System.out.println("Ingrese el valor de n");
double valorn_8=scanner.nextDouble();
System.out.println("Ingrese el valor de p");
double valorp_8=scanner.nextDouble();
System.out.println("Ingrese el valor de q");
double valorq_8=scanner.nextDouble();
double resultado8= valorm_8+(valorn_8/valorp_8-valorq_8);

 System.out.println("La respuesta es: "+ resultado8);   
 
}}