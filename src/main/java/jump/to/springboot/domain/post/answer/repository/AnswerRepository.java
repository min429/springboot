package jump.to.springboot.domain.post.answer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jump.to.springboot.domain.post.answer.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
