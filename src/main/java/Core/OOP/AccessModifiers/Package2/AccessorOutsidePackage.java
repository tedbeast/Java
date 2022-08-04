package Core.OOP.AccessModifiers.Package2;

import Core.OOP.AccessModifiers.Package1.ClassWithFields;

public class AccessorOutsidePackage {
    ClassWithFields cwf;
    public AccessorOutsidePackage(){
        cwf = new ClassWithFields();
    }
    public String getCwfPublicModifier(){
        return "";
    }
    public String getCwfProtectedModifier(){
        return"";
    }
    public String getCwfDefaultModifier(){
        return "";
    }
}
