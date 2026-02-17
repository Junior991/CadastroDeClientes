package dev.junior.santos.CadastroDeClientes.clientes;

import dev.junior.santos.CadastroDeClientes.missoes.MissoesModel;
import jakarta.persistence.*;

//@Entity transforma uma classe em uma entidade do banco de dados..
@Entity
@Table(name ="tb_cadastro")
public class ClienteModel {
    public Long getId1() {
        return id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id1;
    private Long id;
    private String nome;
    private int idade;
    private String email;

    // Um cliente tem uma inica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira
    private MissoesModel missoes;

    public ClienteModel() {
    }

    public ClienteModel(int idade, String email, String nome) {
        this.idade = idade;
        this.email = email;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

