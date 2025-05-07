package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import CRUD.creators.CreateAssinatura;
import CRUD.creators.CreateCliente;
import CRUD.creators.CreateEndereco;
import CRUD.creators.CreatePlano;
import CRUD.readers.ReadAssinatura;
import CRUD.readers.ReadEndereco;
import CRUD.readers.ReadPlano;
import Model.Cliente;
import Repository.ClienteRepository;

public class TelaCadastro extends JFrame {

    private JTextField campoNome;
    private JTextField campoCPF;
    private JTextField campoRua;
    private JTextField campoNumero;
    private JTextField campoNumeroPlano;
    private JButton botaoSalvar;

    public TelaCadastro() {
        setTitle("Cadastro de Cliente");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("Nome:"));
        campoNome = new JTextField();
        add(campoNome);

        add(new JLabel("CPF:"));
        campoCPF = new JTextField();
        add(campoCPF);

        add(new JLabel("Rua:"));
        campoRua = new JTextField();
        add(campoRua);

        add(new JLabel("Número:"));
        campoNumero = new JTextField();
        add(campoNumero);

        add(new JLabel("Número do Plano:"));
        campoNumeroPlano = new JTextField();
        add(campoNumeroPlano);

        botaoSalvar = new JButton("Salvar");
        add(botaoSalvar);

        // espaço vazio para alinhar botão
        add(new JLabel());

        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String cpf = campoCPF.getText();
                String rua = campoRua.getText();
                int numero = Integer.parseInt(campoNumero.getText());
                int numeroPlano = Integer.parseInt(campoNumeroPlano.getText());
                long clienteid = Ids.getidcliente();
                
                CreatePlano.createPlano(50, 100.00);
                CreateEndereco.createEndereco(rua, numero, clienteid);
                CreateAssinatura.createAssinatura(ReadPlano.readPlano(clienteid), true , clienteid, numeroPlano);
                
                CreateCliente.createCliente(nome, cpf, ReadEndereco.readEndereco(clienteid), ReadAssinatura.readAssinatura(clienteid));
                for (Cliente cliente : ClienteRepository.getClienteLista()) {
                	System.out.println(cliente);
                }
                
            }
        });

        setVisible(true);
    }
}