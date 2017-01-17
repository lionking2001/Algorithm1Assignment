import java.util.Scanner;

public class RollTheDice {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter number of dices : ");
        int n=input.nextInt();
        String s;
        Array ob1=new Array(),ob2=new Array();
        RollTheDice ob3=new RollTheDice();
        //int arr[];
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter sequence of the rotation for dice "+(i+1)+" : ");
            s=input.next();
            //System.out.println(s);
            ob3.initializeDice(i,ob1,ob2);
            for(int j=0;j<s.length();j++)
            {
                switch(s.charAt(j))
                {
                    case 'F':
                        ob3.forwardRotation(ob1,ob2);
                        break;
                    case 'B':
                        ob3.backwardRotation(ob1,ob2);
                        break;
                    case 'L':
                        ob3.leftRotation(ob1,ob2);
                        break;
                    case 'R':
                        ob3.rightRotation(ob1,ob2);
                        break;
                    case 'C':
                        ob3.clockWiseRotation(ob1,ob2);
                        break;
                    case 'D':
                        ob3.counterClockWiseRotation(ob1,ob2);
                        break;
                    default:
                        System.out.println("\nWrong letter\n");
                        System.exit(0);
                }
            }
            System.out.println("\nNumber in the front side:  "+ob1.arr[4]);
        }
        input.close();
    }

    public void counterClockWiseRotation(Array ob1,Array ob2)
    {
        int arr[]=ob1.arr,brr[]=ob2.arr;
        arr[2]=brr[5];
        arr[3]=brr[4];
        arr[4]=brr[2];
        arr[5]=brr[3];
        for(int i=0;i<6;i++)
            brr[i]=arr[i];
        ob1.arr=arr;
        ob2.arr=brr;
    }

    public void clockWiseRotation(Array ob1,Array ob2)
    {
        int arr[]=ob1.arr,brr[]=ob2.arr;
        arr[2]=brr[4];
        arr[3]=brr[5];
        arr[4]=brr[3];
        arr[5]=brr[2];
        for(int i=0;i<6;i++)
            brr[i]=arr[i];
        ob1.arr=arr;
        ob2.arr=brr;
    }

    public void rightRotation(Array ob1,Array ob2)
    {
        int arr[]=ob1.arr,brr[]=ob2.arr;
        arr[0]=brr[2];
        arr[1]=brr[3];
        arr[2]=brr[1];
        arr[3]=brr[0];
        for(int i=0;i<6;i++)
            brr[i]=arr[i];
        ob1.arr=arr;
        ob2.arr=brr;
    }

    public void leftRotation(Array ob1,Array ob2)
    {
        int arr[]=ob1.arr,brr[]=ob2.arr;
        arr[0]=brr[3];
        arr[1]=brr[2];
        arr[2]=brr[0];
        arr[3]=brr[1];
        for(int i=0;i<6;i++)
            brr[i]=arr[i];
        ob1.arr=arr;
        ob2.arr=brr;
    }

    public void backwardRotation(Array ob1,Array ob2)
    {
        int arr[]=ob1.arr,brr[]=ob2.arr;
        arr[0]=brr[4];
        arr[1]=brr[5];
        arr[4]=brr[1];
        arr[5]=brr[0];
        for(int i=0;i<6;i++)
            brr[i]=arr[i];
        ob1.arr=arr;
        ob2.arr=brr;
    }

    public void forwardRotation(Array ob1,Array ob2)
    {
        int arr[]=ob1.arr,brr[]=ob2.arr;
        arr[0]=brr[5];
        arr[1]=brr[4];
        arr[4]=brr[0];
        arr[5]=brr[1];
        for(int i=0;i<6;i++)
            brr[i]=arr[i];
        ob1.arr=arr;
        ob2.arr=brr;
    }

    public void initializeDice(int i,Array ob1,Array ob2)
    {
        int arr[]=ob1.arr,brr[]=ob2.arr;
        arr[0]=brr[0]=1;
        arr[1]=brr[1]=6;
        arr[2]=brr[2]=3;
        arr[3]=brr[3]=4;
        arr[4]=brr[4]=2;
        arr[5]=brr[5]=5;
        ob1.arr=arr;
        ob2.arr=brr;
        System.out.println("\nInitial position for the Dice  "+(i+1)+"\n");
        System.out.println("Top Bottom Left Right Front Back");
        System.out.println(" 1 6 3 4 2 5");
    }

}