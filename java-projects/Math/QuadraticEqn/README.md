# Quadratic Equation Solver (Java)

A console program that reads the coefficients a, b and c of a quadratic equation (ax² + bx + c = 0), displays the full equation, and solves it using the discriminant (d = b² − 4ac).

## Cases handled
- **a = 0:** prints "Not a quadratic equation"
- **d > 0:** two distinct real roots
- **d = 0:** one repeated real root
- **d < 0:** two complex roots, printed as `real ± imaginary i`

## How to run
```
javac QuadraticEqn.java
java QuadraticEqn
```
Enter a, b and c when prompted (one per line).

## Example
```
Enter the coefficient a, b, c of the quadratic equation
1
2
5
Equation: 1.0 x^2 + 2.0 x + 5.0 = 0
Equation has a complex root
root 1: -1.0 + 2.0i
root 2: -1.0 - 2.0i
```

## Concepts practised
if / else if chains, methods and parameters, operator precedence, the quadratic formula.