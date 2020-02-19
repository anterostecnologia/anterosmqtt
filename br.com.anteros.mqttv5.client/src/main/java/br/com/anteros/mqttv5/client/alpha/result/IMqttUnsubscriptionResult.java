package br.com.anteros.mqttv5.client.alpha.result;

public interface IMqttUnsubscriptionResult<C> extends IMqttResult<C> {

	int getMessageId();
}
