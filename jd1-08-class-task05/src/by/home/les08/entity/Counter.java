package by.home.les08.entity;

public class Counter {

	private int count;

	public Counter() {

		this.count = 0;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int elementIncrement(int value) {
		value++;
		return value;
	}

	public int elementDecrement(int value) {
		value--;
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (count != other.count)
			return false;
		return true;
	}

}
