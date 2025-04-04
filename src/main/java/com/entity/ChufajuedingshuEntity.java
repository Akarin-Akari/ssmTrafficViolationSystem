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
 * 处罚决定书
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("chufajuedingshu")
public class ChufajuedingshuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChufajuedingshuEntity() {
		
	}
	
	public ChufajuedingshuEntity(T t) {
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
	 * 处罚决定书
	 */
					
	private String chufajuedingshu;
	
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
	 * 设置：处罚决定书
	 */
	public void setChufajuedingshu(String chufajuedingshu) {
		this.chufajuedingshu = chufajuedingshu;
	}
	/**
	 * 获取：处罚决定书
	 */
	public String getChufajuedingshu() {
		return chufajuedingshu;
	}
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
