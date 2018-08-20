package com.book.dao;

import com.book.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Reader数据访问类<br>
 * 版权：Copyright (c) 2015-2018<br>
 * 作者：孙常军<br>
 * 版本：1.0<br>
 * 创建日期：2018/8/20<br>
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
