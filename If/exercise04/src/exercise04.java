class exercise04 {
    public static void main(String[] args)
    {
        int x=1;
        String s;

        switch(x) {
            case 1:
                s="one";
            case 2:
                s="two";
            case 3:
                s="three";
            default:
                s="invalid value";
        }

        System.out.println("Value in text: " + s);
    }
}
