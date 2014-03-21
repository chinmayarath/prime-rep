package com.bookmark.db.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookmarker.db.model.BookMark;

/**
 * This class does all the basic database operations on a bookmark entity
 * @author Chinmaya
 *
 */
@Repository
public class BookMarkDAO
{
@Autowired
private SessionFactory sessionFactory;
 
public BookMark getById(int bookmarkid)
{
 return (BookMark) sessionFactory.getCurrentSession().get(BookMark.class, bookmarkid);
}
 
@SuppressWarnings("unchecked")
public List searchBookMarks(String title)
{
 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(BookMark.class);
 criteria.add(Restrictions.ilike("bookmarkTitle", title+"%"));
 return criteria.list();
}
 
@SuppressWarnings("unchecked")
public List getAllBookMarks()
{
 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(BookMark.class);
 return criteria.list();
}
 
public int save(BookMark bookMark)
{
 return (Integer) sessionFactory.getCurrentSession().save(bookMark);
}
 
public void update(BookMark bookMark)
{
 sessionFactory.getCurrentSession().merge(bookMark);
}
 
public void delete(int id)
{
 BookMark c = getById(id);
 sessionFactory.getCurrentSession().delete(c);
}
}
