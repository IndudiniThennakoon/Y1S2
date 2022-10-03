public class StaticMember {
    private String name;
    private int age;
    private static String batchID;

    public StaticMember(){

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void setBatchID(String batchID) {
        StaticMember.batchID = batchID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static String getBatchID() {
        return batchID;
    }


}