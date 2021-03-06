package com.book.controller;/**
 * Created by scj on 2018/8/19.
 */

import com.book.dao.ReadingListRepository;
import com.book.property.AmazonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制类<br>
 * 版权：Copyright (c) 2015-2018<br>
 * 作者：孙常军<br>
 * 版本：1.0<br>
 * 创建日期：2018/8/19<br>
 */
@Controller
@RequestMapping("/")
@ConfigurationProperties(prefix = "amazon")
public class ReadingListController {

	@Autowired
	private AmazonProperties amazonProperties;

	@Autowired
	private ReadingListRepository readingListRepository;

//	@GetMapping("/{reader}")
//	public String readerBooks(@PathVariable("reader") String reader, Model model) {
//		List<Book> readingList = readingListRepository.findByReader(reader);
//		if (readingList != null) {
//			model.addAttribute("books", readingList);
//			model.addAttribute("reader", reader);
//			model.addAttribute("amazonID", amazonProperties.getAssociateId());
//		}
//
//		return "readingList";
//	}
//
//	@PostMapping("/{reader}")
//	public String addToReadingList(@PathVariable("reader") String reader, Book book) {
//		book.setReader(reader);
//		readingListRepository.save(book);
//
//		return "redirect:/{reader}";
//	}

}
