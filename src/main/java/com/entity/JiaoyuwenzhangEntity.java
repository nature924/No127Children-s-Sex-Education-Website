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
 * 教育文章
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
@TableName("jiaoyuwenzhang")
public class JiaoyuwenzhangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoyuwenzhangEntity() {
		
	}
	
	public JiaoyuwenzhangEntity(T t) {
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
	 * 文章编号
	 */
					
	private String wenzhangbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：文章编号
	 */
	public void setWenzhangbianhao(String wenzhangbianhao) {
		this.wenzhangbianhao = wenzhangbianhao;
	}
	/**
	 * 获取：文章编号
	 */
	public String getWenzhangbianhao() {
		return wenzhangbianhao;
	}
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
