package com.entity.model;

import com.entity.ChufajuedingshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 处罚决定书
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public class ChufajuedingshuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 处理人
	 */
	
	private String chuliren;
		
	/**
	 * 被罚者
	 */
	
	private String beifazhe;
		
	/**
	 * 处罚内容
	 */
	
	private String chufaneirong;
		
	/**
	 * 处罚方式
	 */
	
	private String chufafangshi;
				
	
	/**
	 * 设置：处理人
	 */
	 
	public void setChuliren(String chuliren) {
		this.chuliren = chuliren;
	}
	
	/**
	 * 获取：处理人
	 */
	public String getChuliren() {
		return chuliren;
	}
				
	
	/**
	 * 设置：被罚者
	 */
	 
	public void setBeifazhe(String beifazhe) {
		this.beifazhe = beifazhe;
	}
	
	/**
	 * 获取：被罚者
	 */
	public String getBeifazhe() {
		return beifazhe;
	}
				
	
	/**
	 * 设置：处罚内容
	 */
	 
	public void setChufaneirong(String chufaneirong) {
		this.chufaneirong = chufaneirong;
	}
	
	/**
	 * 获取：处罚内容
	 */
	public String getChufaneirong() {
		return chufaneirong;
	}
				
	
	/**
	 * 设置：处罚方式
	 */
	 
	public void setChufafangshi(String chufafangshi) {
		this.chufafangshi = chufafangshi;
	}
	
	/**
	 * 获取：处罚方式
	 */
	public String getChufafangshi() {
		return chufafangshi;
	}
			
}
