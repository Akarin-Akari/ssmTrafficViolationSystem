package com.entity.model;

import com.entity.DaduiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 大队管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public class DaduiguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 支队照片
	 */
	
	private String zhiduizhaopian;
		
	/**
	 * 大队地点
	 */
	
	private String daduididian;
		
	/**
	 * 大队队长
	 */
	
	private String daduiduizhang;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：支队照片
	 */
	 
	public void setZhiduizhaopian(String zhiduizhaopian) {
		this.zhiduizhaopian = zhiduizhaopian;
	}
	
	/**
	 * 获取：支队照片
	 */
	public String getZhiduizhaopian() {
		return zhiduizhaopian;
	}
				
	
	/**
	 * 设置：大队地点
	 */
	 
	public void setDaduididian(String daduididian) {
		this.daduididian = daduididian;
	}
	
	/**
	 * 获取：大队地点
	 */
	public String getDaduididian() {
		return daduididian;
	}
				
	
	/**
	 * 设置：大队队长
	 */
	 
	public void setDaduiduizhang(String daduiduizhang) {
		this.daduiduizhang = daduiduizhang;
	}
	
	/**
	 * 获取：大队队长
	 */
	public String getDaduiduizhang() {
		return daduiduizhang;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
