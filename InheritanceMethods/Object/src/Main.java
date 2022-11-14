class Main {

    public static void main(String[] args) {
	    SampleClass s = new SampleClass(1,2);
	    System.out.println(s.getClass());
        System.out.println(s.toString());
        System.out.println(s);
        SampleClass s2 = new SampleClass(s);
        System.out.println(s==s2); //sygkrish anaforwn
        System.out.println(s.equals(s2)); //sygkrish twn timwn pou exoun ta antikeimena
    }
}
