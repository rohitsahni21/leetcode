class Solution {
    public boolean completePrime(int num) {

        int dub = num;

        // Prefix
        while(num > 0) {

            if(!Isprime(num)) {
                return false;
            }

            num = num / 10;
        }

        // Suffix
        int divisior = 10;

        while(divisior <= dub) {

            int sufix = dub % divisior;

            if(!Isprime(sufix)) {
                return false;
            }

            if(divisior > dub / 10) {
                break;
            }

            divisior = divisior * 10;
        }

        return true;
    }

    public boolean Isprime(int n) {

        if(n < 2) {
            return false;
        }

        for(int i = 2; i * i <= n; i++) {

            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}