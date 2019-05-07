package com.wipro.Mainservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.Dao.Daoclass;
import com.wipro.MainModel.Mainmodel;

@org.springframework.stereotype.Service
public class Serviceimpl implements Service {
@Autowired Daoclass dao;
@Override
@Transactional
public void tonewuser(Mainmodel bean)
{
	dao.tonewuser(bean);
}
@Override
@Transactional
public String tologincheck(Mainmodel bean)
{
	return dao.tologincheck(bean);
}
@Override
@Transactional
public String toinsert(Mainmodel bean)
{
	return dao.toinsert(bean);
}
@Override
@Transactional
public String toupdate(Mainmodel bean)
{
	return dao.toupdate(bean);
}
}
