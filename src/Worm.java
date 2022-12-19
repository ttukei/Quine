import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Worm {
    int numOfTimes;
    String[] array = {
            "import java.io.FileNotFoundException;",
            "import java.io.IOException;",
            "import java.io.PrintWriter;",
            "public class Worm",
            "int numOfTimes",
            "String[] array ={",
            "};",
            "public static void main(String[] args){",
            "Worm",
            "char quote = 34;",
            "if (worm.numOfTimes < 5) {",
            "try {",
            "PrintWriter myWriter = new PrintWriter(String.valueOf( new char[]{ 'W', 'o', 'r', 'm', Character.forDigit(worm.numOfTimes+1, 10), '.', 'j', 'a', 'v', 'a'}));",
            "myWriter.println(worm.array[0]);",
            "myWriter.println(worm.array[1]);",
            "myWriter.println(worm.array[2]);",
            "myWriter.println(worm.array[3]+(worm.numOfTimes + 1)+'{');",
            "myWriter.println(worm.array[4] + '=' + (worm.numOfTimes + 1) + ';');",
            "myWriter.println(worm.array[5]);",
            "for (int i = 0; i < worm.array.length; i++) {",
            "myWriter.println(quote + worm.array[i] + quote + ',');",
            "}",
            "myWriter.println(worm.array[6]);",
            "myWriter.println(worm.array[7]);",
            "myWriter.println(worm.array[8]+(worm.numOfTimes+1)+' '+'w'+'o'+'r'+'m'+'='+'n'+'e'+'w'+' '+worm.array[8]+(worm.numOfTimes+1)+'('+')'+';');",
            "for (int i = 9; i <worm.array.length; i++) {",
            "myWriter.println(worm.array[i]);",
            "}",
            "myWriter.close();",
            "try {",
            "Process i = Runtime.getRuntime().exec(String.valueOf(new char[]{'j', 'a', 'v', 'a', 'c', ' ', 'W', 'o', 'r', 'm', Character.forDigit(worm.numOfTimes+1, 10), '.', 'j', 'a', 'v', 'a'}));",
            "i.waitFor();",
            "} catch (IOException e) {",
            "e.printStackTrace();",
            "} catch (InterruptedException e) {",
            "e.printStackTrace();",
            "}",
            "try {",
            "Process j = Runtime.getRuntime().exec(String.valueOf(new char[]{'j', 'a', 'v', 'a', ' ', 'W', 'o', 'r', 'm', Character.forDigit(worm.numOfTimes+1 , 10)}));",
            "j.waitFor();",
            "} catch (IOException e) {",
            "e.printStackTrace();",
            "}",
            "} catch (FileNotFoundException | InterruptedException e) {",
            "e.printStackTrace();",
            "}",
            "}",
            "}",
            "}",
    };

    public static void main(String[] args) {
        Worm worm = new Worm();
        char quote = 34;
        if (worm.numOfTimes < 5) {
            try {
                PrintWriter myWriter = new PrintWriter(String.valueOf( new char[]{ 'W', 'o', 'r', 'm', Character.forDigit(worm.numOfTimes+1, 10), '.', 'j', 'a', 'v', 'a'}));
                myWriter.println(worm.array[0]);
                myWriter.println(worm.array[1]);
                myWriter.println(worm.array[2]);
                myWriter.println(worm.array[3]+(worm.numOfTimes+1)+'{');
                myWriter.println(worm.array[4] + '=' + (worm.numOfTimes+1) + ';');
                myWriter.println(worm.array[5]);
                for (int i = 0; i < worm.array.length; i++) {
                    myWriter.println(quote + worm.array[i] + quote + ',');
                }
                myWriter.println(worm.array[6]);
                myWriter.println(worm.array[7]);
                myWriter.println(worm.array[8]+(worm.numOfTimes+1)+' '+'w'+'o'+'r'+'m'+'='+'n'+'e'+'w'+' '+worm.array[8]+(worm.numOfTimes+1)+'('+')'+';');
                for (int i = 9; i < worm.array.length; i++) {
                    myWriter.println(worm.array[i]);
                }
                myWriter.close();
                try {
                    Process i = Runtime.getRuntime().exec(String.valueOf(new char[]{'j', 'a', 'v', 'a', 'c', ' ', 'W', 'o', 'r', 'm', Character.forDigit(worm.numOfTimes+1, 10), '.', 'j', 'a', 'v', 'a'}));
                    i.waitFor();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Process j = Runtime.getRuntime().exec(String.valueOf(new char[]{'j', 'a', 'v', 'a', ' ', 'W', 'o', 'r', 'm', Character.forDigit(worm.numOfTimes+1 , 10)}));
                    j.waitFor();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}