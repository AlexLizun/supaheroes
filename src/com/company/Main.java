package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

// вообще нужно импортить классы через import
// но так как Superhero тоже в пакете com.company, то Main его "видит"
public class Main {

    public static final String FILE_PATH = "users.txt";
    private static ArrayList<Superhero> ar = new ArrayList<Superhero>();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File(FILE_PATH));
        while (in.hasNext()) {
            String info[] = in.nextLine().split(" "); // кул
            Superhero hero = new Superhero();
            hero.id = info[0]; // здесь должна падать ошибка. У тебя String, пусть пока остаётся.
            // Потом надо будет переделать на long - числовое значение, ведь это айдишник
            hero.name = info[1];
            hero.surname = info[2];
            hero.login = info[3];
            // В общем пока что норм)
            ar.add(hero);
            System.out.println(hero); // здесь будешь выводить hero вместо info[2]
            // Только сначала переопредели .toString()

        }
        int razmer = ar.size();
       /* for (int i = 0; i <razmer ; i++) {
            System.out.println(ar.get(i));
        }*/

    }

}
