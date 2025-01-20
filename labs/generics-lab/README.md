# Lab: Generics in Java

In this lab, you will apply your knowledge of Java Generics by implementing generic classes, bounded types, wildcards, and working with collections. These exercises are designed to be both practical and relevant for aspiring Java developers.

---

## Objective
- Understand and implement generic classes, methods, and interfaces.
- Use bounded type parameters (`extends` and `super`).
- Work with wildcards (`?`) in collections.
- Apply generics to real-world problems.

---

## Tasks

### Task 1: Create a Generic Pair Class
Create a class `Pair<T, U>` that stores two values of potentially different types.

#### Steps:
1. Define the `Pair<T, U>` class with two fields, `first` and `second`.
2. Add a constructor to initialize the values.
3. Add `getFirst()` and `getSecond()` methods to retrieve the values.
4. Add a `toString()` method for displaying the pair.

#### Example:
```java
Pair<String, Integer> pair = new Pair<>("Age", 25);
System.out.println(pair); // Output: (Age, 25)
```

---

### Task 2: Implement a Bounded Generic Class
Create a class `NumberStats<T extends Number>` that performs basic operations on a list of numbers.

#### Steps:
1. The class should accept only types that extend `Number` (e.g., `Integer`, `Double`).
2. Add a method `calculateAverage(List<T> numbers)` that calculates and returns the average of the numbers.
3. Add a method `findMax(List<T> numbers)` that finds the maximum value.

#### Example:
```java
NumberStats<Integer> stats = new NumberStats<>();
List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
System.out.println(stats.calculateAverage(numbers)); // Output: 25.0
System.out.println(stats.findMax(numbers));          // Output: 40
```

---

### Task 3: Use Wildcards with Collections
Write a method `printList(List<?> list)` that accepts a list of any type and prints its elements.

#### Steps:
1. Define the method with the wildcard `?`.
2. Iterate through the list and print each element.
3. Test the method with different types of lists (e.g., `List<String>`, `List<Integer>`).

#### Example:
```java
List<String> words = Arrays.asList("Hello", "World");
List<Integer> numbers = Arrays.asList(1, 2, 3);

printList(words);   // Output: Hello World
printList(numbers); // Output: 1 2 3
```

---

### Task 4: Real-World Application - Product Repository
Create a generic class `ProductRepository<T>` to manage a collection of products.

#### Steps:
1. Add a private `List<T>` field to store products.
2. Add methods:
   - `addProduct(T product)` to add a product.
   - `removeProduct(T product)` to remove a product.
   - `getAllProducts()` to return the list of products.
3. Test the repository with a `Product` class containing fields like `id` and `name`.

#### Example:
```java
ProductRepository<Product> repository = new ProductRepository<>();
repository.addProduct(new Product(1, "Laptop"));
repository.addProduct(new Product(2, "Phone"));

System.out.println(repository.getAllProducts());
// Output: [Product{id=1, name='Laptop'}, Product{id=2, name='Phone'}]
```

---

## Bonus Challenge: Combine Generics and Interfaces
Create an interface `Sortable<T>` with a method `sort(List<T> items)`. Implement this interface in a class `StringSorter` that sorts a list of strings in alphabetical order.

#### Example:
```java
StringSorter sorter = new StringSorter();
List<String> items = Arrays.asList("Banana", "Apple", "Cherry");
sorter.sort(items);
System.out.println(items); // Output: [Apple, Banana, Cherry]
```

