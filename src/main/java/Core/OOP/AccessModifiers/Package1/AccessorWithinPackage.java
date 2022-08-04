package Core.OOP.AccessModifiers.Package1;

public class AccessorWithinPackage {
    ClassWithFields cwf;
    public AccessorWithinPackage(){
        cwf = new ClassWithFields();
    }
    public String getCwfPublicModifier(){
        return "";
    }
    public String getCwfProtectedModifier(){
        return "";
    }
    public String getCwfDefaultModifier(){
        return "";
    }
}
