package com.bookmark.servicebase;

import java.util.Arrays;
import java.util.List;

import com.bookmarker.db.model.BookMark;

/**
 * This class a maps user form to a bookmark object which can be used to do database operations
 * @author Chinmaya
 *
 */
public class BookMarkForm {
	
	private BookMark bookmark;
	private String bookMarkTitle, bookMarkNote, bookMarkURL, bookMarkTags;
	/**
	 * @return the bookmark
	 */
	public BookMark getBookmark() {
		return bookmark;
	}
	/**
	 * @param bookmark the bookmark to set
	 */
	public void setBookmark(BookMark bookmark) {
		this.bookmark = bookmark;
	}
	/**
	 * @return the bookMarkTitle
	 */
	public String getBookMarkTitle() {
		return bookMarkTitle;
	}
	/**
	 * @param bookMarkTitle the bookMarkTitle to set
	 */
	public void setBookMarkTitle(String bookMarkTitle) {
		this.bookMarkTitle = bookMarkTitle;
	}
	/**
	 * @return the bookMarkNote
	 */
	public String getBookMarkNote() {
		return bookMarkNote;
	}
	/**
	 * @param bookMarkNote the bookMarkNote to set
	 */
	public void setBookMarkNote(String bookMarkNote) {
		this.bookMarkNote = bookMarkNote;
	}
	/**
	 * @return the bookMarkURL
	 */
	public String getBookMarkURL() {
		return bookMarkURL;
	}
	/**
	 * @param bookMarkURL the bookMarkURL to set
	 */
	public void setBookMarkURL(String bookMarkURL) {
		this.bookMarkURL = bookMarkURL;
	}
	/**
	 * @return the bookMarkTags
	 */
	public String getBookMarkTags() {
		return bookMarkTags;
	}
	/**
	 * @param bookMarkTags the bookMarkTags to set
	 */
	public void setBookMarkTags(String bookMarkTags) {
		this.bookMarkTags = bookMarkTags;
	}
	
	public BookMark mapAsBookMark()
	{
		bookmark = new BookMark();
		bookmark.setBookMarkNote(bookMarkNote);
		bookmark.setBookMarkTitle(bookMarkTitle);
		bookmark.setBookMarkURL(bookMarkURL);
		List<String> taglist = Arrays.asList( bookMarkTags.split(","));
		bookmark.setTags(taglist);
		return bookmark;
	}
	

}
