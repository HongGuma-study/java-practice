package me.java.day14.practice.practice01;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class StudentDao {
    private static StudentDao studentDao;
    private Map<String, Student> map = DataBase.getInstance().getTableList().get(0).getData();

    public static StudentDao getInstance() {
        if (studentDao == null) {
            studentDao = new StudentDao();
        }
        return studentDao;
    }


    /**
     * 인자로 들어온 키를 통해 데이터베이스에 동일한 키 값을 가진 학생 검색 후 반환
     * @Param: Student key 값
     * @return: select된 Student 반환
     * */
    public Student select(String key) {
        // TODO: select 함수 구현
        if(map.containsKey(key)){ //map에 동일한 key가 있으면
            return map.get(key); //해당 value 반환
        }
        return null; //없으면 null
    }


    public Students select(Predicate<Student> condition) {
        Students students = new Students();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String num = iterator.next();
            Student student = map.get(num);

            if (condition != null) {
                if (condition.test(student)) {
                    students.getStudents().add(student);
                }
            }
        }

        return students;
    }


    public Students select() {
        Students studentAll = new Students();
        for (Student student : map.values()) {
            studentAll.getStudents().add(student);
        }
        return studentAll;
    }


    /**
     * 인자로 들어온 학생 1명을 데이터베이스에 추가, 데이터베이스에 정상적으로 추가된 객체 반환
     * 예외 - 현재 데이터베이스에 있는 객체들과 중복된 키를 가질 수 없음
     * @param key : Student key 값
     * @param student : Student 객체 1명
     * @return : DB에 정상적으로 insert 된 객체 반환
     * @exception: 현재 DB에 있는 객체들과 중복된 키를 가질 수 없음
     */
    public Student insert(String key, Student student) {
        // TODO: insert 함수 구현
        if(map.containsKey(key)){ //map에 같은 키가 있으면
            System.out.println("existed key"); //해당 문구 출력후
            return null; //null 리턴
        }else{
            map.put(key,student); //없으면 추가한다.
            return map.get(key); //추가한 student 객체 반환
        }
    }

    /**
     * 인자로 들어온 학생 여러명을 데이터베이스에 추가, 데이터베이스에 정상적으로 추가된 객체 수 반환
     * 예외 - 현재 데이터베이스에 있는 객체들과 중복된 키를 가질 수 없음
     * @param keys Students 들의 key 값들
     * @param students Students 객체 (Student 객체 여러명 담을 수 있음)
     * @return Students 객체 중 DB에 정상적으로 insert 된 객체 수 반환
     * @exception: 현재 DB에 있는 객체들과 중복된 키를 가질 수 없음
     * */
    public int insert(List<String> keys, Students students) {
        // TODO: insert 함수 구현
        int cnt = 0;
        for(int i=0; i<keys.size(); i++){ //입력 받은 key 개수만큼 반복
            if(!map.containsKey(keys.get(i))){ //map 에 key가 포함 되어있지 않다면
                map.put(keys.get(i),students.getStudents().get(i)); //새로 넣고
                cnt++; //cnt 증가
            }
        }
        return cnt; //추가한 개수 리턴
    }

    public int update(Predicate<Student> condition, Column column, Object value) {
        int count = 0;
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String num = iterator.next();
            Student student = map.get(num);

            if (condition != null) {
                if (condition.test(student)) {
                    if (column != null && column.getColumnName() != null) {
                        if (column.getColumnName().equals("sId")) {
                            map.get(num).setsId((String) value);
                        } else if (column.getColumnName().equals("sPw")) {
                            map.get(num).setsPw((String) value);
                        } else if (column.getColumnName().equals("sName")) {
                            map.get(num).setsName((String) value);
                        } else if (column.getColumnName().equals("sAge")) {
                            map.get(num).setsAge((Integer) value);
                        } else if (column.getColumnName().equals("sGender")) {
                            map.get(num).setsGender((String) value);
                        } else if (column.getColumnName().equals("sMajor")) {
                            map.get(num).setsMajor((String) value);
                        } else {
                            continue;
                        }
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public int delete() {
        return delete(s -> true);
    }

    public int delete(Predicate<Student> condition) {
        int count = 0;
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String num = iterator.next();
            Student student = map.get(num);

            if (condition != null) {
                if (condition.test(student)) {
                    iterator.remove();
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * 인자로 들어온 키를 통해 데이터베이스에 동일한 키 값을 가진 학생 검색 후 삭제 및 반환
     * @param key Student key 값
     * @return 삭제된 Student 반환
     * */
    public Student delete(String key) {
        // TODO: delete 함수 구현
        if(map.containsKey(key)){ //map에 key가 있다면
            Student delStudent = map.get(key); //삭제된 객체를 반환해야 해서 일단 변수에 담음
            map.remove(key); //key에 해당하는 값 삭제
            return delStudent; //따로 빼 놨던 student 객체 리턴
        }
        return null; //key없으면 null 리턴
    }

}