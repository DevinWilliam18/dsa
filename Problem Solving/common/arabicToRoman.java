    public static List<String> arabicToRomans(List<Integer> nums) {
        List<String> arabToRomans = new ArrayList<>();
        int[] arabic = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String[] romans = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            for (int i = arabic.length - 1; i >= 0 && num > 0; i--) {
                while (num >= arabic[i]) {
                    num -= arabic[i];
                    sb.append(romans[i]);
                }
            }
            System.out.println("sb: " + sb);
            arabToRomans.add(sb.toString());
            sb.setLength(0);
        }
        return arabToRomans;
    }
