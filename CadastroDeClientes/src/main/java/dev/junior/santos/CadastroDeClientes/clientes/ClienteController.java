package dev.junior.santos.CadastroDeClientes.clientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {
//
     //teste
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Testando a primeira rota";
    }
}
