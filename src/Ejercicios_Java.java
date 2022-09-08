import java.util.Scanner;

public class Ejercicios_Java {

  public static void main(String[] args) {
    
  }

  static void contarNumeros() {
    int[] myArray = { 1, 6, 2, 4, 5, 6, 7, 1, 2, 6 };
    int cont = 0;
    int longtest = 0;
    int num = 0;

    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray.length; j++) {
        if (myArray[i] == myArray[j]) {
          longtest++;
          if (longtest > cont) {
            cont = longtest;
            num=myArray[i];
          }
        }
      }
      longtest = 0;
    }
    System.out.println("Longest:" + cont);
    System.out.println("Number:" + num);
  }

  static int validar(int ballsinbottle) {
    if (ballsinbottle > 0) {
      System.out.println(ballsinbottle);
      return validar(ballsinbottle - 1);
    } else {
      return ballsinbottle;
    }
  }

  static void palindromo() {
    String original, reverse = "";
    Scanner in = new Scanner(System.in);
    original = in.nextLine();
    int length = original.length();
    for (int i = length - 1; i >= 0; i--) {
      reverse = reverse + original.charAt(i);
    }
    if (original.equals(reverse)) {
      System.out.println("La palabra ingresada es un palindromo");
    } else {
      System.out.println("La palabra ingresada No es un palindromo");
    }
  }

  static Boolean numeroPrimo(int numero) {
    Boolean primo = false;
    Double x = Math.sqrt(numero);
    int i = 2;
    if (numero == 2) {
      return true;
    } else {
      while (i <= Math.round(x)) {
        if (numero % i == 0) {
          return false;
        } else {
          primo = true;
        }
        i++;
      }
    }
    return primo;
  }

  static void invertirNumero() {
    int n, reverse = 0;
    System.out.println("Ingrese el numero a invertir");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    while (n != 0) {
      reverse = reverse * 10;
      reverse = reverse + n % 10;
      n = n / 10;
    }
    System.out.println("El numero invertido es:" + reverse);
  }
}
