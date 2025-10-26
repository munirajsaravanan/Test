"""
Sample Python Test Code

This is a simple Python example demonstrating basic testing concepts.
"""

def add(a, b):
    """Add two numbers and return the result."""
    return a + b

def subtract(a, b):
    """Subtract b from a and return the result."""
    return a - b

def multiply(a, b):
    """Multiply two numbers and return the result."""
    return a * b

def divide(a, b):
    """Divide a by b and return the result."""
    if b == 0:
        raise ValueError("Cannot divide by zero")
    return a / b

# Example usage
if __name__ == "__main__":
    print("Addition: 5 + 3 =", add(5, 3))
    print("Subtraction: 5 - 3 =", subtract(5, 3))
    print("Multiplication: 5 * 3 =", multiply(5, 3))
    print("Division: 6 / 3 =", divide(6, 3))
