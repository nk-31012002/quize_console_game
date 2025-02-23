import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is the capital of Australia?", "Sydney", "Melbourne", "Canberra", "Brisbane", "Canberra");
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "Mars");
        questions[2] = new Question(3, "Who wrote the play Romeo and Juliet?", "Charles Dickens", "William Shakespeare", "Jane Austen", "George Orwell", "William Shakespeare");
        questions[3] = new Question(4, "What is the chemical symbol for gold?", "Go", "Au", "Ag", "Fe", "Au");
        questions[4] = new Question(5, "Which country hosted the 2016 Summer Olympics?", "China", "United Kingdom", "Brazil", "Japan", "Brazil");

    }



    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            //user input
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            selection[i] = sc.nextLine();
            i++;            
        }

        for(String s : selection){
            System.out.println(s);
        }
        
    }
}
