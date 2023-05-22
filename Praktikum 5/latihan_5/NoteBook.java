class NoteBook implements IDiskOperation {
	private String content;
	private String name;

	public NoteBook(String name) {
		this.name = name;
		this.content = "";
	}

	public boolean write(String content){
		if (content == null) {
			return false;
		}
		System.out.println("Menulis menggunakan notebook: " +this.name);
		this.content.concat(content);
		return true;
	}

	public String read(){
		System.out.println("Membaca dari notebook: " + this.content);
		return this.content;
	}
}
