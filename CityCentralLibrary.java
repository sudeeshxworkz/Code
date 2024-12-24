class CityCentralLibrary {
    public static void main(String[] lib) {
        Library member = new Library();
        member.setMemberId(601);
        member.setMemberName("Arjun Patel");
        member.setBooksIssued(3);

        System.out.println("Member ID: " + member.getMemberId());
        System.out.println("Member Name: " + member.getMemberName());
        System.out.println("Books Issued: " + member.getBooksIssued());
    }
}