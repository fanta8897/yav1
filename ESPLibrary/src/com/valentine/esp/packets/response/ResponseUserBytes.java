package com.valentine.esp.packets.response;

import com.valentine.esp.constants.Devices;
import com.valentine.esp.data.UserSettings;
import com.valentine.esp.packets.ESPPacket;

public class ResponseUserBytes extends ESPPacket 
{
	public ResponseUserBytes(Devices _destination)
	{
		m_destination = _destination.toByteValue();
		m_timeStamp = System.currentTimeMillis();
		buildPacket();
	}
	
	@Override
	/**
	 * Returns the UserSettings from the V1 using this packets payload data.
	 * @return UserSettings from the V1.
	 */
	public Object getResponseData()
	{
		UserSettings rc = new UserSettings();
		rc.buildFromBytes(payloadData);
		return rc;
	}

	@Override
	/**
	 * See parent for default implementation.
	 */
	protected void buildPacket() 
	{
		
	}
	

}
