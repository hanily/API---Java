package aluno.apiAlunos.repository;

import aluno.apiAlunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
