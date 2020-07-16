# test_code@

#两种方式
#Two ways
# Main
java -jar sum-0.0.1-SNAPSHOT.jar --type [algo1|algo2]

# Main2 在打包时将Main2改成Main
java -jar sum-0.0.1-SNAPSHOT.jar 
algo1
algo2
 
 
 ## question
 
 ## Coding Test
 How the Code Review works?
 You need to provide a GitHub source repository link for a small program that can compile and run 
 written in JAVA for the problems below.
 The jar should be runnable using the following command:
 java -jar target/{artifactid}-{version}-standalone.jar
 When the program runs it should start and simply output its answer to the console (STD OUT) and 
 then exit.
 If you make any assumptions about the problems, please put them along with a brief description of 
 your program in a readme along with the source.
 
 ## Sum of Primes
 Prime numbers are natural numbers greater than 1 that have only two positive integer divisors 1 and 
 itself. 
 ie 3 is a prime number because the only numbers can divide 3 by and still get a positive integer result 
 are 1 and 3. 3 /3 =1 and 3/1 = 3.
 The sum of all prime numbers below 10 = 17 (2 + 3 + 5 + 7)
 Find the sum of all prime numbers below 200,000.
 Please provide 2 solutions, 1 is to only consider the speed of computation, another one is to about 
 reducing the looping count. Hints: consider about the situation if I want the sum of all prime numbers in another larger range.


