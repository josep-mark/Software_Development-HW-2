readme
Joseph Franz
CIT 591 
HW2

The Quadratic Equation
The Quadratic Equation project uses three classes
The first class, QuadraticEquation, takes three inputs to assign to the coefficients of a quadratic equation.
The methods in the class are accessor methods to return the coefficients.
In the QuadraticEquationSolver class the instance variable is of type QuadraticEquation and the constructor receives and object of the QuadraticEquation type.
It also has a method to evaluate the equation given a value of x

The QuadraticEquationSolver class receives a QuadraticEquation object
The constructor accesses the coefficients of the QuadraticEquation and assigns them to new variables in the QuadraticEquationSolver class
The class then has two methods to solve the equation
Both methods calculate the discriminant (b^2 -4ac) then use an if statement to determine if the equation has real solutions
If the discriminant is less than zero the solver methods return 0 and print to the console that there is no real solution
If the discriminant is greater than zero:
getSolution1() finds the smaller equation by assigning (-b - sqrt(discrimant))/(2a) to a variable and printing the solution to the console
getSolution2() finds the larger equation by assigning (-b + sqrt(discrimant))/(2a) to a variable and printing the solution to the console

The changeEquation(a, b, c) method is a mutator method that changes the equation by creating a new object in the QuadraticEquation class
then it uses the solver clas to solve the new equation



PrimeGenerator
The prime generator project prints the prime numbers up to but not including a number given by the user

It does this with two classes.
The PrimeGenerator class determines a prime number and the prime number leading up to an indicated value, n.

First the isPrime() method tests a single number if it is prime. It does this by using the modulo operation on the number being tested for all the integers 2 to n-1
If the number  n % i is 0 at any point the method returns false.
If the number is not divisible by anything but itself and 1 isPrime returns true

The next method, nextPrime uses a for loop to test every integer between 1 and the given value.
If isPrime is true then nextPrime prints that number to the console.
If it is false it moves on to the next number

The printer class imports scanner and asks the user for input. It runs the nextPrime() method on the number given by the user and prints the prime numbers to the console.



Buffon needle experiment

The buffon needle experiment project uses a class and a tester class
The BuffonNeedle class takes instance variables for yHigh, yLow, alpha, and rate
The runTest method runs the experiment 10,000 times in a for loop.
It does this by using two randomized values.
According to the instructions to simulate where the needle fell on the page a random value between 0 and 2 will suffice.
To do this i used the Math.nextDouble() method and multiplied the value by 2. This leads to double values between one and two
The second random variable is alpha or the angle of the needle.
This is between 0 and 180. To do this I multiplied Math.nextDouble() by 180 to simulate double values between 0 and 180
Then I convert the random values to radians
The value yHigh is yLow + sin(alpha) which I calculate in the method
Next I use an if statement to count hits and trials. Every loop of the for loop counts a try, but if yHigh is greater than 2 it is a hit.