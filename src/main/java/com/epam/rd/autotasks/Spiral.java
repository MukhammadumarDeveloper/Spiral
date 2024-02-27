package com.epam.rd.autotasks;

import java.util.Arrays;

class Spiral {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(spiral(2, 3)));

    }


    static int[][] spiral(int rw, int cl) {


        int l = 0, t = 0, r = cl - 1, b = rw - 1;

        int arr[][] = new int[rw][cl];

        int val = 1;

        char dir = 'r';

        while (checkState(l, r, t, b)) {

            if (dir == 'r' && checkState(l,r,t,b)) {
                for (int i = l; i <= r; i++) {
                    arr[t][i] = val++;
                }
                t++;
                dir = 'd';

            }


            if (dir == 'd'&& checkState(l,r,t,b)) {

                for (int i = t; i <= b; i++) {
                    arr[i][r] = val++;
                }
                r--;
                dir = 'l';

            }


            if (dir == 'l'&& checkState(l,r,t,b)) {

                for (int i = r; i >= l; i--) {
                    arr[b][i] = val++;
                }
                b--;
                dir = 't';
            }


            if (dir == 't'&& checkState(l,r,t,b)) {
                for (int i = b; i >= t; i--) {
                    arr[i][l] = val++;
                }
                l++;
                dir = 'r';
            }

        }

        return arr;


    }

    private static boolean checkState(int l, int r, int t, int b) {
        return l <= r && t <= b;
    }
}
