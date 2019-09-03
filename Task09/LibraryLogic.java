package by.htp.hame.main8.Task09;

import java.util.ArrayList;
import java.util.List;

public class LibraryLogic {

	public List<Book> listAuthor(Library lib, String author) {

		List<Book> result = new ArrayList<Book>();

		for (Book bk : lib.getBooks()) {
			if (bk.getAuthor().compareTo(author) == 0) {
				result.add(bk);
			}
		}

		return result;
	}

	public List<Book> listPublishingHouse(Library lib, String publishingHouse) {

		List<Book> result = new ArrayList<Book>();

		for (Book b : lib.getBooks()) {
			if (b.getPublishingHouse().compareTo(publishingHouse) == 0) {
				result.add(b);
			}
		}

		return result;
	}

	public  List<Book> listAfterYear(Library lib, int year) {

		List<Book> result = new ArrayList<Book>();

		for (Book b : lib.getBooks()) {
			if (b.getYearPublishing() > year) {
				result.add(b);
			}
		}
		return result;
	}

}
