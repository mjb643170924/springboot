package com.jk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jk.vo.Pinlun;
import com.jk.vo.TCustomer;
import com.jk.vo.TEmp;

public interface PinlunDao {

	/**
	 * <pre>queryCount(查询条数------评论)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 上午11:33:52    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 上午11:33:52    
	 * 修改备注： 
	 * @param pinlun
	 * @return</pre>
	 */
	long queryCount(@Param("pinlun") Pinlun pinlun);

	/**
	 * <pre>querList(分页查询----评论)
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 上午11:34:28    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 上午11:34:28    
	 * 修改备注： 
	 * @param start
	 * @param end
	 * @param pinlun
	 * @return</pre>
	 */
	List<Pinlun> querList(@Param("sta") int start, @Param("end") int end, @Param("pinlun") Pinlun pinlun);

	/**
	 * <pre>queryTempOption(员工下拉查询)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 下午6:53:28    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 下午6:53:28    
	 * 修改备注： 
	 * @return</pre>
	 */
	List<TEmp> queryTempOption();

	/**
	 * <pre>addPinglun(新增评论)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 下午8:12:56    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 下午8:12:56    
	 * 修改备注： 
	 * @param pinlun</pre>
	 */
	void addPinglun(Pinlun pinlun);

	/**
	 * <pre>queryCustomerOption(客户下拉查询)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月25日 下午8:31:32    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月25日 下午8:31:32    
	 * 修改备注： 
	 * @return</pre>
	 */
	List<TCustomer> queryCustomerOption();

	/**
	 * <pre>deletePinglun(删除评论)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月26日 上午9:33:12    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月26日 上午9:33:12    
	 * 修改备注： 
	 * @param pinlun</pre>
	 */
	void deletePinglun(Pinlun pinlun);

	/**
	 * <pre>queryPinglunById(评论回显)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月26日 上午9:36:52    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月26日 上午9:36:52    
	 * 修改备注： 
	 * @param pinlun
	 * @return</pre>
	 */
	Pinlun queryPinglunById(Pinlun pinlun);

	/**
	 * <pre>updatePinglun(评论修改)   
	 * 创建人：马建彪 cht_java@126.com     
	 * 创建时间：2018年4月26日 上午9:56:21    
	 * 修改人：马建彪 cht_java@126.com      
	 * 修改时间：2018年4月26日 上午9:56:21    
	 * 修改备注： 
	 * @param pinlun</pre>
	 */
	void updatePinglun(Pinlun pinlun);

}
