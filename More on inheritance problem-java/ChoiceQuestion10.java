public class ChoiceQuestion10 extends Question10 {
    private int choiceNumber;

    public ChoiceQuestion10() {
        super();
        choiceNumber = 1;
    }

    // Add a choice to this question.
    public void addChoice(String choice, boolean correct) {
        addText(choiceNumber + ": " + choice);
        if (correct) {
            // Convert choice number to string and set as the correct answer
            setAnswer("" + choiceNumber);
        }
        choiceNumber++;
    }
}
