package jump.to.springboot.domain.answer.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import jump.to.springboot.domain.answer.entity.Answer;
import jump.to.springboot.domain.answer.repository.AnswerRepository;
import jump.to.springboot.domain.question.entity.Question;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {

	private final AnswerRepository answerRepository;

	public void create(Question question, String content) {
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		this.answerRepository.save(answer);
	}
}
