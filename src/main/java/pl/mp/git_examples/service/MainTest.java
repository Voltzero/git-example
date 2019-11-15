package pl.mp.git_examples.service;

public class MainTest {
    public static void main(String[] args) {
        LambdaConverter my = s -> s.length();
        LabmdaIntConverter myIntAdd = (i, j) -> i + j;
        LabmdaIntConverter myIntMul = (i, j) -> i * j;
        LabmdaIntConverter myIntSub = (i, j) -> i - j;
    }
}
