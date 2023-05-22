import java.util.List;

class MUser {
	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook("Belajar PBO");
		EBook eBook = new EBook("Belajar Linux");
		Library eLibrary = new ELibrary(eBook);
		Library oLibrary = new OLibrary(noteBook);

		IDiskOperation bookFromELibrary = eLibrary.getBookByName("Linux");
		IDiskOperation bookFromOLibrary = oLibrary.getBookByName("PBO");

		List<IDiskOperation> books = List.of(bookFromELibrary, bookFromOLibrary);
		User user;
		for(IDiskOperation book: books) {
			user = new User(book);
			user.writeAndRead("test");
		}
	}
}
