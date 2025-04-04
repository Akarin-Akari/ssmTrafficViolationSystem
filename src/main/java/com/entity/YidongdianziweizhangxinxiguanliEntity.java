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
 * 移动电子违章信息管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("yidongdianziweizhangxinxiguanli")
public class YidongdianziweizhangxinxiguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YidongdianziweizhangxinxiguanliEntity() {
		
	}
	
	public YidongdianziweizhangxinxiguanliEntity(T t) {
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
	 * 违章行为
	 */
					
	private String weizhangxingwei;
	
	/**
	 * 违章车辆类型
	 */
					
	private String weizhangcheliangleixing;
	
	/**
	 * 车牌种类
	 */
					
	private String chepaizhonglei;
	
	/**
	 * 违章车牌号
	 */
					
	private String weizhangchepaihao;
	
	/**
	 * 处罚方式
	 */
					
	private String chufafangshi;
	
	/**
	 * 处理人
	 */
					
	private String chuliren;
	
	/**
	 * 违章者
	 */
					
	private String weizhangzhe;
	
	/**
	 * 处罚时间时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chufashijianshijian;
	
	/**
	 * 处罚地点
	 */
					
	private String chufadidian;
	
	/**
	 * 违章内容
	 */
					
	private String weizhangneirong;
	
	/**
	 * 违章视频
	 */
					
	private String weizhangshipin;
	
	/**
	 * 违章照片
	 */
					
	private String weizhangzhaopian;
	
	
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
	 * 设置：违章行为
	 */
	public void setWeizhangxingwei(String weizhangxingwei) {
		this.weizhangxingwei = weizhangxingwei;
	}
	/**
	 * 获取：违章行为
	 */
	public String getWeizhangxingwei() {
		return weizhangxingwei;
	}
	/**
	 * 设置：违章车辆类型
	 */
	public void setWeizhangcheliangleixing(String weizhangcheliangleixing) {
		this.weizhangcheliangleixing = weizhangcheliangleixing;
	}
	/**
	 * 获取：违章车辆类型
	 */
	public String getWeizhangcheliangleixing() {
		return weizhangcheliangleixing;
	}
	/**
	 * 设置：车牌种类
	 */
	public void setChepaizhonglei(String chepaizhonglei) {
		this.chepaizhonglei = chepaizhonglei;
	}
	/**
	 * 获取：车牌种类
	 */
	public String getChepaizhonglei() {
		return chepaizhonglei;
	}
	/**
	 * 设置：违章车牌号
	 */
	public void setWeizhangchepaihao(String weizhangchepaihao) {
		this.weizhangchepaihao = weizhangchepaihao;
	}
	/**
	 * 获取：违章车牌号
	 */
	public String getWeizhangchepaihao() {
		return weizhangchepaihao;
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
	 * 设置：违章者
	 */
	public void setWeizhangzhe(String weizhangzhe) {
		this.weizhangzhe = weizhangzhe;
	}
	/**
	 * 获取：违章者
	 */
	public String getWeizhangzhe() {
		return weizhangzhe;
	}
	/**
	 * 设置：处罚时间时间
	 */
	public void setChufashijianshijian(Date chufashijianshijian) {
		this.chufashijianshijian = chufashijianshijian;
	}
	/**
	 * 获取：处罚时间时间
	 */
	public Date getChufashijianshijian() {
		return chufashijianshijian;
	}
	/**
	 * 设置：处罚地点
	 */
	public void setChufadidian(String chufadidian) {
		this.chufadidian = chufadidian;
	}
	/**
	 * 获取：处罚地点
	 */
	public String getChufadidian() {
		return chufadidian;
	}
	/**
	 * 设置：违章内容
	 */
	public void setWeizhangneirong(String weizhangneirong) {
		this.weizhangneirong = weizhangneirong;
	}
	/**
	 * 获取：违章内容
	 */
	public String getWeizhangneirong() {
		return weizhangneirong;
	}
	/**
	 * 设置：违章视频
	 */
	public void setWeizhangshipin(String weizhangshipin) {
		this.weizhangshipin = weizhangshipin;
	}
	/**
	 * 获取：违章视频
	 */
	public String getWeizhangshipin() {
		return weizhangshipin;
	}
	/**
	 * 设置：违章照片
	 */
	public void setWeizhangzhaopian(String weizhangzhaopian) {
		this.weizhangzhaopian = weizhangzhaopian;
	}
	/**
	 * 获取：违章照片
	 */
	public String getWeizhangzhaopian() {
		return weizhangzhaopian;
	}

}
