class Main {

    public static void main(String[] args) {
        StaticClassMember a = new StaticClassMember(1);
        StaticClassMember b = new StaticClassMember(2);
        a.inc();
        System.out.println(StaticClassMember.sVar);
        b.inc();
        System.out.println(StaticClassMember.sVar);
    }
}
