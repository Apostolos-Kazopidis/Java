class switchValue {
    public static void main(String[] args)
    {
        int x=-2;
        String s;

        switch(x) {
            case 1:
                s="one";
                break;
            case 2:
                s="two";
                break;
            case 3:
                s="three";
                break;
            default:
                s="invalid value";
        }

        System.out.println("Value in text: " + s);
    }
}
