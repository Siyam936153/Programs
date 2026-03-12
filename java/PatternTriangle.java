// Pattern 1: Right-aligned triangle with same number
class Pattern1 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Output:
    //      1 
    //     2 2 
    //    3 3 3 
    //   4 4 4 4 
    //  5 5 5 5 5 
    // 6 6 6 6 6 6 
}

// Pattern 2: Inverted right-aligned triangle with same number
class Pattern2 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Output:
    // 6 6 6 6 6 6 
    //  5 5 5 5 5 
    //   4 4 4 4 
    //    3 3 3 
    //     2 2 
    //      1 
}

// Pattern 3: Right-aligned triangle with incrementing digits
class Pattern3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Output:
    // 
    // 0 
    // 0 1 
    // 0 1 2 
    // 0 1 2 3 
    // 0 1 2 3 4 
}

// Pattern 4: Inverted right-aligned triangle with incrementing digits
class Pattern4 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Output:
    // 0 1 2 3 4 5 
    // 0 1 2 3 4 
    // 0 1 2 3 
    // 0 1 2 
    // 0 1 
    // 0 
}

// Pattern 5: Right-aligned triangle with digits starting from 0
class Pattern5 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Output:
    //      0
    //     01
    //    012
    //   0123
    //  01234
    // 012345
}

// Pattern 6: Inverted right-aligned triangle with digits starting from 0
class Pattern6 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Output:
    // 012345
    //  01234
    //   0123
    //    012
    //     01
    //      0
}
