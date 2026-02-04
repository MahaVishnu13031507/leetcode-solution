// Last updated: 2/4/2026, 8:59:00 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a=x>z?x-z:z-x;
        int b=y>z?y-z:z-y;
        if (a<b)
          return 1;
        else if (b<a)
          return 2;
        else
          return 0;
    }
}