package com.valentine.esp.data;

public class SavvyStatus 
{
	private int m_speedThreshold;
	private boolean m_thresholdOverriddenByUser;
	private boolean m_unmuteEnabled;
	private byte    mByte;

	/**
	 * Returns the speed threshold.
	 * @return	Speed threshold.
	 */
	public int getSpeedThreshold()
	{
		return m_speedThreshold;
	}
	
	/**
	 * Returns if then threshold setting has been overridden by the user.
	 * 
	 * return	True if the user has overridden the speed threshold otherwise false.
	 */
	public boolean getThresholdOverriddenByUser()
	{
		return m_thresholdOverriddenByUser;
	}
	
	/**
	 * Returns if the unmutting is enabled.
	 * @return	True if unmuting is enabled.
	 */
	public boolean getUnmuteEnabled()
	{
		return m_unmuteEnabled;
	}
	
	/**
	 * Sets the savvy setting using data from the passed in byte.
	 * @param _data
	 */
	public void buildFromBytes(byte[] _data)
	{
		m_speedThreshold = (int) _data[0] & 0xff;
		
		if ((_data[1] & 1) > 0)
		{
			m_thresholdOverriddenByUser = true;
		}
		else
		{
			m_thresholdOverriddenByUser = false;
			
		}
		
		if ((_data[1] & 2) > 0)
		{
			m_unmuteEnabled = true;
		}
		else
		{
			m_unmuteEnabled = false;
			
		}
	}

    // added by Franck to control the initial Savvy status

    public byte getControlByte()
    {
        return mByte;
    }
}
