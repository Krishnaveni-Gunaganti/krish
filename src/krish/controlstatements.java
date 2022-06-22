package krish;

import java.security.cert.CertStoreException;

//java program to demonstrate the use of if  else statement
//program to find even or odd number
public class IFELSE{
    public static void main(String[] args) {
        //defining variable
        int number=76;
        //checks
        if(number%2==0) {
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}

//program to find leap year or not
public class IFELSE {
    public static void main(String[] args) {
        int year = 2024;
        if ((!(year % 4)) && ((year % 100) == 0)) {
            if (!(year % 400 == 0)) {
                System.out.println("COMMON YEAR");
            } else {
                System.out.println("LEAP YEAR");
            }
        } else {
            System.out.println("LEAP YEAR");
        }

    }
}
//java program to demonstrate the use of if  else if ladder statement
//program to grading system
public class IFELSEIF{
    public static void main(String[] args) {
        int marks = 65;
        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("invalid");
        }
    }
}

//java program to demonstrate the use of nested if statement
public class NESTEDIF {
    public static void main(String[] args) {
        int age = 35;
        int weight = 67;
        if (age >= 18) {
            if (weight > 50) ;
            System.out.println("you are eligible to donate");
        else {
            System.out.println("you are not eligible to donate");
        }
    }else{
            System.out.println("Age must be greater than 18");
        }
    }
}

//java program to demonstrate the use of switch statements
public class Switch Statements {
    public static void main(String[] args) {
        //specifying month number
        int Month=7;
        switch (Month) {


            case1:
            Month = "1-january";
            break;
            case2:
            Month = "2-february";
            break;
            case3:
            Month = "3-march";
            break;
            case4:
            Month = "4-april";
            break;
            case5:
            Month = "5-may";
            break;
            case6:
            Month = "6-june";
            break;
            case7:
            Month = "7-july";
            break;
            case8:
            Month = "8-august";
            break;
            case9:
            Month = "9-september";
            break;
            case10:
            Month = "10-october";
            break;
            case11:
            Month = "11-november";
            break;
            case12:
            Month = "12-december";
            break;
            default:
                System.out.println("invalid month");
        }
        System.out.println(Month);


    }
}


//java program to demonstrate the use of if statement
public class IF{
    public static void main(String[] args) {
        //defining an age variable
        int age=20;
        //checking the age
        if(age>18){
            System.out.println("Age is greater than 18");
        }
    }
}

//
//java program to demonstrate the use of nested switch statement
public class NestedSwitch{
    public static void main(String[] args) {
        //C-CSE,E-ECE,M-MECH
        char branch='9';
        int collegeYear=4;
        switch(collegeYear) {
            case 1:
                System.out.println("english,maths,science");
                break;
        }

        case 2:
            switch(branch)
            {
                case-:
                    System.out.println("java");
                    break;
                case-:
                    System.out.println("objectScience");
                    break;
                    case

    }
    }
}