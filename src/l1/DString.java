package laboration1;

public class DString implements DynamicString { // implementera metoderna i DynamicString - se lab
	private char[] text;
	private int length = 0;

	public DString() {
		this(10);
	}

	public DString(int size) {
		size = (size <= 0) ? 10 : size;
		text = new char[size];
		length = 0;
	}

	public DString(String str) {
		text = str.toCharArray();
		length = text.length;
	}

	public DString(DString str) {
		text = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			text[i] = str.charAt(i);
		}
		length = text.length;
	}

	private void grow() {
		char[] newArr = new char[length * 2];
		System.arraycopy(text, 0, newArr, 0, text.length);
		text = newArr;
	}

	public void append(char chr) {
		if (length == text.length) {
			grow();
		}
		text[length++] = chr;
	}

	@Override
	public int length() {
		return this.length;
	}

	@Override
	public char charAt(int index) {
		return this.text[index];
	}

	@Override
	public void append(DString str) {
		int orginalLength = length;
		grow();
		int y = 0;
		for (int x = orginalLength; x < length && y < str.length; x++) {
			text[x] = str.charAt(y);
			y++;
		}
	}

	@Override
	public void delete(int start, int end) {
		int i = 0;
		char[] copy = text;
		length = length - (end - start);
		text = new char[length];
		while (i < start) {
			text[i] = copy[i + start];
			i++;
		}
		while (i + end > copy.length) {
			text[i] = copy[i + end];
		}

		// int i = 0;
		// char[] copy = text;
		// length = length - (end - start);
		// text = new char[length];
		// while(start < end)
		// {
		// text[i] = copy[start];
		// i++;
		// }
	}

	@Override
	public void delete(int index) {
		char[] copy = text;
		text = new char[length - 1];
		int i = 0;
		while (true) {
			if (i < index) {
				text[i] = copy[i];
			} else if (i > index) {
				text[i] = copy[i + 1];
			}
			i++;
		}
	}

	@Override
	public String substring(int start, int end) {
		String returnString = "";
		for (int i = start; i < end; i++) {
			returnString += text[i];
		}
		return returnString;
	}

	@Override
	public String substring(int start) {
		String returnString = "";
		for (int i = start; i < text.length; i++) {
			returnString += text[i];
		}
		return returnString;
	}

	@Override
	public int indexOf(char chr) {
		for (int i = 0; i < length; i++) {
			if (text[i] == chr)
				return i;
		}
		return -1;
	}
}