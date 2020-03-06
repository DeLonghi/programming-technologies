package task2;
class U0901WorkArray<T extends Number> {
    private T[] arrNums;

    U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;
        for (int i = 0; i < arrNums.length; i++)
            doubleWork += arrNums[i].doubleValue();
        return doubleWork;
    }
}