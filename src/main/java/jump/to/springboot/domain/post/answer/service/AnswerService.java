package jump.to.springboot.domain.post.answer.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import jump.to.springboot.domain.post.answer.entity.Answer;
import jump.to.springboot.domain.post.answer.repository.AnswerRepository;
import jump.to.springboot.domain.post.question.entity.Question;
import jump.to.springboot.domain.user.entity.SiteUser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {

	private final AnswerRepository answerRepository;

	public Answer create(Question question, String content, SiteUser author) {
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		answer.setAuthor(author);
		this.answerRepository.save(answer);
		return answer;
	}
}
