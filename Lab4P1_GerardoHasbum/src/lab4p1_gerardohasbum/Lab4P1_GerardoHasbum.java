/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_gerardohasbum;
import java.util.Scanner;
/**
 *
 * @author ghasb
 */
public class Lab4P1_GerardoHasbum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jhin = new Scanner(System.in);
        char res_u_men='s';
        while(res_u_men=='s' || res_u_men=='S'){
            System.out.println("*****MENU*****");
            System.out.println("1. Inversion Especial");
            System.out.println("2. Balanza de strs");
            System.out.println("3. Cifrado de Mensajes");
            System.out.print("Ingrese el programa deseado: ");
            int opcion = jhin.nextInt();
            boolean space=false;
            switch(opcion){
                //Inversion Especial
                case 1:
                    String str;
                    String splice;
                    int start = 0;
                    String inv="";
                    System.out.println("*****INVERSION ESPECIAL*****");                    
                    System.out.println("Ingrese una cadena de por lo menos 5 caracteres: ");
                    jhin.nextLine();
                    str = jhin.nextLine();
                    
                    while (str.length() < 5){ 
                        System.out.println("Debe ingresar una cadena de por lo menos 5 caracteres: ");
                        jhin.nextLine();
                        str = jhin.nextLine();
                    }
                    for (int i = 0; i < str.length() - 1; i++){
                        if ((int)str.charAt(i) == 32){
                            space = true;
                            i = str.length() - 1;
                        }
                    } 
                    
                    if (space){ 
                        str += " "; 
                        for (int i = start; i < str.length(); i++){
                            if ((int)str.charAt(i) == 32){
                                splice = str.substring(start, i); 
                                for (int j = splice.length() - 1; j >= 0; j--){
                                    inv += splice.charAt(j);
                                }
                                start = i + 1; 
                                inv += " ";
                            }
                        }
                    } 
                    else { 
                        for (int a = str.length() - 1; a >= 0; a--){
                            inv += str.charAt(a);
                        }
                    }
                    System.out.println("Resultado: " + inv); 
                    break;
                //Fin Inversion Especial
                
                //Balanza de Cadenas
                case 2:
                    System.out.println("*****BALANZA DE CADENAS*****");
                    System.out.println("Ingrese la primera cadena: ");
                    String str1_2 = jhin.nextLine();
                    str1_2 = jhin.nextLine();
                    System.out.println("Ingrese la primera cadena: ");
                    String str2_2 = jhin.nextLine();
                    System.out.println("Ingrese la primera cadena: ");
                    String str3_2 = jhin.nextLine();
                    int str1_num=0,str2_num=0,str3_num=0;
                    for(int i = 0; i<str1_2.length();i++){
                        str1_num+=str1_2.charAt(i);
                    }
                    for(int i = 0; i<str2_2.length();i++){
                        str2_num+=str2_2.charAt(i);
                    }
                    for(int i = 0; i<str3_2.length();i++){
                        str3_num+=str3_2.charAt(i);
                    }
                    System.out.println("Peso cadena 1: "+ str1_num);
                    System.out.println("Peso cadena 2: "+ str2_num);
                    System.out.println("Peso cadena 3: "+ str3_num);
                    if(str1_num>str2_num && str1_num>str3_num){
                        System.out.println("La primera cadena es la mas pesada");
                    }
                    else if(str1_num==str2_num && str1_num>str3_num){
                        System.out.println("Las cadenas 1 y 2 son las mas pesadas");
                    }
                    else if(str2_num==str3_num && str2_num>str1_num){
                        System.out.println("Las cadenas 2 y 3 son las mas pesadas");
                    }
                    else if(str1_num==str3_num && str1_num>str2_num){
                        System.out.println("las cadenas 1 y 3 son las mas pesadas");
                    }
                    else if(str2_num>str3_num){
                        System.out.println("La segunda cadena es la mas pesada");
                    }
                    else if(str1_num==str2_num && str1_num==str3_num){
                        System.out.println("El peso de las cadenas es el mismo");
                    }
                    else{
                        System.out.println("La tercera cadena es la mas pesada");
                    }
                    break;
                //Balanza de Cadenas
                    
                //Cifrado de Mensajes
                case 3:
                    System.out.println("*****CIFRADO DE MENSAJES*****");
                    System.out.println("Ingrese el mensaje a cifrar: ");
                    String str1_3=jhin.nextLine();
                    str1_3=jhin.nextLine();
                    int str_acu=0;
                    String str_res="";
                    for(int i = 0;i<str1_3.length();i++){
                        str_res += (char)((int)str1_3.charAt(i)+2);
                    }
                    System.out.println("El mensaje cifrado seria: "+ str_res);
                    break;
                //Fin Cifrado de Mensajes
            }
            System.out.print("Desea ingresar a otro programa [s/n]: ");                    
            res_u_men = jhin.next().charAt(0);
        }
    }
    
}
