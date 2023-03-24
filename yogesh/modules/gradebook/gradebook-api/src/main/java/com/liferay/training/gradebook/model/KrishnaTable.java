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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Gradebook_Krishna&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Krishna
 * @generated
 */
public class KrishnaTable extends BaseTable<KrishnaTable> {

	public static final KrishnaTable INSTANCE = new KrishnaTable();

	public final Column<KrishnaTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KrishnaTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KrishnaTable, Integer> userId = createColumn(
		"userId", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<KrishnaTable, Long> krishnaId = createColumn(
		"krishnaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private KrishnaTable() {
		super("Gradebook_Krishna", KrishnaTable::new);
	}

}