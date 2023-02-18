class HelloLoop{
    public static void main(String[] args) {
        int num=5;
        // for(int i=0;i<num;i++){                                     
        //     for(int j=0;j<i+1;j++){                                 
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //Output
        // * 
        // * *       
        // * * *     
        // * * * *   
        // * * * * * 
      

        // for(int i=0;i<num;i++){                                     
        //     for(int j=0;j<num-i;j++){                                 
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
         //Output
          // * * * * * 
          // * * * *   
          // * * *      
          // * *       
          // *     



         
        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num-i;j++){
        //     System.out.print("  ");
        // }
        // for(int j=0;j<i+1;j++){
        //     System.out.print("* ");
        // }
        // System.out.println();}
         //        * 
        //       * * 
        //     * * * 
        //   * * * * 
        // * * * * * 
  

         // Pyramid Structure
        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num-i;j++){
        //     System.out.print("  ");
        // }
        // for(int j=0;j<i+1;j++){
        //     System.out.print("* ");
        // }
        // for(int j=0;j<i;j++){
        //     System.out.print("# ");
        // }
        // System.out.println();}
        

          //Decending Order pyramid
        // for(int i=0;i<num;i++){
        //     for(int j=0;j<i+1;j++){
        //     System.out.print("  ");
        // }
        // for(int j=0;j<num-i;j++){
        //     System.out.print("* ");
        // }
        // for(int j=0;j<num-i-1;j++){
        //     System.out.print("* ");
        // }
        // System.out.println();}

        
        //Complete Diamond Stucture
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
            System.out.print("  ");
        }
        for(int j=0;j<i+1;j++){
            System.out.print("* ");
        }
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();}
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
            System.out.print("  ");
        }
        for(int j=0;j<num-i;j++){
            System.out.print("* ");
        }
        for(int j=0;j<num-i-1;j++){
            System.out.print("* ");
        }
        System.out.println();}
    }}