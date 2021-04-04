package model;

public class Calculator {
    private double userInput;
    private double result;

    public Calculator() {
    }

//    public double getUserInput() {
//        return userInput;
//    }
//
//    public void setUserInput(double userInput) {
//        this.userInput = userInput;
//    }

    public Calculator(double userInput) {
        this.userInput = userInput;
    }

    public double calculateProbability(double odds) throws IncorrectArgument {
        if (odds > 1 && odds < 1000)
                result = 100 / odds;
        return result;
    }

    public double calculateOdds(double userInputPercent) {
        if (userInputPercent > 1 && userInputPercent < 99)
            result = 100 / userInputPercent;
        return 100 / userInputPercent;


    }
}
