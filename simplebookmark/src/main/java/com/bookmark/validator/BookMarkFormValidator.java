package com.bookmark.validator;



import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bookmark.servicebase.BookMarkForm;
import com.bookmarker.db.model.BookMark;
 /**
  * This class ensures that the user enters the title and URL as mandatory parameter when saving a bookmark
  * @author Chinmaya
  *
  */
@Component("BookMarkFormValidator")
public class BookMarkFormValidator implements Validator
{
 @SuppressWarnings("unchecked")
 @Override
 public boolean supports(Class clazz)
 {
  return BookMarkForm.class.isAssignableFrom(clazz);
 }
 
 @Override
 public void validate(Object model, Errors errors)
 {
  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookmarkTitle","required.bookmarkTitle", "Bookmark Title is required.");
  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookmarkURL","required.bookmarkURL", "Bookmark URL is required.");
 }
}