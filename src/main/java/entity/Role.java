package entity;

public class Role{



    private String name;
    private int id;

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Role(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Role getAdministratorRole(){
        return new Role("Administrator",2);
    }
    public static Role getUserRole(){
        return new Role("User",1);
    }
    public static Role getAnonymousRole(){
        return new Role("Anonymous",0);
    }
}
