package br.com.anteros.mqttv5.client.alpha.internal;

import br.com.anteros.mqttv5.client.alpha.IMqttCommonClient;
import br.com.anteros.mqttv5.client.alpha.result.IMqttResult;

public class MqttResultImpl<C> implements IMqttResult<C> {

	private final IMqttCommonClient client;
	
	private final C userContext;
	
	public MqttResultImpl(IMqttCommonClient client, C userContext) {
		super();
		this.client = client;
		this.userContext = userContext;
	}

	@Override
	public IMqttCommonClient getClient() {
		return client;
	}

	@Override
	public C getUserContext() {
		return userContext;
	}

}
