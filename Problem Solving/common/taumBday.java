    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long tot = 0;
        
        System.out.println("");
        if ((long) bc > (long) wc + (long) z) {
            tot += ((long) wc + (long) z) * (long) b;
        }else{
            tot += (long) bc * (long) b;
        }
        
        if ((long) wc > (long) bc + (long) z) {
            tot += ((long) bc + (long) z) * (long) w;
        } else {
            tot += (long) wc * (long) w;                
        } 
        
        return tot; 
    }
