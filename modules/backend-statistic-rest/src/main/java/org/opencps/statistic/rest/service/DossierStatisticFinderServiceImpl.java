package org.opencps.statistic.rest.service;

import java.util.List;

import org.opencps.statistic.model.OpencpsDossierStatistic;
import org.opencps.statistic.rest.converter.DossierStatisticConverter;
import org.opencps.statistic.rest.dto.DossierStatisticRequest;
import org.opencps.statistic.rest.dto.DossierStatisticResponse;
import org.opencps.statistic.service.OpencpsDossierStatisticLocalServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;


public class DossierStatisticFinderServiceImpl implements DossierStatisticFinderService {
	
	private final static Logger LOG = LoggerFactory.getLogger(DossierStatisticFinderServiceImpl.class);

//	@Override
//	public DossierStatisticResponse finderDossierStatistic(DossierStatisticRequest dossierStatisticRequest)
//			throws PortalException, SystemException {
//		
////		LOG.info("***DossierStatisticFinderServiceImpl");
//		
//		//DossierStatisticUtils.logAsFormattedJson(LOG, dossierStatisticRequest);
//		
//		List<OpencpsDossierStatistic> dossierStatistics = OpencpsDossierStatisticLocalServiceUtil
//				.searchDossierStatistic(dossierStatisticRequest.getGroupId(), dossierStatisticRequest.getMonth(),
//						dossierStatisticRequest.getYear(), dossierStatisticRequest.getDomain(),
//						dossierStatisticRequest.getGovAgencyCode(), "",
//						dossierStatisticRequest.getStart(), dossierStatisticRequest.getEnd());
//
//		return DossierStatisticConverter.getDossierStatisticResponse().convert(dossierStatistics);
//	}

	@Override
	public DossierStatisticResponse finderDossierStatisticSystem(DossierStatisticRequest dossierStatisticRequest)
			throws PortalException, SystemException {
		
		//DossierStatisticUtils.logAsFormattedJson(LOG, dossierStatisticRequest);
		
		List<OpencpsDossierStatistic> dossierStatistics = OpencpsDossierStatisticLocalServiceUtil
				.searchDossierStatisticSystem(dossierStatisticRequest.getGroupId(), dossierStatisticRequest.getMonth(),
						dossierStatisticRequest.getYear(), dossierStatisticRequest.getDomain(),
						dossierStatisticRequest.getGovAgencyCode(), dossierStatisticRequest.getSystem(), dossierStatisticRequest.getGroupAgencyCode(),
						dossierStatisticRequest.getStart(), dossierStatisticRequest.getEnd());

		return DossierStatisticConverter.getDossierStatisticResponse().convert(dossierStatistics);
	}

	@Override
	public DossierStatisticResponse finderDossierStatistics(DossierStatisticRequest dossierStatisticRequest)
			throws PortalException {
		List<OpencpsDossierStatistic> dossierStatistics = OpencpsDossierStatisticLocalServiceUtil.fetchDossierStatistic(
				dossierStatisticRequest.getGroupId(), dossierStatisticRequest.getMonth(),
				dossierStatisticRequest.getYear(), dossierStatisticRequest.getDomain(),
				dossierStatisticRequest.getGovAgencyCode(), dossierStatisticRequest.getSystem(),
				dossierStatisticRequest.getGroupAgencyCode(), dossierStatisticRequest.getStart(),
				dossierStatisticRequest.getEnd());

		if (dossierStatistics != null && dossierStatistics.size() > 0) {
			return DossierStatisticConverter.getDossierStatisticResponse().convert(dossierStatistics);
		}

		return null;
	}

}
