/*
 * Copyright (c) 2018 datagear.org. All Rights Reserved.
 */

package org.datagear.dataexchange;

/**
 * 导入源。
 * 
 * @author datagear@163.com
 *
 */
public abstract class DataImport extends DataExchange
{
	/** 导入报告 */
	private DataImportReporter dataImportReporter;

	public DataImport()
	{
		super();
	}

	public DataImport(ConnectionFactory connectionFactory, boolean abortOnError)
	{
		super(connectionFactory, abortOnError);
	}

	public boolean hasDataImportReporter()
	{
		return (this.dataImportReporter != null);
	}

	public DataImportReporter getDataImportReporter()
	{
		return dataImportReporter;
	}

	public void setDataImportReporter(DataImportReporter dataImportReporter)
	{
		this.dataImportReporter = dataImportReporter;
	}
}
