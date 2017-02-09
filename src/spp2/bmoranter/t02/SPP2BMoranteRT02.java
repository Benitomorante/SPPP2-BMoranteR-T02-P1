/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmoranter.t02;
import java.util.Scanner;
/**
 *
 * @author Benito Mv
 */
public class SPP2BMoranteRT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //variables
    double sue, pago;
    int cate, he;
    Scanner sc= new Scanner(System.in);
    
    //Introduce sueldo básico
        System.out.println(" Introduce sueldo base");
        sue= sc.nextDouble();
    // Introduce horas extras trabajadas
        System.out.println(" Introduce horas extras trabajadas");
        he= sc.nextInt();
    //Introduce categoría
        System.out.println(" Introduce categoría");
        cate= sc.nextInt();
   
        // Categorías
     if(cate >=1 && cate <=8)   {
        switch (cate) {
            case 1:
                pago= sue+ he*30;
                System.out.println("pago final:$"+pago);
                break;
            case 2:
                pago= sue+ he*38;
                System.out.println("pago final:$"+pago);
                break;
            case 3:
                pago= sue+ he*50;
                System.out.println("pago final:$"+pago);
                break;
            case 4:
                pago= sue + he*70;
                System.out.println("pago final:$"+pago);
                break;
            case 5:
                pago= sue+ he*75;
                System.out.println("pago final:$"+pago);
                break;
            case 6:
                pago= sue+ he*80 ;
                System.out.println("pago final:$"+pago);
                break;
            case 7:
                pago= sue+ he*90;
                System.out.println("pago final:$"+pago);
                break;
            case 8:
                pago= sue+ he*100;
                System.out.println("pago final:$"+pago);
                break;}
        }
     else { System.out.println(" No se hacen cálculos");}
    }
}

        
    

