package br.com.anteros.mqttv5.client.alpha.internal;

import br.com.anteros.mqttv5.client.alpha.IMqttCommonClient;
import br.com.anteros.mqttv5.client.alpha.IMqttMessage;
import br.com.anteros.mqttv5.client.alpha.result.IMqttDeliveryResult;
import br.com.anteros.mqttv5.common.MqttException;

public class MqttDeliveryResultImpl<C> extends MqttResultImpl<C> implements IMqttDeliveryResult<C> {

	private final IMqttMessage message;

	public MqttDeliveryResultImpl(IMqttCommonClient client, C userContext, IMqttMessage message) {
		super(client, userContext);
		this.message = message;
	}

	@Override
	public IMqttMessage getMessage() throws MqttException {
		return message;
	}

}
