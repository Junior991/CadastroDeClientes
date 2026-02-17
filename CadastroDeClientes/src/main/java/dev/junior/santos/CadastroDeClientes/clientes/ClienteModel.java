package dev.junior.santos.CadastroDeClientes.clientes;

import dev.junior.santos.CadastroDeClientes.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity transforma uma classe em uma entidade do banco de dados..
@Entity
@Table(name ="tb_cadastro")
@NoArgsConstructor //Constroi o construtor sem elementos
@AllArgsConstructor // Constroi o construtor com todos os elementos

// Args constructor, anotação para diminuir consideravelmente o tamanho do codigo.
@Data // Cria todos os getter e os setters, diminui consideravelmente o codigo.
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


}

