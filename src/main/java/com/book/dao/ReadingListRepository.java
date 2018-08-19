package com.book.dao;/**
 * Created by scj on 2018/8/19.
 */

import com.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 数据访问类<br>
 * 版权：Copyright (c) 2015-2018<br>
 * 作者：孙常军<br>
 * 版本：1.0<br>
 * 创建日期：2018/8/19<br>
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

	List<Book> findByReader(String reader);
}
