package JavaInterfaces.Enumeration;

enum months{
    Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
}
 class SwitchEnum {
    public static void main(String[] args) {
        
        months mm = months.Oct;
        switch (mm) {
            case Jan:
            System.out.println("This is Jan");
                 break;
                 case Feb:
            System.out.println("This is FEb");
                 break;
                 case Mar:
            System.out.println("This is Mar");
                 break;
                 case Apr:
            System.out.println("This is Apr");
                 break;
                 case May:
            System.out.println("This is May");
                 break;
                 case Jun:
            System.out.println("This is Jun");
                 break;
                 case Jul:
            System.out.println("This is Jul");
                 break;
                 case Aug:
            System.out.println("This is Aug");
                 break;
                 case Sep:
            System.out.println("This is Sep");
                 break;
                 case Oct:
            System.out.println("This is Oct");
                 break;
                 case Nov:
            System.out.println("This is Nov");
                 break;
              
            default :
            System.out.println("This is December");
                break;
        }
    }
    
}
