package 行为型模式.iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //先创建学院
        ArrayList<College> colleges = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

//        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutputImpl output = new OutputImpl(colleges);
        output.printCollege();
    }
}
