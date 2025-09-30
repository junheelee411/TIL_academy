package ch12.unit02;

public class MyStackEX {
	public static void main(String[] args) {
		MyStack<String> st = new MyStackImpl<>(5);
		
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		st.push("E");
		
		while(! st.isEmpty()) {
			System.out.println(st.pop()+" ");
		}
		System.out.println();
	}
}

interface MyStack<E> {
	public E pop();
	public E peek();
	public boolean isEmpty();
	public void push(E data);
}

class MyStackImpl<E> implements MyStack<E> {
	private Object[] elements;
	private int index; // 현재 인덱스
	
	public MyStackImpl(int size) {
		elements = new Object[size];
		index = 0;
	}
	
	@Override
	public E pop() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}

		E item = peek();
		elements[--index] = null;

		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		
		return (E)elements[index - 1];
	}

	@Override
	public boolean isEmpty() {
		return index <= 0;
	}

	@Override
	public void push(E data) {
		if(index >= elements.length) {
			throw new IndexOutOfBoundsException("stack full");
		}
		
		elements[index++] = data;
	}
	
}


