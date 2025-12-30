import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public static void main() {

    JFrame janela = new JFrame();
    JButton botaoCadastar;
    JButton botaoBuscar;
    JButton botaoExcluir;

    //Configuração da Janela
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setTitle("Agenda Eletrônica");
    janela.setSize(800, 600);
    janela.setLayout(null);
    janela.setLocationRelativeTo(null);
    janela.setVisible(true);

    //Botão Cadastrar
    botaoCadastar =  new JButton("Cadastrar");
    botaoCadastar.setBounds(350, 100, 100, 30);
    botaoCadastar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String nome = IO.readln("Digite o nome: ");
            String telefone = IO.readln("Digite o telefone: ");
            String email = IO.readln("Digite o email: ");
            String cpf = IO.readln("Digite o cpf: ");

            Contato contatos = new Contato(nome, telefone, email, cpf);
        }
    });

    //Botão Buscar
    botaoBuscar = new JButton("Buscar");
    botaoBuscar.setBounds(350, 150, 100, 30);
    botaoBuscar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

        }
    });

    //Botão Excluir
    botaoExcluir = new JButton("Excluir");
    botaoExcluir.setBounds(350, 200, 100, 30);
    botaoExcluir.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

        }
    });

    //Configuração de botão na Janela
    janela.add(botaoCadastar);
    janela.add(botaoBuscar);
    janela.add(botaoExcluir);

}
