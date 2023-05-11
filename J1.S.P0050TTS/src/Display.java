
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
class Display {

    GetData getData = new GetData();

    void displayMenu() {
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }

    void displaySolution(List<Float> solution, int select) {
        if (solution == null) {
            System.out.println("The Equation has no solution");
            return;
        } else if (solution.isEmpty()) {
            System.out.println("Equation with infinite solutions");
            return;
        }
        switch (select) {
            case 1:
                System.out.printf("Solution: x = %.3f\n", solution.get(0));
                break;
            case 2:
                if (solution.size() == 1) {
                    System.out.printf("Solution: x = %.3f\n", solution.get(0));
                } else {
                    System.out.printf("Solution: x1 = %.3f and x2 = %.3f\n",
                            solution.get(0), solution.get(1));
                }
                break;

        }
    }

    void displayOddNumber(List<Float> numberList, String msg) {
        List<Float> OddList = new ArrayList<>();
        for (Float number : numberList) {
            if (getData.getOddNumber(number) == true) {
                OddList.add(number);
            }
        }
        if (OddList.isEmpty()) {
            System.out.println("No Odd Number");
        } else {
            System.out.print(msg);
            for (int i = 0; i < OddList.size(); i++) {
                if (i == OddList.size() - 1) {
                    System.out.println(OddList.get(i));
                } else {
                    System.out.print(OddList.get(i) + ", ");
                }
            }

        }
    }

    void displayEvenNumber(List<Float> numberList) {
        List<Float> evenList = new ArrayList<>();
        for (Float number : numberList) {
            if (getData.getEvenNumber(number) == true) {
                evenList.add(number);
            }
        }
        if (evenList.isEmpty()) {
            System.out.println("No Even Number");
        } else {
            System.out.print("Number is Even:");
            for (int i = 0; i < evenList.size(); i++) {
                if (i == evenList.size() - 1) {
                    System.out.println(evenList.get(i));
                } else {
                    System.out.print(evenList.get(i) + ", ");
                }
            }
        }
    }

    void displayPerfectSquareNumber(List<Float> numberList) {
        List<Float> perfectSquareList = new ArrayList<>();
        for (Float number : numberList) {
            if (getData.getPerfectSquareNumber(number) == true) {
                perfectSquareList.add(number);
            }
        }
        if (perfectSquareList.isEmpty()) {
            System.out.println("No Perfect Square Number");
        } else {
            System.out.print("Number is Perfect Square:");
            for (int i = 0; i < perfectSquareList.size(); i++) {
                if (i == perfectSquareList.size() - 1) {
                    System.out.println(perfectSquareList.get(i));
                } else {
                    System.out.print(perfectSquareList.get(i) + ", ");
                }
            }
        }

    }

}
