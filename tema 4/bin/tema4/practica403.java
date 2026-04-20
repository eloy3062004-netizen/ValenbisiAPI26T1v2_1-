package tema4;
import java.util.Random;
import java.util.Scanner;
public class practica403 {
	    public static void main(String[] args) {
	    	        int[][] matriz = {
	    	            {1, 2, 3},
	    	            {4, 5, 6},
	    	            {7, 8, 9}
	    	        };
	    	        Scanner sc = new Scanner(System.in);
	    	        System.out.print("Fila 1 a intercambiar");
	    	        int f1 = sc.nextInt();
	    	        System.out.print("Fila 2 a intercambiar");
	    	        int f2 = sc.nextInt();
	    	        if (f1 >= 0 && f1 < matriz.length && f2 >= 0 && f2 < matriz.length) {
	    	            int[] temp = matriz[f1];
	    	            matriz[f1] = matriz[f2];
	    	            matriz[f2] = temp;
	    	            System.out.println("Intercambio:");
	    	            for (int[] fila : matriz) {
	    	                for (int v : fila)
	    	                    System.out.print(v + "");
	    	                System.out.println();
	    	            }
	    	        } else {
	    	            System.out.println("Alguna fila no existe.");
	    	        }
	    	    }
	    	}

	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    
	    	
	    	
	    	  //      int[][] tabla = new int[10][3];
	    	  //      for (int i = 0; i < 10; i++) {
	    	   //         int n = i + 1;
	    	   //         tabla[i][0] = n;
	    	   //         tabla[i][1] = n * n;
	    	   //         tabla[i][2] = n * n * n;
	    	   //     }
	    	   //     Scanner sc = new Scanner(System.in);
	    	   //     System.out.print("Dime un cubo perfecto:");
	    	   //     int cubo = sc.nextInt();
	    	   //     boolean encontrado = false;
	    	   //     for (int i = 0; i < 10; i++) {
	    	    //        if (tabla[i][2] == cubo) {
	    	  //              System.out.println("Número: " + tabla[i][0]);
	    	   //             System.out.println("Cuadrado: " + tabla[i][1]);
	    	   //             encontrado = true;
	    	    //            break;
	    	   //         }
	    	//        }
	    	 //       if (!encontrado)
	    	//            System.out.println("No es un cubo perfecto");
	    	//    }
	    //	}

	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	//	        int[][] matriz = {
	    //	                {1, 2, 3},
	    //	                {4, 5, 6}
	    //	        };
	    //	        int filas = matriz.length;
	    //	        int cols = matriz[0].length;
	    ///	        int[][] traspuesta = new int[cols][filas];
	    //	        for (int i = 0; i < filas; i++)
	    //	            for (int j = 0; j < cols; j++)
	    //	                traspuesta[j][i] = matriz[i][j];
	    //	        for (int[] fila : traspuesta) {
	    	//            for (int v : fila)
	    //	                System.out.print(v + "");
	    	//            System.out.println();
	    ////	        }
	  //  	    }
	 //   	}

	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	//     int[][] suma = new int[5][5];
	    	  //      for (int i = 0; i < 5; i++)
	    	   //         for (int j = 0; j < 5; j++)
	    	   //             suma[i][j] = i + j;
	    	   //     for (int[] fila : suma) {
	    	   //         for (int v : fila)
	    	   //             System.out.print(v + "");
	    	  //          System.out.println();
	    	   //     }
	    	//    }
	    //	}

	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	 
	     //   String[][] datos = {
	     //           {"Python", "C++", "C#"},
	      //          {"Javascript", "php", ".net"},
	     //           {"Java", "html", "SQL"}
	     //   };
	    //    boolean[][] mascara = {
	     //           {true, false, true},
	     //           {false, false, true},
	     //           {true, true, true}
	     //   };
	     //   System.out.println("Matriz:");
	     //   for (int i = 0; i < datos.length; i++) {
	     //       for (int j = 0; j < datos[0].length; j++) {
	     //           if (mascara[i][j])
	     //               System.out.print(datos[i][j] + "\t");
	    //            else
	   //                 System.out.print("\t");
	     //      }
	    //        System.out.println();
	    //    }
	   // }
	//}

	 //   public static void main(String[] args) {
	  //      int n = 5;
	    //    int[][] matriz = new int[n][n];
	    //    Random r = new Random();
	    //    for (int i = 0; i < n; i++)
	  //          for (int j = 0; j < n; j++)
	   //             matriz[i][j] = r.nextInt(100);
	    //    System.out.println("Diagonal inversa:");
	    //    for (int i = 0; i < n; i++)
	   //         System.out.print(matriz[i][n - 1 - i] + " ");
	  //  }
//	}

//		    public static void main(String[] args) {
	//	        int n = 5;
	//	        int[][] matriz = new int[n][n];
	//	        Random r = new Random();
	//	        for (int i = 0; i < n; i++)
	//	            for (int j = 0; j < n; j++)
	//	                matriz[i][j] = r.nextInt(100);
	//	        System.out.println("Diagonal principal:");
	//	        for (int i = 0; i < n; i++)
	//	            System.out.print(matriz[i][i] + " ");
	//	// TODO Auto-generated method stub


