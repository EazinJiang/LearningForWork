package com.liu.day05.sort.entry;

import com.liu.day05.sort.domain.Student;

public class Entry {

    public static void main(String[] args) {

        // 创建存储学生对象的数组，并且将学生对象添加到数组中
        Student[] students = new Student[5] ;
        students[0] = new Student("郭靖" , 175) ;
        students[1] = new Student("黄蓉" , 155) ;
        students[2] = new Student("黄药师" , 180) ;
        students[3] = new Student("欧阳锋" , 170) ;
        students[4] = new Student("穆念慈" , 160) ;

        // 调用sort方法排序
//        BubbleSort(students);
        SelectSort(students);

        // 遍历集合
        for(int x = 0 ; x < students.length ; x++) {
            System.out.println(students[x]);
        }

    }

    // 排序方法
    // 冒泡排序
    public static void BubbleSort(Student[] students) {
        // 补全代码
        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j < students.length - i -1; j++){
                // 如果顺序不对，交换。这里应该可以交换地址
                if (students[j].getHeight() > students[j+1].getHeight()){
                    Student student = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = student;
                }
            }
        }

    }

    public static void SelectSort(Student[] students){
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            int loc = i;
            for (int j = i + 1; j < students.length; j++) {
                if (student.getHeight() > students[j].getHeight()){
                    student = students[j];
                    loc = j;
                }
            }
            students[loc] = students[i];
            students[i] = student;
        }
    }

}
