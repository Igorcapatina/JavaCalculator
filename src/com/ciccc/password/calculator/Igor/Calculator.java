package com.ciccc.password.calculator.Igor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public void Enabe(){
        Screen.setEnabled(true);
        btnMultiplide.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFive.setEnabled(true);
        btnEight.setEnabled(true);
        btnPoint.setEnabled(true);
        btnPlus.setEnabled(true);
        btnSix.setEnabled(true);
        btnNine.setEnabled(true);
        btnDelete.setEnabled(true);
        btnMinus.setEnabled(true);
        btnDevide.setEnabled(true);
        btnEqual.setEnabled(true);
        btnOne.setEnabled(true);
        btnFour.setEnabled(true);
        btnSeven.setEnabled(true);
        btnZero.setEnabled(true);
    }

    public void Disable(){
       Screen.setEnabled(false);
          btnMultiplide.setEnabled(false);
          btnTwo.setEnabled(false);
          btnThree.setEnabled(false);
          btnFive.setEnabled(false);
          btnEight.setEnabled(false);
          btnPoint.setEnabled(false);
          btnPlus.setEnabled(false);
          btnSix.setEnabled(false);
          btnNine.setEnabled(false);
          btnDelete.setEnabled(false);
          btnMinus.setEnabled(false);
          btnDevide.setEnabled(false);
          btnEqual.setEnabled(false);
          btnOne.setEnabled(false);
          btnFour.setEnabled(false);
          btnSeven.setEnabled(false);
          btnZero.setEnabled(false);
    }

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel CalculatorJAVA;
    private JFormattedTextField Screen;
    private JButton btnMultiplide;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnDelete;
    private JButton btnMinus;
    private JButton btnDevide;
    private JButton btnEqual;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JRadioButton rdOn;
    private JRadioButton rdOff;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(Screen.getText());
        Screen.setText("");
    }

    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnOne.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnTwo.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnThree.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnFour.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnFive.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnSix.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnSeven.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnEight.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnNine.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = Screen.getText() + btnZero.getText();
                Screen.setText(btnTwoText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this will make it neater  - "0."  instead of "."
                if (Screen.getText().equals("")) {
                    Screen.setText("0.");
                }
                //this will help to avoid a bug, 'cause ".."as well as "1.. " or ".8." is
                // not acceptable four this simple calculator, so we will make it impossible
                else if (Screen.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = Screen.getText() + btnPoint.getText();
                    Screen.setText(btnPointText);
                }
               // btnPoint.setEnable(true);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                    total2 = total1 + Double.parseDouble(Screen.getText());
                    break;
                    case '-':
                    total2 = total1 - Double.parseDouble(Screen.getText());
                    break;
                    case '*':
                    total2 = total1 * Double.parseDouble(Screen.getText());
                    break;
                    case '/':
                    total2 = total1 / Double.parseDouble(Screen.getText());
                    break;
                }
                Screen.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                Screen.setText("");
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnDevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDevide.getText();
                getOperator(button_text);
            }
        });
        btnMultiplide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiplide.getText();
                getOperator(button_text);
            }
        });
        rdOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Disable();
            }
        });
        rdOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Enabe();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().CalculatorJAVA);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
