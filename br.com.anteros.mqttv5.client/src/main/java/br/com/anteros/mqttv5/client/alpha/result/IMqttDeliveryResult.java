package br.com.anteros.mqttv5.client.alpha.result;

import br.com.anteros.mqttv5.client.alpha.IMqttMessage;
import br.com.anteros.mqttv5.common.MqttException;

public interface IMqttDeliveryResult<C> extends IMqttResult<C> {
	
	/**
	 * Returns the message being delivered.
	 * 
	 * @return the message associated with this delivery.
	 * @throws MqttException if there was a problem completing retrieving the message
	 */
    IMqttMessage getMessage() throws MqttException;
}
