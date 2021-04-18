import java.util.Scanner;
import java.util.Stack;

/*
Evaluate a compound expression
Use two stacks: operandStack and operatorStack
Operands and operators are pushed into the stacks before they are process.
When an operator is processed, it is popped from operatorStack and applied to the first two operands from operandStack (the two operands are popped from operandStack)
The resultant value is pushed back to operandStack

The algorithm proceeds in two phases
1. Scanning the expression
The program scans the expression from left to right to extract operands, operators, parentheses
1.1 if the extracted item is an operand, push it to operandStack
1.2 if the extracted item is a + or - operator, process all the operators at the top of operatorStack and push the extracted operator to operatorStack
1.3 if the extracted item is a * or / operator, process the * or / operators at the top of operatorStack and push the extracted operator to operatorStack
1.4 if the extracted item is a ( symbol, push it to operatorStack
1.5 if the extracted item is a ) symbol, repeatedly process the operators from the top of operatorStack until seeing the ( symbol on the stack
2. Clearing the stack
Repeatedly process the operators from the top of operatorStack until operatorStack is empty
 */
public class EvaluateExpressions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String expression = in.nextLine();
		in.close();
		
		//make sure that the expression doesn't end on a operator
		if (expression.charAt(expression.length()-1) == '*' || expression.charAt(expression.length()-1) == '/' || expression.charAt(expression.length()-1) == '+' || expression.charAt(expression.length()-1) == '-') {
			System.out.println("invalid expression");
			System.exit(1);
		}
		
		//make sure that the expression does not have two numbers right beside each other
		for (int i = 0; i < expression.length() - 2; i++) {
			if (expression.charAt(i) != '*' && expression.charAt(i) != '/' && expression.charAt(i) != '+' && expression.charAt(i) != '-' && expression.charAt(i) != '(' && expression.charAt(i) != ')' && expression.charAt(i) != ' ') {
				if (expression.charAt(i + 2) != '*' && expression.charAt(i + 2) != '/' && expression.charAt(i + 2) != '+' && expression.charAt(i + 2) != '-' && expression.charAt(i + 2) != '(' && expression.charAt(i + 2) != ')') {
					System.out.println("invalid expression");
					System.exit(1);
				}
			}
		}
		
		try {
			System.out.println(evaluateExpression(expression));
		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

	//evaluate the expression
	public static int evaluateExpression(String expression) {
		//create operandStack to store operands
		Stack<Integer> operandStack = new Stack<>();
		
		//create operatorStack to store operators
		Stack<Character> operatorStack = new Stack<>();
		
		//prepare for extraction, insert blanks around (, ), +, -, *
		expression = insertBlanks(expression);
		
		//extract operands and operators
		String[] tokens = expression.split(" ");
		
		//phase 1: scan tokens
		for (String token: tokens) {
			if (token.length() == 0) { //blank space
				continue;
			}else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
				//process all +, -, *, / in the top of the operator stack
				while(!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-' || operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
					processAnOperator(operandStack, operatorStack);
				}
				//push the + or - operator into the operator stack
				operatorStack.push(token.charAt(0));
			}else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
				//process all +, -, *, / in the top of the operator stack
				while(!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
					processAnOperator(operandStack, operatorStack);
				}
				//push the * or / operator into the operator stack
				operatorStack.push(token.charAt(0));
			}else if (token.trim().charAt(0) == '(') {
				operatorStack.push('('); //push '(' to stack
			}else if (token.trim().charAt(0) == ')') {
				//process all the operators in the stack until seeing '('
				while (operatorStack.peek() != '(') {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.pop(); //pop the '(' symbol from the stack
			}else { //an operand scanned
				//push the operand to the operandStack
				operandStack.push(new Integer(token));
			}			
		}
		
		//return the result
		return operandStack.pop();
	}
	
	//process one operator: take an operator from operatorStack and apply it on the operands in the operandStack
	public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
		char op = operatorStack.pop(); //returns and removes the top element of the stack
		int op1 = operatorStack.pop();
		int op2 = operatorStack.pop();
		
		if (op == '+') {
			operandStack.push(op2 + op1);
		}else if (op == '-') {
			operandStack.push(op2 - op1);
		}else if (op == '*') {
			operandStack.push(op2 * op1);
		}else if (op == '/') {
			operandStack.push(op2 / op1);
		}
		
	}
	
	//insert blanks to the ends of an operand
	public static String insertBlanks(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')'||
				s.charAt(i) == '+' || s.charAt(i) == '-' ||
				s.charAt(i) == '*' || s.charAt(i) == '/' ) {
				result += " " + s.charAt(i) + " ";
			}else {
				result += s.charAt(i);
			}
		}
		return result;
	}

}
