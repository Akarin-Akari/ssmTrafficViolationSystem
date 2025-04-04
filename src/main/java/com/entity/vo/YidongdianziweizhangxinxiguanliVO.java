package com.entity.vo;

import com.entity.YidongdianziweizhangxinxiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 移动电子违章信息管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public class YidongdianziweizhangxinxiguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
