class Solution {
    public String intToRoman(int num) {
        // Define the Roman numerals and their values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        
        // Process each value and corresponding numeral
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(numerals[i]);
                num -= values[i];
            }
        }
        
        return result.toString();
    }
}
