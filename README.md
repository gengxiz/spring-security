### 项目介绍
###### 1，这个项目是看了B站，av73730658，自己借鉴写的代码<br/>
###### 2，当时写了很久，才写出来的，果然还是太菜了<br/>

### 流程图

###### 1，security 过滤图
![alt](images/security.png) <br/>

![alt](images/security2.png) <br/>

###### 2，认证流程图
![alt](images/auth.png) <br/>

###### 3，授权投票
![alt](images/authori.png) <br/>

###### 4，授权uml 图
![alt](images/accessdecis.png) <br/>

### 项目演示
###### 3，当clone 代码后，需要将子项目导入到父项目的模块中，如图<br/>
![alt](images/module.png) <br/>

###### 4，获取code的url <br/>
http://localhost:8080/oauth/authorize?response_type=code&client_id=c1&scope=all&redirect_uri=https://baidu.com/ <br/>

###### 5，获取令牌的url<br/>
localhost:8080/oauth/token<br/>
![alt](images/oauth_token.png)

###### 6，获取token的第二种方式，url <br/>
http://localhost:8080/oauth/authorize?client_id=c1&response_type=token&scope=all&redirect_uri=https://baidu.com/ <br/>

###### 7，密码模式获取令牌 ,一般用于客户端被信任的情况，因为获取令牌需要带上密码<br/>
![alt](images/password_token.png)

###### 8，client直接获取令牌 <br/>
![alt](images/client_token.png)


###### 9，校验令牌 ，url <br/>
localhost:8080/oauth/check_token <br/>
![alt](images/check_token.png)

###### 10，带令牌访问被保护的资源 ，url <br/>
localhost:8081/r/order_resource <br/>
![alt](images/access_resource.png)

###### 11，带jwt令牌访问资源  ，url <br/>
localhost:8081/r/jwt_order_resource <br/>
![alt](images/jwt_check_token.png)























