package task2;

class U0901Main {
    public static void main(String[] args) {
        Integer intArr[] = { 10, 20, 15 };
        Float floatArr[] = new Float[3];

        for (int i = 0; i < floatArr.length; i++)
            floatArr[i] = (float) (Math.random() * 100);

        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);
        
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
    }
}