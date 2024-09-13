package com.entity.vo;

import com.entity.XinwentougaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 新闻投稿
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-31 23:27:29
 */
public class XinwentougaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
