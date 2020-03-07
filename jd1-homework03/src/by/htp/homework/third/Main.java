package by.htp.homework.third;
import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Main {

	public static void task01() {
		
		// Необходимо вывести на экран числа от 1 до 5
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1);
		}	
	}
	
	public static void task02() {
		
		// Необходимо вывести на экран числа от 5 до 1
		
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void task03() {
		
		// Необходимо вывести на экран таблицу умножения на 3
		
		for (int i = 0; i < 10; i++) {
			int num;
			num = i + 1;
			int mult = num * 3;
			
			System.out.println(num + " * 3 = " + mult);
		}
	}
	
	public static void task04() {
		
		// С помощью оператора while напишите программу 
		// вывода всех четных чисел в диапазоне от 2 до 100 включительно
		
		int start;
		start = 2;
		
		while (start <= 100) {
			System.out.print(start + " ");
			start = start + 2;
		}
	}
		
	public static void task05() {
		
		// С помощью оператора while напишите программу 
		// определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
		
		int firstNum;
		int sum;
		firstNum = 1;
		sum = 0;
		
		while (firstNum <= 99) {
			sum = sum + firstNum;
			firstNum = firstNum + 2;
		}
		
		System.out.println(sum);
	}
	
	public static void task06() {
	
		// Напишите программу, где пользователь вводит любое целое положительное число. 
		// А программа суммирует все числа от 1 до введенного пользователем числа.
		
		int sum;
		sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a positive integer");
		int last = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < last; i++) {
			sum = sum + i + 1;
		}
		
		System.out.println(sum);	
	}
	
	public static void task07(int x) {
		
		// Вычислить значения функции на отрезке [а,b] c шагом h:
		
		int a;
		int b;
		int h;
		int y;
		
		a = 0;
		b = 10;
		h = 2;
		
		if (x > 2) {
			for (int i = a; i <= b; i = i + h) {
				y = i;
				System.out.println("y = " + y);
			}
		} else {
			for (int i = a; i <= b; i = i + h) {
				y = -i;
				System.out.println("y = " + y);
			}
		}
	}
	
	public static void task08(int x, int c) {
		
		// Вычислить значения функции на отрезке [а,b] c шагом h:
		
		int a;
		int b;
		int h;
		int y;
		
		a = 0;
		b = 10;
		h = 2;
		
		if (x == 15) {
			for (int i = a; i <= b; i = a + h) {
				y = (i + c) * 2;
				System.out.println("y = " + y);
			}
		} else {
			for (int i = a; i <= b; i = a + h) {
				y = i - c + 6;
				System.out.println("y = " + y);
			}
		}
	}
	
	public static void task09() {
		
		// Найти сумму квадратов первых ста чисел
		
		int firstNum;
		int squared;
		int sum;
		
		sum = 0;
		
		for (int i = 0; i < 100; i++) {
			firstNum = i+1;
			squared = firstNum * firstNum;
			sum = sum + squared;
		}
		
		System.out.println("sum = " + sum);
	}
	
	public static void task10() {
		
		// Составить программу нахождения произведения квадратов первых двухсот чисел.
		
		int firstNum;
		int squared;
		BigInteger mult = new BigInteger("1");
		
		
		for (int i = 1; i <= 200; i++) {
			firstNum = i;
			squared = firstNum * firstNum;
			mult = mult.multiply(BigInteger.valueOf(squared));
		}
		
		System.out.println("multiplied = " + mult);
	}
	
	public static void task11() {
		
		// Составить программу нахождения разности кубов первых двухсот чисел
		
		double firstNum;
		double cube;
		BigDecimal subtr = new BigDecimal("8000000.0");
		
		
		for (int i = 200; i >0; --i) {
			firstNum = i;
			cube = Math.pow(firstNum, 3);
			subtr = subtr.subtract(BigDecimal.valueOf(cube));
		}	
		
		System.out.println("subtracted = " + subtr);	
	}
	
	public static void task12() {
		
		// Последовательность аn строится так: а1 = 1, an =6+ аn-1 , 
		// для каждого n >1 Составьте программу нахождения 
		// произведения первых 10 членов этой последовательности.
		
		int a1;
		int a10;
		long mult;
		
		a1 = 1;
		a10 = a1 + 9 * 6; // an = a1 + (n - 1) * d
		
		mult = 1;
		
		for (int i = a1; i <= a10; i = i + 6) {
			int a = i;
			System.out.print(a + " ");
			mult = mult * a;
		}
		
		System.out.println("multiplied = " + mult);
	}
	
	public static void task13() {
		
		// Составить таблицу значений функции y = 5 - x^2/2 на отрезке [-5; 5] с шагом 0.5.
		
		double x;
		double y;
		
		x = 0.0;
		y = 5 - 0.5 * x * x;
		
		System.out.println("  x  |   y");
		System.out.println("--------------");
		
		for (double i = -5; i <= 5; i = i + 0.5) {
			x = i;
			y = 5 - 0.5 * x * x;
			if (x >= 0) {
				System.out.print(" " + x + " |");
			} else {
				System.out.print(x + " |");
			}
			
			if (y < 0) {
				System.out.println(" " + y);
			} else {
				System.out.println("  " + y);
			};
			
		}	
	}
	
	public static void task14() {
		
		// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
		
		double a;
		int n;
		double sum;
		
		n = 6;
		sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			a = (double) 1 / (i + 1);
			sum = sum + a;
		}
		
		System.out.println("sum = " + sum);
	}
	
	public static void task15() {
		
		// Вычислить : 1+2+4+8+...+ 2 в 10 степени
		
		double base;
		double a;
		double sum;
		
		base = 2;
		sum = 0;
		
		for (int i = 0; i < 11; i++) {
			a = Math.pow(base, i);
			sum = sum + a;
		}
		System.out.println("sum = " + sum);
	}
	
	public static void task16() {
		
		// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
		
		int a;
		long mult;
		
		a = 1;
		mult = 1;
		
		for (int i = 0; i < 9; i++) {
			int h = i + 2;
			a = a + h;
			mult = mult * a;
		}
		System.out.println("mult = " + mult);
	}
	
	public static void task17() {
		
		// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
		
		int a;
		int n;
		int num;
		int mult;
		
		a = 1;
		n = 8;
		mult = 1;
		
		for (int i = 0; i < n; i++) {
			num = a + i;
			mult = mult * num;
		}
		System.out.println("mult = " + mult);
	}
	
	public static void task18() {
		
		// Даны числовой ряд и некоторое число е. 
		// Найти сумму тех членов ряда, модуль которых больше 
		// или равен заданному е. Общий член ряда имеет вид: an = (-1)^(n-1) / n
		
		double an;
		double n;
		double nLast;
		double e;
		double sum;
		
		nLast = 4;
		e = 0.5;
		sum = 0;
		
		for (int i = 0; i < nLast; i++) {
			n = i + 1;
			an = Math.pow(-1, (n - 1)) / n;
			
			if (Math.abs(an) >= e) {
				sum = sum + an;
			}
		}
		System.out.println("sum = " + sum);
	}
	
	public static void task19() {
		
		// Даны числовой ряд и некоторое число е. 
		// Найти сумму тех членов ряда, модуль которых 
		// больше или равен заданному е. Общий член ряда имеет вид: an = 2^(-n) + 3^(-n)
		
		double an;
		double n;
		double nLast;
		double e;
		double sum;
		
		nLast = 4;
		e = 0.5;
		sum = 0;
		
		for (int i = 0; i < nLast; i++) {
			n = i + 1;
			an = Math.pow(2, -n) + Math.pow(3, -n);
			if (Math.abs(an) >= e) {
				sum = sum + an;
			}
		}
		System.out.println("sum = " + sum);
	}
	
	public static void task20() {
		
		// Даны числовой ряд и некоторое число е. 
		// Найти сумму тех членов ряда, модуль которых 
		// больше или равен заданному е. Общий член ряда имеет вид: an = ((3n-2) * (3n+1))^(-1)
		
		double an;
		double n;
		double nLast;
		double e;
		double sum;
		
		nLast = 4;
		e = 0.1;
		sum = 0;
		
		for (int i = 0; i < nLast; i++) {
			n = i + 1;
			an = 1 / (3 * n - 2) / (3 * n + 1);
			if (Math.abs(an) >= e) {
				sum = sum + an;
			}
		}
		System.out.println("sum = " + sum);
	}
	
	public static void task21() {
		
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
		// Результат представить в виде таблицы, первый столбец которой – значения аргумента, 
		// второй - соответствующие значения функции: F(x) = x - sin(x)
		
		double fx;
		double x;
		double a;
		double b;
		double h;
		
		a = -5.0;
		b = 5.0;
		h = 2.0;
		
		System.out.println("  x  |   y   ");
		System.out.println("---------------------------");
		
		for (double i = a; i <= b; i = i + h) {
			x = i;
			fx = x - Math.sin(x);
			if (x >= 0) {
				System.out.print(" " + x + " |");
			} else {
				System.out.print(x + " |");
			}
			
			if (fx < 0) {
				System.out.println(" " + fx);
			} else {
				System.out.println("  " + fx);
			}
		}
	}
	
	public static void task22() {
		
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
		// Результат представить в виде таблицы, первый столбец которой – значения аргумента, 
		// второй - соответствующие значения функции: F(x) = (sin(x))^2
		
		double fx;
		double x;
		double a;
		double b;
		double h;
		
		a = -5.0;
		b = 5.0;
		h = 2.0;
		
		System.out.println("  x  |   y   ");
		System.out.println("---------------");
		
		for (double i = a; i <= b; i = i + h) {
			x = i;
			fx = Math.sin(x) * Math.sin(x);
			if (x > 0) {
				System.out.print(" ");
			}
			System.out.println(x + " |  " + fx);
		}	
	}
	
	public static void task23() {
		
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
		// Результат представить в виде таблицы, первый столбец которой – значения аргумента, 
		// второй - соответствующие значения функции:  F(x) = ctg(x/3) + 0.5 * sin(x)
		
		double fx;
		double x;
		double a;
		double b;
		double h;
		
		a = -5.0;
		b = 5.0;
		h = 2.0;
		
		System.out.println("  x  |   y   ");
		System.out.println("--------------------------");
		
		for (double i = a; i <= b; i = i + h) {
			x = i;
			fx = 1 / Math.tan(x / 3) + 0.5 * Math.sin(x);
			if (x >= 0) {
				System.out.print(" " + x + " |");
			} else {
				System.out.print(x + " |");
			}
			
			if (fx < 0) {
				System.out.println(" " + fx);
			} else {
				System.out.println("  " + fx);
			}
		}	
	}
	
	public static void task24() {
		
		// Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. 
		// Преобразовать его в другое число, цифры которого будут 
		// следовать в обратном порядке по сравнению с введенным числом.
		
		
		int givenNum;
		int separate;
		int sum;
		double newNum;
		int finalNum;
		
		sum = 0;
		newNum = 0;
		
		int length;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your N ");
		givenNum = sc.nextInt();
		sc.close();
		
		length = 0;
		temp = 1;
		
		while (temp <= givenNum) {
			length = length + 1;
			temp = temp * 10;
		}
		
		for (int i = 0; i < length; i++) {
			separate = givenNum % 10;
			if (separate % 2 == 0) {
				sum = sum + separate;
			}
			newNum = newNum + separate * Math.pow(10, (length - 1 - i));
			givenNum = givenNum / 10;
		}
		
		finalNum = (int) newNum;
		System.out.println(finalNum);
		System.out.println("sum of even = " + sum);
	}
	
	public static void task25() {
		
		// Требуется определить факториал числа, которое ввел пользователь
		
		int num;
		int factorial;
		factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your N ");
		num = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < num; i++) {
			factorial = factorial * (i + 1);
		}
		System.out.println("factorial " + num + " = " + factorial);
	}
	
	public static void task26() {
		
		// Вывести на экран соответствий между символами и их численными обозначениями 
		// в памяти компьютера (Таблицу ASCII).
		
		char sign;
		
		System.out.println("num  | sign");
		for (int i = 32; i < 256; i++) {
			sign = (char)i;
			
			if (i < 100) {
				System.out.print(" ");
			}
			
			System.out.println(i + " | " + sign);
		}
	}
	
	public static void task27() {
		
		// Для каждого натурального числа в промежутке от m до n вывести все делители, 
		// кроме единицы и самого числа. m и n вводятся с клавиатуры.
			
		int m;
		int n;
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your m ");
		m = sc.nextInt();
		System.out.println("Enter your n ");
		n = sc.nextInt();
		
		for ( int i = m; i <= n; i++) {
			System.out.print("Делители " + i + " : ");
			for (int j = 2; j <= 9; j++) {
				if ((i % j == 0) && (i != j)) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}	
	}
	
	public static void task28() {
		
		// Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
		// Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, 
		// а также на ввод Y=0 при делении. Организовать возможность многократных вычислений 
		// без перезагрузки программы (т.е. построить цикл). 
		// В качестве символа прекращения вычислений принять ‘0’.
		
		double x;
		double y;
		double z;
		char ch;
		
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your x ");
			x = sc.nextInt();
			if (x == 0) {
				break;
			}
			System.out.println("Enter your y ");
			y = sc.nextInt();
			System.out.println("Enter your operator ");
			ch = sc.next().charAt(0);
			
			switch (ch) {
			case '+':
				z = x + y;
				System.out.println(z);
				break;
			
			case '-':
				z = x - y;
				System.out.println(z);
				break;
			
			case '*':
				z = x * y;
				System.out.println(z);
				break;
			
			case '/':
				if (y == 0) {
					System.out.println("you can't divide by 0, try again");
					break;
				} else {
					z = x / y;
					System.out.println(z);
				}
				break;
				
			default:
				System.out.println("try again with + - * /");
				break;
			}
		}
	}
	
	public static void task29() {
		
		// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
		
		int a;
		int b;
		int num1;
		int num2;
		
		a = 3456;
		b = 740536;
		
		while (a > 0) {
			num1 = a % 10;
			a = a / 10;
			num2 = b;
			while (num2 > 0) {
				if(num2 % 10 == num1) {
					System.out.print(num1 + "; ");
					num2 = num2 / 10;
					break;
				} else {
					num2 = num2 / 10;
				}
			}
		}
	}
	
	public static void task30() {
		
		//  Написать программу, переводящую римские цифры в арабские.
		int current;
		int previous;
		int arabic;
		int positionRoman;
		
		current = 0;
		previous = 0;
		arabic = 0;
		positionRoman = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Roman number ");
		String roman = sc.next();
		sc.close();
		
		int length;
		length = roman.length();
		
		while (positionRoman < length) {
			char romanNum = roman.charAt(positionRoman);
			
			if (romanNum == 'I') {
				current = 1;
			} else if (romanNum == 'V') {
				current = 5;
			} else if (romanNum == 'X') {
				current = 10;
			} else if (romanNum == 'L') {
				current = 50;
			} else if (romanNum == 'C') {
				current = 100;
			} else if (romanNum == 'D') {
				current = 500;
			} else if (romanNum == 'M') {
				current = 1000;
			}
			
			if (current <= previous) {
				arabic = arabic + current;
			} else {
				arabic = arabic + current - 2 * previous; // 1 раз отнимаем предыдущее число от arabic, второй - от текущего числа
			}
			
			previous = current;
			positionRoman = positionRoman + 1;	
		}
		
		System.out.println(arabic);
	}
	
	public static void task31() {
		
		// Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. 
		// Человек пытается их угадать. Программа должна выводить угаданные и неугаданные числа из тех, 
		// что сгенерировала программа, а также ошибочные числа пользователя
		
		int[] generated = new int[5];
		
		Random rand = new Random();
		
		for (int i = 0; i <generated.length; i++) {
			generated[i] = rand.nextInt(15) + 1;
		}
		
		int[] entered = new int[5];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("введите 5 чисел [1-15] через пробел");
		for (int i = 0; i < entered.length; i++) {
			entered[i] = sc.nextInt();
		}
		
		// считаем кол-во совпадений  в массивах
		int counter1;
		counter1 = 0;
		int m = 0;
		for (int i = 0; i < entered.length; i++) {
			for (int j = m; j < generated.length; j++) {
				if (entered[i] == generated[j]) {	// находим совпадение
					counter1 = counter1 + 1;
					int temp = generated[j];		// убираем сгенерированное число в начало, чтобы больше с ним не сравнивать
					for (int y = j; y > 0; y--) {
						generated[y] = generated[y - 1];
					}
					generated[0] = temp; 
					
					m++; // совпавший элемент generated[] больше не сравниваем
					break;
				}
			}
		}
			
		int[] hit = new int[counter1];

		for (int i = 0; i < hit.length; i++) {
			hit[i] = generated[i];
		}
		
		System.out.println("угаданные числа: ");
		for(int i = 0; i < hit.length; i++) {
			System.out.print(hit[i] + " " );
		}
		
		int[] missed = new int[generated.length - counter1];
		int n;
		n = 0;
		for (int i = counter1; i < generated.length;  i++) {
			missed[n] = generated[i];
			n = n + 1;
		}
		
		System.out.println();
		System.out.println("неугаданные числа: ");
		for(int i = 0; i < missed.length; i++) {
			System.out.print(missed[i] + " " );
		}		
		
		// отсортируем введённый массив, сдвинув ошибки в конец.
		for(int i = 0; i < hit.length; i++) {
			for (int j = 0; j < entered.length; j++) {
				if (hit[i] == entered[j]) {
					int temp = entered[j];
					for (int k = j; k > 0; k--) {
						entered[k] = entered[k-1];
					}
					entered[0] = temp;
					j++;
					break;
				}
			}
		}
		
		int [] mistake = new int[entered.length - counter1];
		int p;
		p = 0;
		for (int i = counter1; i < entered.length; i++) {
			mistake[p] = entered[i];
			p++;
		}
		
		System.out.println();
		System.out.println("ошибочные числа: ");
		
		for(int i = 0; i < mistake.length; i++) {
			System.out.print(mistake[i] + " " );
		}	
	}
	
	
	public static void task32() {
		// Проверить введенную пользователем строку на наличие недопустимых символов. 
		// В качестве первого символа допустимы только буквы и знак подчеркивания. 
		// Остальные символы могут быть буквами, цифрами и знаком подчеркивания
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string using latin alphabet");
		String text = sc.nextLine();
		sc.close();
		
		int len;
		len = text.length();
		
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				if (!(Character.isLetter(text.charAt(i)) 
						|| text.charAt(i) == '_')) {
					System.out.println("ERROR! use letters or _ for your 1st symbol");
				}	
			} else {
				if (!(Character.isLetter(text.charAt(i))
						|| Character.isDigit(text.charAt(i))
						|| text.charAt(i) == '_')) {
					System.out.println("ERROR! use only letters, numbers or _ for your text");
					break;
				} 
			}
		}					
	}
	
	public static void task33() {
		
		// Найдите наибольшую цифру данного натурального числа
		
		int n;
		n = 563892;
		
		int counter;
		int temp;
		
		counter = 0;
		temp = n;
		
		while (temp > 0) {
			temp = temp / 10;
			counter = counter + 1;
		}
		
		int[] arr = new int[counter];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = n % 10;
			n = n / 10;
		}
		
		int max;
		max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);	
	}
	
	public static void task34() {
		
		// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15
		
		for (int i = 1000; i < 10000; i++) {
			int a = i / 1000;
			int b = i % 1000 / 100;
			int c = i % 100 / 10;
			int d = i % 10;
			
			int sum = a + b + c + d;
			
			if (sum == 15) {
				System.out.println(i);
			}
		}
	}
	
	public static void task35() {
		
		// Найдите количество четных цифр данного натурального числа.
		
		int n;
		n = 123456789;
		
		int counter;
		int temp;
		
		counter = 0;
		temp = n;
		
		while (temp > 0) {
			temp = temp / 10;
			counter = counter + 1;
		}
		
		int[] arr = new int[counter];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = n % 10;
			n = n / 10;
		}
		
		int sumEven;
		sumEven = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumEven = sumEven + arr[i];
			}
		}
		System.out.println(sumEven);
	}
	
	public static void task36() {
		
		// Два двузначных числа, записанных одно за другим, образуют четырёхзначное число, 
		// которое делится на их произведение. Найти эти числа.
		
		for (int i = 1010; i < 10000; i++) {
			int a = i / 100;
			int b = i % 100;
			
			if (b > 9) {
				int mult = a * b;
				if(i % mult == 0) {
					System.out.println(a + " and " + b);
				}
			}
		}
	}
	
	public static void task37() {
		
		// Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: 
		// первое число получили путем написания сначала числа А, затем В. 
		// Для получения второго числа сначала записали число В, затем А.
		// Найти числа А и В если известно, что 
		// первое четырехзначное число нацело делится на 99, а второе на 49.
		
		for (int i = 1010; i < 10000; i++) {
			if (i % 100 > 9) {
				int reverse = i % 100 * 100 + i / 100;
				if ((i % 99 == 0) && (reverse % 49 == 0)) {
					int a = i / 100;
					int b = i % 100;
					System.out.println(a + " and " + b);
				}
			}
		}
	}
	
	public static void task38() {
		
		// Для заданного натурального числа определить, 
		// образуют ли его цифры арифметическую прогрессию. 
		// Предполагается, что в числе не менее трёх цифр. Например: 1357, 963
		
		int num;
		num = 123456780;
		
		int counter, temp;
		counter = 0;
		temp = num;
		
		while (temp > 0) {
			counter = counter + 1;
			temp = temp / 10;
		}
		
		int[] arr = new int[counter];
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = num % 10;
			num = num / 10;
		}
		
		int n;
		n = arr[1] - arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] + n != arr[i]) {
				System.out.println("no");
				break;
			}
			if (i == arr.length - 1) {
				System.out.println("yes");
			}
		}		
	}
	
	public static void task39() {
		
		// В трехзначном числе зачеркнули старшую цифру. 
		// Когда полученное число умножили на 7, 
		// то получили исходное число. Найти это число.
		
		for (int i = 100; i < 1000; i++) {
			if((i % 7 == 0) && (i / 7 == i % 100)) {
				System.out.println(i);
			}
		}
	}
	
	public static void task40() {
		
		// Получить все числа, не превышающие заданного числа N, 
		// которые делятся без остатка на все свои цифры.
		
		int n;
		n = 150;
		
	outer:	for(int i = 1; i < n; i++) {
			
			int counter;
			int temp1;
			
			counter = 0;
			temp1 = i;
			while (temp1 > 0) {
				counter = counter + 1;
				temp1 = temp1 / 10;
			}
			
			int[] digits = new int[counter];
			
			int temp2;
			temp2 = i;
			for(int j = 0; j <digits.length; j++) {
				
				if(temp2 % 10 == 0) {    // на 0 не делим
					continue outer;
				}
				
				digits[j] = temp2 % 10;
				temp2 = temp2 / 10;
			}
			
			for(int j = 0; j < digits.length; j++) {
				if (i % digits[j] != 0) {
					break;
				}
				
				if (j == digits.length - 1) {
					System.out.print(i + "; ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		task03();
		
	}
}
