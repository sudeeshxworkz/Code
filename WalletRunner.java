class WalletRunner {
    public static void main(String[] wallet) {
        Wallet wallet1 = new Wallet();
        wallet1.showDetails();

        Wallet wallet2 = new Wallet(2, "Bontte Veneta", 4, "Brown");
        wallet2.showDetails();

        Wallet wallet3 = new Wallet(3, "Gucci", 3, "Blue");
        wallet3.showDetails();
		

        Wallet wallet4 = new Wallet(4, "Louis Vuitton", 6, "Green");
        wallet4.showDetails();
		
		
		Wallet wallet5 = new Wallet(5, "Urban Forest", 2, "Red");
        wallet5.showDetails();
		
		Wallet wallet6 = new Wallet(6, "Tommy Hilfiger", 7, "Maroon");
        wallet6.showDetails();
		
		Wallet wallet7 = new Wallet(7, "WoodLand", 8, "Jet Black");
        wallet7.showDetails();
		
		Wallet wallet8 = new Wallet(8, "Puma", 6, "Grey");
        wallet8.showDetails();
		
		Wallet wallet9 = new Wallet(9, "Levi's", 4, "Aqua Blue");
        wallet9.showDetails();
		
    }
}