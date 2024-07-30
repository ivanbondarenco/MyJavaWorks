import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JPanel mainPanel;
    private JTextField display;
    private JButton ACButton;
    private JButton a00Button;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;
    private JPanel Calculator;

    double a , b, result;
    String op;

    private void initComponents() {
        // Inicialización de componentes (usualmente generada automáticamente por el IDE)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Calculator() {
        initComponents();
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a3Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a00Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a0Button.getText());
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().contains(".")){
                display.setText(display.getText() + button20.getText());}
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(display.getText().contains(".")){
                    double n = Double.parseDouble(display.getText());
                    n = n*-1;
                    display.setText(String.valueOf(n));
                }
                else{
                     long n = Long.parseLong(display.getText());
                     n = n * -1;
                     display.setText(String.valueOf(n));

                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "*";
                display.setText("");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "/";
                display.setText("");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "-";
                display.setText("");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "+";
                display.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if(display.getText().length()> 0){

                    StringBuilder strB = new StringBuilder(display.getText());
                    strB.deleteCharAt(display.getText().length()-1);
                    backspace = String.valueOf(strB);
                    display.setText(backspace);
                }
            }
        });


        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(display.getText());
                if(op == "+"){
                    result = a+b;
                    display.setText(String.valueOf(result));
                }
                else if(op == "/"){
                    result = a / b;
                    display.setText(String.valueOf(result));
                }
                else if(op == "*"){
                    result = a * b;
                    display.setText(String.valueOf(result));
                }
                else if(op == "-"){
                    result = a - b;
                    display.setText(String.valueOf(result));
                }
            }
        });
    }


}
