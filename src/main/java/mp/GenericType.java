package mp;

public class GenericType<T> {
	private T aT;

	public T getMember() {
		return aT;
	}

	public void setMember(T newT) {
		aT = newT;
	}
}
