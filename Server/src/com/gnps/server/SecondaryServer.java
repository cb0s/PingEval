package com.gnps.server;

import com.gnps.lib.event.EventBus;

public class SecondaryServer {
	public static void main(String[] args) {
		try(EventBus bus = new EventBus(null, null)) {
			bus.publish(null);
		}
	}
}
