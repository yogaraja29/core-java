package oop;

public class StackClass {

	/* LIFO: Last In First Out */

	int stack_items[] = new int[10];
	int topOfStackIdx;

	StackClass() {
		topOfStackIdx = -1; // initializing default value
	}

	boolean isStackFull() {
		return topOfStackIdx > 8;
	}

	boolean isStackEmpty() {
		return topOfStackIdx < 0;
	}

	void push(int value) {
		if (isStackFull()) {
			System.out.println("Stack is full!");
		} else {
			stack_items[++topOfStackIdx] = value;
		}
	}

	int pop() {
		if (isStackEmpty()) {
			System.out.println("Stack is empty!");
			return -1;
		}
		return stack_items[topOfStackIdx--];
	}

	void viewStack() {
		for (int item : stack_items) {
			System.out.println(item);
		}
	}

}
