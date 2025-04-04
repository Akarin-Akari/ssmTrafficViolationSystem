package com.entity.vo;

import com.entity.ZhiduiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 支队管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public class ZhiduiguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 支队地点
	 */
	
	private String zhiduididian;
		
	/**
	 * 支队队长
	 */
	
	private String zhiduiduizhang;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 支队照片
	 */
	
	private String zhiduizhaopian;
				
	
	/**
	 * 设置：支队地点
	 */
	 
	public void setZhiduididian(String zhiduididian) {
		this.zhiduididian = zhiduididian;
	}
	
	/**
	 * 获取：支队地点
	 */
	public String getZhiduididian() {
		return zhiduididian;
	}
				
	
	/**
	 * 设置：支队队长
	 */
	 
	public void setZhiduiduizhang(String zhiduiduizhang) {
		this.zhiduiduizhang = zhiduiduizhang;
	}
	
	/**
	 * 获取：支队队长
	 */
	public String getZhiduiduizhang() {
		return zhiduiduizhang;
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
			
}
