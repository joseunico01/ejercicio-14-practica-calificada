
package ejer14;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejer14 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int n_filas,n_col;
        float arreglo[][]=new float[3][3];
        float matriz1[][]=new float[3][3];
        float matriz2[][]=new float[3][3];
        
        JOptionPane.showMessageDialog(null, "Digite la 1er matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz1[i][j]=entrada.nextFloat();
            }
        }
        System.out.println("");
        
           JOptionPane.showMessageDialog(null, "Digite la 2er matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz2[i][j]=entrada.nextFloat();
            }
        }     
        
        System.out.println("Multiplicacion de las 2 matrices: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arreglo[i][j]=matriz1[i][j]*matriz2[i][j];
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arreglo[i][j]+" ");
            }
            System.out.println("");
        }
 
        //ordenar la matriz
       
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int x=0;x<3;x++){
                    for(int y=0;y<3;y++){
                        if(arreglo[i][j] < arreglo[x][y]){
                            float t;
                           t= arreglo[i][j];
                           arreglo[i][j]=arreglo[x][y];
                           arreglo[x][y]=t;
                        }
                    }
            }
            }    
            }
        
        //imprimir la matriz ordenada 
        System.out.println("La matriz esta ordenada: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arreglo[i][j]+" ");
    }
            System.out.println("");
}
}
}