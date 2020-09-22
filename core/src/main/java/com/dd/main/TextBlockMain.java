package com.dd.main;

public class TextBlockMain {

    public static void main(String[] args) {

        String query = """
        SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
        WHERE `CITY` = 'INDIANAPOLIS'
        ORDER BY `EMP_ID`, `LAST_NAME`;
        """;

        System.out.println(query);

    }

}
