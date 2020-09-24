# Sum of Two Dice

In this assignment, you'll be writing two methods related to random numbers and arrays. 

The first method is rollDie(). This method represents the rolling of a single die. It takes no inputs, and returns a single integer between 1 and 6, inclusive. The method has the following signature: public static int rollDie() {}

The second method is sumOfTwoDice(). This method takes an input an integer n. The method will then simulate the rolling of n pairs of dice, and it will keep track of how many times each sum came up. Specifically, the method will return an array of length 11, where the first element in the array corresponds to how many times the dice summed up to 2, the second element in the array coorresponds to how many times the dice summed up to 3, and so on, until the last element in the array corresponds to the number of times the dice summed up to 12. 

For instance, let's say that n were 3. That means we would roll 3 pairs of dice. We might see something like:
* Die1 = 1, Die2 = 6 => sum = 7
* Die1 = 3, Die2 = 5 => sum = 8
* Die1 = 1, Die2 = 4 => sum = 5

We note the sum of the first pair is 7, the sum of the second pair is 8, and the sum of the third pair is 5. This means that we've seen:
* 0 pairs that summed to 2
* 0 pairs that summed to 3 
* 0 pairs that summed to 4
* 1 pair that summed to 5
* 0 pairs that summed to 6
* 1 pair that summed to 7
* 1 pair that summed to 8
* 0 pairs that summed to 9
* 0 pairs that summed to 10
* 0 pairs that summed to 11
* and 0 pairs that summed to 12. 

Thus, the output array for this example would be: [0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0]

Once both methods are working, write code in your main method to ask the user for a number of times to roll the dice. Then, print out what percentage of times each sum came up. Because it is random, your results will vary, but they should be somewhat simliar to the example below.

Example of what your program may look like when it is being run:
```shell script
How many pair of dice would you like to roll?
1000000
% of rolls where sum == 2: 2.7744999999999997
% of rolls where sum == 3: 5.5501000000000005
% of rolls where sum == 4: 8.3884
% of rolls where sum == 5: 11.0656
% of rolls where sum == 6: 13.8711
% of rolls where sum == 7: 16.6147
% of rolls where sum == 8: 13.883499999999998
% of rolls where sum == 9: 11.1155
% of rolls where sum == 10: 8.36
% of rolls where sum == 11: 5.5903
% of rolls where sum == 12: 2.7862999999999998
```

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
```shell script
make run
```

## Run your tests with:
```shell script
make test
```