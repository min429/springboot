package jump.to.springboot.domain.question.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jump.to.springboot.domain.question.entity.Question;
import jump.to.springboot.domain.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }
}
