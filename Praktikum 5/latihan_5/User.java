class User {
	private IDiskOperation book;

	public User(IDiskOperation book) {
		this.book = book;
	}

	public void writeAndRead(String content) {
		boolean isSuccess = book.write(content);
		if (Boolean.FALSE.equals(isSuccess)) {
			return;
		}
		System.out.println("user success write to book");
		String savedContent = book.read();
		System.out.println("user read from book");
	}
}
