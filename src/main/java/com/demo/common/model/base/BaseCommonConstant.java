package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCommonConstant<M extends BaseCommonConstant<M>> extends Model<M> implements IBean {

	/**
	 * 主键
	 */
	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	/**
	 * 主键
	 */
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 常数类型
	 */
	public void setTypeCode(java.lang.String typeCode) {
		set("typeCode", typeCode);
	}
	
	/**
	 * 常数类型
	 */
	public java.lang.String getTypeCode() {
		return getStr("typeCode");
	}

	/**
	 * 常数名称
	 */
	public void setTypeName(java.lang.String typeName) {
		set("typeName", typeName);
	}
	
	/**
	 * 常数名称
	 */
	public java.lang.String getTypeName() {
		return getStr("typeName");
	}

	/**
	 * 常数值
	 */
	public void setValue(java.lang.String value) {
		set("value", value);
	}
	
	/**
	 * 常数值
	 */
	public java.lang.String getValue() {
		return getStr("value");
	}

	/**
	 * 描述
	 */
	public void setDescription(java.lang.String description) {
		set("description", description);
	}
	
	/**
	 * 描述
	 */
	public java.lang.String getDescription() {
		return getStr("description");
	}

	/**
	 * 排序
	 */
	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序
	 */
	public java.lang.Integer getSort() {
		return getInt("sort");
	}

	/**
	 * 有效性
	 */
	public void setValid(java.lang.Integer valid) {
		set("valid", valid);
	}
	
	/**
	 * 有效性
	 */
	public java.lang.Integer getValid() {
		return getInt("valid");
	}

}