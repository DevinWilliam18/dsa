
    public static String timeInWords(int h, int m) {

        HashMap<Integer, String> hours = new HashMap<>();
        String word = "";
        
        hours.put(1, "one");
        hours.put(2, "two");
        hours.put(3, "three");
        hours.put(4, "four");
        hours.put(5, "five");
        hours.put(6, "six");
        hours.put(7, "seven");
        hours.put(8, "eight");
        hours.put(9, "nine");
        hours.put(10, "ten");
        hours.put(11, "eleven");
        hours.put(12, "twelve");
        hours.put(13, "thirteen");
        hours.put(14, "fourteen");
        hours.put(15, "quarter");
        hours.put(16, "sixteen");
        hours.put(17, "seventeen");
        hours.put(18, "eighteen");
        hours.put(19, "nineteen");
        hours.put(20, "twenty");
        hours.put(21, "twenty one");
        hours.put(22, "twenty two");
        hours.put(23, "twenty three");
        hours.put(24, "twenty four");
        hours.put(25, "twenty five");
        hours.put(26, "twenty six");
        hours.put(27, "twenty seven");
        hours.put(28, "twenty eight");
        hours.put(29, "twenty nine");
        hours.put(30, "half");
        
        if (m < 15) {
            if (m == 0) {
                if(h == 0) {
                    word = "twelve o' clock";
                }else {
                    word = hours.get(h) +" o' clock";
                }
            }else if (m == 1) {
                if(h == 0) {
                    word = "one minute past twelve";                    
                }else {
                    word = "one minute past " + hours.get(h);                    
                }
            }else{
                if (h == 0) {
                    word = hours.get(m) + " minutes past twelve";
                }else {
                    word = hours.get(m) + " minutes past " + hours.get(h);
                }
            }
        }else if (m == 15) {
            if (h == 0) {
                word = hours.get(m) + " past twelve";
            }else {
                word = hours.get(m) + " past " + hours.get(h);
            }            
        }else if (m > 15 && m < 30) {
            if (h == 0) {
                word = hours.get(m) + " minutes past twelve";
            }else {
                word = hours.get(m) + " minutes past " + hours.get(h);
            }
        }else if (m == 30) {
            if (h == 0) {
                word = hours.get(m) + " past twelve";
            }else {
                word = hours.get(m) + " past " + hours.get(h);
            }            
        }else if (m > 30 && m < 45) {
            word = hours.get(60-m) + " minutes to " + hours.get(h+1);
        }else if (m == 45) {
            word = hours.get(60-m) + " to " + hours.get(h+1);
        }else if (m > 45) {
            word = hours.get(60-m) + " minutes to " + hours.get(h+1);
        }
        
        return word;

    }
