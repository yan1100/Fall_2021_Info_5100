package com.company;

public class Q7AddStrings {
    public static void main(String[] args) {
        Q7AddStrings as = new Q7AddStrings();

        String num1 = "11";
        String num2 = "123";
        System.out.println(as.addStrings(num1,num2));//Output: 134

        String num3 = "456";
        String num4 = "77";
        System.out.println(as.addStrings(num3,num4));//Output: 533

        String num5 = "0";
        String num6 = "0";
        System.out.println(as.addStrings(num5,num6));//Output: 0

    }

    //m == num1.length, n == num2.length
    //Time Complexity: O(max(m,n)): if m > n, Time complexity = O(m); if m < n, Time complexity = O(n)
    //Space Complexity: O(max(m,n))
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        while (p1 > -1 || p2 > -1){
            int x = 0;
            int y = 0;
            if (p1 >= 0){
                x = num1.charAt(p1) - '0';
            }
            if (p2 >= 0){
                y = num2.charAt(p2)  - '0';
            }
            int sum = x + y + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ans.append(digit);
            p1--;
            p2--;
        }
        if (carry > 0) {
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}
