class Main {

    public static void main(String[] args) {
	    Cat c = new Cat();
	    HimalayanCat h = new HimalayanCat();
	    Dog d = new Dog();
	    Doberman dd = new Doberman();
	    KingDoberman kd = new KingDoberman();
		Scripts scripts = new Scripts();

		scripts.makeDoubleSound(c);
		scripts.makeDoubleSound(h);
		scripts.makeDoubleSound(d);
		scripts.makeDoubleSound(dd);
		scripts.makeDoubleSound(kd);
    }
}
