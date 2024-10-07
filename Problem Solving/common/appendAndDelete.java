    public static String appendAndDelete(String s, String t, int k) {
        if (s.length() + t.length() <= k)
            return "Yes";

        int count = 0;

        // to get the minimum value of two integers
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            } else {
                break;
            }
        }

        int remaining = (s.length() - count) + (t.length() - count);
        // System.out.println("k: " + k + ", remaining: " + remaining);
        // System.out.println("remaining <= k : " + (remaining <= k));
        // System.out.println("k - remaining % 2: " + (k - remaining % 2));
        if (remaining <= k && (k - remaining) % 2 == 0) {
            System.out.println("masuk");
            return "Yes";
        }

        return "No";
            
    }
