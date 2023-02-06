package Models;

import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    List<Branch> branches;
    public static City city=null;

    private City(String name){
        this.name=name;
        this.branches=new ArrayList<>();
    }
    public List<Branch> getBranches()
    {
        return this.branches;
    }
    public void addBranch(Branch branch)
    {
        this.branches.add(branch);
    }
    public static City getCity() {
        if(city!=null)
        {
            return city;
        }
    return new City("Delhi");
}
}
