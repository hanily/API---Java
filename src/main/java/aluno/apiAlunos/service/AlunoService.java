package aluno.apiAlunos.service;

import aluno.apiAlunos.model.Aluno;
import aluno.apiAlunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id){
        return alunoRepository.findById(id);
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletarPorId(Long id) {
        alunoRepository.deleteById(id);
    }

    public Aluno atualizar(Long id, Aluno alunoAtualizado) {
        return alunoRepository.findById(id).map(aluno ->{
            aluno.setNome(alunoAtualizado.getNome());
            aluno.setIdade(alunoAtualizado.getIdade());
            aluno.setCurso(alunoAtualizado.getCurso());
            return alunoRepository.save(aluno);
        }).orElseGet(() ->{
            alunoRepository.setId(id);
            return alunoRepository.save(alunoAtualizado);
        });
    }
}	
