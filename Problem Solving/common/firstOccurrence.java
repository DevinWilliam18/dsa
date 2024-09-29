    public int strStr(String haystack, String needle) {

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            for (int i = 0; i < haystack.length() - needle.length(); i++) {
                int count = 0;
                Integer first = null;
                for (int j = i; j < needle.length() + i; j++) {
                    if (haystack.charAt(j) == needle.charAt(j - i) || needle.charAt(j - i) == '*') {
                        if (first == null && j == i) {
                            first = j;
                        }
                        count++;
                    }
                }

                if (count == needle.length()) {
                    return first;
                }

            }
        }

        return -1;        
    }
