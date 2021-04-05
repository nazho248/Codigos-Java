import java.awt.Component;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JOptionPane;


public class Hill {
	   static Scanner sc;

	   static {
	      sc = new Scanner(System.in);
	   }

	   private static int[][] getKeyMatrix() {
	      int[][] matrix = new int[2][2];
	      boolean ver = true;
	      boolean esInt = true;
	      StringBuffer str = new StringBuffer();
	      int input = 0;
	      int x = 2;
	      int y = x;
	      Boolean MatrizValida = false;
	      Boolean MatrizValida2 = false;

	      do {
	         for(int i = 0; i < 2; ++i) {
	            str.append("                            ");

	            for(int j = 0; j < 2; ++j) {
	               String input2;
	               do {
	                  input2 = JOptionPane.showInputDialog(str + " _ \n\n\nInserte el numero \"_\" , matriz (" + x + "x" + y + ")");
	                  if (input2 == null) {
	                     ver = quieresSalir();
	                  } else if (input2.toString().isEmpty()) {
	                     JOptionPane.showMessageDialog((Component)null, "¡Debes introducir algun texto!", "Error", 1);
	                  } else {
	                     try {
	                        input = Integer.parseInt(input2);
	                        esInt = true;
	                     } catch (Exception var13) {
	                        JOptionPane.showMessageDialog((Component)null, "¡Solo numeros !", "Error", 0);
	                        esInt = false;
	                     }
	                  }
	               } while(!ver || input2.toString().isEmpty() || !esInt);

	               matrix[i][j] = input;
	               str.append(matrix[i][j] + " ");
	            }

	            str.append("\n");
	         }

	         MatrizValida = isValidMatrix(matrix);
	         MatrizValida2 = isValidReverseMatrix(matrix, reverseMatrix(matrix));
	         if (!MatrizValida || !MatrizValida2) {
	            str.delete(0, str.length());
	            JOptionPane.showMessageDialog((Component)null, "¡Matriz clave no valida !", "Error", 0);
	         }
	      } while(!MatrizValida || !MatrizValida2);

	      return matrix;
	   }

	   private static Boolean isValidMatrix(int[][] keyMatrix) {
	      int det = keyMatrix[0][0] * keyMatrix[1][1] - keyMatrix[0][1] * keyMatrix[1][0];
	      return det == 0 ? false : true;
	   }

	   private static Boolean isValidReverseMatrix(int[][] Matrix, int[][] MatrizInversa) {
	      int[][] product = new int[2][2];
	      product[0][0] = (Matrix[0][0] * MatrizInversa[0][0] + Matrix[0][1] * MatrizInversa[1][0]) % 26;
	      product[0][1] = (Matrix[0][0] * MatrizInversa[0][1] + Matrix[0][1] * MatrizInversa[1][1]) % 26;
	      product[1][0] = (Matrix[1][0] * MatrizInversa[0][0] + Matrix[1][1] * MatrizInversa[1][0]) % 26;
	      product[1][1] = (Matrix[1][0] * MatrizInversa[0][1] + Matrix[1][1] * MatrizInversa[1][1]) % 26;
	      return product[0][0] == 1 && product[0][1] == 0 && product[1][0] == 0 && product[1][1] == 1 ? true : false;
	   }

	   private static int[][] reverseMatrix(int[][] keyMatrix) {
	      int detmod26 = (keyMatrix[0][0] * keyMatrix[1][1] - keyMatrix[0][1] * keyMatrix[1][0]) % 26;
	      int[][] reverseMatrix = new int[2][2];

	      int factor;
	      for(factor = 1; factor < 26 && detmod26 * factor % 26 != 1; ++factor) {
	      }

	      reverseMatrix[0][0] = keyMatrix[1][1] * factor % 26;
	      reverseMatrix[0][1] = (26 - keyMatrix[0][1]) * factor % 26;
	      reverseMatrix[1][0] = (26 - keyMatrix[1][0]) * factor % 26;
	      reverseMatrix[1][1] = keyMatrix[0][0] * factor % 26;
	      return reverseMatrix;
	   }

	   private static void echoResult(String label, int adder, ArrayList<Integer> phrase) {
	      StringBuffer impresion = new StringBuffer();

	      for(int i = 0; i < phrase.size(); i += 2) {
	         char[] texto = Character.toChars((Integer)phrase.get(i) + 64 + adder);
	         impresion.append(texto[0]);
	         texto = Character.toChars((Integer)phrase.get(i + 1) + 64 + adder);
	         impresion.append(texto[0]);
	         if (i + 2 < phrase.size()) {
	            impresion.append("-");
	         }
	      }

	      JOptionPane.showMessageDialog((Component)null, impresion, label, 1);
	   }

	   public static void Encriptar(String oracion, boolean empezar1, int[][] keyMatrix) {
	      empezar1 = true;
	      int adder = empezar1 ? 1 : 0;
	      ArrayList<Integer> OracionAnumeros = new ArrayList();
	      ArrayList<Integer> OracionCodificada = new ArrayList();
	      oracion = oracion.replaceAll("[^a-zA-Z]", "").toUpperCase();
	      if (oracion.length() % 2 == 1) {
	         oracion = oracion + "Q";
	      }

	      int i;
	      for(i = 0; i < oracion.length(); ++i) {
	         OracionAnumeros.add(oracion.charAt(i) - (64 + adder));
	      }

	      try {
	         for(i = 0; i < OracionAnumeros.size(); i += 2) {
	            int x = (keyMatrix[0][0] * (Integer)OracionAnumeros.get(i) + keyMatrix[0][1] * (Integer)OracionAnumeros.get(i + 1)) % 26;
	            int y = (keyMatrix[1][0] * (Integer)OracionAnumeros.get(i) + keyMatrix[1][1] * (Integer)OracionAnumeros.get(i + 1)) % 26;
	            OracionCodificada.add(empezar1 ? x : (x == 0 ? 26 : x));
	            OracionCodificada.add(empezar1 ? y : (y == 0 ? 26 : y));
	         }
	      } catch (Exception var9) {
	         JOptionPane.showMessageDialog((Component)null, "Hubo un problema en la codificacion, intentalo con otra matriz clave!", "Error", 0);
	         return;
	      }

	      echoResult("Mensaje Encriptado: ", adder, OracionCodificada);
	   }

	   public static void Desencriptar(String phrase, boolean empezar1, int[][] keyMatrix) {
	      empezar1 = true;
	      int adder = empezar1 ? 1 : 0;
	      ArrayList<Integer> phraseToNum = new ArrayList();
	      ArrayList<Integer> phraseDecoded = new ArrayList();
	      phrase = phrase.replaceAll("[^a-zA-Z]", "").toUpperCase();

	      int i;
	      for(i = 0; i < phrase.length(); ++i) {
	         phraseToNum.add(phrase.charAt(i) - (64 + adder));
	      }

	      int[][] revKeyMatrix = reverseMatrix(keyMatrix);

	      for(i = 0; i < phraseToNum.size(); i += 2) {
	         phraseDecoded.add((revKeyMatrix[0][0] * (Integer)phraseToNum.get(i) + revKeyMatrix[0][1] * (Integer)phraseToNum.get(i + 1)) % 26);
	         phraseDecoded.add((revKeyMatrix[1][0] * (Integer)phraseToNum.get(i) + revKeyMatrix[1][1] * (Integer)phraseToNum.get(i + 1)) % 26);
	      }

	      echoResult("Mensaje Desencriptado:: ", adder, phraseDecoded);
	   }

	   public static void main(String[] args) {
	      int[][] matriz = new int[2][2];
	      new StringBuffer();
	      JOptionPane.showMessageDialog((Component)null, "Bienvenido al Enciptador por medio de matrices\n\n          Por Jair Gonzalez & David Parra       \n                               2021A", "Bienvenida", 1);
	      JOptionPane.showMessageDialog((Component)null, " El encriptador se basa en la criptografia HILL para\nencriptar y desencriptar mensajes por medio de matrices.\n\n En este programa algunas matrices estan restringidas al\nno dar una salida desencriptada como deberia. \n\nEl programa funciona solo con matrices 2x2 el hecho de que\ntrabajar con mas dimensiones dificulta las operaciones,\n", "Informacion", 3);
	      matriz = getKeyMatrix();
	      StringBuffer str = GenIm(matriz);
	      imprimirMatriz(str);

	      int opcion;
	      do {
	         opcion = menu();
	         String frase;
	         switch(opcion) {
	         case 0:
	            Finalizar();
	            break;
	         case 1:
	            matriz = getKeyMatrix();
	            str = GenIm(matriz);
	            imprimirMatriz(str);
	            break;
	         case 2:
	            imprimirMatriz(str);
	            break;
	         case 3:
	            frase = PonerTexto("Encriptar", "Introduce el texto a encriptar");
	            Encriptar(frase, false, matriz);
	            break;
	         case 4:
	            frase = PonerTexto("Desencriptar", "Introduce el texto a desencriptar");
	            Desencriptar(frase, false, matriz);
	         }
	      } while(opcion != 0);

	   }

	   public static String PonerTexto(String titulo, String quehacer) {
	      String phrase;
	      do {
	         phrase = JOptionPane.showInputDialog((Component)null, quehacer, titulo, -1);
	         if (phrase == null) {
	            quieresSalir();
	         } else if (phrase.isEmpty()) {
	            JOptionPane.showMessageDialog((Component)null, "¡Debes introducir algun texto!", "Error", 1);
	         }
	      } while(phrase == null || phrase.isEmpty());

	      return phrase;
	   }

	   public static int menu() {
	      int seleccion = JOptionPane.showOptionDialog((Component)null, "                                                                 Seleccione una opcion", "Menu de opciones", 1, 3, (Icon)null, new Object[]{"Salir Del programa", "Cambiar  Matriz Clave", "Ver matriz Clave", "Encriptar mensaje", "Desencriptar mensaje"}, "opcion 1");
	      if (seleccion == -1) {
	         Finalizar();
	      }

	      return seleccion;
	   }

	   public static StringBuffer GenIm(int[][] matrix) {
	      StringBuffer str = new StringBuffer();

	      for(int i = 0; i < 2; ++i) {
	         str.append("                       ");

	         for(int j = 0; j < 2; ++j) {
	            str.append(matrix[i][j] + " ");
	         }

	         str.append("\n");
	      }

	      return str;
	   }

	   public static void imprimirMatriz(StringBuffer str) {
	      JOptionPane.showMessageDialog((Component)null, "La matriz clave es: \n" + str, "Impresion", 1);
	   }

	   public static boolean quieresSalir() {
	      int seleccion = JOptionPane.showOptionDialog((Component)null, "¿Seguro que quieres salir?", "Selector de opciones", 1, 3, (Icon)null, new Object[]{"Si", "No "}, "No");
	      if (seleccion == 0) {
	         Finalizar();
	      }

	      return false;
	   }

	   public static void Finalizar() {
	      JOptionPane.showMessageDialog((Component)null, "Fin del programa", "Finalización", 0);
	      System.exit(0);
	   }
	}