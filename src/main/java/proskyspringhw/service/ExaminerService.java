package proskyspringhw.service;

import proskyspringhw.question.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}