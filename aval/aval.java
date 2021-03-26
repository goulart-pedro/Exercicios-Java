import javax.swing.JOptionPane;

/**
 * aval
 */
public class aval {

  public static void main(String[] args) {
    // System.out.printf("módulo: %f", calcularModulo(-4.2f, 2));
    // exponenciacao();
  }

  static float calcularModulo(float numero, float divisor) {
    return numero % divisor;
  }

  static float[] minMax(float num1, float num2) {
    float[] resultado = { num1 > num2 ? num1 : num2, num1 < num2 ? num1 : num2 };
    return resultado;
    // System.out.printf("Max: %f", num1 > num2 ? num1 : num2);
    // System.out.printf("Min: %f", num1 < num2 ? num1 : num2);
  }

/** Yan */

public static float calcularModulo() {
  float numero = JOptionPane.showInputDialog(null, "digite um número");
  float divisor = JOptionPane.showInputDialog(null, "digite o divisor");
  JOptionPane.showMessageDialog(null, "módulo: " + numero % divisor);
}

public static void minMax() {
  float num1 = JOptionPane.showInputDialog(null, "digite um número");
  float num2 = JOptionPane.showInputDialog(null, "digite outro número");
  float[] resultado = { num1 > num2 ? num1 : num2, num1 < num2 ? num1 : num2 };
  JOptionPane.showMessageDialog(null, "min: " + resultado[0] + "\nmax:  " + resultado[1]);
  // System.out.printf("Max: %f", num1 > num2 ? num1 : num2);
  // System.out.printf("Min: %f", num1 < num2 ? num1 : num2);
}

public static double[] arrendondar() {
  double numero = JOptionPane.showInputDialog(null, "digite um número");
    JOptionPane.showMessageDialog(null, "piso: " + Math.ceil(numero) + "\n teto: " + Math.floor(numero));
  }

public static float[] exponenciacao() {
  float numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre um número"));
  float[] resultado = { (float) Math.pow(numero, 2), (float) Math.pow(numero, 3) };
  JOptionPane.showMessageDialog(null, numero + "²: " + resultado[0] + numero + "\n³: "+ resultado[1]); 
}

/** fim */
  static double[] arrendondar(double numero) {
    double[] resultado = { Math.ceil(numero), Math.floor(numero) };
    JOptionPane.showMessageDialog(null, "piso: " + resultado[1] + "\n teto: " + resultado[0]);
    return resultado;
  }

  static double arrendondarTeto(double numero) {
    return Math.ceil(numero);
  }

  static double arrendondarPiso(double numero) {
    return Math.floor(numero);
  }

  static float[] exponenciacao() {
    float numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre um número"));
    float[] resultado = { (float) Math.pow(numero, 2), (float) Math.pow(numero, 3) };
    return resultado;
    // float numero = Integer.parseInt( JOptionPane.showInputDialog(null, "Entre um
    // número"));
    // JOptionPane.showMessageDialog(null, numero + "²: " + Math.pow(numero, 2) +
    // "\n" + numero + "³: " + Math.pow(numero, 3) );
    // // System.out.printf("%f²: %.2f", numero, Math.pow(numero, 2));
    // // System.out.printf("%f³: %.2f", numero, Math.pow(numero, 3));
  }

  static boolean comparar(String string1, String string2) {
    if (string1.equals(string2)) {
      return true;
    }
    return false;
  }

  static void mostrar(String texto) {
    JOptionPane.showMessageDialog(null, texto);
  }
}
