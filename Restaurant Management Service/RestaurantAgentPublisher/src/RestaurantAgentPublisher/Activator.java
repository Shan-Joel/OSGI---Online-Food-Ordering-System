package restaurantmanagementsystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import salarymanagment.Activator;
import salarymanagment.SalaryManagmentService;
import salarymanagment.SalaryManagmentServiceImpl;

public class Activator implements BundleActivator {

	private static BundleContext Bcontext;

	static BundleContext getContext() {
		return Bcontext;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		Activator.Bcontext = context;
		
		context.registerService(RestaurantAgentPublisherService.class.getName(),new RestaurantAgentPublisherServiceImpl(),null);
		
		System.out.println("-----------------------------------------------------------------------"); 
		
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dateTime.format(now));
		
		System.out.println("-----------------------------------------------------------------------"); 
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		Activator.Bcontext = null;
		
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		System.out.println("-----------------------------------------------------------------------"); 
		
		System.out.println("System Closed Time:  "+ dateTime.format(now));  
		System.out.println("-------------Thank you for ordering with us!--------------");
		
	}

	

}
