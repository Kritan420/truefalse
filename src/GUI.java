import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class GUI{

    public GUI(ArrayList<Statements> list) {
        SwingUtilities.invokeLater(() -> createWindow(list));
    }

   private void createWindow(ArrayList<Statements> list) {
        
        JFrame frame = new JFrame("True or False");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Total t = new Total();
        Correct c = new Correct();
        Wrong w = new Wrong();
        RandNumber r = new RandNumber(list);

        Container pane = frame.getContentPane();
        JPanel jPanel = new JPanel();

        JLabel label = new JLabel(list.get(r.getValue()).getStatement(), JLabel.CENTER);
        JLabel labelC = new JLabel("Correct: " + c.getValue());
        JLabel labelW = new JLabel("Wrong: " + w.getValue());
        JLabel labelT = new JLabel("Total: " + t.getValue());

        label.setFont(new Font("Verdana", 2, 15));
        JButton trueButton = new JButton("True");
        JButton falseButton = new JButton("False");
        JButton resetButton = new JButton("Reset");

        trueButton.addActionListener(event -> {
            if (list.get(r.getValue()).getBool()) {
                c.increment();
                labelC.setText("Correct: " + c.getValue());
                r.newRand();
                label.setText(list.get(r.getValue()).getStatement());
            }
            else {
                w.increment();
                labelW.setText("Wrong: " + w.getValue());
            }
            t.increment();
            labelT.setText("Total: " + t.getValue());
        });

        falseButton.addActionListener(event -> {
            if (!list.get(r.getValue()).getBool()) {
                c.increment();
                labelC.setText("Correct: " + c.getValue());
                r.newRand();
                label.setText(list.get(r.getValue()).getStatement());
            }
            else {
                w.increment();
                labelW.setText("Wrong: " + w.getValue());
            }
            t.increment();
            labelT.setText("Total: " + t.getValue());
        });

        resetButton.addActionListener(event -> {
            c.reset();
            w.reset();
            t.reset();
            r.newRand();
            label.setText(list.get(r.getValue()).getStatement());
            labelC.setText("Correct: " + c.getValue());
            labelW.setText("Wrong: " + w.getValue());
            labelT.setText("Total: " + t.getValue());
        });

        jPanel.add(trueButton);
        jPanel.add(falseButton);
        jPanel.add(labelC);
        jPanel.add(labelW);
        jPanel.add(labelT);
        jPanel.add(resetButton);

        pane.add(label);
        pane.add(jPanel, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        
        frame.pack();
        frame.setSize(1200, 400);
        frame.setVisible(true);
    }
}
