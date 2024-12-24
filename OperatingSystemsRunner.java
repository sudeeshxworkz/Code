class OperatingSystemsRunner {
    public static void main(String[] os) {
        OperatingSystems operatingSys1 = new OperatingSystems("Windows", "10");
        operatingSys1.showSystem();

        OperatingSystems operatingSys2 = new OperatingSystems("macOS", "Catalina");
        operatingSys2.showSystem();

        OperatingSystems operatingSys3 = new OperatingSystems("Linux", "Ubuntu 20.04");
        operatingSys3.showSystem();

        OperatingSystems operatingSys4 = new OperatingSystems("Windows", "9");
        operatingSys4.showSystem();

        OperatingSystems operatingSys5 = new OperatingSystems("macOS", "Big Sur");
        operatingSys5.showSystem();

        OperatingSystems operatingSys6 = new OperatingSystems("Linux", "Fedora 34");
        operatingSys6.showSystem();
	   
        OperatingSystems operatingSys7 = new OperatingSystems("ChromeOS", "91");
        operatingSys7.showSystem();

        OperatingSystems operatingSys8 = new OperatingSystems("Android", "12");
        operatingSys8.showSystem();

        OperatingSystems operatingSys9 = new OperatingSystems("iOS", "14");
        operatingSys9.showSystem();
    }
}