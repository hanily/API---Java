package aluno.apiAlunos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/principal")

public class PrincipalController {
    @GetMapping("/mensagem")
    public String exibirMensagem(){

        return "Bem vindo à API de Alunos!!";
    }

}
