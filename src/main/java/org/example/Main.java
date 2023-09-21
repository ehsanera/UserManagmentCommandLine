package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "World!", "How", "Are", "You"));

        var in = new Scanner(System.in);

        System.out.println("Menu: \n1- List User\n2- Add User\n3- Get User By Id\n4- Delete User\n");
        System.out.println("Please Input Menu Id: ");

        var menuId = in.nextInt();

        if (menuId == 1) {
            System.out.println(list);
        } else if (menuId == 2) {
            var input = in.next();
            list.add(input);
            System.out.println("user added");
            System.out.println(list);
        } else if (menuId == 3) {
            System.out.println("get by id");
        } else if (menuId == 4) {
            System.out.println("delete user");
        }
    }
}