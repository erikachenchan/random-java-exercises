package org.exerciseFive;

public class UserInput {

    public static class TextInput {
        private StringBuilder value = new StringBuilder();

        public void add(char c) {
            value.append(c);
        }

        public String getValue() {
            return value.toString();
        }

    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            if (Character.isDigit(c)) {
                super.add(c);
            }
        }
    }

    public static void main(String[] args) {
        NumericInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue()); // Output: "10"
    }
}
