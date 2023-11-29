package com.springbootrestapi.entity;

import org.springframework.stereotype.Component;

@Component
public class BookEntity {
    private String book_name;
    private String book_Writer;
    private String book_story;
    private String book_chapter;
    private int rool_number;
    private int book_id;
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_Writer() {
		return book_Writer;
	}
	public void setBook_Writer(String book_Writer) {
		this.book_Writer = book_Writer;
	}
	public String getBook_story() {
		return book_story;
	}
	public void setBook_story(String book_story) {
		this.book_story = book_story;
	}
	public String getBook_chapter() {
		return book_chapter;
	}
	public void setBook_chapter(String book_chapter) {
		this.book_chapter = book_chapter;
	}
	public int getRool_number() {
		return rool_number;
	}
	public void setRool_number(int rool_number) {
		this.rool_number = rool_number;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public BookEntity(String book_name, String book_Writer, String book_story, String book_chapter, int rool_number,
			int book_id) {
		super();
		this.book_name = book_name;
		this.book_Writer = book_Writer;
		this.book_story = book_story;
		this.book_chapter = book_chapter;
		this.rool_number = rool_number;
		this.book_id = book_id;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookEntity [book_name=" + book_name + ", book_Writer=" + book_Writer + ", book_story=" + book_story
				+ ", book_chapter=" + book_chapter + ", rool_number=" + rool_number + ", book_id=" + book_id + "]";
	}
    
    

}
