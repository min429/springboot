package jump.to.springboot.domain.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jump.to.springboot.domain.question.entity.Question;
import jump.to.springboot.domain.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}
