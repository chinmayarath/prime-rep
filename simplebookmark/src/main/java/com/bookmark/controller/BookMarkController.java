package com.bookmark.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.bookmark.db.dao.BookMarkDAO;
import com.bookmark.servicebase.BookMarkForm;
import com.bookmark.validator.BookMarkFormValidator;
import com.bookmarker.db.model.BookMark;
 
/**
 * This is the controller class for the whole application 
 * This supports below URL endpoint
 * <UL>
 * 	<li>/searchbookmarks - to serach  bookMarks</li>
 * 	<li>/viewAllContacts - to view All contacts</li>
 * 	<li>/saveBookMark - to save a new bookMark form</li>
 * 	<li>/deleteBookMark - to delete a bookmark</li>
 * </UL>
 * @author Chinmay
 * Added some comment
 */
 
@Controller
public class BookMarkController
{
 @Autowired
 private BookMarkDAO bookmarksDAO;
  
 @Autowired
 private BookMarkFormValidator validator;
   
 @RequestMapping("/searchbookmarks")
 public ModelAndView searchContacts(@RequestParam(required= false, defaultValue="") String name)
 {
  ModelAndView mav = new ModelAndView("showBookMarks");
  List<BookMark> bookMarks = bookmarksDAO.searchBookMarks(name.trim());
  mav.addObject("SEARCH_BOOKMARKS_RESULTS_KEY", bookMarks);
  return mav;
 }
  
 @RequestMapping("/viewAllContacts")
 public ModelAndView getAllContacts()
 {
  ModelAndView mav = new ModelAndView("showBookMarks");
  List<BookMark> bookMarks = bookmarksDAO.getAllBookMarks();
  mav.addObject("SEARCH_BOOKMARKS_RESULTS_KEY", bookMarks);
  return mav;
 }
  
 @RequestMapping(value="/saveBookMark", method=RequestMethod.GET)
 public ModelAndView newuserForm()
 {
  ModelAndView mav = new ModelAndView("newBookMark");
  BookMarkForm bookmark = new BookMarkForm();
  mav.getModelMap().put("newBookMark", bookmark);
  return mav;
 }
  
 @RequestMapping(value="/saveBookMark", method=RequestMethod.POST)
 public String create(@ModelAttribute("newBookMark")BookMarkForm bookmarkform, BindingResult result, SessionStatus status)
 {
  validator.validate(bookmarkform, result);
  if (result.hasErrors())
  {   
   return "newBookMark";
  }
  BookMark bookmark = bookmarkform.mapAsBookMark(); 	// Map a bookmark form to a bookmark object
  bookmarksDAO.save(bookmark);
  status.setComplete();
  return "redirect:viewAllBookMarks";
 }
  
   
 @RequestMapping("/deleteBookMark")
 public ModelAndView delete(@RequestParam("id")Integer id)
 {
  ModelAndView mav = new ModelAndView("redirect:viewAllContacts");
  bookmarksDAO.delete(id);
  return mav;
 }
}