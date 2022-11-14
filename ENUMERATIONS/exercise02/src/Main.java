class Main {

    public static void main(String[] args) {
        Month curMonth = Month.JANUARY;

        System.out.println(curMonth + " " +
                "mood is " + curMonth.moodForMonth + "\n" +
                " for all " + curMonth.daysOfMonth + " days of the month");


        Month.JANUARY.setTemperature(10);

        System.out.println(Month.JANUARY.getTemperature());

        curMonth.setTemperature(15);

        System.out.println(Month.JANUARY.getTemperature());




    }


}
