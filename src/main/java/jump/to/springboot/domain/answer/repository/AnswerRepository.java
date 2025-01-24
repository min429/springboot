package jump.to.springboot.domain.answer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jump.to.springboot.domain.answer.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
