# Mendix Redis Example

### How to test

1. Go to [Redis cloud](https://cloud.redis.io) and create a free Redis database (Choose 'Redis Stack' for type).

2. Copy the endpoint URL to the constant 'RedisURL'.

3. Copy the port to the constant 'RedisPort'.

4. Copy the password to the constant 'RedisPassword'.

5. Start the app. (If the connection to Redis fails, the app won't start.)

6. Create a member.

7. Open the edit page and see if you can see a log with the log node 'SRC'. The value should look like 'SetValue: key member:2:1728314923147 , value {"MemberId":2, ...}

8. You are all set! :) 
