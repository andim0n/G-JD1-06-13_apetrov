package by.itacademy.java.jd1.apetrov.practice.pak1_1;

import java.util.Scanner;

public class Task2 {

	private Scanner input;

	public static void main(final String[] args) {
		Task2 classObject = new Task2();

		int arraySize = 0;
		int[] array;
		int avNumLen = 0;

		arraySize = classObject.enterArraySize();
		array = new int[arraySize];

		array = classObject.enterArray(array);
		classObject.showArray(array);

		classObject.findMaxLen(array);
		classObject.findMinLength(array);

		avNumLen = classObject.calculateAverageNumberLenth(array);
		System.out.printf("\nAverage size of array elements: %d", avNumLen);

		classObject.findShorterThanNum(array, avNumLen);
		classObject.findLongerThanNum(array, avNumLen);

		int countEven = classObject.countNumEvenDigits(array);
		System.out.printf("\nQuantity numbers with even digits: %d", countEven);

		classObject.findMultiple(array, 3, 5);

		classObject.findPrimeNumbers(array);

		classObject.findNumDigitsInOrder(array);

		int firstPalindrom = classObject.findPalindrom(array);
		if (firstPalindrom > 0) {
			System.out.printf("\nFirst palindrom %d", firstPalindrom);
		} else {
			System.out.println("\nThere are no palindrom in array!");
		}
	}

	private int enterArraySize() {
		int sizeArray = 0;
		while (sizeArray < 0) {
			System.out.println("Enter size of array: ");
			sizeArray = enterInt();
		}
		return sizeArray;
	}

	private int enterInt() {
		input = new Scanner(System.in);
		while (!input.hasNextInt()) {
			System.out.print("This is not an integer! Try again: ");
			input.next();
		}
		int enteredInt = input.nextInt();
		return enteredInt;
	}

	private int[] enterArray(final int[] getArray) {
		for (int i = 0; i < getArray.length; i++) {
			System.out.print("Enter array element[" + i + "]:");
			getArray[i] = enterInt();
		}
		return getArray;
	}

	private void showArray(final int[] getArray) {
		System.out.println("\nArray:");
		for (int i : getArray) {
			System.out.printf("%d\t", i);
		}
	}

	private int calculateLength(final int number) {
		int lengthNumber = String.valueOf(Math.abs(number)).length();
		return lengthNumber;
	}

	private int calculateAverageNumberLenth(final int[] getArray) {
		int allLength = 0;
		int averageLength = 0;
		for (int i : getArray) {
			int numLength = calculateLength(i);
			allLength += numLength;
		}
		averageLength = allLength / getArray.length;
		return averageLength;
	}

	private void findMaxLen(final int[] getArray) {
		int maxLengthNum = getArray[0];
		int maxLength = calculateLength(getArray[0]);
		for (int i : getArray) {
			int lengthNum = calculateLength(i);
			if (lengthNum > maxLengthNum) {
				maxLengthNum = i;
				maxLength = lengthNum;
			}
		}
		System.out.printf("\nLongest number %d (%d)", maxLengthNum, maxLength);
	}

	private void findMinLength(final int[] getArray) {
		int minLengthNum = getArray[0];
		int minLength = calculateLength(getArray[0]);
		for (int i : getArray) {
			int lengthNum = calculateLength(i);
			if (lengthNum < minLengthNum) {
				minLengthNum = i;
				minLength = lengthNum;
			}
		}
		System.out.printf("\nShortest number %d (%d)", minLengthNum, minLength);
	}

	private void findShorterThanNum(final int[] getArray, final int num) {
		System.out.print("\nShorter than average: ");
		for (int i : getArray) {
			int length = calculateLength(i);
			if (length < num) {
				System.out.printf("%d (%d)\t", i, length);
			}
		}
	}

	private void findLongerThanNum(final int[] getArray, final int num) {
		System.out.print("\nLonger than average: ");
		for (int i : getArray) {
			int length = calculateLength(i);
			if (length > num) {
				System.out.printf("%d (%d)\t", i, length);
			}
		}
	}

	private int countNumEvenDigits(final int[] getArray) {
		int count = 0;
		for (int i : getArray) {
			boolean onlyEvenDig = hasOnlyEvenDigits(i);
			if (onlyEvenDig) {
				count++;
			}
		}
		return count;
	}

	private boolean hasOnlyEvenDigits(int num) {
		if (num == 0) {
			return false;
		}
		if (num < 0) {
			num *= -1;
		}
		while (num > 0) {
			int digit = num % 10;
			if ((digit % 2) == 0) {
				num /= 10;
			} else {
				return false;
			}
		}
		return true;
	}

	private void findMultiple(final int[] getArray, final int dividerOne,
			final int dividerTwo) {
		boolean hasMultiples = false;
		System.out.print("\nElements multiples 3 or 5: ");
		for (int i : getArray) {
			if (!(i == 0)) {
				if (((i % 3) == 0) || ((i % 5) == 0)) {
					System.out.printf("%d\t", i);
					hasMultiples = true;
				}
			}
		}
		if (!hasMultiples) {
			System.out.println("there are no elements of multiples 3 or 5!");
		}
	}

	private void findPrimeNumbers(final int[] getArray) {
		System.out.print("\nPrime numbers: ");
		boolean hasPrimeNumbers = false;
		int dividers = 0;
		for (int i : getArray) {
			int num = i;
			if (num < 0) {
				num *= -1;
			}
			if (num == 0) {
				continue;
			}
			dividers = 0;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					dividers++;
				}
			}
			if (dividers <= 2) {
				System.out.printf("%d\t", i);
				hasPrimeNumbers = true;
			}
		}
		if (!hasPrimeNumbers) {
			System.out.print("there are no prime numbers!");
		}
	}

	private void findNumDigitsInOrder(final int[] getArray) {
		boolean hasOrderedDigits = true;
		for (int i = 0; i < getArray.length; i++) {
			int num = getArray[i];
			if (num < 0) {
				num *= -1;
			}
			if (num < 12) {
				continue;
			}
			int length = String.valueOf(Math.abs(num)).length();
			int[] digit = new int[length];

			for (int j = 0; j < length; j++) {
				if (j == 0) {
					digit[j] = (int) (num / (Math.pow(10, (length - 2))));
				}
				digit[j] = (int) (num / (Math.pow(10, (length - j - 1))) % 10);
			}

			for (int j = 0; j < length - 1; j++) {
				if (!(digit[j + 1] - digit[j] == 1)) {
					hasOrderedDigits = false;
					break;
				}
			}
			if (hasOrderedDigits) {
				System.out.printf("\nFirst element with digets in order %d", getArray[i]);
				break;
			}
		}
		if (!hasOrderedDigits) {
			System.out.print("\nThere are no elements with digits in order!");
		}
	}

	private int findPalindrom(final int[] getArray) {
		for (int i : getArray) {
			boolean isPalindrom = isPalindrom(i);
			if (isPalindrom) {
				return i;
			}
		}
		return -1;
	}

	private boolean isPalindrom(int num) {
		if (num < 0) {
			num *= -1;
		}
		if (num > 10) {
			String digitsString = String.valueOf(num);
			if (digitsString.equals(
					new StringBuilder().append(digitsString).reverse().toString())) {
				return true;
			}
		}
		return false;
	}

}
