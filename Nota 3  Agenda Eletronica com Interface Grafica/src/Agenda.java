import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    //Cadastrar
    public void cadastrarContato(Contato contato) {
        contatos.add(contato);
    }

    //Buscar
    public Contato buscarContato(String cpf) {
        for (Contato contato : contatos) {
            if (contato.getCpf().equals(cpf)) {
                return contato;
            }
        }
        return null;
    }

    //Excluir
    public void excluirContato(String cpf) {
        Contato contato = buscarContato(cpf);

        if (contato != null) {
            contatos.remove(contato);
        }
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
}
