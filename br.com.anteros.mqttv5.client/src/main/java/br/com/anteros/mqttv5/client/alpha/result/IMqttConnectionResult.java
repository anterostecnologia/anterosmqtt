package br.com.anteros.mqttv5.client.alpha.result;

public interface IMqttConnectionResult<C> extends IMqttResult<C> {

	/**
	 * @return the session present flag from a connack 
	 */
    boolean getSessionPresent();
	
}
