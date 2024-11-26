public class ChoiceQuestion11 extends Question11 {
    private int choiceNumber;

    public ChoiceQuestion11() {
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

    @Override
    public String toString() {
        return super.toString() + "\nChoices added: " + (choiceNumber - 1);
    }
}
