package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 支队管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("zhiduiguanli")
public class ZhiduiguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiduiguanliEntity() {
		
	}
	
	public ZhiduiguanliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 支队队名
	 */
					
	private String zhiduiduiming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：支队队名
	 */
	public void setZhiduiduiming(String zhiduiduiming) {
		this.zhiduiduiming = zhiduiduiming;
	}
	/**
	 * 获取：支队队名
	 */
	public String getZhiduiduiming() {
		return zhiduiduiming;
	}
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
