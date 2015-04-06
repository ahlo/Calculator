import java.util.Scanner;
import java.awt.event.*;
import java.swing.*

public class Calculator extends JFrame implements ActionListener {
    public Calculator(){
        
    }
    
    JPanel[] row = new Jpanel[5]
    JButton[] button = new JButton[19];
    String buttonString = {"7", "8", "9", "+",
                           "4", "5", "6", "-",
                           "1", "2", "3", "*",
                           "C", ".", "0", "/",
                           "+/-", "="};

    //Basic Arithmetic Operations
    static double addition(double number1, double number2) {
        return number1 + number2;
    }
    
    static double subtraction(double number1, double number2) {
        return number1 - number2;
    }
    
    static double multiplication(double number1, double number2) {
        return number1 * number2;
    }
    
    static double division(double number1, double number2) {
        return number1 / number2;
    }

}