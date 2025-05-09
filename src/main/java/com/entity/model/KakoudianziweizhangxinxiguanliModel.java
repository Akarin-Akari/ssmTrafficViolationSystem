package com.entity.model;

import com.entity.KakoudianziweizhangxinxiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 卡口电子违章信息管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public class KakoudianziweizhangxinxiguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 违章车辆
	 */
	
	private String weizhangcheliang;
		
	/**
	 * 车牌种类
	 */
	
	private String chepaizhonglei;
		
	/**
	 * 违章车牌号
	 */
	
	private String weizhangchepaihao;
		
	/**
	 * 行驶方向
	 */
	
	private String xingshifangxiang;
		
	/**
	 * 处罚方式
	 */
	
	private String chufafangshi;
		
	/**
	 * 地点信息
	 */
	
	private String didianxinxi;
		
	/**
	 * 处理人
	 */
	
	private String chuliren;
		
	/**
	 * 违章人
	 */
	
	private String weizhangren;
		
	/**
	 * 违法时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weifashijian;
		
	/**
	 * 违法视频
	 */
	
	private String weifashipin;
		
	/**
	 * 违章图片
	 */
	
	private String weizhangtupian;
				
	
	/**
	 * 设置：违章车辆
	 */
	 
	public void setWeizhangcheliang(String weizhangcheliang) {
		this.weizhangcheliang = weizhangcheliang;
	}
	
	/**
	 * 获取：违章车辆
	 */
	public String getWeizhangcheliang() {
		return weizhangcheliang;
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
	 * 设置：行驶方向
	 */
	 
	public void setXingshifangxiang(String xingshifangxiang) {
		this.xingshifangxiang = xingshifangxiang;
	}
	
	/**
	 * 获取：行驶方向
	 */
	public String getXingshifangxiang() {
		return xingshifangxiang;
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
	 * 设置：地点信息
	 */
	 
	public void setDidianxinxi(String didianxinxi) {
		this.didianxinxi = didianxinxi;
	}
	
	/**
	 * 获取：地点信息
	 */
	public String getDidianxinxi() {
		return didianxinxi;
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
	 * 设置：违章人
	 */
	 
	public void setWeizhangren(String weizhangren) {
		this.weizhangren = weizhangren;
	}
	
	/**
	 * 获取：违章人
	 */
	public String getWeizhangren() {
		return weizhangren;
	}
				
	
	/**
	 * 设置：违法时间
	 */
	 
	public void setWeifashijian(Date weifashijian) {
		this.weifashijian = weifashijian;
	}
	
	/**
	 * 获取：违法时间
	 */
	public Date getWeifashijian() {
		return weifashijian;
	}
				
	
	/**
	 * 设置：违法视频
	 */
	 
	public void setWeifashipin(String weifashipin) {
		this.weifashipin = weifashipin;
	}
	
	/**
	 * 获取：违法视频
	 */
	public String getWeifashipin() {
		return weifashipin;
	}
				
	
	/**
	 * 设置：违章图片
	 */
	 
	public void setWeizhangtupian(String weizhangtupian) {
		this.weizhangtupian = weizhangtupian;
	}
	
	/**
	 * 获取：违章图片
	 */
	public String getWeizhangtupian() {
		return weizhangtupian;
	}
			
}
