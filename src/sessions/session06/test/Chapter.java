package sessions.session06.test;

public class Chapter {

	private String name;
	private Chapter[] children = new Chapter[0];

	public Chapter(String name) {
		this.name = name;
	}

	public void setChildren(Chapter[] children) {
		this.children = children;
	}

	public void display(String prefix) {
		System.out.println(prefix + " " + name);
		for (int i = 0; i < children.length; i++) {
			children[i].display(prefix + (i + 1) + ".");
		}
	}

}
