package Question;

public class AskMe {
    static void answer(Answers results) {
        switch (results){
            case NO:
                System.out.println("НЕТ");
                break;
            case YES:
                System.out.println("ДА");
                break;
            case MAYBE:
                System.out.println("ВОЗМОЖНО");
                break;
            case LATER:
                System.out.println("ПОЗЖЕ");
                break;
            case SOON:
                System.out.println("СКОРО");
                break;
            case NEVER:
                System.out.println("НИКОГДА");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }
}
