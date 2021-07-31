package prototype;

import java.util.ArrayList;
import java.util.List;

public class StatementExample {
    public static void main(String[] args) {
        String sql = "select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star Wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println("firstStatement.sql = " + firstStatement.getSql());
        System.out.println("firstStatement.parameters = " + firstStatement.getParameters());
        System.out.println("firstStatement.record = " + firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();

        System.out.println("secondStatement.sql = " + secondStatement.getSql());
        System.out.println("secondStatement.parameters = " + secondStatement.getParameters());
        System.out.println("secondStatement.record = " + secondStatement.getRecord());

        System.out.println("This is an example of a shallow copy");
    }
}
