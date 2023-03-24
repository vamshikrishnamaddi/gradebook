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

package com.liferay.training.gradebook.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.gradebook.model.Krishna;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Krishna in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KrishnaCacheModel implements CacheModel<Krishna>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof KrishnaCacheModel)) {
			return false;
		}

		KrishnaCacheModel krishnaCacheModel = (KrishnaCacheModel)object;

		if (userId == krishnaCacheModel.userId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", krishnaId=");
		sb.append(krishnaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Krishna toEntityModel() {
		KrishnaImpl krishnaImpl = new KrishnaImpl();

		if (name == null) {
			krishnaImpl.setName("");
		}
		else {
			krishnaImpl.setName(name);
		}

		if (description == null) {
			krishnaImpl.setDescription("");
		}
		else {
			krishnaImpl.setDescription(description);
		}

		krishnaImpl.setUserId(userId);
		krishnaImpl.setKrishnaId(krishnaId);

		krishnaImpl.resetOriginalValues();

		return krishnaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		userId = objectInput.readInt();

		krishnaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(userId);

		objectOutput.writeLong(krishnaId);
	}

	public String name;
	public String description;
	public int userId;
	public long krishnaId;

}