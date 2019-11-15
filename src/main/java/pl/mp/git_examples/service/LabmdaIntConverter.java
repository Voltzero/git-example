package pl.mp.git_examples.service;

@FunctionalInterface
public interface LabmdaIntConverter {

    int twoIntToOne(int i, int j);
    default int calcZero(String s){
        return 0;
    }
}
