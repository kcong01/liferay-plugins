/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.mail.service;


/**
 * <a href="MessageLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is a wrapper for {@link MessageLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MessageLocalService
 * @generated
 */
public class MessageLocalServiceWrapper implements MessageLocalService {
	public MessageLocalServiceWrapper(MessageLocalService messageLocalService) {
		_messageLocalService = messageLocalService;
	}

	public com.liferay.mail.model.Message addMessage(
		com.liferay.mail.model.Message message)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.addMessage(message);
	}

	public com.liferay.mail.model.Message createMessage(long messageId) {
		return _messageLocalService.createMessage(messageId);
	}

	public void deleteMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_messageLocalService.deleteMessage(messageId);
	}

	public void deleteMessage(com.liferay.mail.model.Message message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_messageLocalService.deleteMessage(message);
	}

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.dynamicQuery(dynamicQuery);
	}

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	public int dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.mail.model.Message getMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getMessage(messageId);
	}

	public java.util.List<com.liferay.mail.model.Message> getMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getMessages(start, end);
	}

	public int getMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getMessagesCount();
	}

	public com.liferay.mail.model.Message updateMessage(
		com.liferay.mail.model.Message message)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.updateMessage(message);
	}

	public com.liferay.mail.model.Message updateMessage(
		com.liferay.mail.model.Message message, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.updateMessage(message, merge);
	}

	public com.liferay.mail.model.Message addMessage(long userId,
		long folderId, java.lang.String sender, java.lang.String to,
		java.lang.String cc, java.lang.String bcc, java.util.Date sentDate,
		java.lang.String subject, java.lang.String body,
		java.lang.String flags, long size, long remoteMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.addMessage(userId, folderId, sender, to,
			cc, bcc, sentDate, subject, body, flags, size, remoteMessageId);
	}

	public void deleteMessages(long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_messageLocalService.deleteMessages(folderId);
	}

	public java.util.List<com.liferay.mail.model.Message> getCompanyMessages(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getCompanyMessages(companyId, start, end);
	}

	public int getCompanyMessagesCount(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getCompanyMessagesCount(companyId);
	}

	public java.util.List<com.liferay.mail.model.Message> getFolderMessages(
		long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getFolderMessages(folderId);
	}

	public int getFolderMessagesCount(long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getFolderMessagesCount(folderId);
	}

	public com.liferay.mail.model.Message getMessage(long folderId,
		long remoteMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.getMessage(folderId, remoteMessageId);
	}

	public com.liferay.mail.model.Message updateMessage(long messageId,
		long folderId, java.lang.String sender, java.lang.String to,
		java.lang.String cc, java.lang.String bcc, java.util.Date sentDate,
		java.lang.String subject, java.lang.String body,
		java.lang.String flags, long size, long remoteMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _messageLocalService.updateMessage(messageId, folderId, sender,
			to, cc, bcc, sentDate, subject, body, flags, size, remoteMessageId);
	}

	public MessageLocalService getWrappedMessageLocalService() {
		return _messageLocalService;
	}

	private MessageLocalService _messageLocalService;
}