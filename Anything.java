class Anything{
public static void m(){
System.out.println("M started");
String a[] = {"hi","bye"};
main(a);
System.out.println("M ended");

}
public static void main(String a[]){
System.out.println("Main started");
m();
System.out.println("Main ended");

}
}