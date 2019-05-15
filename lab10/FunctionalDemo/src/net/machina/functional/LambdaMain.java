package net.machina.functional;

public class LambdaMain {

    public static void main(String[] args) {
        int[] tab1 = {1,2,3,4,5}, tab2 = {2,3,4,5,6};
        try {
            ArrayPresenter ap = new ArrayPresenter(tab1, tab2);
            ap.present((a,b) -> a + b);
            System.out.println("---------");
            ap.present((a,b) -> a * b);
            System.out.println("---------");
            ap.present((a,b) -> (a + b) * 10);
        } catch(ArraySizeMismatchException asme) {
            asme.printStackTrace();
        }
    }
}