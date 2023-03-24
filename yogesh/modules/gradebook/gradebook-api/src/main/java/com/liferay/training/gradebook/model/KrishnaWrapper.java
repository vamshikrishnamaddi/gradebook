/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.gradebook.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Krishna}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Krishna
 * @generated
 */
public class KrishnaWrapper
	extends BaseModelWrapper<Krishna>
	implements Krishna, ModelWrapper<Krishna> {

	public KrishnaWrapper(Krishna krishna) {
		super(krishna);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("userId", getUserId());
		attributes.put("krishnaId", getKrishnaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer userId = (Integer)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long krishnaId = (Long)attributes.get("krishnaId");

		if (krishnaId != null) {
			setKrishnaId(krishnaId);
		}
	}

	@Override
	public Krishna cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the description of this krishna.
	 *
	 * @return the description of this krishna
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the krishna ID of this krishna.
	 *
	 * @return the krishna ID of this krishna
	 */
	@Override
	public long getKrishnaId() {
		return model.getKrishnaId();
	}

	/**
	 * Returns the name of this krishna.
	 *
	 * @return the name of this krishna
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this krishna.
	 *
	 * @return the primary key of this krishna
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this krishna.
	 *
	 * @return the user ID of this krishna
	 */
	@Override
	public int getUserId() {
		return model.getUserId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the description of this krishna.
	 *
	 * @param description the description of this krishna
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the krishna ID of this krishna.
	 *
	 * @param krishnaId the krishna ID of this krishna
	 */
	@Override
	public void setKrishnaId(long krishnaId) {
		model.setKrishnaId(krishnaId);
	}

	/**
	 * Sets the name of this krishna.
	 *
	 * @param name the name of this krishna
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this krishna.
	 *
	 * @param primaryKey the primary key of this krishna
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this krishna.
	 *
	 * @param userId the user ID of this krishna
	 */
	@Override
	public void setUserId(int userId) {
		model.setUserId(userId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected KrishnaWrapper wrap(Krishna krishna) {
		return new KrishnaWrapper(krishna);
	}

}