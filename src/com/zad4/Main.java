package com.zad4;

import java.util.ArrayList;
import java.util.List;

/*
   Interfejs:
   - mamy kilka klas niepowiazanych ze sobą
   - a chcemy je wrzucić do Kolekcji i wywołać konretną metodę
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Admin admin = new Admin("adam");
        RegularUser regularUser = new RegularUser("piotr");

        Admin admin2 = new Admin("super-adam");
        RegularUser regularUser2 = new RegularUser("piotr2");

        List<Userable> objects= new ArrayList<Userable>();
        objects.add(admin2);
        objects.add(admin);
        objects.add(regularUser);
        objects.add(regularUser2);
        for (Userable u:objects ){
            System.out.println(u.getUsername());
        }


    }
}
