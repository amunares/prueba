package p3.lsp.violation1;

public class Square extends Rectangle {
	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
		this.height = width;
	}
}