
package matrizsimetrica;

import java.util.Random;
import java.util.Scanner;

public class MatrizSimetrica {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("filas");
        int f=sc.nextInt();
        System.out.println("columnas");
        int c=sc.nextInt();
        int[][] matriz=new int[f][c];
        
        rellenarMatriz2(matriz);
        rellenar(matriz);
        esCuadrada(matriz);
        traspuesta(matriz);
        esSimetrica(matriz);
        
    }
    
    public static boolean esCuadrada(int[][] m){
        return m.length==m[0].length;
    }
    public static void rellenar(int[][] m){
        Scanner teclado=new Scanner(System.in);
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[i].length;j++){
                System.out.println("dame elemento");
                m[i][j]=teclado.nextInt();
            }
        }
    }
    
    public static boolean traspuesta(int[][] m){
        boolean traspuesta=true;
            for(int i=0;i<m.length;i++){
                for(int j=0;j<m[i].length;j++)
                    if (m[i][j]!=m[j][i]){
                        traspuesta=false;
                }
        }
    return traspuesta;
    
    }
    
    public static void esSimetrica(int[][] m){
        if (esCuadrada(m) && traspuesta(m))
            System.out.println("Es simetrica");    
        else
            System.out.println("No es simetrica");
 
    }
     public static void rellenarMatriz2(int[][] m){
        Random r=new Random();
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=r.nextInt(9);
            }
        }  
        for(int i=0;i<m.length;i++){
                for(int j=0;j<m[i].length;j++){
                    System.out.println(m[i][j]+" ");
                }
                System.out.println("");
            }
    }

}
