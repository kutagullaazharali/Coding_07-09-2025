public class FindNearPerson {

     public int findClosest(int x, int y, int z) 
    {
       int person1 = z-x;
       int person2 = z-y;
       System.out.println("person 1 : "+person1);
       System.out.println("person 2 : "+person2);
       if(person1<0){
        return 2;
       }
         if(person2<0) {
        return 1;
       }
       if(person1 < person2) {
        return 1;
       } 
       else {
        return 2;
       }
    }
    public static void main(String[] args) {
        FindNearPerson obj = new FindNearPerson();
        int x = 1;
        int y = 5;
        int z =3;
        System.out.println(""+obj.findClosest(x,y,z));
    }
}
