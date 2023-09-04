class exercise07 {
    public static void main(String[] args)
    {
        int hour, minute, second;

        hour=2;
        minute=47;
        second=15;

        if (!(hour>=0 && hour<=23))
            System.out.println("Invalid hour");
        else if (!(minute>=0 && minute<=59))
            System.out.println("Invalid minutes");
        else if (!(second>=0 && second<=59))
            System.out.println("Invalid seconds");
        else {
            if (hour>=0 && hour<=9)
                System.out.print("0");
            System.out.print(hour + ":");

            if (minute>=0 && minute<=9)
                System.out.print("0");
            System.out.print(minute + ":");

            if (second>=0 && second<=9)
                System.out.print("0");
            System.out.print(second);
        }

    }
}
