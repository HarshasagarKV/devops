package com.wipro.Mainservice;

import com.wipro.MainModel.Mainmodel;

public interface Service {
 void tonewuser(Mainmodel bean);
 String tologincheck(Mainmodel bean);
 String toinsert(Mainmodel bean);
 String toupdate(Mainmodel bean);
}
