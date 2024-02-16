class demo{
    public static void main(String args[]){
        int[][] nums = {{7,9,1},{8,6,5},{3,2,0}};
        System.out.println("----------------------------");
        System.out.println("The Array Is : ");
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                System.out.println("The nums of ["+i+"]["+j+"]"+nums[i][j]);
            }
        }
        System.out.println("------------------------------");
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        System.out.println("The Transpose of an Matrix :");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("The nums of ["+i+"]["+j+"]"+nums[i][j]);
            }
        }
        System.out.println("------------------------------");
        System.out.println("The 90 degree of an Given Array is :");
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < (nums[i].length)/2;j++){
                int last = (nums[i].length)-1;
                int high= nums[i][last-j];
                nums[i][last-j] = nums[i][j];
                nums[i][j] = high;
            }
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("The nums of array is : ["+i+"]["+j+"] :"+nums[i][j]);
            }
        }
    }
}