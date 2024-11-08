# BeverageSystem_DecoratorDesignPattern

This project demonstrates the **Decorator Design Pattern** through a beverage system, allowing dynamic addition of condiments (decorators) like mint, milk, or sugar to basic beverages such as coffee or tea.

## Project Structure

The project consists of the following components:

1. **Beverage (Interface)**
   - Represents the core beverage component with a `prepare()` method that returns the preparation description.

2. **Concrete Beverage Classes**
   - **Coffee**: A basic beverage with a `prepare()` method returning `"Coffee with coffee beans"`.
   - **Tea**: A basic beverage with a `prepare()` method returning `"Tea with Tea Leaves"`.

3. **CondimentDecorator (Decorator Class)**
   - Implements `Beverage` and serves as a base decorator class for adding condiments to beverages.
   - Has a constructor that wraps a `Beverage` component and calls its `prepare()` method to build upon the beverage’s description.

4. **Concrete Decorators (MintDecorator, MilkDecorator, SugarDecorator)**
   - Each decorator extends `CondimentDecorator`, adding specific condiments:
     - **MintDecorator**: Adds `" with mint"` to the beverage description.
     - **MilkDecorator**: Adds `" with milk"` to the beverage description.
     - **SugarDecorator**: Adds `" with sugar"` to the beverage description.

5. **Main (Driver Class)**
   - Demonstrates the usage of the Decorator Pattern by creating different beverage combinations with various condiments.

## How It Works

1. **Decorator Design Pattern**:
   - The pattern allows condiments (decorators) to be added to a beverage object dynamically, creating unique combinations without modifying the original classes.
   - Each condiment wraps a `Beverage` instance and augments the `prepare()` method to add its description.

2. **Beverage Preparation**:
   - Each decorator builds upon the `prepare()` method of the wrapped beverage to add a unique description, enabling combinations like "Coffee with milk" or "Tea with mint and sugar."

## Sample Output

Running the `Main` class will generate output similar to:

```plaintext
Tea with Tea Leaves
Coffee with coffee beans
Coffee with coffee beans with milk
Tea with Tea Leaves with mint
Coffee with coffee beans with sugar
Coffee with coffee beans with mint with sugar
```


## Key Takeaways
- Decorator Design Pattern: Enables flexible and extensible addition of functionalities without modifying the original class or creating multiple subclasses.
- Modular Design: Each condiment is a modular decorator that can be easily added or removed, supporting a scalable system for beverages and add-ons.
- Flexible Configuration: Allows creating various beverage combinations with minimal code changes, maintaining a clean and dynamic structure.


## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see how the Decorator Pattern allows adding condiments to beverages in a modular way.
