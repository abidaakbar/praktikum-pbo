class OLibrary extends Library {
	private IDiskOperation book;

	public OLibrary(IDiskOperation book) {
		this.book = book;
	}

	public IDiskOperation getBookByName(String name) {
		System.out.println("get book from offline-library");
		return book;
	}
}
