package com.Reflex;

/**
 * @ClassName reflex
 * @Description //TODO
 * @Author crazy402
 * @Date 2020/9/7 16:42
 * @Version 1.0
 **/

/**
 *获取Class对象的三种方法
 * 1.Object->getClass
 * 2.任何数据类型前都有一个静态的class属性
 * 3.通过class类的静态方法：forname(String classname)(常用)
 **/
public class reflex {
    public static void main(String[] args) {
        //第一种方法
        Student stu = new Student();
        Class stuClass = stu.getClass();
        System.out.println(stuClass.getName());

        //第二中方法
        Class stu2 = Student.class;
        //判断两种方式获取的对象是否相等
        System.out.println(stuClass == stu2);

        //第三种方法
        try{
            //注意此处的forname中填的字符串必须是真实地址，带包名
            Class stu3 = Class.forName("com.Reflex.Student");
            System.out.println(stu3 == stu2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
