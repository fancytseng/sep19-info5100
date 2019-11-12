package Assignment8;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends BaseFrame {

    private JLabel firstLabel, secondLabel, operationLabel, resultLabel;
    private JTextField firstText, secondText;
    private JComboBox options;
    private JButton resultsButton;

    @Override
    public void create() {
        firstLabel = new JLabel("First Number : ");
        secondLabel = new JLabel("Second Number : ");
        operationLabel = new JLabel("Operation : ");
        resultLabel = new JLabel("Result : ");

        firstText = new JTextField(10);
        secondText = new JTextField(10);

        //JComboBox:A component that combines a button or editable field and a drop-down list. The user can select a
        // value from the drop-down list, which appears at the user's request. If you make the combo box editable, then
        // the combo box includes an editable field into which the user can type a value.
        options = new JComboBox(new String[] { "+", "-", "x", "/" });

        resultsButton = new JButton("Compute");

    }

    @Override
    public void add(Container con) {
        GridLayout gl = new GridLayout(5, 1);
        con.setLayout(gl);
        addResultsLabel(con);
        addFirstComponent(con);
        addOptions(con);
        addSecondComponent(con);
        addResultsButton(con);

    }

    private void addFirstComponent(Container con) {
        JPanel panel = new JPanel();
        panel.add(firstLabel);
        panel.add(firstText);

        con.add(panel);
    }
    //    private void addOptions(Container con) {
    //        addComponents(con, operationLabel, options);
    //
    //    }
    private void addOptions(Container con) {
        JPanel panel = new JPanel();
        panel.add(operationLabel);
        panel.add(options);

        con.add(panel);
    }

    //    private void addSecondComponent(Container con) {
    //      addComponents(con, secondLabel, secondText);
    //
    //    }
    private void addSecondComponent(Container con) {
        JPanel panel = new JPanel();
        panel.add(secondLabel);
        panel.add(secondText);

        con.add(panel);
    }

    private void addResultsButton(Container con) {
        con.add(resultsButton);

    }

    private void addResultsLabel(Container con) {
        con.add(resultLabel);

    }


//    private void addComponents(Container con, Component a, Component b) {
//        JPanel panel = new JPanel();
//        panel.add(a);
//        panel.add(b);
//        con.add(panel);
//
//    }



    void calculateAndStoreResult() {
        int a = 0;
        try {
            a = Integer.parseInt(firstText.getText());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Number should be entered in the first text field");
            throw e;
        }
        int b = Integer.parseInt(secondText.getText());

        String choice = options.getSelectedItem().toString();
        int result = getResult(a, b, choice);

        String answer = a + " " + choice + " " + b + " = " + result;
        resultLabel.setText(answer);
    }

    private int getResult(int a, int b, String choice) {
        if (choice.equals("+")) {
            return a + b;
        }
        if (choice.equals("-")) {
            return a - b;
        }
        if (choice.equals("x")) {
            return a * b;
        } else
            return a / b;
    }

    @Override
    public void addListeners() {
        resultsButton.addActionListener((e) -> calculateAndStoreResult());

    }

    public static void main(String[] args) {
        new Calculator();

    }

}

