package th02.business;

import java.util.Scanner;

public interface IEmployee {
    int  BASIC_SALARY =  1300000;
    void inputData(Scanner scanner, boolean isAdd);
    void displayData();

}
