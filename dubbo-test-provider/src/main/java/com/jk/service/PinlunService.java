package com.jk.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jk.vo.Pinlun;
import com.jk.vo.TCustomer;
import com.jk.vo.TEmp;

public interface PinlunService {

	/**
	 * <pre>queryPinlun(评论查询)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 上午11:29:55    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 上午11:29:55    
	 * 修改备注： 
	 * @param page
	 * @param rows
	 * @param pinlun
	 * @return</pre>
	 */
	JSONObject queryPinlun(int page, int rows, Pinlun pinlun);

	/**
	 * <pre>queryTempOption(员工下拉查询)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 下午6:52:43    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 下午6:52:43    
	 * 修改备注： 
	 * @return</pre>
	 */
	List<TEmp> queryTempOption();

	/**
	 * <pre>addPinglun(新增评论)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 下午8:12:22    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 下午8:12:22    
	 * 修改备注： 
	 * @param pinlun</pre>
	 */
	void addPinglun(Pinlun pinlun);

	/**
	 * <pre>queryCustomerOption(客户下拉查询)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 下午8:30:46    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 下午8:30:46    
	 * 修改备注： 
	 * @return</pre>
	 */
	List<TCustomer> queryCustomerOption();

	/**
	 * <pre>deletePinglun(删除评论)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月26日 上午9:32:48    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月26日 上午9:32:48    
	 * 修改备注： 
	 * @param pinlun</pre>
	 */
	void deletePinglun(Pinlun pinlun);

	/**
	 * <pre>queryPinglunById(回显)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月26日 上午9:34:53    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月26日 上午9:34:53    
	 * 修改备注： 
	 * @param pinlun
	 * @return</pre>
	 */
	com.jk.vo.Pinlun queryPinglunById(Pinlun pinlun);

	/**
	 * <pre>updatePinglun(评论修改)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月26日 上午9:55:53    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月26日 上午9:55:53    
	 * 修改备注： 
	 * @param pinlun</pre>
	 * @return 
	 */
	void updatePinglun(Pinlun pinlun);

}
