package lambdaStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class lambda1 {

    public static void main(String[] args){


//        Demo1();

//        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        int[] nums1=new int[]{4,5,6,0,0,0};
        int[] nums2=new int[]{1,2,3};
        merge(nums1,3,nums2,3);

    }

    public static void Demo1(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        // 以前的循环方式
//        for (String player : players) {
//            System.out.print(player + "; ");
//        }

        // 使用 lambda 表达式以及函数操作(functional operation)
//        players.forEach((player) -> System.out.print(player + "; "));
        players.forEach((player)->System.out.println(player+";"));
        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=m;
        for(int i=0;i<n;i++){
            if(m==0){
                nums1[i]=nums2[i];
            }else if(m>0){
                for(int k=0;k<m;k++){
                    if(nums2[i]<nums1[k]){
                        for(int x=count;x>k;x--){
                            nums1[x]=nums1[x-1];
                        }
                        nums1[k]=nums2[i];
                        count++;
                        break;
                    }else if(nums2[i]>nums1[count-1]){
                        nums1[count]=nums2[i];
                        count++;
                        break;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(nums1));
    }
}
