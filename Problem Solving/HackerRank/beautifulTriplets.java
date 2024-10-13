    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;
        for (int i = 0; i <= arr.size() - 3; i++){
            int prev = 0;
            int nestedCount = 0;
            for (int j = i; j < arr.size(); j ++){
                if (j == i){
                    prev = arr.get(j);
                }else if (arr.get(j) - prev == d && nestedCount == 0){
                    prev = arr.get(j);
                    nestedCount++;
                }else if (arr.get(j) - prev == d && nestedCount == 1){
                    nestedCount = 1;
                    count += 1;
                    
                }
            }
        }
        return count;
    }
