package com.bookmarker.db.model;

import java.util.List;

public class BookMark {
	
	private int bookMarkID;
	private String bookMarkTitle, bookMarkNote, bookMarkURL;
	private List<String> Tags;
	/**
	 * @return the bookMarkID
	 */
	public int getBookMarkID() {
		return bookMarkID;
	}
	/**
	 * @param bookMarkID the bookMarkID to set
	 */
	public void setBookMarkID(int bookMarkID) {
		this.bookMarkID = bookMarkID;
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
	 * @return the tags
	 */
	public List<String> getTags() {
		return Tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		Tags = tags;
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
	
	
	
	

}
