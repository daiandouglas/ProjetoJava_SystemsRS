/** Arquivo principal do projeto */

import com.companytest.mavenproject1.newpackage.Calculadora;
import java.util.Scanner;
import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        String aux;
        double valor;
        
        //System.out.println("Digite o primeiro valor: ");
        //calculadora.setValor1(scanner.nextDouble());
        aux = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        valor = Double.parseDouble(aux);
        calculadora.setValor1(valor);
        
        //System.out.println("Digite o segundo valor: ");
        //calculadora.setValor2(scanner.nextDouble());
        aux = JOptionPane.showInputDialog("Digite o segundo valor: ");
        valor = Double.parseDouble(aux);
        calculadora.setValor2(valor);
        
        //System.out.println("A soma é: " + calculadora.getSoma());
        JOptionPane.showMessageDialog(null, "A soma é: " + calculadora.getSoma());
    }
}