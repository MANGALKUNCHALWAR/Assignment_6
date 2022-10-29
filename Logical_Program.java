import java.util.Arrays;
import java.util.Scanner;

    //1. Fibonacci Series
//Fibonacci series is a special type of series in which the next term is the sum of the
//previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
//the next term will be 1(0+1).


    class FibonacciExample1{
        public static void main(String args[])
        {
            int n1=0,n2=1,n3,i,count=10;
            //printing 0 and 1
            System.out.print(n1+" "+n2);
            //loop starts from 2 because 0 and 1 are already printed
            for(i=2;i<count;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }

        }
    }

//2. Perfect Number
//a. Just like the Armstrong number, the Perfect Number is also a special type of
//positive number. When the number is equal to the sum of its positive divisors
//excluding the number, it is called a Perfect Number. For example, 28 is the perfect
//number because when we sum the divisors of 28, it will result in the same number.
//The divisors of 28 are 1, 2, 4, 7, and 14. So,
//b. 28 = 1+2+4+7
//c. 28 = 28


    class Logical_Programs {
        public static void main(String[] args) {
            int n, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println(" Please Enter Number: ");
            n = sc.nextInt();
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum = sum + i;
            }
            if (sum == n)
                System.out.println("perfect no. Yes");
            else
                System.out.println(" No");
        }
    }

//3. Prime Number
//Just like the Perfect number, the Prime number is also a special type of number. When
//the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//divided by 2, so 2 is the only even prime minister.

    class Prime_number {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                // condition for nonprime number
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }

//or

    class Primenumber {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n,count=0,i;
            System.out.println("Enter a number");
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("it is a prime number");
            }
            else
            {
                System.out.println("not prime");
            }
        }

    }


    //4. Reverse a number
//In Java, we can reverse a number either by using for loop, while loop, or using recursion.
//The simplest way to reverse a number is by using for loop or while loop. In order to
//reverse a number, we have to follow the following steps:
//a. We need to calculate the remainder of the number using the modulo
//b. After that, we need to multiply the variable reverse by 10 and add the remainder into
//it.
//c. We then divide the number by 10 and repeat steps until the number becomes 0.
    class ReverseNumber {

        public static void main(String[] args) {
            int n, reverse = 0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            n=sc.nextInt(); //7654
            while(n != 0)
            {
                int remainder = n % 10;  //4 5 6 7
                reverse = reverse * 10 + remainder; //4 45 456 4567
                n = n/10;  //765.4
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }

    }

    //5. Coupon Numbers
//a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
//need to generate a distinct coupon number? This program simulates this random process.
//b. I/P -> N Distinct Coupon Number
//c. Logic -> repeatedly choose a random number and check whether it's a new one.
//d. O/P -> total random number needed to have all distinct numbers.
//e. Functions => Write Class Static Functions to generate random numbers and to process distinct coupons.
    class CouponQues {

        public static void main(String[] args) {
// iterate the loop until get N distinct number
            int number = 10;
            int couponCount = 0;
            int arrIndex = 0;
            int loopCount = 0;
            int[] record = new int[number];
            while (couponCount < number) {
                int random = CouponQues.generateRandomNumber(number);
                System.out.println(random);
                if (!isExists(record, random)) {
                    couponCount++;
                    record[arrIndex] = random;
                    arrIndex++;
                }
                loopCount++;
            }

            System.out.println("total loop count : " + loopCount);
            System.out.println("distinct coupons : " + Arrays.toString(record));

        }

        private static boolean isExists(int[] record, int random) {
            for (int i : record) {
                if (i == random) {
                    return true;
                }
            }
            return false;
        }

        private static int generateRandomNumber(int number) {
            return (int) (Math.floor(Math.random() * 100)) % number + 1;
        }
    }





