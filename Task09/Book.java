package by.htp.hame.main8.Task09;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int yearPublishing;
	private int amountPage;
	private int price;
	private String typeBinding;

	public Book(int id, String title, String author, String publishingHouse, int yearPublishing, int amountPage,
			int price, String typeBinding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
		this.amountPage = amountPage;
		this.price = price;
		this.typeBinding = typeBinding;

	}

	public Book() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getAmountPage() {
		return amountPage;
	}

	public void setAmountPage(int amountPage) {
		this.amountPage = amountPage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeBinding() {
		return typeBinding;
	}

	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amountPage;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + price;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((typeBinding == null) ? 0 : typeBinding.hashCode());
		result = prime * result + yearPublishing;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (amountPage != other.amountPage)
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (price != other.price)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (typeBinding == null) {
			if (other.typeBinding != null)
				return false;
		} else if (!typeBinding.equals(other.typeBinding))
			return false;
		if (yearPublishing != other.yearPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishingHouse=" + publishingHouse
				+ ", yearPublishing=" + yearPublishing + ", amountPage=" + amountPage + ", price=" + price
				+ ", typeBinding=" + typeBinding + ", toString()=" + super.toString() + "]";
	}

}
