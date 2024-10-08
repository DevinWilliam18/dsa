  public static int beautifulTriplets(int d, List<Integer> arr) {
    System.out.println("masuk");
    List<Set<Integer>> triplets = new ArrayList<>();

    for (int i = 0; i < arr.size() - 3; i++) {
      Set<Integer> temp = new HashSet<>();
      int prev = 0;
      for (int j = i; j < arr.size(); j++) {
        if (temp.size() == 3) {
          break;
        }
        if (prev != 0) {
          int diff = arr.get(j) - prev;

          if (diff == d) {
            temp.add(prev);
            temp.add(arr.get(j));
            prev = arr.get(j);
          } else if (prev == 0) {
            prev = arr.get(i);
          }

        }
        System.out.println("temp size: " + temp.size() + ", data: " + temp);
        if (temp.size() == 3) {
          triplets.add(temp);
        }
      }

    }
    return triplets.size();
  }
