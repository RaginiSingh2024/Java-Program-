class LcontinueEx {
    public static void main(String args[])
    {
        //First label
        first:
        for (int i=0; i<3; i++){
            //Second label
            second:
            for (int j=0; j<3; j++){
                if(i==1 && j==1){
                    continue first;

                }
                System.out.println(i + ""+j);
            }
        }
        
    
    }
}
