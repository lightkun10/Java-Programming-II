package Lectures.L2_Interfaces_as_Method_Parameters;

/*
The true benefits of interfaces are reaped when they are used as
the type of parameter provided to a method. Since an interface
can be used as a variable's type, it can also be used as a
parameter type in method calls. For example, the print method in
the Printer class of the class below gets a variable of type read.
 */
public class Printer {
    public void print(Readable readable) {
        System.out.println(readable.read());
    }
}
