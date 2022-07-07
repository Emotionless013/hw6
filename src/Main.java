import java.util.Arrays;

public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(arr.length);
        //первая задача
        int sum=0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        // вторая задача
        int dailyMin = arr[0];
        int dailyMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (dailyMin > arr[i]) {
            dailyMin = arr[i];
        }
            if (dailyMax < arr[i]) {
                dailyMax = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + dailyMin + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + dailyMax + " рублей.");
        //третья задача
        int sumForThird = 0;
        for (int element: arr) {
            sumForThird += element;
        }
        double middle = sumForThird/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей.");
        //четвертая задача
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        for (int i = 0; i < reverseFullName.length; i++) {
            fullName[i] = reverseFullName[reverseFullName.length-i-1];
            System.out.print(fullName[i]);
        }
        System.out.println();
        //пятая задача
        //Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте
        // ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i+j)%2==0) {
                    matrix[i][j]=1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        //шестая задача
        //У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        //Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        //Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        //Нам дан массив чисел: {5, 4, 3, 2, 1}
        //Необходимо привести его к виду: {1, 2, 3, 4, 5}
        //Решите задачу с использованием дополнительного массива.
        //Напечатайте массив до преобразования и после
        int[] wrongArr = {5, 4, 3, 2, 1};
        int[] rightArr = new int[wrongArr.length];
        for (int i = 0; i < wrongArr.length; i++) {
            rightArr[i] = wrongArr[(wrongArr.length-i-1)];
        }
        System.out.println(Arrays.toString(rightArr));
        //седьмая задача
        //Решите предыдущее задание, но без использования дополнительного массива.
        //Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        //Выведите результат программы в консоль тем же способом.
        int[] wrongArr2 = {5, 4, 3, 2, 1};
        int temp;
        for (int i = 0; i < wrongArr2.length/2; i++) {
            temp = wrongArr2[i];
            wrongArr2[i]=wrongArr2[wrongArr2.length-1-i];
            wrongArr2[wrongArr2.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(wrongArr2));
        //восьмая задача
        //Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        //Необходимо найти два числа, сумма которых равна −2.
        //Напечатать эти числа в консоль.
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]+array[j]== -2) {
                    if (array[i]>array[j]) {
                        break;
                    }
                    System.out.println(array[i]+" " + array[j]);
                }

            }

        }
    }
}