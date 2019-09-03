package by.htp.hame.main8.Task09;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

public class Main {

	public static void main(String[] args) {

		Library lib1 = new Library();
		LibraryLogic libLog = new LibraryLogic();

		lib1.add(new Book(45, "sdfg", "wer", "abc", 345, 234, 567, "sdfgew"));
		lib1.add(new Book(45, "sdfg", "qwe", "abc", 345, 234, 567, "sdfgew"));
		lib1.add(new Book(45, "sdfg", "qwe", "q", 345, 234, 567, "sdfgew"));
		lib1.add(new Book(45, "sdfg", "qwe", "q", 347, 234, 567, "sdfgew"));
		lib1.add(new Book(45, "sdfg", "wer", "q", 348, 234, 567, "sdfgew"));
		lib1.add(new Book(45, "sdfg", "wer", "q", 348, 234, 567, "sdfgew"));

		System.out.println("Книги автора qwe:");
		for (Book b : libLog.listAuthor(lib1, "qwe")) {
			print(b);
		}
		System.out.println("Книги издательства q:");
		for (Book b : libLog.listPublishingHouse(lib1, "q")) {
			print(b);
		}
		System.out.println("Книги изданные после 345 года:");
		for (Book b : libLog.listAfterYear(lib1, 345)) {
			print(b);
		}

	}

	public static void print(Book b) {
		System.out.println(b.getId() + " " + b.getTitle() + " " + b.getAuthor() + " " + b.getPublishingHouse() + " "
				+ b.getYearPublishing() + " " + b.getAmountPage() + " " + b.getPrice() + " " + b.getTypeBinding());
	}

}
