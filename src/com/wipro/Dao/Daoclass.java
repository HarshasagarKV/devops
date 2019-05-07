package com.wipro.Dao;

import com.wipro.MainModel.Mainmodel;

public interface Daoclass {
 void tonewuser (Mainmodel bean);
 String tologincheck(Mainmodel bean);
 String toinsert(Mainmodel bean);
 String toupdate(Mainmodel bean);
}
