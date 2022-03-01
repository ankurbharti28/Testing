	
//	Synchronization is to apply wait in our statements execution
	
//	There are 4 type of wait
//	1. Implicit Wait
//	2. Explicit Wait
//	3. Thread.sleep
//	4. Fluent Wait
	
//	Implicit wait:
//	It is used to apply global wait for a specific time before statement throw any exception
//	It will be applied for all statements.
//	e.g. Hey wait for 5 number of second before you throw exception
//	This time is maximum time for wait.
//	If our action takes 2 sec to load then it will go to next step after 2nd sec. It will not wait till 5th second
//	It keeps checking DOM (Document object model - it is html code of web browser) continuously whether the content is loaded or not.
	
//	Advatage:
//	1. Defining it global.
//	   So if there are 1000 of pages then it will be applied with single line code for all pages.
//	2. It takes immediate action as soon as page loads so dont waste time even if content loads warly.
	
//	Disadvatage:
//	There is chance to skip some performance error.
//	If we have provided a good amount to wait for some execution (e.g. 15 second)
//    but as per load/performance testing some page should Open in 4 second and in real it is taking around 12 second.
//    In this case our Test Case will get PASS but we will skip that performance issue/load testing issue. 
    
    
//    Explicit wait:
//    It is used to apply wait in specific scenario.
//    If some scenario taking much time to load then we can apply explicit wait for those scenarios only
//    and can apply implicit for overall.
    
//    IDEAL STRATEGY TO APPLY WAIT IN SELENIMUM IS:
//    Combination of Implicit and Explicit wait
    
    
//    Thread.sleep:
//    It halts script scenario for defined seconds
//    It is part of jave and not selenium
//    It waits till the maximum time provided.
//    Not preferrable to use
    	
