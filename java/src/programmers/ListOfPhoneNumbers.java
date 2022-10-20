package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfPhoneNumbers {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12","123","1235","567","88"};
        String[] phone_book4 = {"12","34","3456","567","88"};
        System.out.println(solution(phone_book2));
    }

    public static boolean solution(String[] phone_book){
      /*  // 런타임에러...
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(String phone : phone_book){
            treeSet.add(Integer.parseInt(phone));
        }

        System.out.println(treeSet);

        String firstElement = String.valueOf(treeSet.pollFirst());

        while(!treeSet.isEmpty()){
            String lastElement = String.valueOf(treeSet.pollLast());
            if(lastElement.equals(firstElement)) continue;
            if(lastElement.indexOf(firstElement) == 0) return false;
        }*/

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(phone_book));
        Collections.sort(arrayList);
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if(i+1 == arrayList.size()) break;
            if(arrayList.get(i+1).indexOf(arrayList.get(i)) == 0) return false;
        }

        return true;
    }
}

