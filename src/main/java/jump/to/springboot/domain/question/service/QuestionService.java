package jump.to.springboot.domain.question.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jump.to.springboot.domain.question.entity.Question;
import jump.to.springboot.domain.question.repository.QuestionRepository;
import jump.to.springboot.global.exception.DataNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

	private final QuestionRepository questionRepository;

	public List<Question> getList() {
		return this.questionRepository.findAll();
	}

	public Question getQuestion(Integer id) {
		Optional<Question> question = this.questionRepository.findById(id);
		if (question.isPresent()) {
			return question.get();
		} else {
			throw new DataNotFoundException("question not found");
		}
	}
}
