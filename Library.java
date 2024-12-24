class Library {
    private int memberId;
    private String memberName;
    private int booksIssued;

	public Library(){
		System.out.println("Library Constructor is created");
	}
	
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }

    public int getBooksIssued() {
        return booksIssued;
    }
}