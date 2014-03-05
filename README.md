# The Open-Closed Principle

## Abstract

"The Elements of Programming Style" by Kernighan and Plauger (1974) is a classic text that contains many pieces of programming wisdom. One piece of wisdom is that "each module should do one thing well." In Object-Oriented Programming, this wisdom would be analogous to the principle of Single Responsibility: each class should perform a narrow responsibility. While we strive for our classes to each have a single responsibility, we must be mindful of how our software might grow in the future. The Open-Closed Principle states "software entities should be open for extension, but closed for modification". What sounds like a contradiction turns out to be a good software development practice. This talk will examine the Open-Closed Principle by addressing how we can plan future code by being mindful of extensions as well as restructure existing classes.

## Ye Ole Yogurt Shop

Ye Ole Yogurt Shop has just hired their first developer: you!

You are first tasked with designing the business's shopping cart for the store cash register software. The manager has given you the store's product line, which consists of just two items:

- Yogurt, sold at 45 cents per ounce
- Milkshakes, sold at $3.00 each

You sketch out a basic design for the shopping cart:

- Class Cart, representing the shopping cart.
- Class Item, representing either Yogurt or Milkshake.
- The class Cart will have a one-to-many relationship with an Item.

The initial design is pretty simple. You need to put the business logic somewhere and your design gives you two places (Cart or Item). For now, you decide to put the core business logic in the Cart class.

You create the two classes and draft a set of unit tests to test the code for correctness. As you deliver your new shopping cart software to the manager, you are thrown a curve ball: the manager wants to add t-shirts to the business. T-shirts are being sold with a promotion: buy 2 t-shirts and get 1 fore free! You must decide how to add t-shirts to your existing code.

## How do we add new business logic?

There are two key alternatives to this problem.

Alternative 1. You realize that since you originally put the business logic in the Cart class, the new business logic can  also go in the Cart class.

Pros:
- You can probably add this code with little trouble.
- You can probably even add a few more unit tests to make sure the implementation works.

Cons:
- There will probably be more products for sale in the future if the business continues to grow.
- As the code in the Cart class grows, conflicts will arise and testing becomes harder. You are venturing into spaghetti territory.
- The developer who maintains the code after you will probably have a few harsh words to describe you.

Alternative 2. This looks like an opportunity to refactor the code using the Strategy Pattern. By refactoring the code, we don't change any of the existing behaviors of the overall code and we create a plan for extending existing code.

Pros:
- Extending the functionality of a class with new rules (or strategies) becomes easier.
- Maintaining the existing code will become easier. 
- Unit testing on rules will be easier, since the classes will have fewer components to test.

Cons:
- It's work to take a working implementation and rewrite it. Thought must go into determining if refactoring is worth the trouble.
- Refactoring introduces complexity, which will make your code harder to understand for some.
- The developer who maintains the code after you will probably have a few harsh words to describe you.

In this talk we implement both alternatives. Alternative 1 is short, but it does come with some drawbacks. Alternative 2 requires more work, but it allows for better organized extensions in the future.
