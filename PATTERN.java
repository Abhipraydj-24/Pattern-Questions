
class Solution {
    // Pattern1
    void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern2
    void printTriangle1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern3
    void printTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern4
    void printTriangle3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    // Pattern5
    void printTriangle4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern6
    void printTriangle5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n + 1 - i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    // Pattern7
    void printTriangle6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (j <= i - 1) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    // Pattern8
    void printTriangle7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (j - 1 >= i) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    // Pattern9
    void printTriangle8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern10
    void printTriangle9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    // Pattern11
    void printTriangle10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("   ");
                } else {
                    System.out.print(n - j + 1 + " ");
                }
            }
            System.out.println();
        }
    }

    // Pattern12
    void printTriangle11(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((num++) + " ");
            }
            System.out.println();

        }
    }

    // Pattern13
    void printTriangle12(int n) {
        int num = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c", num);
                num++;
            }

            System.out.println();
            num = 65;
        }
    }

    // Pattern14
    void printTriangle13(int n) {
        int num = 65;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c", num++);
            }
            num = 65;
            System.out.println();
        }
    }

    // Pattern15
    void printTriangle14(int n) {
        int num = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c", num);

            }

            System.out.println();
            num++;

        }
    }

    // Pattern16
    void printTriangle15(int n) {
        int num1 = 65;
        int num2 = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.printf("%c", num1++);
                } else {
                    System.out.print(" ");
                }
            }
            num1 = 65;
            for (int j = 1; j <= n; j++) {
                if (j <= i - 1) {
                    System.out.printf("%c", num2--);
                }

            }
            num2 = 65 + i - 1;

            System.out.println();
        }
    }

    // Pattern17
    void printTriangle16(int n) {
        int num = 64 + n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c ", num);
                num--;
            }

            System.out.println();
            num = 64 + n;
        }
    }

    // Pattern18
    void printTriangle17(int n) {
        int num = 64 + n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c ", num);
                num--;
            }

            System.out.println();
            num = 64 + n;
        }
    }

    // Pattern19
    void printTriangle18(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    // Pattern20
    void printTriangle19(int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }

    // Pattern21
    void printSquare20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Pattern22
    void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}

class PATTERN {

    public static void main(String[] args) {
        int n = 5;
        Solution s = new Solution();
        System.out.println("\n Pattern 1 \n");
        s.printSquare(n);

        System.out.println("\n Pattern 2 \n");
        s.printTriangle1(n);

        System.out.println("\n Pattern 3\n");
        s.printTriangle2(n);

        System.out.println("\n Pattern 4 \n");
        s.printTriangle3(n);

        System.out.println("\n Pattern 5 \n");
        s.printTriangle4(n);

        System.out.println("\n Pattern 6 \n");
        s.printTriangle5(n);

        System.out.println("\n Pattern 7 \n");
        s.printTriangle6(n);

        System.out.println("\n Pattern 8 \n");
        s.printTriangle7(n);

        System.out.println("\n Pattern 9 \n");
        s.printTriangle8(n);

        System.out.println("\n Pattern 10 \n");
        s.printTriangle9(n);

        System.out.println("\n Pattern 11 \n");
        s.printTriangle10(n);

        System.out.println("\n Pattern 12 \n");
        s.printTriangle11(n);

        System.out.println("\n Pattern 13 \n");
        s.printTriangle12(n);

        System.out.println("\n Pattern 14 \n");
        s.printTriangle13(n);

        System.out.println("\n Pattern 15 \n");
        s.printTriangle14(n);

        System.out.println("\n Pattern 16 \n");
        s.printTriangle15(n);

        System.out.println("\n Pattern 17 \n");
        s.printTriangle16(n);

        System.out.println("\n Pattern 18 \n");
        s.printTriangle17(n);

        System.out.println("\n Pattern 19 \n");
        s.printTriangle18(n);

        System.out.println("\n Pattern 20 \n");
        s.printTriangle19(n);

        System.out.println("\n Pattern 21 \n");
        s.printSquare20(n);

        System.out.println("\n Pattern 22 \n");
        s.printDiamond(n);
    }
}