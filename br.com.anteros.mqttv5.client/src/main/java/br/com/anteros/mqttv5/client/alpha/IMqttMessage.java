package br.com.anteros.mqttv5.client.alpha;

import java.nio.ByteBuffer;

public interface IMqttMessage {

	/**
	 * Returns the quality of service for this message.
	 * 
	 * @return the quality of service to use, either 0, 1, or 2.
	 */
    int getQos();
	
	
	/**
	 * The payload of this message
	 * @return a read only {@link ByteBuffer}
	 */
    ByteBuffer payload();
	
	/**
	 * Returns whether or not this message should be/was retained by the server. For
	 * messages received from the server, this method returns whether or not the
	 * message was from a current publisher, or was "retained" by the server as the
	 * last message published on the topic.
	 *
	 * @return <code>true</code> if the message should be, or was, retained by the
	 *         server.
	 */
    boolean isRetained();
}
