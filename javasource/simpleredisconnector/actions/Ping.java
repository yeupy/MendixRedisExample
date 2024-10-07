// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package simpleredisconnector.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import redis.clients.jedis.Jedis;

public class Ping extends CustomJavaAction<java.lang.String>
{
	private java.lang.String RedisURL;
	private java.lang.Long RedisPort;
	private java.lang.String RedisPassword;
	private java.lang.Boolean EnableSsl;

	public Ping(IContext context, java.lang.String RedisURL, java.lang.Long RedisPort, java.lang.String RedisPassword, java.lang.Boolean EnableSsl)
	{
		super(context);
		this.RedisURL = RedisURL;
		this.RedisPort = RedisPort;
		this.RedisPassword = RedisPassword;
		this.EnableSsl = EnableSsl;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		try {
			Jedis jedis = new Jedis(this.RedisURL, this.RedisPort.intValue(), EnableSsl);
			if (RedisPassword != null && RedisPassword != "" && RedisPassword.length() > 0) {
				jedis.auth(RedisPassword);				
			}
			String response = jedis.ping();
			jedis.close();
			
			return response;
		} catch (Exception e) {
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Error on Ping action: " + e.getStackTrace());
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "Ping";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
