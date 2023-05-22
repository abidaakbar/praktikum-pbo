class ELibrary extends Library {
	private IDiskOperation book;

	public ELibrary(IDiskOperation book) {
		this.book = book;
	}

	public IDiskOperation getBookByName(String name) {
		System.out.println("get book from e-library");
		return book;
	}
}
