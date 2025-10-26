/**
 * Sample JavaScript Test Code
 * 
 * This is a simple JavaScript example demonstrating basic testing concepts.
 */

// Basic mathematical operations
function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    if (b === 0) {
        throw new Error("Cannot divide by zero");
    }
    return a / b;
}

// Example usage
console.log("Addition: 5 + 3 =", add(5, 3));
console.log("Subtraction: 5 - 3 =", subtract(5, 3));
console.log("Multiplication: 5 * 3 =", multiply(5, 3));
console.log("Division: 6 / 3 =", divide(6, 3));

// Export for testing (Node.js)
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { add, subtract, multiply, divide };
}
