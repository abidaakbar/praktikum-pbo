interface IDiskOperation {
	boolean write(String content);

	String read();
}
