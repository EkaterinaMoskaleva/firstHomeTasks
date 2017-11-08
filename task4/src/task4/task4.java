package task4;

public class task4 {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex","Emma","John","James","Jane",
        "Emily", "Daniel", "Neda","Aaron", "Kate"};

        int[] results = {341,237, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        for (int i = 0; i < names.length; i ++) {
            for (int j = i + 1; j < names.length; j ++) {
                if (results[i] > results[j]) {
                    int temp = results[i];
                    String tmpStr = names[i];
                    results[i] = results[j];
                    names[i] = names[j];
                    results[j] = temp;
                    names[j] = tmpStr;
                }
            }
        }

        for (int i = 0; i < names.length; i ++) {
            System.out.println(names[i] + " -> " + results[i]);
        }


    }
}
