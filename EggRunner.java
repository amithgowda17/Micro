class EggRunner{
	
	public static void main(String []args){
		
		Egg eggDetails=new Egg();
		
		eggDetails.total(1000);
		eggDetails.eggAvailability(true);
		eggDetails.nameOfOwner("Varun");
		eggDetails.storage=120;
		eggDetails.shopCode=5675;
		eggDetails.ownerNum=962992267l;
		eggDetails.series='A';
		eggDetails.costOfTrae=3000.6786f;
		eggDetails.gstOfTrae=300.17899d;
		
		System.out.println("storage capacity of shop is==="+eggDetails.storage);
		System.out.println("shop code is==="+eggDetails.shopCode);
		System.out.println("owner number is==="+eggDetails.ownerNum);
		System.out.println("series of shop is==="+eggDetails.series);
		System.out.println("cost of the trae is==="+eggDetails.costOfTrae);
		System.out.println("gst of the trae is==="+eggDetails.gstOfTrae);
		
	}
}
