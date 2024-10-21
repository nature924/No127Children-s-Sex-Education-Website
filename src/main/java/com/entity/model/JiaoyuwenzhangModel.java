package com.entity.model;

import com.entity.JiaoyuwenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教育文章
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
public class JiaoyuwenzhangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章标题
	 */
	
	private String wenzhangbiaoti;
		
	/**
	 * 文章分类
	 */
	
	private String wenzhangfenlei;
		
	/**
	 * 文章封面
	 */
	
	private String wenzhangfengmian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 文章内容
	 */
	
	private String wenzhangneirong;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：文章标题
	 */
	 
	public void setWenzhangbiaoti(String wenzhangbiaoti) {
		this.wenzhangbiaoti = wenzhangbiaoti;
	}
	
	/**
	 * 获取：文章标题
	 */
	public String getWenzhangbiaoti() {
		return wenzhangbiaoti;
	}
				
	
	/**
	 * 设置：文章分类
	 */
	 
	public void setWenzhangfenlei(String wenzhangfenlei) {
		this.wenzhangfenlei = wenzhangfenlei;
	}
	
	/**
	 * 获取：文章分类
	 */
	public String getWenzhangfenlei() {
		return wenzhangfenlei;
	}
				
	
	/**
	 * 设置：文章封面
	 */
	 
	public void setWenzhangfengmian(String wenzhangfengmian) {
		this.wenzhangfengmian = wenzhangfengmian;
	}
	
	/**
	 * 获取：文章封面
	 */
	public String getWenzhangfengmian() {
		return wenzhangfengmian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：文章内容
	 */
	 
	public void setWenzhangneirong(String wenzhangneirong) {
		this.wenzhangneirong = wenzhangneirong;
	}
	
	/**
	 * 获取：文章内容
	 */
	public String getWenzhangneirong() {
		return wenzhangneirong;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
