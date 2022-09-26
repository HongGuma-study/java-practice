package me.java.arrays;

/**
 * 다시 풀어...
 */
public class Practice03 {
    public static void main(String[] args) {
        int[][] scores2d = {{1,50,60,70}, {2,60,76,100}, {3,95,88,87}, {4,60,65,85}, {5,100,85,77}};

    }
}
//public class Practice03 {
//    public static void main(String[] args) {
//        int[][] scores2d = {{1,50,60,70}, {2,60,76,100}, {3,95,88,87}, {4,60,65,85}, {5,100,85,77}};
//        double[][] studentArgs = new double[2][5];
//        double[][] subjectArgs = new double[2][3];
//
//        //학생별 평균
//        for(int i=0; i<5; i++){
//            int sum = 0;
//            for(int j=0; j<4; j++){
//                if(j == 0){ //[n][0] 은 학생 번호
//                    studentArgs[0][i] = scores2d[i][j];
//                    continue; //학생 번호라 sum 에 포함시키지 않는다.
//                }
//                sum += scores2d[i][j];
//            }
//            studentArgs[1][i] = sum/3; //과목이 3개라서 /3
//        }
//        //과목별 평균
//        for(int i=0; i<3; i++){
//            int sum = 0;
//            for(int j=0; j<5; j++){
//                sum += scores2d[j][i+1]; //i+1 하는 이유 i가 0이면 학생 번호라서
//            }
//            subjectArgs[0][i] = i;
//            subjectArgs[1][i] = sum/5; //학생이 5명이라서 /5
//        }
//        ascOrder(studentArgs); //학생 평균 내림차순
//        descOrder(subjectArgs); //과목 평균 오름차순
//
//    }
//
//    //오름차순 정렬 + 출력
//    public static void descOrder(double[][] arr){
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++){
//                if(arr[1][i] > arr[1][j]){
//                    double tmp = arr[1][i];
//                    arr[1][i] = arr[1][j];
//                    arr[1][j] = tmp;
//                    double tmp2 = arr[0][i];
//                    arr[0][i] = arr[0][j];
//                    arr[0][j] = tmp2;
//                }
//            }
//        }
//
//        for(int i=0; i<arr.length; i++){
//            System.out.printf("학생 번호 : %d, 평균 : %f\n",(int)arr[0][i],arr[1][i]);
//        }
//    }
//
//    //내림차순 정렬 + 출력
//    public static void ascOrder(double[][] arr){
//        String[] subjects = {"국어","영어","수학"};
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++){
//                if(arr[1][i] < arr[1][j]){
//                    double tmp = arr[1][i];
//                    arr[1][i] = arr[1][j];
//                    arr[1][j] = tmp;
//                    double tmp2 = arr[0][i];
//                    arr[0][i] = arr[0][j];
//                    arr[0][j] = tmp2;
//                }
//            }
//        }
//
//        for(int i=0; i<arr.length; i++){
//            System.out.printf("%s 과목 평균 : %f\n",subjects[(int)arr[0][i]],arr[1][i]);
//        }
//    }
//}
