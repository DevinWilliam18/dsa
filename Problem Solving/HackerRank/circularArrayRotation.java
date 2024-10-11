    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList();
        Map<Integer, Integer> existingVal = new HashMap<>();
        
        
        // 1 2 3
        
        for (int i = 0; i < a.size(); i++) {
            if (i + k >= a.size()) {
                int index = (i + k) % a.size();
                Integer temp = existingVal.get(i);
                
                if(temp == null) {
                    temp = a.get(i);
                }
                
                existingVal.put(index, a.get(index));
                a.set(index, temp);
                
            }else {                    
                
                Integer temp = existingVal.get(i);

                if(temp == null) {
                    temp = a.get(i);
                    }                
                    
                    existingVal.put(i + k, a.get(i + k));                
                    a.set(i + k, temp);
                }
                
        }
        
        for (int i = 0; i < queries.size(); i++ ){
            result.add(a.get(queries.get(i)));
        }
        
        return result;

    }
