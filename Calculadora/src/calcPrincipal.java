import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcPrincipal extends JFrame {
    private JTextField txtResult;
    private JButton btn8;
    private JButton btn9;
    private JButton btn7;
    private JButton btnRaiz;
    private JButton btnIgual;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnVirgula;
    private JButton bntPercent;
    private JButton btnSoma;
    private JButton btnSubtrai;
    private JButton btnMulti;
    private JButton btnDiv;
    private JPanel pnlTelaCalc;
    private JButton btnC;

    double valor1;
    double valor2;
    String operador;


    public calcPrincipal() {
        iniciarComponentes();
        addListeners();
    }
    private void iniciarComponentes(){

        JPanel telaCalc = new JPanel();
        setSize(500,500);
        setContentPane(pnlTelaCalc);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setVisible(true);
    }
    private void addListeners(){
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+"9");
            }
        });
        btnVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(txtResult.getText()+",");
            }
        });
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                operador = "+";
            }
        });
        btnSubtrai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                operador = "-";
            }
        });
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                operador = "*";
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                operador = "/";
            }
        });
        bntPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                operador = "%";
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText("");
                operador = "";
            }
        });

        btnRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                operador = "SQRT";
                double sqrt = Math.sqrt(valor1);
                txtResult.setText(String.valueOf(sqrt));
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(txtResult.getText());

                switch (operador){
                    case "+":
                        txtResult.setText(String.valueOf(valor1+valor2));
                        break;
                    case "-":
                        txtResult.setText(String.valueOf(valor1-valor2));
                        break;
                    case "*":
                        txtResult.setText(String.valueOf(valor1*valor2));
                        break;
                    case "/":
                        txtResult.setText(String.valueOf(valor1/valor2));
                        break;
                    case "%":
                        txtResult.setText(String.valueOf(valor1*(valor2/100)));
                        break;
                    default:
                        break;

                }
            }
        });


    }

    public static void main(String[] args) {
        calcPrincipal calculadora = new calcPrincipal();
        }

    }

