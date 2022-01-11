package com.company;
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        // Calling constructor of parent Exception
        super(str);
    }
}

public class ExceptionThw {
    //function to check if person is eligible to vote or not
    public static void validate(int age) {
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            try {
                throw new UserDefinedException("Sorry age is less then 18");
            }
            catch(UserDefinedException ude){
                System.out.println(ude.getMessage());
            }
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    //main method
    public static void main(String args[]){
        //calling the function

            validate(13);

        System.out.println("rest of the code...");
    }
}