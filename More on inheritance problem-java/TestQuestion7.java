public class TestQuestion7 {
    public static void main(String[] args) {
        Question7 question = new Question7();
        question.setText("Who invented Java?");
        question.setAnswer("James Gosling");

        question.display();

        // Test cases
        System.out.println(question.checkAnswer("James Gosling")); // true
        System.out.println(question.checkAnswer(" JAMES gosling ")); // true
        System.out.println(question.checkAnswer("James   Gosling")); // true
        System.out.println(question.checkAnswer("JamesGosling")); // false
        System.out.println(question.checkAnswer("Gosling")); // false
    }
}

