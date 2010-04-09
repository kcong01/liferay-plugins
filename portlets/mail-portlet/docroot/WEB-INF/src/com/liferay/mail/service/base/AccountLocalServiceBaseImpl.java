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

package com.liferay.mail.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.mail.model.Account;
import com.liferay.mail.service.AccountLocalService;
import com.liferay.mail.service.AttachmentLocalService;
import com.liferay.mail.service.FolderLocalService;
import com.liferay.mail.service.MessageLocalService;
import com.liferay.mail.service.persistence.AccountPersistence;
import com.liferay.mail.service.persistence.AttachmentPersistence;
import com.liferay.mail.service.persistence.FolderPersistence;
import com.liferay.mail.service.persistence.MessagePersistence;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.util.List;

/**
 * <a href="AccountLocalServiceBaseImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public abstract class AccountLocalServiceBaseImpl implements AccountLocalService {
	public Account addAccount(Account account) throws SystemException {
		account.setNew(true);

		return accountPersistence.update(account, false);
	}

	public Account createAccount(long accountId) {
		return accountPersistence.create(accountId);
	}

	public void deleteAccount(long accountId)
		throws PortalException, SystemException {
		accountPersistence.remove(accountId);
	}

	public void deleteAccount(Account account)
		throws PortalException, SystemException {
		accountPersistence.remove(account);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return accountPersistence.findWithDynamicQuery(dynamicQuery);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) throws SystemException {
		return accountPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return accountPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	public int dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return accountPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public Account getAccount(long accountId)
		throws PortalException, SystemException {
		return accountPersistence.findByPrimaryKey(accountId);
	}

	public List<Account> getAccounts(int start, int end)
		throws SystemException {
		return accountPersistence.findAll(start, end);
	}

	public int getAccountsCount() throws SystemException {
		return accountPersistence.countAll();
	}

	public Account updateAccount(Account account) throws SystemException {
		account.setNew(false);

		return accountPersistence.update(account, true);
	}

	public Account updateAccount(Account account, boolean merge)
		throws SystemException {
		account.setNew(false);

		return accountPersistence.update(account, merge);
	}

	public AccountLocalService getAccountLocalService() {
		return accountLocalService;
	}

	public void setAccountLocalService(AccountLocalService accountLocalService) {
		this.accountLocalService = accountLocalService;
	}

	public AccountPersistence getAccountPersistence() {
		return accountPersistence;
	}

	public void setAccountPersistence(AccountPersistence accountPersistence) {
		this.accountPersistence = accountPersistence;
	}

	public AttachmentLocalService getAttachmentLocalService() {
		return attachmentLocalService;
	}

	public void setAttachmentLocalService(
		AttachmentLocalService attachmentLocalService) {
		this.attachmentLocalService = attachmentLocalService;
	}

	public AttachmentPersistence getAttachmentPersistence() {
		return attachmentPersistence;
	}

	public void setAttachmentPersistence(
		AttachmentPersistence attachmentPersistence) {
		this.attachmentPersistence = attachmentPersistence;
	}

	public FolderLocalService getFolderLocalService() {
		return folderLocalService;
	}

	public void setFolderLocalService(FolderLocalService folderLocalService) {
		this.folderLocalService = folderLocalService;
	}

	public FolderPersistence getFolderPersistence() {
		return folderPersistence;
	}

	public void setFolderPersistence(FolderPersistence folderPersistence) {
		this.folderPersistence = folderPersistence;
	}

	public MessageLocalService getMessageLocalService() {
		return messageLocalService;
	}

	public void setMessageLocalService(MessageLocalService messageLocalService) {
		this.messageLocalService = messageLocalService;
	}

	public MessagePersistence getMessagePersistence() {
		return messagePersistence;
	}

	public void setMessagePersistence(MessagePersistence messagePersistence) {
		this.messagePersistence = messagePersistence;
	}

	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	public ResourceService getResourceService() {
		return resourceService;
	}

	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	protected void runSQL(String sql) throws SystemException {
		try {
			DB db = DBFactoryUtil.getDB();

			db.runSQL(sql);
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AccountLocalService.class)
	protected AccountLocalService accountLocalService;
	@BeanReference(type = AccountPersistence.class)
	protected AccountPersistence accountPersistence;
	@BeanReference(type = AttachmentLocalService.class)
	protected AttachmentLocalService attachmentLocalService;
	@BeanReference(type = AttachmentPersistence.class)
	protected AttachmentPersistence attachmentPersistence;
	@BeanReference(type = FolderLocalService.class)
	protected FolderLocalService folderLocalService;
	@BeanReference(type = FolderPersistence.class)
	protected FolderPersistence folderPersistence;
	@BeanReference(type = MessageLocalService.class)
	protected MessageLocalService messageLocalService;
	@BeanReference(type = MessagePersistence.class)
	protected MessagePersistence messagePersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}