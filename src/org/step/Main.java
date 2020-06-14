package org.step;

import Models.Employee;
import Products.Pen;
import Products.Pencil;
import Sets.Beginner;

import java.util.*;

public class Main {

    public static void main(String[] args) {

		Pen penBlue = new Pen("Blue", "UNE-MAX", 0.7f, "Maid in India",250,2);
		Pen penRed = new Pen("Red", "UNE-MAX", 0.7f, "Maid in India",10,5);
		Pen penGreen = new Pen("Green", "UNE-MAX", 0.7f, "Maid in India");
		Pen penRed2 = new Pen("Red", "UNE-MAX", 0.7f, "Maid in India");

		Pencil pencilGray = new Pencil("Gray", "UNE-MAX", 0.7f, "Maid in India",80,10);
		Pencil pencilOrange = new Pencil("Orange", "UNE-MAX", 0.7f, "Maid in India",80,10);
		Pencil pencilRed = new Pencil("Red", "UNE-MAX", 0.7f, "Maid in India",210,10);

		List<Pencil> pencils = new ArrayList<>();
		pencils.add(pencilGray);
		pencils.add(pencilOrange);
		pencils.add(pencilRed);

		List<Pen> collection = new ArrayList<>();

		collection.add(penBlue);
		collection.add(penRed);
		collection.add(penGreen);
		collection.add(penRed2);

		for (Object o : collection) {
			System.out.println("-----------------------------------");
			System.out.println(o.toString());
			System.out.println("HashCode: " + o.hashCode());
			System.out.println(o.equals(penBlue));
			System.out.println(o.equals(penRed));
			System.out.println(o.equals(penGreen));
			System.out.println(o.equals(penRed2));
			System.out.println("-----------------------------------");

		}

		Set beginners = new TreeSet<Beginner>();
		beginners.add(penBlue);
		beginners.add(pencilGray);
		beginners.add(penRed);
		System.out.println("-----------------------------------");
		System.out.println(" 			sort");
		for (Object o : beginners) {
			System.out.println(o);

		}
		System.out.println("-----------------------------------");

		Set employees = new HashSet();
		employees.add(new Employee("Рожков","Станислав","Онисимович","Ул.Магнитогорская",123321459520l,"Менеджер", pencils.get(1),null));
		employees.add(new Employee("Рожков","Станислав","Онисимович","Ул.Магнитогорская",123321459520l,"Менеджер", pencils.get(2),null));


		int i = 0;
		for (Object o : employees) {
			i++;
			System.out.println(employees.toString());
			System.out.println("Cтоимость: " + pencils.get(i).getSum());
		}



    }
}
