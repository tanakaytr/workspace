public class Cart{
	public Book[] books;
	
	public void add(Book[] books) {
		this.books = books;
	}
	public int getTotal() {
		int total = 0;
		for(Book book : this.books) {
		    total += book.getSubTotal();
		}
		return total;

	}
}