    public static int saveThePrisoner(int n, int m, int s) {
        
        int c = (m % n) + s - 1 ;
        if ( c > n) c -= n;
        if ( c == 0) return n;
        return c;
        
    }
