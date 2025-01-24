package jump.to.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jump.to.springboot.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
