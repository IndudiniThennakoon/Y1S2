public class StaticMemberMain {
    public static void main(String[] args) {


        // there are 3 type of variables - local, class, static
        // local - belongs to a particular block
        // class - valiable which is defineing a class- in this example name and age
        // class variables are belongs to a partiular object. whenever we creating an objects class variables are repeated
        // static - belong to the class. there is no copy
        // static varibles are donot belongs to an indivial objects. common to all the instances


        // all other attributes are created inside of the object
        // but batchID is not created inside the same object because its STATIC
        // Static attributes are not belong to the objects
        // It will be sotred in a seperate location

        StaticMember ob  = new StaticMember();
        ob.name = "indu";
        ob.batchID = "SE";
        System.out.println(ob.name); // print name as "indu"
        System.out.println(ob.batchID); // print batchID as "SE"

        StaticMember ob1  = new StaticMember();
        System.out.println(ob.name); // print name as "null" - default constructor
        System.out.println(ob.batchID); // print batchID as "SE" - this is a static attribute so its does not belong to the object



    }

}
