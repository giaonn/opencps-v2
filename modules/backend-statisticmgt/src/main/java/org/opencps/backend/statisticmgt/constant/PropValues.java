package org.opencps.backend.statisticmgt.constant;

import com.liferay.portal.kernel.util.GetterUtil;

import org.opencps.backend.statisticmgt.util.PropUtil;

/**
 * @author trungnt
 *
 */
public class PropValues {
	public static final String STATISTIC_DOSSIER_RECEIVING_OFFLINE_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RECEIVING_OFFLINE_TOTAL_COUNT);

	public static final String STATISTIC_DOSSIER_RECEIVING_OFFLINE_DOMAIN_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RECEIVING_OFFLINE_DOMAIN_COUNT);

	public static final String STATISTIC_DOSSIER_RECEIVING_ONLINE_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RECEIVING_ONLINE_TOTAL_COUNT);

	public static final String STATISTIC_DOSSIER_RECEIVING_ONLINE_DOMAIN_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RECEIVING_ONLINE_DOMAIN_COUNT);

	public static final String STATISTIC_DOSSIER_RELEASED_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RELEASED_TOTAL_COUNT);

	public static final String STATISTIC_DOSSIER_RELEASED_BETIMES_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RELEASED_BETIMES_COUNT);

	public static final String STATISTIC_DOSSIER_RELEASED_ONTIME_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RELEASED_ONTIME_COUNT);

	public static final String STATISTIC_DOSSIER_RELEASED_OVERTIME_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_RELEASED_OVERTIME_COUNT);

	public static final String STATISTIC_DOSSIER_DONE_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_DONE_TOTAL_COUNT);

	public static final String STATISTIC_DOSSIER_DONE_BETIMES_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_DONE_BETIMES_COUNT);

	public static final String STATISTIC_DOSSIER_DONE_ONTIME_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_DONE_ONTIME_COUNT);

	public static final String STATISTIC_DOSSIER_DONE_OVERTIME_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_DONE_OVERTIME_COUNT);

	public static final String STATISTIC_DOSSIER_PROCESSING_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_PROCESSING_TOTAL_COUNT);

	public static final String STATISTIC_DOSSIER_PROCESSING_ONTIME_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_PROCESSING_ONTIME_COUNT);

	public static final String STATISTIC_DOSSIER_PROCESSING_NEAREXPIRED_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_PROCESSING_NEAREXPIRED_COUNT);

	public static final String STATISTIC_DOSSIER_PROCESSING_OVERTIME_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_PROCESSING_OVERTIME_COUNT);

	public static final String STATISTIC_DOSSIER_REJECT_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_REJECT_TOTAL_COUNT);

	public static final String STATISTIC_DOSSIER_TAKEBACK_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_TAKEBACK_TOTAL_COUNT);

	public static final String STATISTIC_DOSSIER_PEDING_TOTAL_COUNT = PropUtil.getQueryProperty(PropKeys.STATISTIC_DOSSIER_PEDING_TOTAL_COUNT);
	
	public static final int CONFIG_DOSSIER_STATISTIC_SIZE_LIST = GetterUtil.getInteger(PropUtil.getConfigProperty(PropKeys.CONFIG_DOSSIER_STATISTIC_SIZE_LIST));
}
