package by.htp.hame.main8.Task05;

/*
 *  5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Counter {

	private int minValue;
	private int maxValue;
	private int currentValue;

	public Counter() {

	}

	public Counter(int minValue, int maxValue, int currentValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.currentValue = currentValue;

	}

	public void increase() {
		currentValue++;
	}

	public void decrease() {
		currentValue--;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public int get_currentValue() {
		return currentValue;
	}

	@Override
	public String toString() {
		return "Counter [minValue=" + minValue + ", maxValue=" + maxValue + ", currentValue=" + currentValue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentValue;
		result = prime * result + maxValue;
		result = prime * result + minValue;
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
		if (currentValue != other.currentValue)
			return false;
		if (maxValue != other.maxValue)
			return false;
		if (minValue != other.minValue)
			return false;
		return true;
	}

}
