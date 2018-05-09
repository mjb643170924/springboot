package com.jk.service.impl;

import java.util.List;

import com.jk.service.PinlunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.PinlunDao;
import com.jk.vo.Pinlun;
import com.jk.vo.TCustomer;
import com.jk.vo.TEmp;

@Service("pinlunService")
public class PinlunServiceImpl implements PinlunService {

	@Autowired
	private PinlunDao pinlunDao;
	
	@Override
	public JSONObject queryPinlun(int page, int rows, Pinlun pinlun) {
		// TODO Auto-generated method stub
		int start = (page-1)*rows;
		int end = rows;
		long total = pinlunDao.queryCount(pinlun);
		List <Pinlun> list = pinlunDao.querList(start,end,pinlun);
		JSONObject json = new JSONObject();
		json.put("total",total);
		json.put("rows",list);
		return json;
	}

	@Override
	public List<TEmp> queryTempOption() {
		// TODO Auto-generated method stub
		return pinlunDao.queryTempOption();
	}

	@Override
	public void addPinglun(Pinlun pinlun) {
		// TODO Auto-generated method stub
		pinlunDao.addPinglun(pinlun);
	}

	@Override
	public List<TCustomer> queryCustomerOption() {
		// TODO Auto-generated method stub
		return pinlunDao.queryCustomerOption();
	}

	@Override
	public void deletePinglun(Pinlun pinlun) {
		// TODO Auto-generated method stub
		pinlunDao.deletePinglun(pinlun);
	}

	@Override
	public Pinlun queryPinglunById(Pinlun pinlun) {
		// TODO Auto-generated method stub
		return pinlunDao.queryPinglunById(pinlun);
	}

	@Override
	public void updatePinglun(Pinlun pinlun) {
		// TODO Auto-generated method stub
		 pinlunDao.updatePinglun(pinlun);
	}

}
