import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public static void main() {

    DefaultTableModel modelo = new DefaultTableModel();
    JFrame janela = new JFrame();
    JPanel painelFormulario = new JPanel();
    JPanel painelBotão = new JPanel();
    JTextField textoCPF, textoTelefone, textoEmail, textoNome;
    JButton botaoCadastar, botaoBuscar, botaoExcluir;
    Agenda agenda = new Agenda();

    JPanel

    //Botão Cadastrar
    botaoCadastar =  new JButton("Cadastrar");
    botaoCadastar.setBounds(100, 100, 100, 30);
    botaoCadastar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {


        }
    });

    //Botão Buscar
    botaoBuscar = new JButton("Buscar");
    botaoBuscar.setBounds(100, 150, 100, 30);
    botaoBuscar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

        }
    });

    //Botão Excluir
    botaoExcluir = new JButton("Excluir");
    botaoExcluir.setBounds(100, 200, 100, 30);
    botaoExcluir.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

        }
    });

    //Configuração de botão na Janela
    janela.add(botaoCadastar);
    janela.add(botaoBuscar);
    janela.add(botaoExcluir);

    //Configuração de texto na Janela

    //Configuração da Janela
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setTitle("Agenda Eletrônica");
    janela.setSize(300, 500);
    janela.setLayout(null);
    janela.setLocationRelativeTo(null);
    janela.setVisible(true);
}
