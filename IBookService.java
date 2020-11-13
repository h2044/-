package com.zking.mybatis01.service;

import com.zking.mybatis01.dto.BookDto;
import com.zking.mybatis01.model.Book;

import java.util.List;
import java.util.Map;

public interface IBookService {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    //查全部
    List<Book> listAll(Book book);

    //if条件
    List<Book> listByIf(Book book);

    //foreach
    List<Book> listByForeach(BookDto bookDto);

    //模糊查
    List<Book> listByLike(Book book);

    List<Book> listByResultMap();

    Book listBySingle(Book book);

    List<Map> listByListMap(Book book);

    Map listByMap(Book book);

    List<Book> listByPrice(BookDto bookDto);
}
