public String to String ()
{
     return "Id: "+id+" Name: "+name+" marks1: "+marks1+" "+" marks2;
}
    

}
    public int getId(){
    return id;
    }

    public void setId(int id){
    this.id = id;
    }
    public String getName(){
    return name;
    }

    public void setName(String name){
    this.name =name;
    }

    public int getmarks1(){
    return marks1;
    }

    public void setMarks1(int marks1){
    this.marks1=marks1;
    }

    public int getMarks2(){
    return marks2;
    }

    public void setMarks2(int marks2){
    this.marks2 = marks2;
    }

    //method

    public void result(){
    System.out.println("Total marks "+(marks1+marks2));
    }
}


class classEx4Students{
public static void main(SAtring args[]){
Student2 s1=new Student2();
System.out.printlns(s1);
s1.setId(id:11);
s1.setName(NAME:"ABC");
s1.setMarks1(marks1:70);
s1.setMarks2(marks2: 70);
System.out.println("After setting values of s1  "+s1);
s1.result();

Student2 s2=new Student2(i:22, n:"zxc",m1:70, m2:75);
System.out.println(s2);
s2.setId(id:33);
System.out.println("After setting id=33 for s2"+s2);
}
}