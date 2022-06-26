package krish.corejava.variable;

public class TypesOfVariables
    {
        static int value1=100;//static variable
        static int localMethod()
        {
            int value2=90;//local variable

            System.out.println(value2+"from localMethod");
            return value2;
        }
        public static void main(String args[])
        {
            int value3=50;//instance variable
            System.out.println(value3);
            System.out.println(localMethod()+"from mainMethod");
        }
    }

