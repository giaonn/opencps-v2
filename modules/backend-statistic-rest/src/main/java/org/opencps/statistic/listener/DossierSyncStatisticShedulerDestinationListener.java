package org.opencps.statistic.listener;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.DestinationEventListener;
import com.liferay.portal.kernel.messaging.MessageListener;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true,
	property = {"destination.name=invoke/dossiersyncstatisticsheduler/in/destination"},
	service = DestinationEventListener .class)
public class DossierSyncStatisticShedulerDestinationListener implements DestinationEventListener  {
	
	private Log _log = LogFactoryUtil.getLog(DossierSyncStatisticShedulerDestinationListener.class);

	@Override
	public void messageListenerRegistered(String destinationName, MessageListener messageListener) {
		// TODO Auto-generated method stub
		_log.info("messageListenerRegistered:"+destinationName);
		
		
	}

	@Override
	public void messageListenerUnregistered(String destinationName, MessageListener messageListener) {
		// TODO Auto-generated method stub
		
		_log.info("messageListenerUnregistered:"+destinationName);
	}

	
	
}