public class InversionColores {
    public static void main(String[] args) {
        
        int[][] imagen = {
            { 0, 50, 100 },
            { 150, 200, 255 },
            { 60, 120, 180 }
        };

        System.out.println("Imagen original:");
        imprimirMatriz(imagen);

       
        invertirColores(imagen);

        System.out.println("Imagen con colores invertidos:");
        imprimirMatriz(imagen);
    }

    public static void invertirColores(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 255 - matriz[i][j];
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
 
    

