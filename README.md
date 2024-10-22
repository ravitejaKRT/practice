# Practice

This repository is for practicing problems from the [Grind 75](https://www.techinterviewhandbook.org/grind75/) list.

## Overview

Grind 75 is a curated list of the most important coding interview problems. This repository contains solutions and test cases for these problems, implemented in Java.

## Structure


## How to Run

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven

### Running the Code

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/practice.git
    cd practice
    ```

2. Compile and run the main classes using Maven:
    ```sh
    mvn compile
    mvn exec:java -Dexec.mainClass="leetcode.grind75.easy.TwoSum"
    mvn exec:java -Dexec.mainClass="leetcode.grind75.easy.StringTokenConcatenation"
    ```

3. Compile and run the main classes using Java:
    ```sh
    # Compile the classes
    javac -d target/classes src/main/java/leetcode/grind75/easy/TwoSum.java
    javac -d target/classes src/main/java/leetcode/grind75/easy/StringTokenConcatenation.java

    # Run the classes
    java -cp target/classes leetcode.grind75.easy.TwoSum
    java -cp target/classes leetcode.grind75.easy.StringTokenConcatenation
    ```

### Running the Tests

1. Run the tests using Maven:
    ```sh
    mvn test
    ```
