//package com.mybatis.service;
//
//import com.mybatis.Bookbean;
//import com.mybatis.mapper.BookMapper;
//import com.mybatis.tools.DBTools;
//import org.apache.ibatis.session.SqlSession;
//
///**
// * Created by hua on 2018/5/25.
// */
//public class BookService {
//    public static void main(String[] args){
//        insertBook(1);
//    }
//
//    /**
//     * 新增书籍
//     */
//    private static void insertUser() {
//        SqlSession session = DBTools.getSession();
//        BookMapper mapper = session.getMapper(BookMapper.class);
//        Bookbean Book = new Bookbean(3, "sky", "hello sky");
//        try {
//            mapper.insertBook(Book);
//            System.out.println(Book.toString());
//            session.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            session.rollback();
//        }
//    }
//}
