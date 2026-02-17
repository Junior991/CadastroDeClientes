package dev.junior.santos.CadastroDeClientes.missoes;


import dev.junior.santos.CadastroDeClientes.clientes.ClienteModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //uma missao pode ter varios clietes
    @OneToMany(mappedBy = "missoes")
    private List<ClienteModel> clientes;



}
