/*
int deleteDigit(int n) {
    String s = Integer.toString(n);
    int toRemove = 0;
    int currentMin = ((int)s.charAt(0)) - 48;

    int i = 1;
    while (currentMin != 0 && i < s.length()) {
        int temp = ((int)s.charAt(i)) - 48;
        if (temp < currentMin) {
            toRemove = i;
            currentMin = temp;
        }
        i++;
    }

    return Integer.parseInt(s.substring(0, toRemove) + s.substring(toRemove+1));
}
*/

int deleteDigit(int n)
{
    int max = 0;
    for (int t = 1; t < n; t *= 10)
        max = Math.max(n / 10 / t * t + n % t, max);
    return max;
}
