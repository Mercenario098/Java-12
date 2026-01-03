
package Agenda;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public Contato(String nome,
                   String telefone,
                   String email,
                   String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    // Validação de CPF e Email
    public void validacao (String cpf, String email){
        if(email == null || email.isEmpty()){
            throw new IllegalArgumentException("Email inválido!");
        }

        if (cpf.length() != 11){
            throw new IllegalArgumentException("CPF deve conter 11 dígitos!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
