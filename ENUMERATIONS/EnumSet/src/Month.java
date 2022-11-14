enum Month {
    JANUARY(31, 3),
    FEBRUARY(28, 0),
    MARCH(31, 2),
    APRIL(30, 2),
    MAY(31, 4),
    JUNE(30, 5),
    JULY(31, 2),
    AUGUST(31, 0),
    SEPTEMBER(30, 3),
    OCTOBER(31, 7),
    NOVEMBER(30, 6),
    DECEMBER(31, 2);

    int daysOfMonth;
    int moodForMonth;

    Month(int days, int moodForMonth) {
        daysOfMonth = days;
        this.moodForMonth = moodForMonth;
    }


}
