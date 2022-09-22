BEAN SCOPES
——————————
Singleton,     Prototype,	 Request,		 Session, 		Application,	 WebSocket


Singleton Scope


ContentFiltering obj1 = appContextObj.getBean(ContentFiltering.class); 																		com.bean.lifecycle.config.beanlifecycle.singleton.com.scope.ContentFiltering@2fb68ec6
ContentFiltering obj2 = appContextObj.getBean(ContentFiltering.class);    SPRING CONTAINER => CREATES ONE SHARED INSTANCE => CACHED MEMORY 	com.bean.lifecycle.config.beanlifecycle.singleton.com.scope.ContentFiltering@2fb68ec6
ContentFiltering obj3 = appContextObj.getBean(ContentFiltering.class);																		com.bean.lifecycle.config.beanlifecycle.singleton.com.scope.ContentFiltering@2fb68ec6


Prototype Scope

ContentFiltering obj1 = appContextObj.getBean(ContentFiltering.class); 																		com.bean.lifecycle.config.beanlifecycle.singleton.com.scope.ContentFiltering@117632cf
ContentFiltering obj2 = appContextObj.getBean(ContentFiltering.class);  		SPRING CONTAINER => CREATES NEW BEAN INSTANCES					com.bean.lifecycle.config.beanlifecycle.singleton.com.scope.ContentFiltering@2fb68ec6
ContentFiltering obj3 = appContextObj.getBean(ContentFiltering.class);  																		com.bean.lifecycle.config.beanlifecycle.singleton.com.scope.ContentFiltering@d71adc2


Mixed Scope


SPRING CONTAINER => SINGELTON SCOPE =>  MULTI FILTERING =>  WHEN CONTENT FILTERING IS REQUESTED => PROTOTYPE BEAN


Arjun => Requesting Trailer => USA Server => Content would be retrieved => Proxy Server => Client => Arjun
Manish =>Request USA Server
Regional Cache =>
Proxy Send him back the response
Requesting Trailer => Proxy Server => Client => Manish


Singleton => Proxy Mode => Prototype By Injecting into Singleton

@ComponentScan

=> Scans specific packages

=> Filter Types
1. Include Filters
=> Package to Include

	2. Exclude Filters 
		=> Package to exclude

1. FilterType.ANNOTATION
2. FilterType.ASPECTJ
3. FilterType.ASSIGNABLE_TYPE
4. FilterType.REGEX
5. FilterType.CUSTOM


Bean Life Cycle

Container => Bean Instantiation => Dependency Injection => Post Construct Method=> Bean is Ready


Employee Management System

1. Prerequisite method before running application => Connecting to Database => Establish a connection => Post Construct

Lot of Methods => Adding an Employee, Update an Employee


Connect() => Wait Time
addEmployee()
UpdateEmployee()


Container => Method With @PostConstructor  => Bean Ready
AddEmployee()
UpdateEmployee()
Container => Method with @PreDestroy => Bean Destroyed


Prototypes Scoped Beans



