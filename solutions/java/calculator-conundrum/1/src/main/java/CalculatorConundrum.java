class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if (operation.equals("+")) {
            return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
        }
        if (operation.equals("*")) {
            return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
        }
        if (operation.equals("/")) {
            try {
                return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
            }
            catch (ArithmeticException e) { 
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
        }
        throw new IllegalOperationException("Operation '" + operation + "' does not exist");
    }
}
