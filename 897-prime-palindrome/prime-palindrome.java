class Solution {
    public int primePalindrome(int n) {

        while (true) {

            int temp = n;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
            if (digits % 2 == 0 && n > 11) {

                int jump = 1;

                for (int i = 0; i < digits; i++) {
                    jump = jump * 10;
                }

                n = jump + 1;
            }

            if (palindrome(n) && isprime(n)) {
                return n;
            }

            n++;
        }
    }

    public boolean palindrome(int x) {
        int dub = x;
        int rev = 0;

        while (x > 0) {
            int lastdigit = x % 10;
            rev = rev * 10 + lastdigit;
            x = x / 10;
        }

        return dub == rev;
    }

    public boolean isprime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}