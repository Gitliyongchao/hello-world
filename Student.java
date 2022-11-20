public class Student {
    public String lastname;
    public int realName;
    private int age;

    private String address;
    public String getName() {
        return lastname;
    }

    public void setName(String name) {
        this.lastname = name;
    }

    public int getRealName() {
        return realName;
    }

    public void setRealName(int realName) {
        this.realName = realName;
    }

    public void dosomething(){
        age = 18;
        System.out.println(realName+"年龄为："+ age);
        //System.out.println(realName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
