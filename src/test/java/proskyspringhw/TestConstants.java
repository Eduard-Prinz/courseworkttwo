package proskyspringhw;


import proskyspringhw.question.Question;

import java.util.Set;

public class TestConstants {

    public static final String QUESTION1 = "Вопрос номер один";
    public static final String QUESTION2 = "Вопрос номер два";
    public static final String QUESTION3 = "Вопрос номер три";

    public static final String ANSWER1 = "Ответ номер один";
    public static final String ANSWER2 = "Ответ номер два";
    public static final String ANSWER3 = "Ответ номер три";

    public static final Question FULL_QUESTION1 = new Question(QUESTION1, ANSWER1);
    public static final Question FULL_QUESTION2 = new Question(QUESTION2, ANSWER2);
    public static final Question FULL_QUESTION3 = new Question(QUESTION3, ANSWER3);

    public static final Set<Question> TEST_QUESTIONS1 = Set.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3);
    public static final Set<Question> TEST_QUESTIONS2 = Set.of(FULL_QUESTION1);

    public static final String EMPTY_ANSWER = null;
}