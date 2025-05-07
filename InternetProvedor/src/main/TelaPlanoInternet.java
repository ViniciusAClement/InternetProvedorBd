package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaPlanoInternet extends JFrame {

    private JTextField campoMegas;
    private JTextField campoPreco;
    private JButton botaoSalvar;

    public TelaPlanoInternet() {
        setTitle("Cadastro de Plano de Internet");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Quantidade de Megas:"));
        campoMegas = new JTextField();
        add(campoMegas);

        add(new JLabel("Preço:"));
        campoPreco = new JTextField();
        add(campoPreco);

        botaoSalvar = new JButton("Salvar");
        add(botaoSalvar);
        add(new JLabel()); // alinhamento

        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int megas = Integer.parseInt(campoMegas.getText());
                    double preco = Double.parseDouble(campoPreco.getText());

                    System.out.println("PLANO CADASTRADO:");
                    System.out.println("Megas: " + megas);
                    System.out.println("Preço: R$ " + preco);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                        "Por favor, insira valores válidos para megas (int) e preço (double).",
                        "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }
}
