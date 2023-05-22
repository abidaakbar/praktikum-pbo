class EBook implements IDiskOperation {
	private String content;
	private String name;

	public EBook(String name) {
		this.name = name;
		this.content = "";
	}

	public boolean write(String content){
		if (content == null) {
			return false;
		}
		System.out.println("Menulis menggunakan Ebook: " +this.name);
		this.content.concat(content);
		return true;
	}

	public String read(){
		System.out.println("Membaca dari Ebook: " + this.content);
		return this.content;
	}
}
