package Arrays;


 class ArrasObject {

    
    String Name;
    int RollNo;
    int Marks;
    
 

    public static void main(String[] args) {
        

        ArrasObject s1 = new ArrasObject();
        s1.Name="Vikram";
        s1.RollNo=23;
        s1.Marks=75;


        ArrasObject s2= new ArrasObject();
        s2.Name="SaiRam";
        s2.RollNo=22;
        s2.Marks=74;


        ArrasObject s3 = new ArrasObject();
        s3.Name="Ram";
        s3.RollNo=20;
        s3.Marks=65;

        ArrasObject s4 = new ArrasObject();
        s4.Name="Vim";
        s4.RollNo=19;
        s4.Marks=69;

        
        

        ArrasObject stud[] = new ArrasObject[4];
        stud[0]=s1;
         stud[1]=s2;

          stud[2]=s3;

           stud[3]=s4;

          
            for(int i=0;i<stud.length;i++){
                System.out.println(stud[i].Name+ " "+ stud[i].Marks);
            }

    }
}
 