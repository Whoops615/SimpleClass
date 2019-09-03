package by.htp.hame.main8.Task03;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		GroupLogic grlogic = new GroupLogic();

		Group gr = new Group(22);

		gr.add(new Student("Иванов", new int[] {4,5,6,7,8}));
		gr.add(new Student("Петров", new int[] {9,10,9,9,9}));
		gr.add(new Student("Сидоров", new int[] { 9, 9, 9, 9, 9 }));
		gr.add(new Student("Никитин", new int[] { 9, 9, 9, 9, 9 }));
		gr.add(new Student("Федоров", new int[] { 9, 9, 9, 4, 9 }));
		gr.add(new Student("Клеопатра", new int[] { 9, 9, 9, 9, 9 }));
		gr.add(new Student("Цезарь", new int[] { 9, 10, 9, 9, 9 }));
		gr.add(new Student("Саурон", new int[] { 9, 9, 9, 9, 9 }));
		gr.add(new Student("Волондеморт", new int[] { 9, 9, 9, 9, 9 }));
		gr.add(new Student("Мороз", new int[] { 2, 2, 2, 2, 2 }));


		
		print(grlogic.botaniks(gr));

	}



	public static void print(List<Student> dd) {

		System.out.println("Отличники:");

		for (Student st : dd) {

			System.out.println("Номер группы: "+st.getNumberGroup() + " Фамилия: " + st.getName());
		}
	}

}
