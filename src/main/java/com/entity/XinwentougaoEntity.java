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
 * 新闻投稿
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-31 23:27:29
 */
@TableName("xinwentougao")
public class XinwentougaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinwentougaoEntity() {
		
	}
	
	public XinwentougaoEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 新闻分类
	 */
					
	private String xinwenfenlei;
	
	/**
	 * 内容简述
	 */
					
	private String neirongjianshu;
	
	/**
	 * 新闻稿件
	 */
					
	private String xinwengaojian;
	
	/**
	 * 投稿日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tougaoriqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：新闻分类
	 */
	public void setXinwenfenlei(String xinwenfenlei) {
		this.xinwenfenlei = xinwenfenlei;
	}
	/**
	 * 获取：新闻分类
	 */
	public String getXinwenfenlei() {
		return xinwenfenlei;
	}
	/**
	 * 设置：内容简述
	 */
	public void setNeirongjianshu(String neirongjianshu) {
		this.neirongjianshu = neirongjianshu;
	}
	/**
	 * 获取：内容简述
	 */
	public String getNeirongjianshu() {
		return neirongjianshu;
	}
	/**
	 * 设置：新闻稿件
	 */
	public void setXinwengaojian(String xinwengaojian) {
		this.xinwengaojian = xinwengaojian;
	}
	/**
	 * 获取：新闻稿件
	 */
	public String getXinwengaojian() {
		return xinwengaojian;
	}
	/**
	 * 设置：投稿日期
	 */
	public void setTougaoriqi(Date tougaoriqi) {
		this.tougaoriqi = tougaoriqi;
	}
	/**
	 * 获取：投稿日期
	 */
	public Date getTougaoriqi() {
		return tougaoriqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
