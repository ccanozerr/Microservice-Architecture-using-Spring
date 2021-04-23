package com.ccanozerr.fr.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.ccanozerr.fr.domain.metadata.annotations.EventPublisher;
import com.ccanozerr.fr.event.FootballerEvent;

@Service
@ConditionalOnProperty(name = "event.publisher", havingValue = "websocket")
public class EventPublisherWebSocketAdapter implements EventPublisher {
	@Autowired
	private SimpMessagingTemplate smt;

	@Override
	public void publish(FootballerEvent footballerEvent) {
		smt.convertAndSend("/topic/changes", footballerEvent);
	}

}
