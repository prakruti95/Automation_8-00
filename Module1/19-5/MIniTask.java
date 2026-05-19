package com.a165;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MIniTask
{
    static String name;
    static String surname;
    static String email;
    static String phone;
    static String pass;

    // USER INPUT WITH VALIDATION
    public static void getuserinput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        name = sc.next();

        System.out.println("Enter Your Surname");
        surname = sc.next();

        // EMAIL VALIDATION
        while(true)
        {
            System.out.println("Enter Your Email");
            email = sc.next();

            if(email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid Email Format");
            }
        }

        // PHONE VALIDATION
        while(true)
        {
            System.out.println("Enter Your Phone");
            phone = sc.next();

            if(phone.matches("[0-9]{10}"))
            {
                break;
            }
            else
            {
                System.out.println("Phone Number Must Be 10 Digits");
            }
        }

        // PASSWORD VALIDATION
        while(true)
        {
            System.out.println("Enter Your Password");
            pass = sc.next();

            // 1 uppercase, 1 lowercase, 1 digit, min 8 chars
            if(pass.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$"))
            {
                break;
            }
            else
            {
                System.out.println(
                "Password Must Contain:\n" +
                "1 Uppercase Letter\n" +
                "1 Lowercase Letter\n" +
                "1 Number\n" +
                "Minimum 8 Characters");
            }
        }
    }

    // SIGNUP
    public static void usersignup() throws IOException
    {
        getuserinput();

        FileOutputStream fout =
                new FileOutputStream("E://Abcd.txt", true);

        String userdata =
                "\n-------------------" +
                "\nName is :" + name +
                "\nSurname is :" + surname +
                "\nEmail is :" + email +
                "\nPhone is :" + phone +
                "\nPassword is :" + pass +
                "\n-------------------";

        fout.write(userdata.getBytes());

        fout.close();

        System.out.println("Signup Successful");
    }

    // LOGIN
    public static void userlogin() throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Email");
        String email1 = sc.next();

        System.out.println("Enter Your Password");
        String pass1 = sc.next();

        FileInputStream fin =
                new FileInputStream("E://Abcd.txt");

        int i;
        String data = "";

        // READ FILE
        while((i = fin.read()) != -1)
        {
            data = data + (char)i;
        }

        fin.close();

        // SPLIT USER BLOCKS
        String users[] = data.split("-------------------");

        boolean loginSuccess = false;

        // CHECK LOGIN
        for(String user : users)
        {
            String lines[] = user.split("\n");

            String storedEmail = "";
            String storedPassword = "";

            for(String line : lines)
            {
                line = line.trim();

                if(line.startsWith("Email is :"))
                {
                    storedEmail =
                            line.replace("Email is :", "").trim();
                }

                if(line.startsWith("Password is :"))
                {
                    storedPassword =
                            line.replace("Password is :", "").trim();
                }
            }

            if(storedEmail.equals(email1) &&
               storedPassword.equals(pass1))
            {
                loginSuccess = true;
                break;
            }
        }

        if(loginSuccess)
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Invalid Email or Password");
        }
    }

    // MAIN METHOD
    public static void main(String[] args)
            throws IOException, InterruptedException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Signup");
        System.out.println("2. Login");

        System.out.println("Enter Your Choice:");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                usersignup();
                break;

            case 2:
                userlogin();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}