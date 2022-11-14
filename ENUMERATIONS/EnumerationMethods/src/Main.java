class Main {

    public static void main(String[] args) {
        Day[] array = Day.values();

        for (var d: array)
            System.out.println(d + "(" + d.ordinal() + ")");

        System.out.println(Day.THURSDAY.compareTo(Day.MONDAY));
        System.out.println(Day.THURSDAY.compareTo(Day.THURSDAY));
        System.out.println(Day.THURSDAY.compareTo(Day.FRIDAY));

        Day d = Day.valueOf("MONDAY");
        System.out.println(d);
    }
}
