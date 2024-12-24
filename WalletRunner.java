class WalletRunner {
    public static void main(String[] wallet) {
        Wallet wallet1 = new Wallet();
		wallet1.showDetails();
        wallet1.id = 1;
        wallet1.brand = "Montblanc";
        wallet1.noOfCompartments = 5;
        wallet1.color = "Black";
        wallet1.showDetails();

        Wallet wallet2 = new Wallet();
        wallet2.id = 2;
        wallet2.brand = "Bontte Veneta";                
        wallet2.noOfCompartments = 4;
        wallet2.color = "Brown";
        wallet2.showDetails();

        Wallet wallet3 = new Wallet();
        wallet3.id = 3;
        wallet3.brand = "Gucci";
        wallet3.noOfCompartments = 3;
        wallet3.color = "Blue";
        wallet3.showDetails();wallet1.showDetails();wallet1.showDetails();
		

        Wallet wallet4 = new Wallet();
        wallet4.id = 4;
        wallet4.brand = "Louis Vuitton";
        wallet4.noOfCompartments = 6;
        wallet4.color = "Green";
        wallet4.showDetails();wallet1.showDetails();
		
		
		Wallet wallet5 = new Wallet();
        wallet5.id = 5;
        wallet5.brand = "Urban Forest";
        wallet5.noOfCompartments = 2;
        wallet5.color = "Red";
        wallet5.showDetails();
		
		Wallet wallet6 = new Wallet();
        wallet6.id = 6;
        wallet6.brand = "Tommy Hilfiger";
        wallet6.noOfCompartments = 7;
        wallet6.color = "Maroon";
        wallet6.showDetails();
		
		Wallet wallet7 = new Wallet();
        wallet7.id = 7;
        wallet7.brand = "WoodLand";
        wallet7.noOfCompartments = 8;
        wallet7.color = "Jet Black";
        wallet7.showDetails();
		
		Wallet wallet8 = new Wallet();
        wallet8.id = 8;
        wallet8.brand = "Puma";
        wallet8.noOfCompartments = 6;
        wallet8.color = "Grey";
        wallet8.showDetails();
		
		Wallet wallet9 = new Wallet();
        wallet9.id = 9;
        wallet9.brand = "Levi's";
        wallet9.noOfCompartments = 4;
        wallet9.color = "Aqua Blue";
        wallet9.showDetails();
		
    }
}