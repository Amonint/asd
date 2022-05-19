import java.util.Scanner;

public class problema10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],filas,col,sumafil,sumacol,posmatriz;
        
        System.out.println("Numero filas de la matriz");
        filas= entrada.nextInt();
        System.out.println("Numero columnas de la matriz");
        col= entrada.nextInt();
        matriz= new int[filas][col]; 
        
        
         
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                
                System.out.print("Digite el numero en la posicion ["+(i+1)+"]"+"["+(j+1)+"]");
                 matriz[i][j]= entrada.nextInt();
            }
            System.out.println("");
        }
        for(int i=0;i<matriz.length;i++){
            sumafil=0;
            for(int j=0;j<matriz[0].length;j++){
                sumafil +=  matriz[i][j];
               
            }
            System.out.println("Suma de la fila"+"  "+i+"  "+"es  "+sumafil);
        }
        for(int j=0;j<matriz.length;j++){
            sumacol=0;
            for(int i=0;i<matriz.length;i++){
                sumacol +=  matriz[i][j];
               
            }
            System.out.println("Suma de la columna"+"  "+j+"  "+"es  "+sumacol);
        }
        
        for(int j=0;j<matriz.length;j++){
            for(int i=0;i<matriz.length;i++){  
                
                System.out.println([i][j]);
            }
            
        }
        
    }
}