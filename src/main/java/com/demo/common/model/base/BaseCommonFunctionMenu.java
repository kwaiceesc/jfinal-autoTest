package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCommonFunctionMenu<M extends BaseCommonFunctionMenu<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	/**
	 * 菜单名
	 */
	public void setMenuName(java.lang.String menuName) {
		set("menuName", menuName);
	}
	
	/**
	 * 菜单名
	 */
	public java.lang.String getMenuName() {
		return getStr("menuName");
	}

	/**
	 * 跳转地址
	 */
	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	/**
	 * 跳转地址
	 */
	public java.lang.String getUrl() {
		return getStr("url");
	}

	/**
	 * 菜单图标
	 */
	public void setIconClass(java.lang.String iconClass) {
		set("iconClass", iconClass);
	}
	
	/**
	 * 菜单图标
	 */
	public java.lang.String getIconClass() {
		return getStr("iconClass");
	}

	/**
	 * 是否父级菜单
	 */
	public void setIsParent(java.lang.Integer isParent) {
		set("isParent", isParent);
	}
	
	/**
	 * 是否父级菜单
	 */
	public java.lang.Integer getIsParent() {
		return getInt("isParent");
	}

	/**
	 * 父级菜单id
	 */
	public void setParentId(java.lang.Integer parentId) {
		set("parentId", parentId);
	}
	
	/**
	 * 父级菜单id
	 */
	public java.lang.Integer getParentId() {
		return getInt("parentId");
	}

	/**
	 * 排序号
	 */
	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序号
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