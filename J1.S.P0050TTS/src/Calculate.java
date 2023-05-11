
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
class Calculate {

    List<Float> calculateSuperlativeEquation(float A, float B, List<Float> numberList) {
        if (numberList.isEmpty()) {
            numberList.add(A);
            numberList.add(B);
        }
        List<Float> solution = null;
        if (A == 0 && B != 0) {
            return solution;
        }
        solution = new ArrayList<>();
        if (A == 0 && B == 0) {
            return solution;
        } else {
            float x = -B / A;
            solution.add(x);
            numberList.add(x);
        }
        return solution;
    }

    List<Float> calculateQuadraticEquation(float A, float B, float C, List<Float> numberList) {
        numberList.add(A);
        numberList.add(B);
        numberList.add(C);
        float delta = B * B - 4 * A * C;
        List<Float> solution = null;
        if (A != 0) {
            if (delta < 0) {
                return solution;
            }
            solution = new ArrayList<>();
            if (delta >= 0) {
                float x1, x2;
                x1 = (-B + (float) Math.sqrt(delta)) / 2 * A;
                x2 = (-B - (float) Math.sqrt(delta)) / 2 * A;
                solution.add(x1);
                solution.add(x2);
                numberList.add(x1);
                numberList.add(x2);
            }

        } else {
            solution = calculateSuperlativeEquation(B, C, numberList);
        }
        return solution;
    }

}
