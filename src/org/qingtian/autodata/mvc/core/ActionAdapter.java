package org.qingtian.autodata.mvc.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 继承自{@link AbstractAction}抽象类，实现其中的抽象方法，提供空的实现。
 * 
 * @author qingtian
 *
 * 2011-3-4 下午11:17:21
 */
public class ActionAdapter extends AbstractAction {

	@Override
	public String show(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String viewAdd(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String add(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String delete(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String viewModify(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String modify(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String viewFilter(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String filter(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String list(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

	@Override
	public String listByPage(HttpServletRequest req, HttpServletResponse resp) {
		return SUCCESS;
	}

}
