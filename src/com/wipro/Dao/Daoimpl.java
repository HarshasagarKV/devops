package com.wipro.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.MainModel.Mainmodel;

@Repository
public class Daoimpl implements Daoclass{
@Autowired SessionFactory session;

@Override
public void tonewuser(Mainmodel bean)
{
	session.getCurrentSession().save(bean);
}
@Override
public String tologincheck(Mainmodel bean)
{
	session.getCurrentSession();
	return "admin";
	
}
@Override
public String toinsert(Mainmodel bean)
{
	session.getCurrentSession().save(bean);
	return "adminuser";
	
}
@Override
public String toupdate(Mainmodel bean)
{
	session.getCurrentSession().update(bean);;
	return "adminuser";
	
}
}



