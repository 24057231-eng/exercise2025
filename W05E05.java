/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w05e05;

/**
 *
 * @author 18171
 */
import java.util.Scanner;
public class W05E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        int times = sc.nextInt();
        int i = 0;
        int even,odd,sumeven,sumodd,input;
        even = 0;
        odd = 0;
        sumeven = 0;
        sumodd = 0;
        while(i<times){
            System.out.print("Enter number; ");
            input = sc.nextInt();
            if(input%2==0){
                even++;
                sumeven+=input;
            }else{
                odd++;
                sumodd+=input;
            }   
            i++;
        }
        System.out.println("total even numbers:"+even+"\n"+"total odd numbers: "+odd+"\n"+"sum of even number is:"+sumeven+"\n"+"sum of odd number is:"+sumodd);
    }
    
}
