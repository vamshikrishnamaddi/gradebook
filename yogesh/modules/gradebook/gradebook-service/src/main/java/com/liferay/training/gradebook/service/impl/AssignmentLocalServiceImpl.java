package com.liferay.training.gradebook.service.impl;

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
//s
// package com.liferay.training.gradebook.service.impl;
 import com.liferay.portal.aop.AopService;
 import com.liferay.portal.kernel.dao.orm.Disjunction;
 import com.liferay.portal.kernel.dao.orm.DynamicQuery;
 import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
 import com.liferay.portal.kernel.exception.PortalException;
 import com.liferay.portal.kernel.model.Group;
 import com.liferay.portal.kernel.model.User;
 import com.liferay.portal.kernel.service.ServiceContext;
 import com.liferay.portal.kernel.util.OrderByComparator;
 import com.liferay.portal.kernel.util.Validator;
 import com.liferay.training.gradebook.model.Assignment;
 import com.liferay.training.gradebook.service.base.AssignmentLocalServiceBaseImpl;
 
 import java.util.Date;
 import java.util.List;
 import org.osgi.service.component.annotations.Component;
 
 /**
  * @author Brian Wing Shun Chan
  */
 @Component(property = "model.class.name=com.liferay.training.gradebook.model.Assignment", service = AopService.class)
 public class AssignmentLocalServiceImpl extends AssignmentLocalServiceBaseImpl {
 
     public Assignment addAssignment(long groupId, String title, String description, Date dueDate,
             ServiceContext serviceContext) throws PortalException {
         // Get group and user.
         Group group = groupLocalService.getGroup(groupId);
         long userId = serviceContext.getUserId();
         User user = userLocalService.getUser(userId);
         // Generate primary key for the assignment.
         long assignmentId = counterLocalService.increment(Assignment.class.getName());
         // Create assigment. This doesn 't yet persist the entity.
         Assignment assignment = createAssignment(assignmentId);
         // Populate fields.
         assignment.setCompanyId(group.getCompanyId());
         assignment.setCreateDate(serviceContext.getCreateDate(new Date()));
         assignment.setDueDate(dueDate);
         assignment.setDescription(description);
         assignment.setGroupId(groupId);
         assignment.setModifiedDate(serviceContext.getModifiedDate(new Date()));
         assignment.setTitle(title);
         assignment.setUserId(userId);
         assignment.setUserName(user.getScreenName());
         // Persist assignment to database.
         return super.addAssignment(assignment);
     }
 
     public Assignment updateAssignment(long assignmentId, String title, String description, Date dueDate,
             ServiceContext serviceContext) throws PortalException {
         // Get the Assignment by id.
         Assignment assignment = getAssignment(assignmentId);
         // Set updated fields and modification date.
         assignment.setModifiedDate(new Date());
         assignment.setTitle(title);
         assignment.setDueDate(dueDate);
         assignment.setDescription(description);
         assignment = super.updateAssignment(assignment);
         return assignment;
     }
 
     public Assignment updateAssignment(Long assignmentId, String title, String description, Date dueDate,
             ServiceContext serviceContext) throws PortalException {
         // Get the Assignment by id.
         Assignment assignment = getAssignment(assignmentId);
         // Set updated fields and modi fication date.
         assignment.setModifiedDate(new Date());
         assignment.setTitle(title);
         assignment.setDueDate(dueDate);
         assignment.setDescription(description);
         assignment = super.updateAssignment(assignment);
         return assignment;
     }
 
     public List<Assignment> getAssignmentsByGroupId(long groupId) {
         return assignmentPersistence.findByGroupId(groupId);
  
     }
 
     public List<Assignment> getAssignmentsByGroupId(long groupId, int start, int end) {
         return assignmentPersistence.findByGroupId(groupId, start, end);
     }
 
     public List<Assignment> getAssignmentsByGroupId(long groupId, int start, int end,
             OrderByComparator<Assignment> orderByComparator) {
         return assignmentPersistence.findByGroupId(groupId, start, end, orderByComparator);
     }
 
     public long getAssignmentsCountBykeywords(long groupId, String keywords) {
         return assignmentLocalService.dynamicQueryCount(getKeywordSearchDynamicQuery(groupId, keywords));
     }
     private DynamicQuery getKeywordSearchDynamicQuery(long groupld, String keywords) {
         DynamicQuery dynamicQuery = dynamicQuery().add(RestrictionsFactoryUtil.eq("groupid", groupld));
         if (Validator.isNotNull(keywords)) {
             Disjunction disjunctionQuery = RestrictionsFactoryUtil.disjunction();
             disjunctionQuery.add(RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
             disjunctionQuery.add(RestrictionsFactoryUtil.like("description", "%" + keywords + "%"));
             dynamicQuery.add(disjunctionQuery);
         }
         return dynamicQuery;
     }
     @Override
     public Assignment addAssignment(Assignment assignment) {
         throw new UnsupportedOperationException("Not supported.");
     }
 
     @Override
     public Assignment updateAssignment(Assignment assignment) {
         throw new UnsupportedOperationException("Not supported.");
     }
    }